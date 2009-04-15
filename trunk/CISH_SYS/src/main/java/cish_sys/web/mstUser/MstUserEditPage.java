package cish_sys.web.mstUser;


import org.seasar.teeda.extension.annotation.validator.Required;

import org.seasar.teeda.core.exception.AppFacesException;

import cish_sys.entity.MstUser;
import cish_sys.web.CrudType;

public class MstUserEditPage extends AbstractMstUserPage {

	public MstUserEditPage() {
	}

	public Class initialize() {
		if(getCrudType() == CrudType.UPDATE) {
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

	@Override
	@Required
	public void setId(Long id) {
		super.setId(id);
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

	public String getIsNotCreateStyle() {
		return getCrudType() == CrudType.CREATE ? "display: none;" : null;
	}
}