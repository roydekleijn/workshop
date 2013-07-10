package org.workshop.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

@Test(groups = { "all", "login" })
public class LoginTest {

  public void login() {
    // Create a webdriver instance to control the browser
    WebDriver driver = new FirefoxDriver();
    // Open a website
    driver.get("http://selenium.polteq.com/testshop/");
    // Navigate to login page
    driver.findElement(By.className("login")).click();

    // Fill in the form
    driver.findElement(By.id("email")).sendKeys("tester@test.com");
    driver.findElement(By.id("passwd")).sendKeys("tester");
    driver.findElement(By.id("SubmitLogin")).click();
    
    // close browser
    driver.quit();
  }

}
