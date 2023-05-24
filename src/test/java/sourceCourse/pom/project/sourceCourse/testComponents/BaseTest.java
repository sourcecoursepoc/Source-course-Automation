package sourceCourse.pom.project.sourceCourse.testComponents;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeMethod;

import sourceCourse.pom.project.sourceCourse.HomePage;


public class BaseTest {

	public static WebDriver driver;

	public static WebDriver initializeDriver() throws IOException

	{

		Properties prop = new Properties();

		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")
				+ "/src/main/java/sourceCourse/pom/project/sourceCourse/resources/GlobalData.properties");
		prop.load(fis);

		String browsername = prop.getProperty("Browser");

		if (browsername.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\u27780\\chromedriver.exe");

			driver = new ChromeDriver();

		}

		else if (browsername.equals("edge")) {
			System.setProperty("webdriver.edge.driver", "C:\\Users\\u27780\\edgedriver.exe");

			driver = new EdgeDriver();

		}

		else

		{
			// IE
		}

		driver.manage().window().maximize();

		return driver;

	}


	
	public static HomePage LunchApplication() throws IOException

	{

		driver = initializeDriver();

		HomePage homepage = new HomePage(driver);

		homepage.goTo();

		return homepage;
	}

}
