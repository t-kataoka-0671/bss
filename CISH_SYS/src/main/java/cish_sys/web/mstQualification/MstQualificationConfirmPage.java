package cish_sys.web.mstQualification;

import java.util.Date;

import org.seasar.teeda.extension.annotation.convert.DateTimeConverter;
import org.seasar.teeda.extension.annotation.takeover.TakeOver;
import org.seasar.teeda.extension.annotation.takeover.TakeOverType;
import org.seasar.teeda.extension.annotation.validator.Required;
import org.seasar.teeda.core.exception.AppFacesException;
import org.seasar.teeda.extension.util.LabelHelper;

import cish_sys.entity.MstQualification;
import cish_sys.web.CrudType;

public class MstQualificationConfirmPage extends AbstractMstQualificationPage {
	
	private LabelHelper labelHelper;
	
	public MstQualificationConfirmPage() {
	}
	
	public Class initialize() {
		if(isComeFromList()) {
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

	@TakeOver(type = TakeOverType.NEVER)
	public Class doFinish() {
		switch(getCrudType()) {
			case CrudType.CREATE:
				getMstQualificationDao().insert(getMstQualificationDxo().convert(this));
				break;
			case CrudType.UPDATE:
				getMstQualificationDao().update(getMstQualificationDxo().convert(this));
				break;
			case CrudType.DELETE:
				getMstQualificationDao().delete(getMstQualificationDxo().convert(this));
				break;
			default:
				break;
		}
		return MstQualificationListPage.class;
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
	
	public String getJumpMstQualificationEditStyle() {
		return isComeFromList() ? "display: none;" : "";
	}

	public String getDoFinishValue() {
        return labelHelper.getLabelValue(CrudType.toString(getCrudType()));
    }
}