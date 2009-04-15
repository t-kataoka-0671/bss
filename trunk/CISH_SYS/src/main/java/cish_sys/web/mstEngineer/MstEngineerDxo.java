package cish_sys.web.mstEngineer;

import cish_sys.entity.MstEngineer;

public interface MstEngineerDxo {

	public MstEngineer convert(AbstractMstEngineerPage src);
	
	public void convert(MstEngineer src, AbstractMstEngineerPage dest);
}