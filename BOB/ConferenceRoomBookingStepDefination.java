package com.cg.roorbooking.stepdefination;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.cg.roorbooking.beans.ConfernaceRoomBookingPageBean;

import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ConferenceRoomBookingStepDefination {
	private WebDriver driver;
	private ConfernaceRoomBookingPageBean pageBean ;
	@Before
	public void setUpStepEnv() {
		System.setProperty("webdriver.chrome.driver",
				"D:\\FUTURENOVA\\selenium\\chromedriver_win32\\chromedriver.exe");
	}

	@Given("^User is on Conference room booking page$")
	public void user_is_on_Conference_room_booking_page() throws Throwable {
	
		driver = new ChromeDriver();
		driver.get("D:\\Users\\skolapar\\BDD\\Conferenceroom\\WebContent\\ConferenceRegistartion.html");
		driver.manage().window().maximize();
		pageBean= new ConfernaceRoomBookingPageBean();
		PageFactory.initElements(driver, pageBean);
		
	}

	@When("^User select 'Next' link without entering 'FirstName'$")
	public void user_select_Next_link_without_entering_FirstName() throws Throwable {
		//driver.findElement(By.linkText("Next")).click();
		pageBean.clickNextPageLink();
	}

	@Then("^'Please fill the First Name' message should display$")
	public void please_fill_the_First_Name_message_should_display() throws Throwable {
		String actualMessage=driver.switchTo().alert().getText();
		String expectedMessage="Please fill the First Name";
		Assert.assertEquals(expectedMessage, actualMessage);
	}

	@When("^User select 'Next' link without entering 'LastName'$")
	public void user_select_Next_link_without_entering_LastName() throws Throwable {
		driver.switchTo().alert().dismiss();
	/*	driver.findElement(By.id("txtFirstName")).sendKeys("srinivas");
		driver.findElement(By.linkText("Next")).click();*/
		pageBean.setFirstName("srinivas");
		pageBean.clickNextPageLink();
		
	}

	@Then("^'Please fill the Last Name' message should display$")
	public void please_fill_the_Last_Name_message_should_display() throws Throwable {
		String actualMessage=driver.switchTo().alert().getText();
		String expectedMessage="Please fill the Last Name";
		Assert.assertEquals(expectedMessage, actualMessage);
	}

	@When("^User select 'Next' link without entering 'Email'$")
	public void user_select_Next_link_without_entering_Email() throws Throwable {
		driver.switchTo().alert().dismiss();
		/*driver.findElement(By.id("txtLastName")).sendKeys("kolaparthi");
		driver.findElement(By.linkText("Next")).click();*/
		pageBean.setLastName("kolaparthi");
		pageBean.clickNextPageLink();
	
	}

	@Then("^'Please fill the Email' message should display$")
	public void please_fill_the_Email_message_should_display() throws Throwable {
		String actualMessage=driver.switchTo().alert().getText();
		String expectedMessage="Please fill the Email";
		Assert.assertEquals(expectedMessage, actualMessage);
	}

	@When("^User select 'Next' link after entering invalid 'Email' address$")
	public void user_select_Next_link_after_entering_invalid_Email_address() throws Throwable {
		driver.switchTo().alert().dismiss();
	/*	driver.findElement(By.id("txtEmail")).sendKeys("srinivas.a.kolaparthi capgemini.com");
		driver.findElement(By.linkText("Next")).click();*/
		pageBean.setEmail("srinivas.a.kolaparthi capgemini.com");
		pageBean.clickNextPageLink();
		
	}

	@Then("^'Please enter valid Email Id\\.' message should display$")
	public void please_enter_valid_Email_Id_message_should_display() throws Throwable {
		String actualMessage=driver.switchTo().alert().getText();
		String expectedMessage="Please enter valid Email Id.";
		Assert.assertEquals(expectedMessage, actualMessage);
	}

	@When("^User select 'Next' link without entering 'Contact No'$")
	public void user_select_Next_link_without_entering_Contact_No() throws Throwable {
		driver.switchTo().alert().dismiss();
		/*driver.findElement(By.id("txtEmail")).clear();
		driver.findElement(By.id("txtEmail")).sendKeys("srinivas.a.kolaparthi@capgemini.com");
		driver.findElement(By.linkText("Next")).click();*/
		pageBean.setEmail("srinivas.a.kolaparthi@capgemini.com");
		pageBean.clickNextPageLink();
	}

	@Then("^'Please fill the Contact No\\.' message should display$")
	public void please_fill_the_Contact_No_message_should_display() throws Throwable {

		String actualMessage=driver.switchTo().alert().getText();
		String expectedMessage="Please fill the Contact No.";
		Assert.assertEquals(expectedMessage, actualMessage);
	}

	@When("^User select 'Next' link after entering invalid 'Contact No'$")
	public void user_select_Next_link_after_entering_invalid_Contact_No() throws Throwable {
		driver.switchTo().alert().dismiss();
		/*driver.findElement(By.id("txtPhone")).sendKeys("123456789");
		driver.findElement(By.linkText("Next")).click();*/
		pageBean.setContactNo("123456789");
		pageBean.clickNextPageLink();
	}

	@Then("^'Please enter valid Contact no\\.' message should display$")
	public void please_enter_valid_Contact_no_message_should_display() throws Throwable {
		String actualMessage=driver.switchTo().alert().getText();
		String expectedMessage="Please enter valid Contact no.";
		Assert.assertEquals(expectedMessage, actualMessage);
	}

	@When("^User select 'Next' link without selecting  'Number of people attending'$")
	public void user_select_Next_link_without_selecting_Number_of_people_attending() throws Throwable {
		driver.switchTo().alert().dismiss();
		/*driver.findElement(By.id("txtPhone")).clear();
		driver.findElement(By.id("txtPhone")).sendKeys("9930856957");
		driver.findElement(By.linkText("Next")).click();*/
		pageBean.setContactNo("9930856957");
		pageBean.clickNextPageLink();
	}

	@Then("^'Please fill the Number of people attending' message should display$")
	public void please_fill_the_Number_of_people_attending_message_should_display() throws Throwable {
		String actualMessage=driver.switchTo().alert().getText();
		String expectedMessage="Please fill the Number of people attending";
		Assert.assertEquals(expectedMessage, actualMessage);
	}
	
	@When("^User select 'Next' link without entereing  'Building Name & Room No'$")
	public void user_select_Next_link_without_entereing_Building_Name_Room_No() throws Throwable {
		driver.switchTo().alert().dismiss();
		/*Select select = new Select(driver.findElement(By.name("size")));
		select.selectByVisibleText("3");
		driver.findElement(By.linkText("Next")).click();*/
		pageBean.setNoOfPerson("3");
		pageBean.clickNextPageLink();
	}

	@Then("^'Please fill the Building & Room No' message should display$")
	public void please_fill_the_Building_Room_No_message_should_display() throws Throwable {
		String actualMessage=driver.switchTo().alert().getText();
		String expectedMessage="Please fill the Building & Room No";
		Assert.assertEquals(expectedMessage, actualMessage);
	}

	@When("^User select 'Next' link without entereing  'Area Name'$")
	public void user_select_Next_link_without_entereing_Area_Name() throws Throwable {
		driver.switchTo().alert().dismiss();
		/*driver.findElement(By.id("txtAddress1")).sendKeys("B building, flat 405 ,Three Jewels Society");
		driver.findElement(By.linkText("Next")).click();*/
		pageBean.setBuildingAndRoomNo("B building, flat 405 ,Three Jewels Society");
		pageBean.clickNextPageLink();
	}

	@Then("^'Please fill the Area name' message should display$")
	public void please_fill_the_Area_name_message_should_display() throws Throwable {
		String actualMessage=driver.switchTo().alert().getText();
		String expectedMessage="Please fill the Area name";
		Assert.assertEquals(expectedMessage, actualMessage);
	}
	
	@When("^User select 'Next' link without selecting  'City'$")
	public void user_select_Next_link_without_selecting_City() throws Throwable {
		driver.switchTo().alert().dismiss();
		/*driver.findElement(By.id("txtAddress2")).sendKeys("Tilekarnagar, Kondhwa");
		driver.findElement(By.linkText("Next")).click();*/
		pageBean.setAreaName("Tilekarnagar, Kondhwa");
		pageBean.clickNextPageLink();
	}

	@Then("^'Please select city' message should display$")
	public void please_select_city_message_should_display() throws Throwable {
		String actualMessage=driver.switchTo().alert().getText();
		String expectedMessage="Please select city";
		Assert.assertEquals(expectedMessage, actualMessage);
	}

	@When("^User select 'Next' link without selecting  'State'$")
	public void user_select_Next_link_without_selecting_State() throws Throwable {
		driver.switchTo().alert().dismiss();
		/*Select select = new Select(driver.findElement(By.name("city")));
		select.selectByVisibleText("Pune");
		driver.findElement(By.linkText("Next")).click();*/
		pageBean.setCity("Pune");
		pageBean.clickNextPageLink();
	}

	@Then("^'Please select state' message should display$")
	public void please_select_state_message_should_display() throws Throwable {
		String actualMessage=driver.switchTo().alert().getText();
		String expectedMessage="Please select state";
		Assert.assertEquals(expectedMessage, actualMessage);
	}

	@When("^User select 'Next' link without selecting  'MemberShip Status '$")
	public void user_select_Next_link_without_selecting_MemberShip_Status() throws Throwable {
		driver.switchTo().alert().dismiss();
		/*Select select = new Select(driver.findElement(By.name("state")));
		select.selectByVisibleText("Maharashtra");
		driver.findElement(By.linkText("Next")).click();*/
		pageBean.setState("Maharashtra");
		pageBean.clickNextPageLink();
	}

	@Then("^'Please Select MemeberShip status' message should display$")
	public void please_Select_MemeberShip_status_message_should_display() throws Throwable {
		String actualMessage=driver.switchTo().alert().getText();
		String expectedMessage="Please Select MemeberShip status";
		Assert.assertEquals(expectedMessage, actualMessage);
	}

	@When("^User select 'Next' link after entering Valid set of information$")
	public void user_select_Next_link_after_entering_Valid_set_of_information() throws Throwable {
		/*driver.findElement(By.id("txtFirstName")).sendKeys("srinivas");
		driver.findElement(By.id("txtLastName")).sendKeys("kolaparthi");
		driver.findElement(By.id("txtEmail")).sendKeys("srinivas.a.kolaparthi@capgemini.com");
		driver.findElement(By.id("txtPhone")).sendKeys("9930856957");
		new Select(driver.findElement(By.name("size"))).selectByVisibleText("3");
		driver.findElement(By.id("txtAddress1")).sendKeys("B building, flat 405 ,Three Jewels Society");
		driver.findElement(By.id("txtAddress2")).sendKeys("Tilekarnagar, Kondhwa");
		new Select(driver.findElement(By.name("city"))).selectByVisibleText("Pune");
		new Select(driver.findElement(By.name("state"))).selectByVisibleText("Maharashtra");
		driver.findElements(By.name("memberStatus")).get(0).click();
		driver.findElement(By.linkText("Next")).click();*/
		pageBean.setFirstName("srinivas");
		pageBean.setLastName("kolaparthi");
		pageBean.setEmail("srinivas.a.kolaparthi@capgemini.com");
		pageBean.setContactNo("9930856957");
		pageBean.setNoOfPerson("3");
		pageBean.setBuildingAndRoomNo("B building, flat 405 ,Three Jewels Society");
		pageBean.setAreaName("Tilekarnagar, Kondhwa");
		pageBean.setCity("Pune");
		pageBean.setState("Maharashtra");
		pageBean.setMemberStatus("member");
		pageBean.clickNextPageLink();
	}

	@Then("^'Personal details are validated\\.' message should display$")
	public void personal_details_are_validated_message_should_display() throws Throwable {
		String actualMessage=driver.switchTo().alert().getText();
		String expectedMessage="Personal details are validated.";
		Assert.assertEquals(expectedMessage, actualMessage);
	}


}
