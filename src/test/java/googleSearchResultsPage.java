import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class googleSearchResultsPage {


    @FindBy(xpath = "//div[@class='srg']/div[@class='g']")
    static
    List<WebElement> searchResults;
    private static Object webDriver;


    public static List<String> getSearchResults() {
        List<String> searchResultsList = new ArrayList<String>();
        for (WebElement searchResult : searchResults) {
            ((JavascriptExecutor) webDriver).executeScript("arguments[0].scrollIntoView();", searchResult);
            String searchResultText = searchResult.getText();
            searchResultsList.add(searchResultText);
        }
        return searchResultsList;
    }

    public static int searchResults() {
        return searchResults.size();

    }
}


