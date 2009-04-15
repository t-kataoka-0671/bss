package cish_sys.web.mstCompany;

import java.util.Date;

import org.seasar.teeda.extension.annotation.convert.DateTimeConverter;
import org.seasar.teeda.extension.annotation.takeover.TakeOver;
import org.seasar.teeda.extension.annotation.takeover.TakeOverType;
import org.seasar.teeda.extension.annotation.validator.Required;
import org.seasar.teeda.core.exception.AppFacesException;
import org.seasar.teeda.extension.util.LabelHelper;

import cish_sys.entity.MstCompany;
import cish_sys.web.CrudType;

public class MstCompanyConfirmPage extends AbstractMstCompanyPage {
	
	private LabelHelper labelHelper;
	
	public MstCompanyConfirmPage() {
	}
	
	public Class initialize() {
		if(isComeFromList()) {
			MstCompany data = getMstCompanyDao().selectById(getCompanyCode());
			if(data == null) {
				throw new AppFacesException("E0000001");
			}
			getMstCompanyDxo().convert(data ,this);
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
				getMstCompanyDao().insert(getMstCompanyDxo().convert(this));
				break;
			case CrudType.UPDATE:
				getMstCompanyDao().update(getMstCompanyDxo().convert(this));
				break;
			case CrudType.DELETE:
				getMstCompanyDao().delete(getMstCompanyDxo().convert(this));
				break;
			default:
				break;
		}
		return MstCompanyListPage.class;
	}
	
	public boolean isComeFromList() {
        return getCrudType() == CrudType.READ || getCrudType() == CrudType.DELETE;
    }

	@Override
	@Required
	public void setCompanyDiv(String companydiv) {
		super.setCompanyDiv(companydiv);
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
	public void setStateFlag(String stateflag) {
		super.setStateFlag(stateflag);
	}

	public void setLabelHelper(LabelHelper labelHelper) {
		this.labelHelper = labelHelper;
	}
	
	public LabelHelper getLabelHelper() {
		return this.labelHelper;
	}
	
	public String getJumpMstCompanyEditStyle() {
		return isComeFromList() ? "display: none;" : "";
	}

	public String getDoFinishValue() {
        return labelHelper.getLabelValue(CrudType.toString(getCrudType()));
    }
}