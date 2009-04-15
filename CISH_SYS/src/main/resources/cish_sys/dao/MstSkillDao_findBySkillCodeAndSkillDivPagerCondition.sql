select * from MST_SKILL
/*BEGIN*/
 where
       /*IF argSkillCode != null*/
             SKILL_CODE LIKE concat(/*argSkillCode*/' ','%')
       /*END*/
       /*IF argSkillDiv != null*/
           /*IF argSkillCode != null*/
             and
           /*END*/
             SKILL_DIV LIKE concat(/*argSkillDiv*/' ','%')
       /*END*/
/*END*/
 ORDER BY SKILL_CODE,SKILL_DIV
