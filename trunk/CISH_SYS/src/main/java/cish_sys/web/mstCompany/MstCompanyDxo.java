package cish_sys.web.mstCompany;

import cish_sys.entity.MstCompany;

public interface MstCompanyDxo {

	public MstCompany convert(AbstractMstCompanyPage src);
	
	public void convert(MstCompany src, AbstractMstCompanyPage dest);
}