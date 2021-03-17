package CasoDeTeste2;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ForgottenPassword {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = null;
        System.setProperty("webdriver.chrome.driver", "/home/george/eclipse-workspace/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://vk.com/");
        driver.manage().window().setSize(new Dimension(1366, 713));
        driver.findElement(By.id("index_forgot")).click();
        driver.findElement(By.id("login_input")).sendKeys("x5x55xfsx");
        driver.findElement(By.id("submitBtn")).click();
        try {
        	   Thread.sleep(15000);
        	} catch (InterruptedException e) {
        	   e.printStackTrace();
        }
        driver.close();
	}
}
