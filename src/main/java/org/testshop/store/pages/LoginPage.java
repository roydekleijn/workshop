package org.testshop.store.pages;

import static org.testng.AssertJUnit.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.LoadableComponent;

public class LoginPage extends LoadableComponent<LoginPage> {
  private WebDriver driver;
  
  @FindBy(how = How.CSS, using = "input#email")
  private WebElement emailTextField;
  
  @FindBy(how = How.CSS, using = "input#passwd")
  private WebElement passwordTextField;
  
  @FindBy(how = How.CSS, using = "input#SubmitLogin")
  private WebElement loginButton;
  
  @FindBy(how = How.CSS, using = "div.error")
  private WebElement errorContainer;
  
  public LoginPage(WebDriver driver) {
    this.driver = driver;
    PageFactory.initElements(driver, this);
  }
  
  @Override
  protected void load() {
    driver.get("http://selenium.polteq.com/testshop/index.php?controller=authentication");
  }

  @Override
  protected void isLoaded() throws Error {
    String url = driver.getCurrentUrl();
    assertTrue("Not on the issue entry page: " + url, url.contains("/authentication"));
  }
  
  public LoginPage login(String email, String password) {
    emailTextField.sendKeys(email);
    passwordTextField.sendKeys(password);
    loginButton.click();
    return this;
  }
  
  public boolean isErrorDisplayed() {
    return errorContainer.isDisplayed();
  }
}
