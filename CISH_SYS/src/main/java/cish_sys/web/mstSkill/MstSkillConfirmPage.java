package cish_sys.web.mstSkill;

import java.util.Date;

import org.seasar.teeda.extension.annotation.convert.DateTimeConverter;
import org.seasar.teeda.extension.annotation.takeover.TakeOver;
import org.seasar.teeda.extension.annotation.takeover.TakeOverType;
import org.seasar.teeda.extension.annotation.validator.Required;
import org.seasar.teeda.core.exception.AppFacesException;
import org.seasar.teeda.extension.util.LabelHelper;

import cish_sys.entity.MstSkill;
import cish_sys.web.CrudType;

public class MstSkillConfirmPage extends AbstractMstSkillPage {

	private LabelHelper labelHelper;

	public MstSkillConfirmPage() {
	}

	public Class initialize() {
		if(isComeFromList()) {
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

	@TakeOver(type = TakeOverType.NEVER)
	public Class doFinish() {
		switch(getCrudType()) {
			case CrudType.CREATE:
				getMstSkillDao().insert(getMstSkillDxo().convert(this));
				break;
			case CrudType.UPDATE:
				getMstSkillDao().update(getMstSkillDxo().convert(this));
				break;
			case CrudType.DELETE:
				getMstSkillDao().delete(getMstSkillDxo().convert(this));
				break;
			default:
				break;
		}
		return MstSkillListPage.class;
	}

	public boolean isComeFromList() {
        return getCrudType() == CrudType.READ || getCrudType() == CrudType.DELETE;
    }

	@Override
	@DateTimeConverter
	public Date getInsDate() {
		return super.getInsDate();
	}

	@Override
	@DateTimeConverter
	public Date getUpdDate() {
		return super.getUpdDate();
	}

	@Override
	@Required
	public void setDelFlag(String delflag) {
		super.setDelFlag(delflag);
	}

	public void setLabelHelper(LabelHelper labelHelper) {
		this.labelHelper = labelHelper;
	}

	public LabelHelper getLabelHelper() {
		return this.labelHelper;
	}

	public String getJumpMstSkillEditStyle() {
		return isComeFromList() ? "display: none;" : "";
	}

	public String getDoFinishValue() {
        return labelHelper.getLabelValue(CrudType.toString(getCrudType()));
    }
}