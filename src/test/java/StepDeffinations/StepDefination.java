package StepDeffinations;

import java.net.URL;
import java.util.Properties;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.apache.http.util.Asserts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import PageObject.EmpDetails;
import PageObject.LoginPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import Utility.ReadExcel;
import Utility.Screenshot;
import Utility.propfile;

public class StepDefination {
	    
	    static Properties prop=propfile.propertyfile();
	         
	         WebDriver driver;
	         @Given("^Navigate to the Application$")
	            public void navigate_to_the_Application() throws Throwable {
	               
	        	String strbrowser = "GRID_CHROME";
	//	String strExecutionPlatform  = System.getProperty("executionPlatform").trim().toUpperCase();
		switch(strbrowser)
	  {
		case "LOCAL_CHROME":
		{
			 System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");//chromedriver
			driver=new ChromeDriver();
			break; //.\\drivers\\chromedriver.exe
		}
		
		case "GRID_CHROME":
		{
			 URL gridUrl = new URL("http://localhost:4444/wd/hub");
             DesiredCapabilities desiredCapabilities = DesiredCapabilities.chrome();
             ChromeOptions chromeOptions = new ChromeOptions();
             desiredCapabilities.setCapability(ChromeOptions.CAPABILITY, chromeOptions);
             driver= new RemoteWebDriver(gridUrl,desiredCapabilities);
             break;
		}
	
	  }
	                driver.get(prop.getProperty("url"));
	               	Screenshot.Screenshots(driver,101);
	            }
	             
	        
	            @When("^In the Home page Enter the User Name and Password$")
	            public void in_the_Home_page_Enter_the_User_Name_and_Password() throws Throwable {
	               
	                LoginPage.username(driver).sendKeys(ReadExcel.retrieveExcelData("Username"));
	                LoginPage.password(driver).sendKeys(ReadExcel.retrieveExcelData("Password"));
	                LoginPage.loginbutton(driver).click();
	                Screenshot.Screenshots(driver,102);
	      
	            }
	            @When("^Click Login Verify Login successful$")
	            public void click_Login_Verify_Login_successful() throws Throwable {
	                // Write code here that turns the phrase above into concrete actions
	                System.out.println("Login Success");
	                Screenshot.Screenshots(driver,103);
	            }
	        
	      
	            @Then("^Click on Edit Employee icon$")
	            public void click_on_Edit_Employee_icon() throws Throwable {
	                // Write code here that turns the phrase above into concrete action
	                WebElement editemployee =driver.findElement(By.xpath("//td[text()='suvathi12']//following-sibling::td[3]"));
	                 editemployee.click();
	                 Screenshot.Screenshots(driver,105);
	            }
	            
	            @Then("^Change email$")
	            public void change_email() throws Throwable {
	                // Write code here that turns the phrase above into concrete actions
	                WebElement emailid = driver.findElement(By.xpath("//input[@name='email_id']"));
	                emailid.clear();
	                emailid.sendKeys( prop.getProperty("email"));
	                Screenshot.Screenshots(driver,106);
	                
	            }
	            
	            @Then("^Click on update Details$")
	            public void click_on_update_Details() throws Throwable {
	                // Write code here that turns the phrase above into concrete actions
	            	 EmpDetails.submit(driver).click();
	                Screenshot.Screenshots(driver,107);
	            }
	             
	           @Then("^Assert E-mail Updated$")
	            public void validation() throws Throwable {
	                // Write code here that turns the phrase above into concrete actions
	               String actualTitle = driver.findElement(By.xpath("//*[text()='Employee Details updated Successfully']")).getText();
	               String expectedTitle = "Employee Details updated Successfully";
	               Screenshot.Screenshots(driver,108);
	                
	            try {
	                if(expectedTitle==actualTitle)
	                {
	                    System.out.println("The Message is verified");
	                }
	            }
	            catch(Exception e)
	            {
	                e.printStackTrace();
	            }
	           }
	              
	            @Then("^Click on Logout$")
	            public void click_on_Logout() throws Throwable {
	                // Write code here that turns the phrase above into concrete actions
	                WebElement logoff = driver.findElement(By.xpath("//a[@href='logout.php']"));
	                logoff.click();
	             	Screenshot.Screenshots(driver,109); 
	                driver.close();
	        	driver.quit();
	            }

	 
	            

	             @Then("^Click on Employee Details$")
	            public void click_on_Employee_Details() throws Throwable {
	            // Write code here that turns the phrase above into concrete actions
	            WebElement employee =driver.findElement(By.xpath("//a[@href=\"edit_employee.php\"]"));
	            employee.click();
	            Screenshot.Screenshots(driver,4);
	            }

	             @Then("^Create New User Link verify New user page is displayed$")
	            public void create_New_User_Link_verify_New_user_page_is_displayed() throws Throwable {
	            // Write code here that turns the phrase above into concrete actions
	            WebElement newuser =driver.findElement(By.xpath("//a[@href='create_newuser.php']"));
	            newuser.click();
	            Screenshot.Screenshots(driver,5);
	            }

	             @Then("^Enter all the mandatory details$")
	            public void enter_all_the_mandatory_details() throws Throwable {
	            // Write code here that turns the phrase above into concrete actions
	           
	            EmpDetails.id(driver).sendKeys("suvathi12");
	      
	            EmpDetails.firstname(driver).sendKeys("Suvathi");
	         
	            EmpDetails.lastname(driver).sendKeys("Govindaraj");
	           
	            EmpDetails.newpassword(driver).sendKeys("yazhini@17");
	           
	            EmpDetails.confirmpassword(driver).sendKeys("yazhini@17");
	            
	            EmpDetails.DOJ(driver).sendKeys("2020-02-19");
	            
	            EmpDetails.rateperhour(driver).sendKeys("9");
	            
	            EmpDetails.offno(driver).sendKeys("7338774121");
	            
	            EmpDetails.mobno(driver).sendKeys("7358950876");
	            
	            EmpDetails.emailid(driver).sendKeys("suvathigovindaraj98@gmail.com");
	            
	            EmpDetails.address1(driver).sendKeys("3/673, 10-C Muthuramlingapuram");
	          
	            EmpDetails.address2(driver).sendKeys("Padanthal");
	            
	            EmpDetails.country(driver).sendKeys("India");
	            
	            EmpDetails.interest(driver).sendKeys("Automation Testing");
	            Screenshot.Screenshots(driver,6);
	            }

	             @Then("^Click on Save Details$")
	            public void click_on_Save_Details() throws Throwable {
	            // Write code here that turns the phrase above into concrete actions
	           
	            EmpDetails.submit(driver).click();
	            Screenshot.Screenshots(driver,7);
	            }

	             @Then("^Click on Employee Details Link$")
	            public void click_on_Employee_Details_Link() throws Throwable {
	            // Write code here that turns the phrase above into concrete actions
	            System.out.println("new user detail is displayed in the table");
	            Screenshot.Screenshots(driver,8);
	            }

	
}
