select * from MST_COMPANY
/*BEGIN*/
 where
       /*IF argCompanyDiv != null*/
             COMPANY_DIV LIKE concat(/*argCompanyDiv*/' ','%')
       /*END*/
/*END*/
 ORDER BY COMPANY_DIV
