package cish_sys.dao;

import org.seasar.dao.annotation.tiger.Arguments;
import org.seasar.dao.annotation.tiger.S2Dao;
import cish_sys.entity.MstSkill;

@S2Dao(bean=MstSkill.class)
public interface MstSkillDao {
	public MstSkill[] selectAll();

	
	@Arguments({"SKILL_DIV","SKILL_CODE"})
	public MstSkill selectById(String skillDiv,String skillCode);
	
	public int insert(MstSkill mstSkill);

	public int update(MstSkill mstSkill);
	
	public int delete(MstSkill mstSkill);
}