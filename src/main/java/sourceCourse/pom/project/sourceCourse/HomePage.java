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
public class HomePage extends AbstractComponents
{
	
	WebDriver driver;
	
 
  public HomePage(WebDriver driver) {
	  
	    super(driver);
	    this.driver = driver;
	    
	    PageFactory.initElements(driver, this);
	}


@FindBy (xpath = "//span[text()='Compose ']")
  
  WebElement compose;




  
 @FindBy (xpath = "//span[text()='Discover']")
  
  WebElement schema;

 
 
 @FindBy (xpath = "//span[text()='More']")
 
 WebElement MoreOption;



 
 
 
 // Actions 
 
 
 public void goTocompose()
 
 {
	 compose.click();
	 
 }
 
 
 public void goToschema()
 
 
 
 {
	 schema.click();
	 
 }
 
 
 public void goTo()
 
 {
     
     driver.get("http://localhost:3000/");
     
  
 
}
 
 public String verifyHomePageTitle()
 
 {
	 
	 String homeTitle = driver.getTitle();
	 

	 
	 
	 System.out.println(homeTitle);
	 
	 return homeTitle;
 }
}