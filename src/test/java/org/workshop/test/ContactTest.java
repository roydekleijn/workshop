package org.workshop.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

@Test(groups = { "all", "contact" })
public class ContactTest {

  public void completeForm() throws InterruptedException {
    // Create a webdriver instance to control the browser
    WebDriver driver = new FirefoxDriver();
    // Open a website
    driver.get("http://selenium.polteq.com/testshop/");
    // Navigate to contact page
    driver.findElement(By.cssSelector("li#header_link_contact a")).click();
    // Complete form
    Select subject = new Select(driver.findElement(By.id("id_contact")));
    subject.selectByVisibleText("Customer service");

    driver.findElement(By.id("email")).sendKeys("tester@test.com");

    driver.findElement(By.id("id_order")).sendKeys("12345");

    driver.findElement(By.id("message")).sendKeys("Message of what went wrong");

    driver.findElement(By.id("submitMessage")).click();

    // close browser
    driver.quit();
  }
}
