package cish_sys.web.mstCompany;

import java.util.Date;

import org.seasar.teeda.extension.annotation.validator.Required;

import org.seasar.teeda.core.exception.AppFacesException;

import cish_sys.entity.MstCompany;
import cish_sys.web.CrudType;

public class MstCompanyEditPage extends AbstractMstCompanyPage {

	public MstCompanyEditPage() {
	}

	public Class initialize() {
		if(getCrudType() == CrudType.UPDATE) {
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

	@Override
	@Required
	public void setCompanyCode(String companyCode) {
		super.setCompanyCode(companyCode);
	}
	@Override
	@Required
	public void setCompanyDiv(String companydiv) {
		super.setCompanyDiv(companydiv);
	}
	@Override
	@Required
	public void setStateFlag(String stateflag) {
		super.setStateFlag(stateflag);
	}

	public String getIsNotCreateStyle() {
		return getCrudType() == CrudType.CREATE ? "display: none;" : null;
	}
}