import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest {
	WebDriver driver=null;
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\nikita.naik01\\eclipse-workspace1\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://google.com/");
driver.close();
}
  }

