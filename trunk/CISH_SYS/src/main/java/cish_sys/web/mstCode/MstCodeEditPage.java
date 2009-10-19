package cish_sys.web.mstCode;



import org.seasar.teeda.extension.annotation.validator.Required;
import org.seasar.teeda.core.exception.AppFacesException;

import cish_sys.entity.MstCode;
import cish_sys.web.CrudType;

public class MstCodeEditPage extends AbstractMstCodePage {

	public MstCodeEditPage() {
	}
	
	public Class<?> initialize() {
		if(getCrudType() == CrudType.UPDATE) {
			MstCode data = getMstCodeDao().selectById(getCodeDiv(), getCode());
			if(data == null) {
				throw new AppFacesException("E0000001");
			}
			getMstCodeDxo().convert(data ,this);
		}
		return null;
	}
	
	public Class<?> prerender() {
		return null;
	}

	@Override
	@Required
	public void setDelFlag(String delFlag) {
		super.setDelFlag(delFlag);
	}

	public String getIsNotCreateStyle() {
		return getCrudType() == CrudType.CREATE ? "display: none;" : null;
	}
}