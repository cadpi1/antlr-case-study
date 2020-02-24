grammar ConditionalString;

/*
 * Parsers
 */

 // all valid checks
condition: '(' (comparable|biggerthan|smallerthan|biggerorequal|smallerorequal|equal|notequal|and|or|not)')';

biggerthan: comparable BIGGERTHAN comparable;
smallerthan: comparable SMALLERTHAN comparable;
biggerorequal: comparable BIGGEROREQUAL comparable;
smallerorequal: comparable SMALLEROREQUAL comparable;
equal: comparable EQUAL comparable;
notequal:comparable NOTEQUAL comparable;
and: comparable AND comparable;
or: comparable OR comparable;
not: NOT comparable;

//define what can be compared in a condition string
comparable: (btrue|bfalse|number|variable|maths);

// a mathematical operation
maths: '('(add|substract|divide|modulo|times)')';

// all valid mathematical operations
add: numberorvariable PLUS numberorvariable;
substract: numberorvariable MINUS numberorvariable;
divide: numberorvariable DIVIDED numberorvariable;
times: numberorvariable TIMES numberorvariable;
modulo: numberorvariable MODULO numberorvariable;

// types. btrue instead of true and bfalse instead of false to avoid conflicts when generating
btrue:'true';
bfalse:'false';
number:NUMBER;
variable: VARIABLE;
numberorvariable: NUMBER|variable;


/*
 * Lexers
 */

 //elements
NUMBER : [0-9]+ ;
WHITESPACE : ' ' -> skip ;
VARIABLE: [a-z]+'_'(NUMBER|[a-z]+);

//integer comparators
BIGGERTHAN: '>';
SMALLERTHAN: '<';
BIGGEROREQUAL: '>=';
SMALLEROREQUAL: '<=';
EQUAL: '==';
NOTEQUAL: '!=';

//boolean comparators
AND: '&&';
OR: '||';

//unary operator
NOT: '!';

//mathematical symbols
PLUS: '+';
MINUS: '-';
TIMES: '*';
DIVIDED: '/';
MODULO: '%';
