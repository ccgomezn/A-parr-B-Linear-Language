grammar LinearLanguage;

program: (type_def';' | NEWLINE)*
         (func_def | proc_def | NEWLINE)*
         (var_def';' | NEWLINE)*
         (func_call | deduct_def | deduct | NEWLINE)*;
func_call: id '(' parameter (',' parameter) * ')' (';')?;
parameter: BOOLEAN | id;
deduct: '[' (deduct | id) (',' (deduct | id) )* ']' '->' deduct_rule;
deduct_rule: 'cut' |
      '&' |
      'first (+)' |
      'second (+)' |
      '(x)' |
      '-&';

type_def: type_var id;
var_def: type id '=' (literal | val_id);
val_id: id;
func_def: 'def' 'func' id lin_expr '-o' lin_func_expr ';';
lin_expr:  '(' (log_term_op)? type id (log_op ((log_term_op)? type id | lin_expr))* ')';
log_op: '(x)'
      | '(+)'
      | '&'
      | '-&';
log_term_op: 'not'
             | '!'
             | '?';
value: literal
     | id '(' id (',' id)* ')'
     | transformed
     | id;
transformed: (id | literal) operator (id | literal) (operator (id | literal))*;
assignation: type id '=' value;
func_expr: assignation
         | proc_call
         |func_call;
proc_call: id '->' parameter (',' parameter) *;
lin_func_expr: '(' (lin_func_expr |func_expr) (log_op (lin_func_expr |func_expr))* ')';
deduct_def: 'def' 'deduct' id '-|' term_id  (',' term_id)* ';';
term_id: (log_term_op)? id;
proc_def: 'def' 'proc' id '(' id id (',' id id)* ')' '{' proc_body '}';
proc_body: stmt*
           ('return' id ';')?;
stmt: 'print(' (literal | val_id) ');'
     | id '(' id (',' id)* ')' ';'
     | assignation ';'
     | NEWLINE;
type: id;
type_var: 'string'
        | 'int'
        | 'bool'
        | 'float';
operator: '+'
        | '-'
        | '*'
        | '**'
        | '/';
literal: INTEGER
       | STRING
       | BOOLEAN;
BOOLEAN : 'True' | 'False' | '0a' | '1m';

id : ID;
ID: ('a'..'z' | 'A'..'Z')('a'..'z' | 'A'..'Z' | '0'..'9' | '_')*;
SKIP_: ( SPACES ) -> skip;

INTEGER : ('0'..'9')+;
STRING  : '"' (' '..'!' | '#'..'[' | ']'..'~' | '\\"' | '\\n' | '\\t' | '\\\\' )* '"';
SPACES: ' ';
NEWLINE: ( '\r'? '\n' | '\r' | '\f' );
