package org.workshop.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

@Test(groups = { "all", "interactWithTheBrowser" })
public class InteractWithTheBrowserTest {

  @Test
  public void launchFirefox() {
    // This will open firefox
    WebDriver driver = new FirefoxDriver();

    // Open a webpage
    driver.get("http://selenium.polteq.com/testshop/");

    // Close the browser
    driver.quit();
  }

  @Test
  public void launchInternetExplorer() {
    // We have to set a path property
    System.setProperty("webdriver.ie.driver",
        "src/test/resources/IEDriverServer.exe");

    // This will open firefox
    WebDriver driver = new InternetExplorerDriver();

    // Open a webpage
    driver.get("http://selenium.polteq.com/testshop/");

    // Close the browser
    driver.quit();
  }

  @Test
  public void launchChrome() {
    // We have to set a path property
    System.setProperty("webdriver.chrome.driver",
        "src/test/resources/chromedriver.exe");

    // This will open firefox
    WebDriver driver = new ChromeDriver();

    // Open a webpage
    driver.get("http://selenium.polteq.com/testshop/");

    // Close the browser
    driver.quit();
  }
}
