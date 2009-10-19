package cish_sys.dao;

import org.seasar.dao.annotation.tiger.Arguments;
import org.seasar.dao.annotation.tiger.S2Dao;
import cish_sys.entity.MstCode;
import cish_sys.paging.MstCodePagerCondition;

@S2Dao(bean=MstCode.class)
public interface MstCodeDao {
	public MstCode[] selectAll();

	@Arguments({"argCodeName","argCodeDiv","argCode"})
	public MstCode[] findByCodeNameAndCodeDivAndCodePagerCondition(
		String argCodeName, String argCodeDiv, String argCode, MstCodePagerCondition dto);
	
	@Arguments({"CODE_DIV","CODE"})
	public MstCode selectById(String codeDiv,String code);
	
	public int insert(MstCode mstCode);

	public int update(MstCode mstCode);
	
	public int delete(MstCode mstCode);
}