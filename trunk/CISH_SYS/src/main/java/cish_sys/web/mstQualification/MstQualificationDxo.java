package cish_sys.web.mstQualification;

import cish_sys.entity.MstQualification;

public interface MstQualificationDxo {

	public MstQualification convert(AbstractMstQualificationPage src);
	
	public void convert(MstQualification src, AbstractMstQualificationPage dest);
}