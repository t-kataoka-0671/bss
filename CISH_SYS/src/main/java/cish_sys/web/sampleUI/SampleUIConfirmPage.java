package cish_sys.web.sampleUI;

import java.util.Date;

import org.seasar.teeda.extension.annotation.convert.DateTimeConverter;
import org.seasar.teeda.extension.annotation.takeover.TakeOver;
import org.seasar.teeda.extension.annotation.takeover.TakeOverType;
import org.seasar.teeda.extension.annotation.validator.Required;
import org.seasar.teeda.core.exception.AppFacesException;
import org.seasar.teeda.extension.util.LabelHelper;

import cish_sys.entity.MstSkill;
import cish_sys.web.CrudType;

public class SampleUIConfirmPage extends AbstractSampleUIPage {

	private LabelHelper labelHelper;

	private String inputFileGetName;

	public SampleUIConfirmPage() {
	}

	public Class initialize() {
		this.inputFileGetName = InputFileGetName();
		return null;
	}

	public Class prerender() {
		return null;
	}

	public void setLabelHelper(LabelHelper labelHelper) {
		this.labelHelper = labelHelper;
	}

	public LabelHelper getLabelHelper() {
		return this.labelHelper;
	}

	public String getDoFinishValue() {
        return labelHelper.getLabelValue(CrudType.toString(getCrudType()));
    }


	public String getInputFileGetName() {
		if(inputFileGetName==null){
			this.inputFileGetName = InputFileGetName();
		}
		return inputFileGetName;
	}

	public void setInputFileGetName(String inputFileGetName) {
		this.inputFileGetName = inputFileGetName;
	}

	private String InputFileGetName() {
		StringBuilder sb = new StringBuilder();
		sb.append(getInputFile().getName());
		sb.append(" -> ");
		if(getInputFile().isInMemory()){
			sb.append("InMemory");
		}else{
			sb.append(getInputFile().getStoreLocation().getName());
		}
		return sb.toString();
	}
}