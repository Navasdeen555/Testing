package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition {
	public ChromeDriver driver;
	
	@Given("Open the browser")
	public void openBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 driver = new ChromeDriver();
	}
	@Given("Load the URL")
	public void loadURL()
	{
		driver.get("http://leaftaps.com/opentaps/control/main");
	}
	@Given("Max the browser")
	public void maxBrowser()
	{
		driver.manage().window().maximize();
	}
	@Given("Set the Timeouts")
	public void setTimeouts()
	{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	@Given("Enter the Username")
	public void enterUsername()
	{
		driver.findElementById("username").sendKeys("Demosalesmanager");
	}
	@Given("Enter the password")
	public void enterPassword()
	{
		driver.findElementById("password").sendKeys("crmsfa");
	}
	@When("Click the Login Button")
	public void clickLogin()
	{
		driver.findElementByClassName("decorativeSubmit").click();
	}
	@Then("Verify Login Successful")
	public void verifyLogin()
	{
		String text = driver.findElementByTagName("h2").getText();
		System.out.println(text.contains("Welcome"));
	}
	
	
	
	
	
	
}
