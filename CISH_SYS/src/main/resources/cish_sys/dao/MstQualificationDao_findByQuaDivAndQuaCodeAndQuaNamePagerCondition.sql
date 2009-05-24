select * from MST_QUALIFICATION
/*BEGIN*/
 where
       /*IF argQuaDiv != null*/
             QUA_DIV LIKE concat(/*argQuaDiv*/' ','%')
       /*END*/
       /*IF argQuaCode != null*/
           /*IF argQuaDiv != null*/
             and
           /*END*/
             QUA_CODE LIKE concat(/*argQuaCode*/' ','%')
       /*END*/
       /*IF argQuaName != null*/
           /*IF argQuaDiv != null || argQuaCode != null*/
             and
           /*END*/
             QUA_NAME LIKE concat(/*argQuaName*/' ','%')
       /*END*/
/*END*/
 ORDER BY QUA_DIV,QUA_CODE,QUA_NAME
