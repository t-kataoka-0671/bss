package cish_sys.web.sampleUI;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.seasar.framework.util.ArrayUtil;
import org.seasar.teeda.extension.util.UploadedFile;

import cish_sys.web.AbstractCrudPage;

public abstract class AbstractSampleUIPage extends AbstractCrudPage {

	private String outputText;

	private String inputText;

	private String inputSecret;

	private String inputHidden;

	private String inputTextarea;

	private String inputRadio;

	private String selectOneRadio;

	private List selectOneRadioItems;

	private Boolean selectBooleanCheckbox;

	private String[] selectManyCheckbox;

	private List selectManyCheckboxItems;

	private String selectOneMenu;

	private List selectOneMenuItems;

	private String[] selectManyList;

	private List selectManyListItems;

	private UploadedFile inputFile;

	private Date popupCalendar;

	private String commandButton;

	private List forEachItems;

	public String getOutputText() {
		return outputText;
	}

	public void setOutputText(String outputText) {
		this.outputText = outputText;
	}

	public String getInputText() {
		return inputText;
	}

	public void setInputText(String inputText) {
		this.inputText = inputText;
	}

	public String getInputSecret() {
		return inputSecret;
	}

	public void setInputSecret(String inputSecret) {
		this.inputSecret = inputSecret;
	}

	public String getInputHidden() {
		return inputHidden;
	}

	public void setInputHidden(String inputHidden) {
		this.inputHidden = inputHidden;
	}

	public void setInputTextarea(String inputTextarea) {
		this.inputTextarea = inputTextarea;
	}

	public String getInputTextarea() {
		return inputTextarea;
	}

	public String getInputRadio() {
		return inputRadio;
	}

	public void setInputRadio(String inputRadio) {
		this.inputRadio = inputRadio;
	}

	public String getSelectOneRadio() {
		return selectOneRadio;
	}

	public void setSelectOneRadio(String selectOneRadio) {
		this.selectOneRadio = selectOneRadio;
	}

	public List getSelectOneRadioItems() {
		return selectOneRadioItems;
	}

	public void setSelectOneRadioItems(List selectOneRadioItems) {
		this.selectOneRadioItems = selectOneRadioItems;
	}

	public Boolean getSelectBooleanCheckbox() {
		return selectBooleanCheckbox;
	}

	public void setSelectBooleanCheckbox(Boolean selectBooleanCheckbox) {
		this.selectBooleanCheckbox = selectBooleanCheckbox;
	}

	public String[] getSelectManyCheckbox() {
		if (selectManyCheckbox == null) {
			selectManyCheckbox = new String[0];
		}
		return selectManyCheckbox;
	}

	public void setSelectManyCheckbox(String[] selectManyCheckbox) {
		this.selectManyCheckbox = selectManyCheckbox;
	}

	public String getSelectManyCheckboxValue() {
		return ArrayUtil.toString(getSelectManyCheckbox());
	}

	public List getSelectManyCheckboxItems() {
		return selectManyCheckboxItems;
	}

	public void setSelectManyCheckboxItems(List selectManyCheckboxItems) {
		this.selectManyCheckboxItems = selectManyCheckboxItems;
	}

	public String getSelectOneMenu() {
		return selectOneMenu;
	}

	public void setSelectOneMenu(String selectOneMenu) {
		this.selectOneMenu = selectOneMenu;
	}

	public List getSelectOneMenuItems() {
		return selectOneMenuItems;
	}

	public void setSelectOneMenuItems(List selectOneMenuItems) {
		this.selectOneMenuItems = selectOneMenuItems;
	}

	public String[] getSelectManyList() {
		if (selectManyList == null) {
			selectManyList = new String[0];
		}
		return selectManyList;
	}

	public void setSelectManyList(String[] selectManyList) {
		this.selectManyList = selectManyList;
	}

	public List getSelectManyListItems() {
		return selectManyListItems;
	}

	public String getSelectManyListValue() {
		return ArrayUtil.toString(getSelectManyList());
	}

	public void setSelectManyListItems(List selectManyListItems) {
		this.selectManyListItems = selectManyListItems;
	}

	public UploadedFile getInputFile() {
		return inputFile;
	}

	public void setInputFile(UploadedFile inputFile) {
		this.inputFile = inputFile;
	}

	public Date getPopupCalendar() {
		return popupCalendar;
	}

	public void setPopupCalendar(Date popupCalendar) {
		this.popupCalendar = popupCalendar;
	}

	public String getCommandButton() {
		return commandButton;
	}

	public void setCommandButton(String commandButton) {
		this.commandButton = commandButton;
	}

	public List getForEachItems() {
		return forEachItems;
	}

	public void setForEachItems(List forEachItems) {
		this.forEachItems = forEachItems;
	}

}