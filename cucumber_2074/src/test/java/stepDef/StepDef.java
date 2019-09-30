package stepDef;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDef {
WebDriver driver;


@Given("app is up")
public void app_is_up() {
	System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
	 driver= new ChromeDriver();
	 driver.get("http://newtours.demoaut.com/");
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
}

@Given("enter {string} and {string}")
public void enter_and(String string, String string2) {
	driver.findElement(By.xpath("//a[contains(text(),'REGISTER')]")).click();
	 driver.findElement(By.xpath("//input[@id='email']")).sendKeys("demo");
	 driver.findElement(By.xpath("//input[@name='password']")).sendKeys("demo");
	 driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys("demo");
	 driver.findElement(By.xpath("//input[@name='register']")).click();
    // Write code here that turns the phrase above into concrete actions
   // throw new cucumber.api.PendingException();
}

@Given("John purchase microwave for {int} rs")
public void john_purchase_microwave_for_rs(Integer int1) {
    // Write code here that turns the phrase above into concrete actions
   // throw new cucumber.api.PendingException();
}

@Given("he has receipt")
public void he_has_receipt() {
    // Write code here that turns the phrase above into concrete actions
   // throw new cucumber.api.PendingException();
}

@When("John returns the faulty microwave")
public void john_returns_the_faulty_microwave() {
    // Write code here that turns the phrase above into concrete actions
   // throw new cucumber.api.PendingException();
}

@Then("he got refund of {int} doll")
public void he_got_refund_of_doll(Integer int1) {
    // Write code here that turns the phrase above into concrete actions
   // throw new cucumber.api.PendingException();
}
}