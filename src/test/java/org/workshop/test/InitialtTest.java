package org.workshop.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

@Test(groups = { "all", "initialtest" })
public class InitialtTest {

  public void openSite() {
    // Create a webdriver instance to control the browser
    WebDriver driver = new FirefoxDriver();
    // Open a website
    driver.get("http://selenium.polteq.com/testshop/");
    // Assert the browsers title
    Assert.assertEquals(driver.getTitle(), "TestShop");
    // Quit the browser
    driver.quit();
  }
}
