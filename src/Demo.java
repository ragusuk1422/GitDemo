import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		
		//Implement methods of web driver
		
		//Creating driver object for chrome browser
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium-Java\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());

	}

}
