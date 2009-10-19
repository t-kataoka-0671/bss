package cish_sys.web.UITest;

import java.util.Date;
import java.util.List;

import cish_sys.web.AbstractCrudPage;

public abstract class AbstractUITestPage extends AbstractCrudPage {

	private String outputText;

	private String inputText;

	private String inputHidden;

	private String inputRadio;

	private String inputSecret;

	private String inputTextarea;

	private String inputFile;

	private Date popupCalendar;

	private String selectOneMenu;

	private String selectOneRadio;

	private Boolean selectBooleanCheckbox;

	private List selectManyCheckbox;

	private List forEach;

	private String commandButton;


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

	public String getInputHidden() {
		return inputHidden;
	}

	public void setInputHidden(String inputHidden) {
		this.inputHidden = inputHidden;
	}

	public String getInputRadio() {
		return inputRadio;
	}

	public void setInputRadio(String inputRadio) {
		this.inputRadio = inputRadio;
	}

	public String getInputSecret() {
		return inputSecret;
	}

	public void setInputSecret(String inputSecret) {
		this.inputSecret = inputSecret;
	}

	public String getInputTextarea() {
		return inputTextarea;
	}

	public void setInputTextarea(String inputTextarea) {
		this.inputTextarea = inputTextarea;
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

	public String getSelectOneMenu() {
		return selectOneMenu;
	}

	public void setSelectOneMenu(String selectOneMenu) {
		this.selectOneMenu = selectOneMenu;
	}

	public String getSelectOneRadio() {
		return selectOneRadio;
	}

	public void setSelectOneRadio(String selectOneRadio) {
		this.selectOneRadio = selectOneRadio;
	}

	public Boolean getSelectBooleanCheckbox() {
		return selectBooleanCheckbox;
	}

	public void setSelectBooleanCheckbox(Boolean selectBooleanCheckbox) {
		this.selectBooleanCheckbox = selectBooleanCheckbox;
	}

	public List getSelectManyCheckbox() {
		return selectManyCheckbox;
	}

	public void setSelectManyCheckbox(List selectManyCheckbox) {
		this.selectManyCheckbox = selectManyCheckbox;
	}

	public List getForEach() {
		return forEach;
	}

	public void setForEach(List forEach) {
		this.forEach = forEach;
	}

	public String getCommandButton() {
		return commandButton;
	}

	public void setCommandButton(String commandButton) {
		this.commandButton = commandButton;
	}
}