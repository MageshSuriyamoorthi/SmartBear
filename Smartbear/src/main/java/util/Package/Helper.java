package util.Package;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Helper extends utilityfiles {
	static WebElement element;

	public void geturl(String string) {

		driver.get(string);
	}

	public void maximize() {
		driver.manage().window().maximize();
	}

	public void ClickElement(String xpath) throws InterruptedException {
	Thread.sleep(4000);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath(xpath)).click();
	}

	public void selectDropdown(String xpath, String visibleText) {
		element = driver.findElement(By.xpath(xpath));
		Select produts = new Select(element);
		produts.selectByVisibleText(visibleText);
	}

	public void entertext(String xpath, String text)  {
		driver.findElement(By.xpath(xpath)).sendKeys(text);
	}

	public void closeDriver() throws InterruptedException {
		Thread.sleep(2000);
		driver.close();
	}

}
