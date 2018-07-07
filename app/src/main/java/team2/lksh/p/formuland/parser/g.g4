grammar g;
root : variable EQ expr;
expr : MINUS expr
     | expr CAP expr
     | expr op = (MULT | DIV) expr
     | expr op = (PLUS | MINUS) expr
     | func LBR (expr (COMMA expr)*)? RBR
     | con
     | variable
     | NUMBER
     | LBR expr RBR;


func : UNDL ID;
con : AND ID;
variable : DOLL ID;

ID: [a-zA-Z]+;
PLUS:  '+';
MINUS: '-';
MULT:  '*';
DIV:   '/';
LBR:   '(';
RBR:   ')';
NUMBER: [0-9]+('.' [0-9]+)?;
UNDL:  '_';
DOLL:  '@';
AND:   '&';
DOT:   '.';
COMMA: ',';
EQ: '=';
CAP: '^';