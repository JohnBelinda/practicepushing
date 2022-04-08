package def_after_run;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;


public class defafrun {

	WebDriver driver;
	public String URL= "https://demoapp.skillrary.com/login.php?type=login";


//	@Given("I want to open the app in chrome")
//	public void i_want_to_open_the_app_in_chrome() {
//	    // Write code here that turns the phrase above into concrete actions
//		WebDriverManager.chromedriver().setup();
//		driver = new ChromeDriver();
//		driver.get(URL);	
//		driver.findElement(By.linkText("LOGIN")).click();
//	}
//	@Given("enter username as {string}")
//	public void enter_username_as(String string) {
//	    // Write code here that turns the phrase above into concrete actions
//		driver.findElement(By.id("email")).sendKeys(string);
//	}
//	@Given("enter password as {string}")
//	public void enter_password_as(String string) {
//	    // Write code here that turns the phrase above into concrete actions
//		driver.findElement(By.id("password")).sendKeys(string);
//	}
//	@Then("click in the loginbutton")
//	public void click_in_the_loginbutton() {
//	    // Write code here that turns the phrase above into concrete actions
//		driver.findElement(By.id("last")).click();
//	}
//	@Then("check more outcomes {string}")
//	public void check_more_outcomes(String string) {
//	    // Write code here that turns the phrase above into concrete actions
//		 String admin = driver.findElement(By.xpath("//span[contains(text(),'SkillRary Admin')]")).getText();
//		 Assert.assertEquals(admin, string);
//	}
//
//
//}

	@Given("I want to open the app in chrome")
	public void i_want_to_open_the_app_in_chrome() {
	    // Write code here that turns the phrase above into concrete actions
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(URL);	
		driver.findElement(By.linkText("LOGIN")).click();
	}
	@Given("enter username as {string}")
	public void enter_username_as(String string) {
    // Write code here that turns the phrase above into concrete actions
	 WebElement un= driver.findElement(By.id("email"));
	   un.sendKeys(string);
	   //String actun = un.getAttribute("actun");
	   String exun = "admin";
	   if(un.equals(exun))
	   {
		   System.out.println("valid username");
	   }
	   else {
		   System.out.println("invalid username");
	   }
	}
	@Given("enter password as {string}")
	public void enter_password_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
   WebElement pswd = driver.findElement(By.id("password"));
        pswd.sendKeys(string);
	 //String password = pswd.getAttribute("password");
	 String expassword="admin";
	 if(pswd.equals(expassword)) {
		 System.out.println("valid password");
	 }
	 else {
		 System.out.println("invalid pswd");
	 }
	}
	@Then("click in the loginbutton")
	public void click_in_the_loginbutton() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("last")).click();
	}
	@Then("check more outcomes {string}")
	public void check_more_outcomes(String string) {
	    // Write code here that turns the phrase above into concrete actions
		String admin = driver.findElement(By.xpath("//span[contains(text(),'SkillRary Admin')]")).getText();
		 Assert.assertEquals(admin, string);
	}


}
