import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.File;

public class Main {
    public static void main(String[] args) throws Exception {
        try{
            LinearLanguageLexer lexer;
            if (args.length>0)
                lexer = new LinearLanguageLexer(CharStreams.fromFileName(args[0]));
            else
                lexer = new LinearLanguageLexer(CharStreams.fromStream(System.in));
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            LinearLanguageParser parser = new LinearLanguageParser(tokens);
            ParseTree tree = parser.program();
            LinearLanguageInterpreter<String> loader = new LinearLanguageInterpreter<String>();
            loader.visit(tree);

        } catch (Exception e){
            System.err.println("Error (Test): " + e);
        }
    }
}
