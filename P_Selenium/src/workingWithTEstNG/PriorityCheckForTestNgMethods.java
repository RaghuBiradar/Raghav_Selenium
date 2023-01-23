package workingWithTEstNG;

import org.testng.annotations.Test;

public class PriorityCheckForTestNgMethods {

	
		@Test(priority = 1)
		
		public void Register() { 
		   System.out.println(" Hello");
		}
		@Test(priority = 71)
		public void Create() {
			   System.out.println("How");
			}
		@Test(priority = 11)
		public void Modify() {
			   System.out.println("are");
			}
		@Test(priority = 0)
		public void Delete() {
			   System.out.println(" you");
			}
		@Test(priority = -11)
		public void Trash() {
			   System.out.println(" Thanks");
			}

	}


