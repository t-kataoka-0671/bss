package cish_sys.web.sampleUI;

import java.util.Date;
import java.util.List;
import java.util.Map;

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

	private String selectManyCheckboxValue;

	private List selectManyCheckboxItems;

	private String selectOneMenu;

	private List selectOneMenuItems;

	private String[] selectManyList;

	private String selectManyListValue;

	private List selectManyListItems;

	private String inputFile;

	private Date popupCalendar;

	private String commandButton;

	private List forEach;

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
		return selectManyCheckbox;
	}

	public void setSelectManyCheckbox(String[] selectManyCheckbox) {
		this.selectManyCheckbox = selectManyCheckbox;
	}

	public String getSelectManyCheckboxValue() {
		return selectManyCheckboxValue;
	}

	public void setSelectManyCheckboxValue(String selectManyCheckboxValue) {
		this.selectManyCheckboxValue = selectManyCheckboxValue;
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
		return selectManyList;
	}

	public void setSelectManyList(String[] selectManyList) {
		this.selectManyList = selectManyList;
	}

	public List getSelectManyListItems() {
		return selectManyListItems;
	}

	public String getSelectManyListValue() {
		return selectManyListValue;
	}

	public void setSelectManyListValue(String selectManyListValue) {
		this.selectManyListValue = selectManyListValue;
	}

	public void setSelectManyListItems(List selectManyListItems) {
		this.selectManyListItems = selectManyListItems;
	}

	public String getInputFile() {
		return inputFile;
	}

	public void setInputFile(String inputFile) {
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

	public List getForEach() {
		return forEach;
	}

	public void setForEach(List forEach) {
		this.forEach = forEach;
	}
}