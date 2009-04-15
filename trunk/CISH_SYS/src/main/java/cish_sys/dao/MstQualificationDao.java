package cish_sys.dao;

import org.seasar.dao.annotation.tiger.Arguments;
import org.seasar.dao.annotation.tiger.S2Dao;
import cish_sys.entity.MstQualification;

@S2Dao(bean=MstQualification.class)
public interface MstQualificationDao {
	public MstQualification[] selectAll();

	
	@Arguments({"QUA_DIV","QUA_CODE"})
	public MstQualification selectById(String quaDiv,String quaCode);
	
	public int insert(MstQualification mstQualification);

	public int update(MstQualification mstQualification);
	
	public int delete(MstQualification mstQualification);
}