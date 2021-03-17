package brincadeira;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidLogin {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = null;
        System.setProperty("webdriver.chrome.driver", "/home/george/eclipse-workspace/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://vk.com/");
        driver.manage().window().setSize(new Dimension(1366, 713));
        driver.findElement(By.id("index_email")).sendKeys("5581993757831");
        driver.findElement(By.id("index_pass")).click();
        driver.findElement(By.id("index_pass")).sendKeys("egroeg666");
        driver.findElement(By.id("index_login_button")).click();
        try {
        	   Thread.sleep(15000);
        	} catch (InterruptedException e) {
        	   e.printStackTrace();
        }
        driver.close();
	}
}
