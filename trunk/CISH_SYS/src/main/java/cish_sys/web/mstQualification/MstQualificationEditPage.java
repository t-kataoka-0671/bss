package cish_sys.web.mstQualification;

import java.util.Date;

import org.seasar.teeda.extension.annotation.validator.Required;

import org.seasar.teeda.core.exception.AppFacesException;

import cish_sys.entity.MstQualification;
import cish_sys.web.CrudType;

public class MstQualificationEditPage extends AbstractMstQualificationPage {

	public MstQualificationEditPage() {
	}

	public Class initialize() {
		if(getCrudType() == CrudType.UPDATE) {
			MstQualification data = getMstQualificationDao().selectById(getQuaDiv(), getQuaCode());
			if(data == null) {
				throw new AppFacesException("E0000001");
			}
			getMstQualificationDxo().convert(data ,this);
		}
		return null;
	}

	public Class prerender() {
		return null;
	}

	@Override
	@Required
	public void setQuaDiv(String quaDiv) {
		super.setQuaDiv(quaDiv);
	}

	@Override
	@Required
	public void setQuaCode(String quaCode) {
		super.setQuaCode(quaCode);
	}

	@Override
	@Required
	public void setDelFlag(String delflag) {
		super.setDelFlag(delflag);
	}

	public String getIsNotCreateStyle() {
		return getCrudType() == CrudType.CREATE ? "display: none;" : null;
	}
}