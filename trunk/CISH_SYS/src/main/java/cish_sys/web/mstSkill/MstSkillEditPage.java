package cish_sys.web.mstSkill;

import java.util.Date;

import org.seasar.teeda.extension.annotation.convert.DateTimeConverter;
import org.seasar.teeda.extension.annotation.validator.ByteLength;
import org.seasar.teeda.extension.annotation.validator.Required;

import org.seasar.teeda.core.exception.AppFacesException;

import cish_sys.entity.MstSkill;
import cish_sys.web.CrudType;

public class MstSkillEditPage extends AbstractMstSkillPage {

	public MstSkillEditPage() {
	}

	public Class initialize() {
		if(getCrudType() == CrudType.UPDATE) {
			MstSkill data = getMstSkillDao().selectById(getSkillDiv(), getSkillCode());
			if(data == null) {
				throw new AppFacesException("E0000001");
			}
			getMstSkillDxo().convert(data ,this);
		}
		return null;
	}

	public Class prerender() {
		return null;
	}

	public String getMstSkillTitle(){
		return "マスタメンテナンス【スキルマスタ】";
	}

	@Override
	@Required
	@ByteLength(maximum = 2)
	public void setSkillDiv(String skillDiv) {
		super.setSkillDiv(skillDiv);
	}

	@Override
	@Required
	@ByteLength(maximum = 3)
	public void setSkillCode(String skillCode) {
		super.setSkillCode(skillCode);
	}

	@Override
	@ByteLength(maximum = 50)
	public void setSkillName(String skillName) {
		super.setSkillName(skillName);
	}

	@Override
	@ByteLength(maximum = 8)
	public void setInsUser(String insUser) {
		super.setInsUser(insUser);
	}

	@Override
	@ByteLength(maximum = 8)
	public void setUpdUser(String updUser) {
		super.setUpdUser(updUser);
	}

	@Override
	@Required
	@ByteLength(maximum = 1)
	public void setDelFlag(String delflag) {
		super.setDelFlag(delflag);
	}

	public boolean isCreate(){
		Date sysDate = new Date();
		if(getCrudType() == CrudType.CREATE) {
			super.setInsDate(sysDate);
			return true;
		}else{
			super.setUpdDate(sysDate);
			return false;
		}
	}

	public String getIsNotCreateStyle() {
		return getCrudType() == CrudType.CREATE ? "display: none;" : null;
	}
}