package sourceCourse.pom.project.sourceCourse;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import sourceCourse.pom.project.sourceCourse.abstractComponents.AbstractComponents;

/**
 * Hello world!
 *
 */
public class ComposePage extends AbstractComponents {

	WebDriver driver;

	public ComposePage(WebDriver driver) {

		super(driver);
		this.driver = driver;

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//input[@placeholder='Name'])[1]")

	WebElement projectName;

	@FindBy(xpath = "(//input[@placeholder='Description'])[1]")

	WebElement ProjectDescription;

	@FindBy(xpath = "//span[text()='Save']")

	WebElement save;

	@FindBy(xpath = "//span[text()='Yes']")

	WebElement ConfirmationYes;

	@FindBy(xpath = "//span[text()='No']")

	WebElement ConfirmationNo;

	@FindBy(xpath = "//div[@Class='Toastify__toast-body']")

	WebElement SavedSuccess;

	// Actions

	public Boolean saveProject() throws InterruptedException

	{
		projectName.click();
		projectName.sendKeys("Project name");

		ProjectDescription.click();
		ProjectDescription.sendKeys("Project Description");

		save.click();

		waitForElementToAppear(By.xpath("//span[text()='Yes']"));
		ConfirmationYes.click();

		Boolean saveSuccessMessage = SavedSuccess.isEnabled();

		return saveSuccessMessage;

	}

	public String verifyComposePageTitle()

	{

		String composeTitle = driver.getTitle();

		return composeTitle;
	}

}