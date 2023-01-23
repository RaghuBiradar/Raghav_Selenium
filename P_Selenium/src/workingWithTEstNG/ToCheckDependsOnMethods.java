package workingWithTEstNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToCheckDependsOnMethods {

	@Test(dependsOnMethods = "register")
	public void createaccount() {
		Reporter.log("from create account", true);
	}
	
	@Test(dependsOnMethods = {"register","createaccount"})
	public void modifyaccount() {
		Reporter.log("from modifyaccount", true);
	}
	
	@Test
	public void register() {
		Reporter.log("from register account", true);
	}
	
	@Test(dependsOnMethods = {"createaccount","modifyaccount"})
	public void deleteaccount() {
		Reporter.log("from create account", true);
	}
	
	@Test(dependsOnMethods = "createaccount")
	public void amounttransfer() {
		Reporter.log("from amounttransfer", true);
	}

}
