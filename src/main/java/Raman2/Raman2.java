package Testlayer;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeMethod;
public class Raman2 {
	
	public class Raman_2 {
		package Raman2;

		import org.testng.annotations.Test;
		import org.openqa.selenium.support.PageFactory;

		import basepage.Base_Page;
		import pages.Flipkart_Login;
		public class Flipkart_LoginTest extends Base_Page { @Test
		public void init() throws Exception {

		Flipkart_Login loginpage = PageFactory.initElements(driver,Flipkart_Login.class);

		loginpage.setEmail("abc@gmail.com"); loginpage.setPassword("abcdef"); loginpage.clickLoginButton();
		}
		}
		 


}

private static void setup() {
	// TODO Auto-generated method stub
	
}

}
