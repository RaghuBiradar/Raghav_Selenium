package workingWithTEstNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class UseReporterLogInstaedOfSOPLN {

	
		@Test(priority = 1)

		public void Register() { 
			Reporter.log(" Hello");
		}
		@Test(priority = 71)
		public void Create() {
			Reporter.log("How");
		}
		@Test(priority = 11)
		public void Modify() {
			Reporter.log("are");
		}
		@Test(priority = 0)
		public void Delete() {
			Reporter.log(" you");
		}
		@Test(priority = -11)
		public void Trash() {
			Reporter.log(" Thanks");
		}


	}

