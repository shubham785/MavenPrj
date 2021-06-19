package GitHub;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Facebook 
	{
		public static WebDriver driver;
		
		 //public ExtentHtmlReporter htmlReporter;
		//public ExtentReports extent;
		//public ExtentTest test;

		@BeforeMethod
		public void LaunchBrowser()
		{
			System.setProperty("webdriver.chrome.driver", "F:\\Eclipse\\BrowserDriver\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://www.facebook.com");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//div[@id='pageFooter']/ul/li[12]/a")).click();
			driver.findElement(By.xpath("//a[text()='English (US)']")).click();
		}
		static int count =0;
		@Test(priority=1)
		public void loginTest() {	
		count++;
		System.out.println(count);
		driver.findElement(By.cssSelector("input[id='email']")).sendKeys("shufhamchaurasia.rock@gmail.com");
		driver.findElement(By.cssSelector("input[id='pass']")).sendKeys("idon'tknow");
		driver.findElement(By.cssSelector("button[name='login']")).click();
		driver.findElement(By.xpath("//div[@id='login_link']/div/a[text()='Forgotten password?']")).click();
		Assert.fail();
		driver.quit();
		}
		
		@Test(priority=2)
		public void regTest() 
		{
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		driver.findElement(By.xpath("//input[@type='text'][@name='firstname']")).sendKeys("Ajit");
		driver.findElement(By.xpath("//input[@type='text'][@name='lastname']")).sendKeys("Kumar");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("1256458528");
		driver.findElement(By.xpath("//input[@type='password'][@name='reg_passwd__']")).sendKeys("@Ajit7854848");
		Select selectdate = new Select(driver.findElement(By.xpath("//select[@name='birthday_day']")));
		selectdate.selectByValue("5");
		Select selectmonth = new Select(driver.findElement(By.xpath("//select[@id='month']")));
		selectmonth.selectByValue("4");
		Select selectyear = new Select(driver.findElement(By.xpath("//select[@name='birthday_year']")));
		selectyear.selectByVisibleText("1982");
		driver.findElement(By.xpath("//label[text()='Male']")).click();
		driver.findElement(By.xpath("//button[text()='Sign Up']")).click();
		driver.quit();
		}
		
		@Test(priority=3)
		public void regTest2() 
		{
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		driver.findElement(By.xpath("//div/div/input[@name='firstname']")).sendKeys("Raguvendra");
		driver.findElement(By.xpath("//div[@id='fullname_field']/div/div[2]/div/div/input")).sendKeys("Pandey");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("1237894141");
		driver.findElement(By.xpath("//input[@type='password'][@name='reg_passwd__']")).sendKeys("@Qwert18545#");
		Select selectdate1 = new Select(driver.findElement(By.xpath("//select[@name='birthday_day']")));
		selectdate1.selectByValue("5");
		Select selectmonth1 = new Select(driver.findElement(By.xpath("//select[@id='month']")));
		selectmonth1.selectByValue("4");
		Select selectyear1 = new Select(driver.findElement(By.xpath("//select[@name='birthday_year']")));
		selectyear1.selectByVisibleText("1982");
		driver.findElement(By.xpath("//label[text()='Male']")).click();
		driver.findElement(By.xpath("//button[text()='Sign Up']")).click();
		driver.quit();
		}

}
