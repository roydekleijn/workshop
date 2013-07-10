package org.workshop.test;

import junit.framework.Assert;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testshop.store.pages.HomePage;
import org.testshop.store.pages.LoginPage;

public class DesignPatternTest {
  private WebDriver driver;  
  
  @BeforeMethod(alwaysRun = true)
  public void setUp() {
    driver = new FirefoxDriver();
  }
  
  @AfterMethod(alwaysRun = true)
  public void tearDown() {
    driver.quit();
  }
  
  @Test
  public void loginWithError() {
    LoginPage loginPage = new HomePage(driver).get().clickOnLoginLink().login("tester@test.com", "test");
    Assert.assertEquals(true, loginPage.isErrorDisplayed());
  }
}
