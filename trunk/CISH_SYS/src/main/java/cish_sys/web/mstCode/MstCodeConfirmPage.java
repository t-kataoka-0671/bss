package cish_sys.web.mstCode;

import java.util.Date;

import org.seasar.teeda.extension.annotation.convert.DateTimeConverter;
import org.seasar.teeda.extension.annotation.takeover.TakeOver;
import org.seasar.teeda.extension.annotation.takeover.TakeOverType;
import org.seasar.teeda.extension.annotation.validator.Required;
import org.seasar.teeda.core.exception.AppFacesException;
import org.seasar.teeda.extension.util.LabelHelper;

import cish_sys.entity.MstCode;
import cish_sys.web.CrudType;

public class MstCodeConfirmPage extends AbstractMstCodePage {
	
	private LabelHelper labelHelper;
	
	public MstCodeConfirmPage() {
	}
	
	public Class initialize() {
		if(isComeFromList()) {
			MstCode data = getMstCodeDao().selectById(getCodeDiv(), getCode());
			if(data == null) {
				throw new AppFacesException("E0000001");
			}
			getMstCodeDxo().convert(data ,this);
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
				getMstCodeDao().insert(getMstCodeDxo().convert(this));
				break;
			case CrudType.UPDATE:
				getMstCodeDao().update(getMstCodeDxo().convert(this));
				break;
			case CrudType.DELETE:
				getMstCodeDao().delete(getMstCodeDxo().convert(this));
				break;
			default:
				break;
		}
		return MstCodeListPage.class;
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
	
	public String getJumpMstCodeEditStyle() {
		return isComeFromList() ? "display: none;" : "";
	}

	public String getDoFinishValue() {
        return labelHelper.getLabelValue(CrudType.toString(getCrudType()));
    }
}