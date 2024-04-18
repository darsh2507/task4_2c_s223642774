package sit707_week4;

import static org.junit.Assert.*;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;
public class BunningsForm1Test {

	private String baseUrl= "https://www.bunnings.com.au/login";
	
	
	   
	
	
	@Test
	public void testValidLogin()
	
	{
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(baseUrl);
        driver.findElement(By.id("okta-signin-username")).sendKeys("darshp8@gmail.com");
        driver.findElement(By.id("okta-signin-password")).sendKeys("Darsh180800");
        driver.findElement(By.id("okta-signin-submit")).click();
        assertEquals("Login successful page title", driver.getTitle());
        driver.quit();
	}
	

	@Test
	public void testInvaalidpassword()
	
	{
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(baseUrl);
        driver.findElement(By.id("okta-signin-username")).sendKeys("darshp8@gmail.com");
        driver.findElement(By.id("okta-signin-password")).sendKeys("invalidPassword");
        driver.findElement(By.id("okta-signin-submit")).click();
        assertEquals("Login failed page title", driver.getTitle());
        driver.quit();
	}
	
	@Test
	public void testInvalidUsername()
	
	{
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(baseUrl);
        driver.findElement(By.id("okta-signin-username")).sendKeys("darshp8@gmail.com");
        driver.findElement(By.id("okta-signin-password")).sendKeys("Darsh@180800");
        driver.findElement(By.id("okta-signin-submit")).click();
        assertEquals("Login failed page title", driver.getTitle());
        driver.quit();
	}
	
	
	@Test
	public void testInvalidUsernameandPassword()
	
	{
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(baseUrl);
        driver.findElement(By.id("okta-signin-username")).sendKeys("darshp8@gmail.com");
        driver.findElement(By.id("okta-signin-password")).sendKeys("Darsh@1800");
        driver.findElement(By.id("okta-signin-submit")).click();
        assertEquals("Login failed page title", driver.getTitle());
        driver.quit();
	}
	
	@Test
	public void testEmptyUsername()
	
	{
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(baseUrl);
        driver.findElement(By.id("okta-signin-username")).sendKeys("");
        driver.findElement(By.id("okta-signin-password")).sendKeys("Darsh@180800");
        driver.findElement(By.id("okta-signin-submit")).click();
        assertEquals("Login failed page title", driver.getTitle());
        driver.quit();
	}
	
	@Test
	public void testEmptyPassword()
	
	{
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(baseUrl);
        driver.findElement(By.id("okta-signin-username")).sendKeys("darsh958@gamil.com");
        driver.findElement(By.id("okta-signin-password")).sendKeys("");
        driver.findElement(By.id("okta-signin-submit")).click();
        assertEquals("Login failed page title", driver.getTitle());
        driver.quit();
	}

	@Test
	public void testEmptyUsernameandPassword()
	
	{
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(baseUrl);
        driver.findElement(By.id("okta-signin-username")).sendKeys("");
        driver.findElement(By.id("okta-signin-password")).sendKeys("");
        driver.findElement(By.id("okta-signin-submit")).click();
        assertEquals("Login failed page title", driver.getTitle());
        driver.quit();
	}

}
