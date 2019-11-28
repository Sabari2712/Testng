package org.Demo;

import java.util.Date;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC01_DemoQA_Chrome extends BaseClass  {
	
	static Locators l;
	
	
	@BeforeClass
	public void Chrome()
	{
		chromesetUp("http://demo.automationtesting.in/Register.html");
		Assert.assertTrue(driver.getCurrentUrl().contains("automationtesting"));		
	}
	
	@BeforeMethod
	public void startTime() {
		Date d = new Date();
		System.out.println(d);
	}
	
	@AfterMethod
	public void endTime() {
		Date a = new Date();
		System.out.println(a);
	}
	
	@Parameters ({"Fname", "Lname", "Addres", "Email", "Phone", "Lang", "Pass", "ConPass"})
	@Test
	public void Details(String Fn, String Ln, String Ad,String Eml, String Ph, String Lng, String Ps1, String Ps2)
	{
		l = new Locators();
		type1(l.getTxtFname(),Fn);
		type1(l.getTxtLName(),Ln);
		type1(l.getTxtAddress(),Ad);
		type1(l.getTxtEmail(),Eml);
		type1(l.getTxtPhone(),Ph);
		type1(l.getTxtLang(),Lng);	
	}


}
