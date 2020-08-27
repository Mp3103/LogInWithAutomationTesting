import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogInTest {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\15145\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver webDriver = new ChromeDriver();
		
		webDriver.get("https://www.facebook.com/");
		
		WebElement userName = webDriver.findElement(By.id("email"));
		userName.sendKeys("YourEmail@mail.com");
		
		webDriver.findElement(By.id("pass")).sendKeys("YOUR_PASSWORD");
		
		webDriver.findElement(By.name("login")).click();
		
	}
}
