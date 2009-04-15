package cish_sys.dao;

import org.seasar.dao.annotation.tiger.Arguments;
import org.seasar.dao.annotation.tiger.S2Dao;
import cish_sys.entity.MstCompany;
import cish_sys.paging.MstCompanyPagerCondition;

@S2Dao(bean=MstCompany.class)
public interface MstCompanyDao {
	public MstCompany[] selectAll();

	@Arguments({"argCompanyDiv"})
	public MstCompany[] findByCompanyDivPagerCondition(
		java.lang.String argCompanyDiv, MstCompanyPagerCondition dto);
	
	@Arguments("COMPANY_CODE")
	public MstCompany selectById(String companyCode);
	
	public int insert(MstCompany mstCompany);

	public int update(MstCompany mstCompany);
	
	public int delete(MstCompany mstCompany);
}