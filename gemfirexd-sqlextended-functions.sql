drop function INITCAP;
drop function REMOVE;
drop function LPAD;
drop function RPAD;
drop function GFXD_TRANSLATE;
drop function REPLACE;
drop function INSTR;

CREATE FUNCTION INITCAP (data VARCHAR(32672)) RETURNS VARCHAR(32672)
LANGUAGE JAVA
EXTERNAL NAME 'pivotal.au.accelarator.gemfirexd.sql.functions.GemFireXdSqlFunctions.initcap'
PARAMETER STYLE JAVA;

CREATE FUNCTION REMOVE (data VARCHAR(32672), replace VARCHAR(32672)) RETURNS VARCHAR(32672)
LANGUAGE JAVA
EXTERNAL NAME 'pivotal.au.accelarator.gemfirexd.sql.functions.GemFireXdSqlFunctions.remove'
PARAMETER STYLE JAVA;

CREATE FUNCTION LPAD (data VARCHAR(32672), size int, padchar VARCHAR(1)) RETURNS VARCHAR(32672)
LANGUAGE JAVA
EXTERNAL NAME 'pivotal.au.accelarator.gemfirexd.sql.functions.GemFireXdSqlFunctions.lpad'
PARAMETER STYLE JAVA;

CREATE FUNCTION RPAD (data VARCHAR(32672), size int, padchar VARCHAR(1)) RETURNS VARCHAR(32672)
LANGUAGE JAVA
EXTERNAL NAME 'pivotal.au.accelarator.gemfirexd.sql.functions.GemFireXdSqlFunctions.rpad'
PARAMETER STYLE JAVA;

CREATE FUNCTION GFXD_TRANSLATE (data VARCHAR(32672), searchchars VARCHAR(32672), replacechars VARCHAR(32672)) RETURNS VARCHAR(32672)
LANGUAGE JAVA
EXTERNAL NAME 'pivotal.au.accelarator.gemfirexd.sql.functions.GemFireXdSqlFunctions.translate'
PARAMETER STYLE JAVA;

CREATE FUNCTION REPLACE (data VARCHAR(32672), searchchars VARCHAR(32672), replacechars VARCHAR(32672)) RETURNS VARCHAR(32672)
LANGUAGE JAVA
EXTERNAL NAME 'pivotal.au.accelarator.gemfirexd.sql.functions.GemFireXdSqlFunctions.replace'
PARAMETER STYLE JAVA;

CREATE FUNCTION INSTR (data VARCHAR(32672), searchchars VARCHAR(32672), startposition int, appearance int) RETURNS INT
LANGUAGE JAVA
EXTERNAL NAME 'pivotal.au.accelarator.gemfirexd.sql.functions.GemFireXdSqlFunctions.instr'
PARAMETER STYLE JAVA;