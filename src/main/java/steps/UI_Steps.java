package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import pages.GooglePage;
import pages.SearchResultsPage;

public class UI_Steps {
    public void userCanSearch(WebDriver driver) {
        driver.get("https://www.duckduckgo.com");
        GooglePage page = PageFactory.initElements(driver, GooglePage.class);
        SearchResultsPage results = page.searchFor("Selenide java");
        Assert.assertTrue(results.getResults().get(0).getText().contains("Selenide: concise UI tests in Java"));
    }
}
