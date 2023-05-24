package sourceCourse.pom.project.sourceCourse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import sourceCourse.pom.project.sourceCourse.abstractComponents.AbstractComponents;

public class AddSchema extends AbstractComponents

{
	WebDriver driver;
	 String newSchema;


	public AddSchema(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub

		this.driver = driver;

		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(css = "img[src='/schemas-icon.png']")

	WebElement schemaIcon;

	@FindBy(xpath = "//span[@Class='anticon anticon-plus-circle']")

	WebElement addSchema;

		
	//
	
	// @FindBy(xpath = "//span[ contains (text(),'ITEM')]")
	// WebElement selectSchema;

	@FindBy(xpath = "//button/span[ contains (text(),'Import')]")

	WebElement importSchema;

	//@FindBy(xpath = "//div[ contains (text(),'ITEM')]")

	//WebElement schemaItem;
	
	 //	

	// select schema

	
	
	public void addSchema(String Schemaname) throws InterruptedException

	{
		newSchema = Schemaname;
	
		// Click on Schema Icon
		schemaIcon.click();

	
		// Click on Add Schema button
		addSchema.click();

		Thread.sleep(2000);
	
		// Select one schema from list.
		
		WebElement selectSchema = driver.findElement(By.xpath("//span[ contains (text(),'"+newSchema+"')]"));	
		selectSchema.click();
		
		// click on import button.
		importSchema.click();

	}

	public Boolean validateSchema() throws InterruptedException

	{
		WebElement schemaItem = driver.findElement(By.xpath("//div[ contains (text(),'"+newSchema+"')]"));
		Boolean schemaitem = schemaItem.isDisplayed();

		return schemaitem;

	}

}
