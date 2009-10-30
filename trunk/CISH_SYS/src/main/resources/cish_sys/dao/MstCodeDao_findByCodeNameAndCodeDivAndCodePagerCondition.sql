select * from MST_CODE
/*BEGIN*/
 where
       /*IF argCodeName != null*/
         CODE_NAME LIKE concat(/*argCodeName*/' ','%')
       /*END*/
       /*IF argCodeDiv != null*/
         and CODE_DIV LIKE concat(/*argCodeDiv*/' ','%')
       /*END*/
       /*IF argCode != null*/
         and CODE LIKE concat(/*argCode*/' ','%')
       /*END*/
/*END*/
 ORDER BY CODE_DIV,CODE,CODE_NAME
