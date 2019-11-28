package org.Demo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Locators extends BaseClass {
	
	public Locators()
	{
		PageFactory.initElements(driver, this);
	}

	@FindBy (xpath=("//input[@placeholder='First Name']"))
	private WebElement txtFname;
	
	@FindBy (xpath=("//input[@placeholder='Last Name']"))
	private WebElement txtLName;
	
	@FindBy (xpath=("//textarea[@ng-model='Adress']"))
	private WebElement txtAddress;
	
	@FindBy (xpath=("//input[@type='email']"))
	private WebElement txtEmail;
	
	@FindBy (xpath=("//input[@ng-model='Phone']"))
	private WebElement txtPhone;
	
	
	@FindBy (xpath=("//input[@value='Male']"))
	private WebElement radioMale;
	
	@FindBy (xpath=("//input[@value='FeMale']"))
	private WebElement radioFemale;
	
	@FindBy (xpath=("//input[@value='Movies']"))
	private WebElement ChBoxMovies;
	
	@FindBy (id="msdd") 
	private WebElement txtLang;
	
	@FindBy (id="Skills")
	private WebElement ddSkills;
	
	
	@FindBy (id="countries")
	private WebElement ddCountries;
	
	@FindBy (xpath=("//span[@role='combobox']"))
	private WebElement ddSelCountry;
	
	@FindBy (id="yearbox")
	private WebElement ddYear;
	
	@FindBy (xpath=("//select[@placeholder='Month']"))
	private WebElement ddMonth;
	
	@FindBy (id="daybox")
	private WebElement ddDay;
	
	@FindBy (id="firstpassword")
	private WebElement txtPassword;
	
	@FindBy (id="secondpassword")
	private WebElement txtConfirmPass;
	
	@FindBy (id="submitbtn")
	private WebElement btnSubmit;
	
	@FindBy (xpath=("//input[@value='Refresh']"))
	private WebElement btnRefresh;

	public WebElement getTxtFname() {
		return txtFname;
	}

	public WebElement getTxtLName() {
		return txtLName;
	}

	public WebElement getTxtAddress() {
		return txtAddress;
	}

	public WebElement getTxtEmail() {
		return txtEmail;
	}

	public WebElement getTxtPhone() {
		return txtPhone;
	}

	public WebElement getRadioMale() {
		return radioMale;
	}

	public WebElement getRadioFemale() {
		return radioFemale;
	}

	public WebElement getChBoxMovies() {
		return ChBoxMovies;
	}

	public WebElement getTxtLang() {
		return txtLang;
	}

	public WebElement getDdSkills() {
		return ddSkills;
	}

	public WebElement getDdCountries() {
		return ddCountries;
	}

	public WebElement getDdSelCountry() {
		return ddSelCountry;
	}

	public WebElement getDdYear() {
		return ddYear;
	}

	public WebElement getDdMonth() {
		return ddMonth;
	}

	public WebElement getDdDay() {
		return ddDay;
	}

	public WebElement getTxtPassword() {
		return txtPassword;
	}

	public WebElement getTxtConfirmPass() {
		return txtConfirmPass;
	}

	public WebElement getBtnSubmit() {
		return btnSubmit;
	}

	public WebElement getBtnRefresh() {
		return btnRefresh;
	}
	
	
	
	
	
	
	
	

	
	
	
	
}
