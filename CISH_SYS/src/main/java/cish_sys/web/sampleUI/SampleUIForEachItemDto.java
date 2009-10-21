package cish_sys.web.sampleUI;

import java.io.Serializable;

public class SampleUIForEachItemDto implements Serializable {

	private static final long serialVersionUID = 1L;

	private int forEachId;

	private String forEachVal;

	public int getForEachId() {
		return forEachId;
	}

	public void setForEachId(int forEachId) {
		this.forEachId = forEachId;
	}

	public String getForEachVal() {
		return forEachVal;
	}

	public void setForEachVal(String forEachVal) {
		this.forEachVal = forEachVal;
	}
}
