import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.TerminalNode;

import javax.sound.sampled.Line;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;


public class LinearLanguageInterpreter<T> extends LinearLanguageBaseVisitor<T> {

    public class Tuple<X, Y> {
        public final X x;
        public final Y y;
        public Tuple(X x, Y y) {
            this.x = x;
            this.y = y;
        }

        public X first() {
            return this.x;
        }

        public Y second() {
            return this.y;
        }
    }


    HashMap<String, String> symbolTableTypes = new HashMap<>();
    HashMap<String, HashMap<String, Tuple<String, String>>> symbolTableVariables = new HashMap<>();
    HashMap<String,Tuple<ArrayList<ArrayList<String>>,LinearLanguageParser.Proc_bodyContext>> symbolTableProcess =  new HashMap<>();
    HashMap<String,Tuple<LinearLanguageParser.Lin_exprContext, LinearLanguageParser.Lin_func_exprContext>> symbolTableFunctions =  new HashMap<>();
    HashMap<String,LinearLanguageParser.Deduct_defContext> symbolTableDeducts =  new HashMap<>();
    String scope = "global";

    @Override
    public T visitProgram(LinearLanguageParser.ProgramContext ctx) {
        return super.visitProgram(ctx);
    }

    @Override
    public T visitType_def(LinearLanguageParser.Type_defContext ctx) {
        String type = ctx.type_var().getText();
        symbolTableTypes.put(ctx.id().getText(), type);
        return null;
    }

    @Override
    public T visitVar_def(LinearLanguageParser.Var_defContext ctx) {

        String value = "";
        if(ctx.val_id() != null) {
            value = (String) visitVal_id(ctx.val_id());
        } else {
            value = (String) visitLiteral(ctx.literal());
        }
        if(symbolTableVariables.containsKey(scope)) {
            symbolTableVariables.get(scope).put(ctx.id().getText(), new Tuple<String, String>(ctx.type().getText(), value));
        }else{
            symbolTableVariables.put(scope, new HashMap<String, Tuple<String, String>>());
            symbolTableVariables.get(scope).put(ctx.id().getText(), new Tuple<String, String>(ctx.type().getText(), value));
        }
        return null;
    }

    @Override
    public T visitProc_def(LinearLanguageParser.Proc_defContext ctx) {
        String id = ctx.id(0).getText();
        ArrayList<ArrayList<String>> parameters = new ArrayList<>();
        for(Integer i = 1; i < ctx.id().size(); i += 2) {
            String paramType = ctx.id(i).getText();
            String paramId = ctx.id(i+1).getText();
            ArrayList<String> parameter  = new ArrayList<>();
            parameter.add(paramType);
            parameter.add(paramId);
            parameters.add(parameter);
        }

        symbolTableProcess.put(id, new Tuple<ArrayList<ArrayList<String>>,LinearLanguageParser.Proc_bodyContext>(parameters, ctx.proc_body()));
        return null;
    }

    @Override
    public T visitFunc_def(LinearLanguageParser.Func_defContext ctx) {
        symbolTableFunctions.put(ctx.id().getText(), new Tuple<LinearLanguageParser.Lin_exprContext, LinearLanguageParser.Lin_func_exprContext>(ctx.lin_expr(), ctx.lin_func_expr()));
        return null;
    }


    public void decodeStatement(LinearLanguageParser.StmtContext ctx, HashMap<String, String> parameters) throws Exception {
        if(ctx.assignation() != null) {
            createAssignationSt(ctx.assignation(), parameters);
        } else if(ctx.id().size() > 0) {
            ArrayList<String> parameterList = new ArrayList<>();
            for(Integer i = 1; i < ctx.id().size(); i++) {
                parameterList.add(ctx.id(i).getText());
            }
            decodeProcess(ctx.id(0).getText(), parameterList);
        }else if(ctx.NEWLINE() == null){
            if(ctx.literal() != null) {
                System.out.println(ctx.literal().getText());
            }else{
                String id = ctx.val_id().id().getText();
                System.out.println(symbolTableVariables.get(scope).get(id).second());
            }
        }

    }

    public Object decodeProcess(String processId, ArrayList<String> parameters) throws Exception {
        Tuple<ArrayList<ArrayList<String>>,LinearLanguageParser.Proc_bodyContext> process = symbolTableProcess.get(processId);
        if(process.first().size() != parameters.size()) {
            throw new Exception(String.format("Semantic Error: Wrong Number of Arguments; %s Expected but %s Given"
                    , String.valueOf(parameters.size())
                    , String.valueOf(process.first().size())));
        }

        HashMap<String, String> mapVariables = new HashMap<String, String>();
        for(Integer i = 0; i < parameters.size(); i++) {
            if(!symbolTableVariables.get(scope).get(parameters.get(i)).first().equals(process.first().get(i).get(0))){
                throw new Exception(String.format("Semantic Error: Wrong Type; %s Expected but %s Given"
                        , String.valueOf(symbolTableVariables.get(scope).get(parameters.get(i)).first())
                        , String.valueOf(process.first().get(i).get(0))));
            }
            mapVariables.put(process.first().get(i).get(1), parameters.get(i));
        }



        for(Integer i = 0; i < process.second().getChildCount(); i++) {
            if(process.second().getChild(i) instanceof TerminalNode) {
                return symbolTableVariables.get(scope).get(process.second().id().getText()).second();
            }else {
                decodeStatement((LinearLanguageParser.StmtContext) process.second().getChild(i), mapVariables);
            }
        }
        return null;
    }

    public void createAssignation(LinearLanguageParser.AssignationContext ctx, HashMap<String, LinearLanguageParser.ParameterContext> variables) throws Exception {
        String value = "";
        if(ctx.value().id().size() == 1) {
            String preId = ctx.value().id(0).getText();
            String id = variables.get(preId).getText();
            value = symbolTableVariables.get(scope).get(id).second();
        } else if(ctx.value().id().size() > 1) {
            String funcId = ctx.value().id(0).getText();
            ArrayList<String> parameters = new ArrayList<String>();
            for(Integer i = 1; i < ctx.value().id().size(); i++){
                parameters.add(variables.get(ctx.value().id(i).getText()).getText());
            }
            value = (String) decodeProcess(funcId, parameters);
        } else if(ctx.value().literal() != null) {
            value = ctx.value().literal().getText();
        } else if(ctx.value().transformed() != null) {
            value = createTransformedValue(ctx.value().transformed(), variables);
        }
        String id = "";
        if(ctx.id() != null) {
            id = ctx.id().getText();
        }else{
            id = ctx.getChild(1).getText();
        }
        if (symbolTableVariables.containsKey(scope)) {

            symbolTableVariables.get(scope).put(id, new Tuple<String, String>(ctx.type().getText(), value));
        }else{
            symbolTableVariables.put(scope, new HashMap<String, Tuple<String, String>>());
            symbolTableVariables.get(scope).put(id, new Tuple<String, String>(ctx.type().getText(), value));
        }
    }


    public String createTransformedValue(LinearLanguageParser.TransformedContext ctx, HashMap<String, LinearLanguageParser.ParameterContext> variables)  {
        Boolean stringMode = false;
        if((ParserRuleContext) ctx.getChild(0) instanceof LinearLanguageParser.LiteralContext) {
            if(ctx.literal(0).getText().contains("\"")){
                stringMode = true;
            }
        }else{
            if(symbolTableVariables.get(scope).get(variables.get(ctx.id(0).getText()).getText()).first().equals("string")) {
                stringMode = true;
            }
        }
        Integer idCount = 0;
        Integer literalCount = 0;
        if(stringMode) {
            String val = "";
            if((ParserRuleContext) ctx.getChild(0) instanceof LinearLanguageParser.LiteralContext) {
                if(ctx.literal(0).getText().contains("\"")){
                    val = ctx.literal(0).getText().substring(1,ctx.literal(0).getText().length()-1);
                    literalCount++;
                }
            }else{
                if(symbolTableTypes.get(symbolTableVariables.get(scope).get(ctx.id(idCount).getText()).first()).equals("string")) {
                    val =symbolTableVariables.get(scope).get(ctx.id(idCount).getText()).second();
                    idCount++;
                }
            }
            for (Integer i  = 0; i < ctx.operator().size(); i++) {
                if(!ctx.operator(i).getText().equals("+")){
                    try {
                        throw new Exception("Semantic error: You cannot apply a function different to concatenation to a String");
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                if((ParserRuleContext) ctx.getChild(2*i) instanceof LinearLanguageParser.LiteralContext) {
                    if(ctx.literal(literalCount).getText().contains("\"")){
                        val = val.concat(ctx.literal(literalCount).getText());
                        literalCount++;
                    }else{
                        try {
                            throw new Exception("Semantic error: You cannot concat a String with another Data Type");
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                }else{
                    if(symbolTableVariables.get(scope).get(variables.get(ctx.id(idCount).getText()).getText()).first().equals("string")) {
                        val = val.concat(symbolTableVariables.get(scope).get(variables.get(ctx.id(idCount).getText()).getText()).second());
                        idCount++;
                    }else{
                        try {
                            throw new Exception("Semantic error: You cannot concat a String with another Data Type");
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
            return val;
        }else{
            double val = 0.0;
            if((ParserRuleContext) ctx.getChild(0) instanceof LinearLanguageParser.LiteralContext) {
                val = val += Double.parseDouble(ctx.literal(0).getText());
                literalCount++;
            }else{
                val = Double.parseDouble(symbolTableVariables.get(scope).get(ctx.id(0).getText()).second());
                idCount++;
            }
            for (Integer i  = 0; i < ctx.operator().size(); i++) {
                if((ParserRuleContext) ctx.getChild(2*i) instanceof LinearLanguageParser.LiteralContext) {
                    if(ctx.literal(literalCount).getText().contains("\"")){
                        try {
                            throw new Exception("Semantic error: You cannot add a Integer or Float with another Data Type");
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }else{
                        if(ctx.operator(i).getText().equals("+")){
                            val += Double.parseDouble(ctx.literal(literalCount).getText());
                        } else if(ctx.operator(i).getText().equals("-")) {
                            val -= Double.parseDouble(ctx.literal(literalCount).getText());
                        } else if(ctx.operator(i).getText().equals("*")) {
                            val *= Double.parseDouble(ctx.literal(literalCount).getText());
                        } else {
                            val /= Double.parseDouble(ctx.literal(literalCount).getText());
                        }
                        literalCount++;
                    }
                }else{
                    if(!symbolTableVariables.get(scope).get(variables.get(ctx.id(idCount).getText()).getText()).first().equals("string")) {
                        if(ctx.operator(i).getText().equals("+")){
                            val += Double.parseDouble(symbolTableVariables.get(scope).get(variables.get(ctx.id(idCount).getText()).getText()).second());
                        } else if(ctx.operator(i).getText().equals("-")) {
                            val -= Double.parseDouble(symbolTableVariables.get(scope).get(variables.get(ctx.id(idCount).getText()).getText()).second());
                        } else if(ctx.operator(i).getText().equals("*")) {
                            val *= Double.parseDouble(symbolTableVariables.get(scope).get(variables.get(ctx.id(idCount).getText()).getText()).second());
                        } else {
                            val /= Double.parseDouble(symbolTableVariables.get(scope).get(variables.get(ctx.id(idCount).getText()).getText()).second());
                        }
                        idCount++;
                    }else{
                        try {
                            throw new Exception("Semantic error: You cannot concat a String with another Data Type");
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
            return String.valueOf(val);
        }

    }

    public String createTransformedValueSt(LinearLanguageParser.TransformedContext ctx, HashMap<String, String> variables)  {
        Boolean stringMode = false;
        if((ParserRuleContext) ctx.getChild(0) instanceof LinearLanguageParser.LiteralContext) {
            if(ctx.literal(0).getText().contains("\"")){
                stringMode = true;
            }
        }else{
            if(symbolTableVariables.get(scope).get(variables.get(ctx.id(0).getText())).first().equals("string")) {
                stringMode = true;
            }
        }
        Integer idCount = 0;
        Integer literalCount = 0;
        if(stringMode) {
            String val = "";
            if((ParserRuleContext) ctx.getChild(0) instanceof LinearLanguageParser.LiteralContext) {
                val = ctx.literal(0).getText().substring(1,ctx.literal(0).getText().length()-1);
                literalCount++;

            }else{
                val =symbolTableVariables.get(scope).get(variables.get(ctx.id(0).getText())).second();
                idCount++;

            }
            for (Integer i  = 0; i < ctx.operator().size(); i++) {
                if(!ctx.operator(i).getText().equals("+")){
                    try {
                        throw new Exception("Semantic error: You cannot apply a function different to concatenation to a String");
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                if((ParserRuleContext) ctx.getChild(2*i+2) instanceof LinearLanguageParser.LiteralContext) {
                    if(ctx.literal(literalCount).getText().contains("\"")){
                        val = val.concat(ctx.literal(literalCount).getText().substring(1, ctx.literal(literalCount).getText().length()-1));
                        literalCount++;
                    }else{
                        try {
                            throw new Exception("Semantic error: You cannot concat a String with another Data Type");
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                }else{
                    if(symbolTableTypes.get(symbolTableVariables.get(scope).get(variables.get(ctx.id(idCount).getText())).first()).equals("string")) {
                        val = val.concat(symbolTableVariables.get(scope).get(variables.get(ctx.id(idCount).getText())).second());
                        idCount++;
                    }else{
                        try {
                            throw new Exception("Semantic error: You cannot concat a String with another Data Type");
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
            return val;
        }else{
            double val = 0.0;
            if((ParserRuleContext) ctx.getChild(0) instanceof LinearLanguageParser.LiteralContext) {
                val = val += Double.parseDouble(ctx.literal(0).getText());
                literalCount++;
            }else{
                val = Double.parseDouble(symbolTableVariables.get(scope).get(variables.get(ctx.id(0).getText())).second());
                idCount++;
            }
            for (Integer i  = 0; i < ctx.operator().size(); i++) {
                if((ParserRuleContext) ctx.getChild(2*i+2) instanceof LinearLanguageParser.LiteralContext) {
                    if(ctx.literal(literalCount).getText().contains("\"")){
                        try {
                            throw new Exception("Semantic error: You cannot add a Integer or Float with another Data Type");
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }else{
                        if(ctx.operator(i).getText().equals("+")){
                            val += Double.parseDouble(ctx.literal(literalCount).getText());
                        } else if(ctx.operator(i).getText().equals("-")) {
                            val -= Double.parseDouble(ctx.literal(literalCount).getText());
                        } else if(ctx.operator(i).getText().equals("*")) {
                            val *= Double.parseDouble(ctx.literal(literalCount).getText());
                        } else {
                            val /= Double.parseDouble(ctx.literal(literalCount).getText());
                        }
                        literalCount++;
                    }
                }else{
                    if(!symbolTableTypes.get(symbolTableVariables.get(scope).get(variables.get(ctx.id(idCount).getText())).first()).equals("string")) {
                        if(ctx.operator(i).getText().equals("+")){
                            val += Double.parseDouble(symbolTableVariables.get(scope).get(variables.get(ctx.id(idCount).getText())).second());
                        } else if(ctx.operator(i).getText().equals("-")) {
                            val -= Double.parseDouble(symbolTableVariables.get(scope).get(variables.get(ctx.id(idCount).getText())).second());
                        } else if(ctx.operator(i).getText().equals("*")) {
                            val *= Double.parseDouble(symbolTableVariables.get(scope).get(variables.get(ctx.id(idCount).getText())).second());
                        } else {
                            val /= Double.parseDouble(symbolTableVariables.get(scope).get(variables.get(ctx.id(idCount).getText())).second());
                        }
                        idCount++;
                    }else{
                        try {
                            throw new Exception("Semantic error: You cannot concat a String with another Data Type");
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                }
            }



            return String.valueOf(val);
        }

    }

    public String createTransformedValue(LinearLanguageParser.TransformedContext ctx)  {
        Boolean stringMode = false;
        if((ParserRuleContext) ctx.getChild(0) instanceof LinearLanguageParser.LiteralContext) {
            if(ctx.literal(0).getText().contains("\"")){
                stringMode = true;
            }
        }else{
            if(symbolTableVariables.get(scope).get(ctx.id(0).getText()).first().equals("string")) {
                stringMode = true;
            }
        }
        Integer idCount = 0;
        Integer literalCount = 0;
        if(stringMode) {
            String val = "";

            if((ParserRuleContext) ctx.getChild(0) instanceof LinearLanguageParser.LiteralContext) {
                if(ctx.literal(0).getText().contains("\"")){
                    val = ctx.literal(0).getText().substring(1,ctx.literal(0).getText().length()-1);
                    literalCount++;
                }
            }else{
                if(symbolTableTypes.get(symbolTableVariables.get(scope).get(ctx.id(0).getText()).first()).equals("string")) {
                    val =symbolTableVariables.get(scope).get(ctx.id(0).getText()).second();
                    idCount++;
                }
            }
            for (Integer i  = 0; i < ctx.operator().size(); i++) {
                if((ParserRuleContext) ctx.getChild(2*i+2) instanceof LinearLanguageParser.LiteralContext) {
                    if(ctx.literal(literalCount).getText().contains("\"")){
                        val = val.concat(ctx.literal(literalCount).getText().substring(1,ctx.literal(literalCount).getText().length()-1));
                        literalCount++;
                    }else{
                        try {
                            throw new Exception("Semantic error: You cannot concat a String with another Data Type");
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                }else{
                    if(symbolTableTypes.get(symbolTableVariables.get(scope).get(ctx.id(0).getText()).first()).equals("string")) {
                        val = val.concat(symbolTableVariables.get(scope).get(ctx.id(0).getText()).second());
                        idCount++;
                    }else{
                        try {
                            throw new Exception("Semantic error: You cannot concat a String with another Data Type");
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                }
            }

            return val;
        }else{
            double val = 0.0;

            if((ParserRuleContext) ctx.getChild(0) instanceof LinearLanguageParser.LiteralContext) {
                val = val += Double.parseDouble(ctx.literal(0).getText());
                literalCount++;
            }else{
                    val = Double.parseDouble(symbolTableVariables.get(scope).get(ctx.id(0).getText()).second());
                    idCount++;
            }

            for (Integer i  = 0; i < ctx.operator().size(); i++) {
                if((ParserRuleContext) ctx.getChild(2*i+2) instanceof LinearLanguageParser.LiteralContext) {
                    if(ctx.literal(literalCount).getText().contains("\"")){
                        try {
                            throw new Exception("Semantic error: You cannot add a Integer or Float with another Data Type");
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }else{
                        val += Double.parseDouble(ctx.literal(literalCount).getText());
                        literalCount++;
                    }
                }else{
                    if(symbolTableTypes.get(symbolTableVariables.get(scope).get(ctx.id(0).getText()).first()).equals("string")) {
                        val += Double.parseDouble(symbolTableVariables.get(scope).get(ctx.id(0).getText()).second());
                        idCount++;
                    }else{
                        try {
                            throw new Exception("Semantic error: You cannot concat a String with another Data Type");
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                }
            }

            return String.valueOf(val);
        }

    }

    public void createAssignation(LinearLanguageParser.AssignationContext ctx) throws Exception {
        String value = "";
        if(ctx.value().id().size() == 1) {
            String id = ctx.value().id(0).getText();
            value = symbolTableVariables.get(scope).get(id).second();
        } else if(ctx.value().id().size() > 1) {
            String funcId = ctx.value().id(0).getText();
            ArrayList<String> parameters = new ArrayList<String>();
            for(Integer i = 1; i < ctx.value().id().size(); i++){
                parameters.add(ctx.value().id(i).getText());
            }
            value = (String) decodeProcess(funcId, parameters);
        } else if(ctx.value().literal() != null) {
            if(ctx.value().literal().getText().contains("\"")){
                value = ctx.value().literal().getText().substring(1,ctx.value().literal().getText().length()-1);
            }else{
                value = ctx.value().literal().getText();
            }
        } else if(ctx.value().transformed() != null) {
            value = createTransformedValue(ctx.value().transformed());
        }
        String id = "";
        if(ctx.id() != null) {
            id = ctx.id().getText();
        }else{
            id = ctx.getChild(1).getText();
        }
        if (symbolTableVariables.containsKey(scope)) {

            symbolTableVariables.get(scope).put(id, new Tuple<String, String>(ctx.type().getText(), value));
        }else{
            symbolTableVariables.put(scope, new HashMap<String, Tuple<String, String>>());
            symbolTableVariables.get(scope).put(id, new Tuple<String, String>(ctx.type().getText(), value));
        }
    }

    public void createAssignationSt(LinearLanguageParser.AssignationContext ctx, HashMap<String, String> variables) throws Exception {
        String value = "";
        if(ctx.value().id().size() == 1) {
            String id = variables.get(ctx.value().id(0).getText());
            value = symbolTableVariables.get(scope).get(id).second();
        } else if(ctx.value().id().size() > 1) {
            String funcId = ctx.value().id(0).getText();
            ArrayList<String> parameters = new ArrayList<String>();
            for(Integer i = 1; i < ctx.value().id().size(); i++){
                parameters.add(variables.get(ctx.value().id(i).getText()));
            }
            value = (String) decodeProcess(funcId, parameters);
        } else if(ctx.value().literal() != null) {
            if(ctx.value().literal().getText().contains("\"")){
                value = ctx.value().literal().getText().substring(1,ctx.value().literal().getText().length()-1);
            }else{
                value = ctx.value().literal().getText();
            }
        } else if(ctx.value().transformed() != null) {
            value = createTransformedValueSt(ctx.value().transformed(), variables);
        }
        String id = "";
        if(ctx.id() != null) {
            id = ctx.id().getText();
        }else{
            id = ctx.getChild(1).getText();
        }
        if (symbolTableVariables.containsKey(scope)) {

            symbolTableVariables.get(scope).put(id, new Tuple<String, String>(ctx.type().getText(), value));
        }else{
            symbolTableVariables.put(scope, new HashMap<String, Tuple<String, String>>());
            symbolTableVariables.get(scope).put(id, new Tuple<String, String>(ctx.type().getText(), value));
        }
    }



    public void decodeFuncExpr(LinearLanguageParser.Func_exprContext ctx,HashMap<String, LinearLanguageParser.ParameterContext> variables) throws Exception {
        if(ctx.assignation() != null) {
            createAssignation(ctx.assignation(), variables);
        } else if(ctx.proc_call() != null) {
            ArrayList<String> parameters = new ArrayList<String>();
            for(Integer i = 0; i < ctx.proc_call().parameter().size(); i++){
                LinearLanguageParser.ParameterContext parameter = variables.get(ctx.proc_call().parameter(i).getText());
                if(parameter.BOOLEAN() != null) {
                    parameters.add(parameter.getText());
                }else {
                    parameters.add(parameter.getText());
                }
            }
            decodeProcess(ctx.proc_call().id().getText(), parameters);
        } else {
            ArrayList<LinearLanguageParser.ParameterContext> parameters = new ArrayList<>();
            for(Integer i = 0; i < ctx.func_call().parameter().size(); i++) {
                parameters.add(variables.get(ctx.func_call().parameter(i).getText()));
            }
            LinearLanguageParser.Lin_exprContext linearPrefix = symbolTableFunctions.get(ctx.func_call().id().getText()).first();
            LinearLanguageParser.Lin_func_exprContext linearPost = symbolTableFunctions.get(ctx.func_call().id().getText()).second();


            HashMap<String, LinearLanguageParser.ParameterContext> variableTable = new HashMap<>();

            if(parameters.size() != linearPrefix.id().size()) {
                try {
                    throw new Exception(String.format("Semantic Error: Wrong Number of Parameters; %s Expected but %s Given"
                            , String.valueOf(parameters.size())
                            , String.valueOf(linearPrefix.id().size())));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            for(Integer i = 0; i < parameters.size(); i++) {
                LinearLanguageParser.ParameterContext parameter = parameters.get(i);
                if(parameter.BOOLEAN() == null) {
                    String parameterType = symbolTableVariables.get("global").get(parameter.getText()).first();
                    if(!parameterType.equals(linearPrefix.type(i).getText())) {
                        try {
                            throw new Exception(String.format("Semantic Error: Wrong Type; %s Expected but %s Given"
                                    , String.valueOf(parameterType)
                                    , String.valueOf(linearPrefix.type(i).getText())));
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                }
                variableTable.put(linearPrefix.id(i).getText(), parameter);
            }

            decodeFuncBodyElement(linearPost, variableTable);
        }
    }

    public void decodeFuncBodyElement(LinearLanguageParser.Lin_func_exprContext ctx, HashMap<String, LinearLanguageParser.ParameterContext> variables) {
        if(ctx.log_op().size() > 0) {
            for(Integer i = 0; i < ctx.log_op().size(); i++){
                Thread t1;
                Thread t2;
                final Integer j = i;
                if((ParserRuleContext) ctx.getChild(1+ 2*i) instanceof LinearLanguageParser.Func_exprContext){
                    t1 = new Thread(() -> {
                        try {
                            decodeFuncExpr((LinearLanguageParser.Func_exprContext) ctx.getChild(1+ 2*j), variables);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    });
                }else {
                    t1 = new Thread(() -> {
                        decodeFuncBodyElement((LinearLanguageParser.Lin_func_exprContext) ctx.getChild(1+ 2*j),variables);
                    });
                }

                if((ParserRuleContext) ctx.getChild(1+ 2*i + 2) instanceof LinearLanguageParser.Func_exprContext){
                    t2 = new Thread(() -> {
                        try {
                            decodeFuncExpr((LinearLanguageParser.Func_exprContext) ctx.getChild(1+ 2*j + 2), variables);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    });
                }else {
                    t2 = new Thread(() -> {
                        decodeFuncBodyElement((LinearLanguageParser.Lin_func_exprContext) ctx.getChild(1+ 2*j + 2),variables);
                    });
                }
                if(ctx.log_op(i).getText().equals("(x)")) {
                    t1.start();
                    t2.start();
                } else if (ctx.log_op(i).getText().equals("(+)")) {
                    if(Math.random() > 0.5) {
                        t1.start();
                    }else{
                        t2.start();
                    }
                } else if (ctx.log_op(i).getText().equals("&")) {
                    if(Math.random() > 0.5) {
                        t1.start();
                    }else{
                        t2.start();
                    }
                } else {
                    if(Math.random() > 0.5) {
                        t1.start();
                    }else{
                        t2.start();
                    }
                }
                try {
                    t1.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                try {
                    t2.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }else{
            if(ctx.func_expr() != null){
                    try {
                        decodeFuncExpr(ctx.func_expr(0), variables);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }

            }else {
                decodeFuncBodyElement(ctx.lin_func_expr(0),variables);
            }
        }

    }

    @Override
    public T visitFunc_call(LinearLanguageParser.Func_callContext ctx) {
        String id = ctx.id().getText();
        ArrayList<LinearLanguageParser.ParameterContext> parameters = new ArrayList<>();
        for(Integer i = 0; i < ctx.parameter().size(); i++) {
            parameters.add(ctx.parameter(i));
        }
        LinearLanguageParser.Lin_exprContext linearPrefix = symbolTableFunctions.get(ctx.id().getText()).first();
        LinearLanguageParser.Lin_func_exprContext linearPost = symbolTableFunctions.get(ctx.id().getText()).second();
        HashMap<String, LinearLanguageParser.ParameterContext> variableTable = new HashMap<>();

        if(parameters.size() != linearPrefix.id().size()) {
            try {
                throw new Exception(String.format("Semantic Error: Wrong Number of Parameters; %s Expected but %s Given"
                        , String.valueOf(parameters.size())
                        , String.valueOf(linearPrefix.id().size())));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        for(Integer i = 0; i < parameters.size(); i++) {
            LinearLanguageParser.ParameterContext parameter = parameters.get(i);
            if(parameter.BOOLEAN() == null) {
                if(!symbolTableVariables.get(scope).containsKey(parameter.getText())){
                    try {
                        throw new Exception(String.format("Semantic Error: Variable %s does not Exists"
                                , parameter.getText()));
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                String parameterType = symbolTableVariables.get("global").get(parameter.getText()).first();
                if(!parameterType.equals(linearPrefix.type(i).getText())) {
                    try {
                        throw new Exception(String.format("Semantic Error: Wrong Type; %s Expected but %s Given"
                                , String.valueOf(parameterType)
                                , String.valueOf(linearPrefix.type(i).getText())));
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
            variableTable.put(linearPrefix.id(i).getText(), parameter);
        }
        decodeFuncBodyElement(linearPost, variableTable);
        boolean modalApplied = false;
        for (Integer i = 0; i < linearPrefix.getChildCount(); i++){
            if(linearPrefix.getChild(i) instanceof ParserRuleContext) {
                if((ParserRuleContext) linearPrefix.getChild(i) instanceof LinearLanguageParser.Log_term_opContext && linearPrefix.getChild(i).getText().equals("!")) {
                    modalApplied = true;
                }else if((ParserRuleContext) linearPrefix.getChild(i) instanceof LinearLanguageParser.IdContext) {
                    if(modalApplied) {
                        modalApplied = false;
                    }else{
                        symbolTableVariables.get(scope).remove(variableTable.get(linearPrefix.getChild(i).getText()).getText());
                    }
                }
            }
        }
        return super.visitFunc_call(ctx);
    }

    @Override
    public T visitVal_id(LinearLanguageParser.Val_idContext ctx) {
        String actualScope = ctx.getText();
        if(!symbolTableVariables.containsKey(scope) ||symbolTableVariables.get(scope).containsKey(actualScope)){
            actualScope = "global";
        }
        String value = symbolTableVariables.get(actualScope).get(ctx.getText()).second();

        return (T) value;
    }


    @Override
    public T visitDeduct_def(LinearLanguageParser.Deduct_defContext ctx) {
        symbolTableDeducts.put(ctx.id().getText(), ctx);
        return null;
    }



    @Override
    public T visitDeduct(LinearLanguageParser.DeductContext ctx) {
        String rule = ctx.deduct_rule().getText();
        ArrayList<ArrayList<String>> premises = new ArrayList<>();
        for(Integer i = 0; i < ctx.getChildCount(); i++){
            if(ctx.getChild(i) instanceof ParserRuleContext) {
                if((ParserRuleContext) ctx.getChild(i) instanceof LinearLanguageParser.IdContext) {
                    LinearLanguageParser.Deduct_defContext deduct = symbolTableDeducts.get(ctx.getChild(i).getText());
                    ArrayList<String> deductList = new ArrayList<>();
                    for(Integer j = 0; j < deduct.term_id().size(); j++){
                        deductList.add(deduct.term_id(j).getText());
                    }
                    premises.add(deductList);
                }else if((ParserRuleContext) ctx.getChild(i) instanceof LinearLanguageParser.DeductContext) {
                    ArrayList<String> conclusion = (ArrayList<String>) visitDeduct((LinearLanguageParser.DeductContext) ctx.getChild(i));
                    premises.add(conclusion);
                }
            }
        }
        ArrayList<String> conclusions = new ArrayList<>();
        if(rule.equals("cut")) {
            if(premises.size() != 2) {
                try {
                    throw new Exception("Semantic Error: Cut rule can only be applied with two premises.");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            if(premises.get(0).get(0).equals("not" + premises.get(1).get(0)) ||  premises.get(1).get(0).equals("not" + premises.get(0).get(0))){
                for(Integer i = 1; i < premises.get(0).size(); i++){
                    conclusions.add(premises.get(0).get(i));
                }
                for(Integer i = 1; i < premises.get(1).size(); i++){
                    conclusions.add(premises.get(1).get(i));
                }
            }else{
                try {
                    throw new Exception("Semantic Error: Cut rule cannot be applied.");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }else if(rule.equals("&")) {
            if(premises.size() != 2) {
                try {
                    throw new Exception("Semantic Error: & rule can only be applied with two premises.");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            if(premises.get(0).size() != premises.get(1).size()){
                try {
                    throw new Exception("Semantic Error: & rule can only be applied with two premises with same length.");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            for(Integer i = 1; i < premises.get(0).size(); i++){
                if(!premises.get(1).get(i).equals(premises.get(0).get(i))){
                    try {
                        throw new Exception("Semantic Error: & rule can only be applied with two premises with same parameters after the first one.");
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }


            conclusions.add(premises.get(0).get(0).concat(" & ").concat(premises.get(1).get(0)));

            for(Integer i = 1; i < premises.get(1).size(); i++){
                conclusions.add(premises.get(1).get(i));
            }

        } else if(rule.equals("first (+)")){
            if(premises.size() != 1){
                try {
                    throw new Exception("Semantic Error: first (+) rule can only be applied with one premise.");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            conclusions.add(premises.get(0).get(0).concat(" (+) ").concat("ZZ"));
            for(Integer i = 1; i < premises.get(0).size(); i++){
                conclusions.add(premises.get(0).get(i));
            }
        } else if(rule.equals("second (+)")){
            if(premises.size() != 1){
                try {
                    throw new Exception("Semantic Error: second (+) rule can only be applied with one premise.");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            String val = "ZZ";
            conclusions.add(val.concat(" (+) ").concat(premises.get(0).get(0)));
            for(Integer i = 1; i < premises.get(0).size(); i++){
                conclusions.add(premises.get(0).get(i));
            }
        } else if(rule.equals("(x)")) {
            if(premises.size() != 2) {
                try {
                    throw new Exception("Semantic Error: (x) rule can only be applied with two premises.");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }


            conclusions.add(premises.get(0).get(0).concat(" (x) ").concat(premises.get(1).get(0)));

            for(Integer i = 1; i < premises.get(0).size(); i++){
                conclusions.add(premises.get(0).get(i));
            }
            for(Integer i = 1; i < premises.get(1).size(); i++){
                conclusions.add(premises.get(1).get(i));
            }
        } else {
            if(premises.size() != 1){
                try {
                    throw new Exception("Semantic Error: -& rule can only be applied with one premise.");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            if(premises.get(0).size() < 2) {
                try {
                    throw new Exception("Semantic Error: -& rule can only be applied with one premise with more than two propositional letters.");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            conclusions.add(premises.get(0).get(0).concat(" -& ").concat(premises.get(0).get(1)));
            for(Integer i = 2; i < premises.get(0).size(); i++){
                conclusions.add(premises.get(0).get(i));
            }
        }

        System.out.print("deduct: |- ");
        for(Integer i = 0; i < conclusions.size(); i++){
            if(i > 0) {
                System.out.print(" , ");
            }
            System.out.print(conclusions.get(i));
        }

        System.out.println();
        return (T) conclusions;
    }

    @Override
    public T visitLiteral(LinearLanguageParser.LiteralContext ctx) {
        if(ctx.getText().contains("\"")){
            return (T) ctx.getText().substring(1,ctx.getText().length()-1);

        }
        return (T) ctx.getText();
    }
}
