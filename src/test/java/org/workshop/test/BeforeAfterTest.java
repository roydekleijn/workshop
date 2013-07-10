package org.workshop.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

@Test(groups = { "all", "initialtest" })
public class BeforeAfterTest {
  private WebDriver driver;

  @BeforeMethod(alwaysRun= true)
  public void setUp() {
    driver = new FirefoxDriver();
    driver.get("http://selenium.polteq.com/testshop/");
  }

  @AfterMethod(alwaysRun= true)
  public void tearDown() {
    driver.quit();
  }

  public void openSite() {
    Assert.assertEquals(driver.getTitle(), "TestShop");
  }
}
