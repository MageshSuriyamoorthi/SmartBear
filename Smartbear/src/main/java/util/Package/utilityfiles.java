package util.Package;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class utilityfiles {
	 public  static  WebDriver driver;
	
public void BrowserSelect() {
    
	Scanner scan = new Scanner(System.in);
	System.out.println("enter the browser");
	String browser = scan.nextLine();
	switch (browser) {

	case "chrome":
		driver = new ChromeDriver();
		
		break;

	case "firefox":
		driver = new FirefoxDriver();
		break;
	case "ie":
		System.setProperty("webdriver.ie.driver",
				"D:\\new\\eclipse-workspace\\AutomationTesting\\lib\\IEDriverServer.exe");
		driver = new InternetExplorerDriver();
		break;
	case "edge":
		System.setProperty("webdriver.edge.driver",
				"D:\\new\\eclipse-workspace\\AutomationTesting\\lib\\MicrosoftWebDriver.exe");
		driver = new EdgeDriver();
		break;
	}
	scan.close();
	
}


}
