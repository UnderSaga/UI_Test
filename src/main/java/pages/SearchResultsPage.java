package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SearchResultsPage {
    @FindBy(css = "[data-testid=\"result\"]")
    private List<WebElement> results;

    public List<WebElement> getResults() {
        return results;
    }
}
