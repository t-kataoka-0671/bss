package cish_sys.web.mstEngineer;

import java.util.Date;

import org.seasar.teeda.extension.annotation.validator.Required;

import org.seasar.teeda.core.exception.AppFacesException;

import cish_sys.entity.MstEngineer;
import cish_sys.web.CrudType;

public class MstEngineerEditPage extends AbstractMstEngineerPage {

	public MstEngineerEditPage() {
	}

	public Class initialize() {
		if(getCrudType() == CrudType.UPDATE) {
			MstEngineer data = getMstEngineerDao().selectById(getEngineerNo(), getStateFlag());
			if(data == null) {
				throw new AppFacesException("E0000001");
			}
			getMstEngineerDxo().convert(data ,this);
		}
		return null;
	}

	public Class prerender() {
		return null;
	}

	@Override
	@Required
	public void setEngineerNo(String engineerNo) {
		super.setEngineerNo(engineerNo);
	}
	@Override
	@Required
	public void setStateFlag(String stateFlag) {
		super.setStateFlag(stateFlag);
	}

	public String getIsNotCreateStyle() {
		return getCrudType() == CrudType.CREATE ? "display: none;" : null;
	}
}