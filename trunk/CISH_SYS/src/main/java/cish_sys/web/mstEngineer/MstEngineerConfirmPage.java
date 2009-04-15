package cish_sys.web.mstEngineer;

import java.util.Date;

import org.seasar.teeda.extension.annotation.convert.DateTimeConverter;
import org.seasar.teeda.extension.annotation.takeover.TakeOver;
import org.seasar.teeda.extension.annotation.takeover.TakeOverType;
import org.seasar.teeda.extension.annotation.validator.Required;
import org.seasar.teeda.core.exception.AppFacesException;
import org.seasar.teeda.extension.util.LabelHelper;

import cish_sys.entity.MstEngineer;
import cish_sys.web.CrudType;

public class MstEngineerConfirmPage extends AbstractMstEngineerPage {
	
	private LabelHelper labelHelper;
	
	public MstEngineerConfirmPage() {
	}
	
	public Class initialize() {
		if(isComeFromList()) {
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

	@TakeOver(type = TakeOverType.NEVER)
	public Class doFinish() {
		switch(getCrudType()) {
			case CrudType.CREATE:
				getMstEngineerDao().insert(getMstEngineerDxo().convert(this));
				break;
			case CrudType.UPDATE:
				getMstEngineerDao().update(getMstEngineerDxo().convert(this));
				break;
			case CrudType.DELETE:
				getMstEngineerDao().delete(getMstEngineerDxo().convert(this));
				break;
			default:
				break;
		}
		return MstEngineerListPage.class;
	}
	
	public boolean isComeFromList() {
        return getCrudType() == CrudType.READ || getCrudType() == CrudType.DELETE;
    }

	@Override
	@DateTimeConverter
	public Date getBirth() {
		return super.getBirth();
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

	public void setLabelHelper(LabelHelper labelHelper) {
		this.labelHelper = labelHelper;
	}
	
	public LabelHelper getLabelHelper() {
		return this.labelHelper;
	}
	
	public String getJumpMstEngineerEditStyle() {
		return isComeFromList() ? "display: none;" : "";
	}

	public String getDoFinishValue() {
        return labelHelper.getLabelValue(CrudType.toString(getCrudType()));
    }
}