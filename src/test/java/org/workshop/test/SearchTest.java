package org.workshop.test;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

@Test(groups = { "all", "search" })
public class SearchTest {

  public void searchQuery() {
    // Create a webdriver instance to control the browser
    WebDriver driver = new FirefoxDriver();
    // Open a website
    driver.get("http://selenium.polteq.com/testshop/");

    driver.findElement(By.id("search_query_top")).sendKeys("iPod");

    driver.findElement(By.name("submit_search")).click();

    List<WebElement> searchResults = driver.findElements(By
        .cssSelector("ul#product_list li div h3"));
    List<String> searchResultTitles = new ArrayList<String>();
    for (WebElement result : searchResults) {
      searchResultTitles.add(result.getText());
    }

    // close browser
    driver.quit();
  }
}
