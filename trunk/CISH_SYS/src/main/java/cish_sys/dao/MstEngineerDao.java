package cish_sys.dao;

import org.seasar.dao.annotation.tiger.Arguments;
import org.seasar.dao.annotation.tiger.S2Dao;
import cish_sys.entity.MstEngineer;

@S2Dao(bean=MstEngineer.class)
public interface MstEngineerDao {
	public MstEngineer[] selectAll();

	
	@Arguments({"ENGINEER_NO","STATE_FLAG"})
	public MstEngineer selectById(String engineerNo,String stateFlag);
	
	public int insert(MstEngineer mstEngineer);

	public int update(MstEngineer mstEngineer);
	
	public int delete(MstEngineer mstEngineer);
}