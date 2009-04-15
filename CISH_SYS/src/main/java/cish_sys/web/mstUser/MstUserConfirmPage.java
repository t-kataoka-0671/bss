package cish_sys.web.mstUser;


import org.seasar.teeda.extension.annotation.convert.DateTimeConverter;
import org.seasar.teeda.extension.annotation.takeover.TakeOver;
import org.seasar.teeda.extension.annotation.takeover.TakeOverType;
import org.seasar.teeda.extension.annotation.validator.Required;
import org.seasar.teeda.core.exception.AppFacesException;
import org.seasar.teeda.extension.util.LabelHelper;

import cish_sys.entity.MstUser;
import cish_sys.web.CrudType;

public class MstUserConfirmPage extends AbstractMstUserPage {
	
	private LabelHelper labelHelper;
	
	public MstUserConfirmPage() {
	}
	
	public Class initialize() {
		if(isComeFromList()) {
			MstUser data = getMstUserDao().selectById(getId());
			if(data == null) {
				throw new AppFacesException("E0000001");
			}
			getMstUserDxo().convert(data ,this);
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
				getMstUserDao().insert(getMstUserDxo().convert(this));
				break;
			case CrudType.UPDATE:
				getMstUserDao().update(getMstUserDxo().convert(this));
				break;
			case CrudType.DELETE:
				getMstUserDao().delete(getMstUserDxo().convert(this));
				break;
			default:
				break;
		}
		return MstUserListPage.class;
	}
	
	public boolean isComeFromList() {
        return getCrudType() == CrudType.READ || getCrudType() == CrudType.DELETE;
    }

	@Override
	@Required
	public void setDelFlag(String delflag) {
		super.setDelFlag(delflag);
	}

	@Override
	@Required
	public void setLoginId(String loginid) {
		super.setLoginId(loginid);
	}

	public void setLabelHelper(LabelHelper labelHelper) {
		this.labelHelper = labelHelper;
	}
	
	public LabelHelper getLabelHelper() {
		return this.labelHelper;
	}
	
	public String getJumpMstUserEditStyle() {
		return isComeFromList() ? "display: none;" : "";
	}

	public String getDoFinishValue() {
        return labelHelper.getLabelValue(CrudType.toString(getCrudType()));
    }
}