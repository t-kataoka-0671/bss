select * from MST_SKILL
/*BEGIN*/
 where
       /*IF argSkillCode != null*/
             SKILL_CODE LIKE concat(concat('%',/*argSkillCode*/' '),'%')
       /*END*/
       /*IF argSkillDiv != null*/
           /*IF argSkillCode != null*/
             and
           /*END*/
             SKILL_DIV LIKE concat(concat('%',/*argSkillDiv*/' '),'%')
       /*END*/
       /*IF argSkillName != null*/
           /*IF argSkillCode != null || argSkillDiv != null*/
             and
           /*END*/
             SKILL_NAME LIKE concat(concat('%',/*argSkillName*/' '),'%')
       /*END*/
/*END*/
 ORDER BY SKILL_CODE,SKILL_DIV
