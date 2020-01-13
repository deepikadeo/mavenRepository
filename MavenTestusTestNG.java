package mavenTestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class MavenTestusTestNG {
	WebDriver driver;
  @Test
  public void f() {
	  System.out.println(driver.getTitle());
	  System.out.println(driver.getCurrentUrl());
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chromedriver.exe");
	    driver=new ChromeDriver();
		driver.get("https://www.google.com/");
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
