import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;


public class BrowserTest {

	public static void main(String[] args) throws InterruptedException {
		
		String projectPath = System.getProperty("user.dir");
		
		/* firefox
		System.setProperty("webdriver.chrome.driver",projectPath+ "\\drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		*/
		
		/*chrome
		System.setProperty("webdriver.chrome.driver",projectPath+ "\\drivers\\chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver", "D:\\Asus Drive\\Training\\Selenium Tools\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		*/
		
		
		
		/*For Internet Explorer*/
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("ignoreProtectedModeSettings", true);
		System.setProperty("webdriver.ie.driver",projectPath+ "\\drivers\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver(cap);
		
		
		driver.get("http://google.com/");
		
		WebElement textbox = driver.findElement(By.name("q"));
		// -- xpath ile yazýlmýþý WebElement textbox = driver.findElement(By.xpath("//input[@name='q']"));
		textbox.sendKeys("Sarya Arkan");
		textbox.submit();
		Thread.sleep(3000); // 3sn beklet
		driver.quit();
	}
}
