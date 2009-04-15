package cish_sys.web.mstSkill;

import cish_sys.entity.MstSkill;

public interface MstSkillDxo {

	public MstSkill convert(AbstractMstSkillPage src);
	
	public void convert(MstSkill src, AbstractMstSkillPage dest);
}