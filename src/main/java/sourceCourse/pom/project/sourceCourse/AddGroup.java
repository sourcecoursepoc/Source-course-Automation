package sourceCourse.pom.project.sourceCourse;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import sourceCourse.pom.project.sourceCourse.abstractComponents.AbstractComponents;

public class AddGroup extends AbstractComponents


{
	WebDriver driver;

	public AddGroup(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		
		
		   this.driver = driver;
		    
		    PageFactory.initElements(driver, this);
	}

	 // Select group 
	 
	 
	 @FindBy (css ="img[src='/groups-icon.png']" )
	 
	 WebElement groupIcon;


	 
	@FindBy (xpath = "//span[@Class='anticon anticon-plus-circle']")
	 
	 WebElement addGroup;



	@FindBy (xpath = "//span[ contains (text(),'ITEM')]")

	WebElement expandSchema;



	@FindBy (xpath = "//span[ contains (text(),'id')]")

	WebElement addItem1;

	@FindBy (xpath = "//span[ contains (text(),'name')]")
	 

	WebElement addItem2;

	@FindBy (xpath ="//span[ contains (text(),'status')]")


	WebElement addItem3;



	@FindBy (xpath ="(//input[@placeholder='Name'])[2]")

	WebElement groupName;




	@FindBy (xpath ="(//input[@placeholder='Description'])[2]")

	WebElement groupDesc;



	@FindBy (xpath ="(//span[ contains (text(),'Save')])[2]")

	WebElement saveGroup;


	
	 
	 public void addGroup()
	 
	 {
		 
		 //Click on Group Icon. 
		 groupIcon.click();
		 
		 // Click on Add Group button . 
		 addGroup.click();
		 
		 //Expand the schema .
		 expandSchema.click();
		 
		 // Add 3 attributes. 
		 addItem1.click();
		 addItem2.click();
		 addItem3.click();
		 
		 
		 
	 }
	
	 
	 public void saveGroup() throws InterruptedException
	 
	 {

		 groupName.click();

		 groupName.sendKeys("GroupName");
		 
		 groupDesc.click();

		 groupDesc.sendKeys("Group Description");
		 
		 
		 saveGroup.click();
		 
		 
	 }
	
	 
	
}
