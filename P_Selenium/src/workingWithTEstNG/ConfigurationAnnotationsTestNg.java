package workingWithTEstNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ConfigurationAnnotationsTestNg {

	@BeforeClass
	public void hi1() {
		System.out.println("bfclass");
	}
	
	
	@BeforeSuite
	public void hi2() {
		System.out.println("bfsuit");
	}
	
	
	@BeforeMethod
	public void hi3() {
		System.out.println("bfmethod");
	}
	
	@BeforeTest
	public void hi4() {
		System.out.println("bf test");
	}
	
	@Test()
	public void hi() {
		System.out.println("huli1");
	}
	
	@BeforeMethod
	public void c99() {
		System.out.println("99");
	}
	
	@Test
	public void  bye() {
		System.out.println("huli2");
	}
	@AfterClass
	public void hi5() {
		System.out.println("ac");
	}
	@AfterTest
	public void hi6() {
		System.out.println("at");
	}
	@AfterMethod
	public void hi7() {
		System.out.println("am");
	}
	@AfterSuite
	public void hi8() {
		System.out.println("End");
	}
	
	
	
}
