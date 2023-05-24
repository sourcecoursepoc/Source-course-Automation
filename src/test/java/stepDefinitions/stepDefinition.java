package stepDefinitions;

import java.io.File;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

import junit.framework.TestCase;
import junit.framework.TestSuite;
import sourceCourse.pom.project.sourceCourse.AddGroup;
import sourceCourse.pom.project.sourceCourse.AddSchema;
import sourceCourse.pom.project.sourceCourse.ComposePage;
import sourceCourse.pom.project.sourceCourse.HomePage;
import sourceCourse.pom.project.sourceCourse.testComponents.BaseTest;

public class stepDefinition extends BaseTest {

	HomePage homepage = new HomePage(driver);
	ComposePage composepage = new ComposePage(driver);
	AddSchema addschema = new AddSchema(driver);
	AddGroup addgroup = new AddGroup(driver);

	@Given("User launch application")
	public static void Launch_application() throws IOException

	{

		LunchApplication();

	}

	@When("User navigate to home page")

	public void navigate_to_home_page()

	{

		String Hometitle = homepage.verifyHomePageTitle();
		Assert.assertEquals("", Hometitle);

	}

	@And("User navigate to compose page")
	public void navigate_to_compose_page() {

		homepage.goTocompose();
	}

	@Then("Compose page title should be displayed")

	public void verify_compose_page()

	{

		// Verify Compose page title .
		String Composetitle = composepage.verifyComposePageTitle();
		Assert.assertEquals("", Composetitle);

		driver.close();

	}

	@And("User add a Schema with name{string}")
	
	public void navigate_to_addSchema_page(String Schemaname) throws InterruptedException 

	{
		
		System.out.println("hello");
		
		
		//System.out.println(Schema_name);

		addschema.addSchema(Schemaname);

	}

	@Then("Selected Schema should get added")
	public void validate_added_Schema() throws InterruptedException

	{

		// Add Schema to list.
		Boolean schemaitem = addschema.validateSchema();

		Assert.assertTrue(schemaitem);

		driver.close();
	}

	@And("User add a Group")

	public void navigate_to_addGroup_page()

	{

		// Add Group to list
		addgroup.addGroup();

	}

	@When("User save a group")
	public void navigate_to_saveGroup_page() throws InterruptedException

	{

		// Save Group
		addgroup.saveGroup();

	}

	@Then("User should be able save the project")
	public void navigate_to_saveProject() throws InterruptedException

	{

		Boolean successmessage = composepage.saveProject();

		Assert.assertTrue(successmessage);

	}

}
