package cish_sys.dao;

import org.seasar.dao.annotation.tiger.Arguments;
import org.seasar.dao.annotation.tiger.S2Dao;
import cish_sys.entity.MstSkill;
import cish_sys.paging.MstSkillPagerCondition;

@S2Dao(bean=MstSkill.class)
public interface MstSkillDao {
	public MstSkill[] selectAll();

	@Arguments({"argSkillCode","argSkillDiv","argSkillName"})
	public MstSkill[] findBySkillCodeAndSkillDivAndSkillNamePagerCondition(java.lang.String argSkillCode, java.lang.String argSkillDiv, java.lang.String argSkillName, MstSkillPagerCondition dto);

	@Arguments({"SKILL_DIV","SKILL_CODE"})
	public MstSkill selectById(String skillDiv,String skillCode);

	public int insert(MstSkill mstSkill);

	public int update(MstSkill mstSkill);

	public int delete(MstSkill mstSkill);
}