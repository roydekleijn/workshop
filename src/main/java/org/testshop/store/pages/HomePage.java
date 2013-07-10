package org.testshop.store.pages;

import static org.testng.AssertJUnit.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.LoadableComponent;

public class HomePage extends LoadableComponent<HomePage> {
  private WebDriver driver;
  
  @FindBy(how = How.CSS, using = "a.login")
  private WebElement loginLink;
  
  public HomePage(WebDriver driver) {
    this.driver = driver;
    PageFactory.initElements(driver, this);
  }
  
  @Override
  protected void load() {
    driver.get("http://selenium.polteq.com/testshop/");
  }

  @Override
  protected void isLoaded() throws Error {
    String url = driver.getCurrentUrl();
    assertTrue("Not on the issue entry page: " + url, url.endsWith("/index.php"));
  }

  public LoginPage clickOnLoginLink() {
    loginLink.click();
    return new LoginPage(driver);
  }
}
