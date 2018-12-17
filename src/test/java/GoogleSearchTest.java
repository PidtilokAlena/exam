import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

import static java.lang.Thread.sleep;


public class GoogleSearchTest {
    @FindBy(xpath = "//*[@name='q']")
    private WebElement searchField;

@FindBy(xpath = "//*[@aria-label='Page 2']")
WebElement page2;

    @Test
    public void googleSearchPage() {
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://www.google.com/");
        WebElement searchField = webDriver.findElement(By.xpath("//*[@name='q']"));
        searchField.sendKeys("Selenium");
        searchField.sendKeys(Keys.ENTER);

        Assert.assertEquals(googleSearchResultsPage.searchResults(), 10,
               "SearchResultsCount is wrong.");
        List<String> searchResultList = googleSearchResultsPage.getSearchResults();
        page2.click();

    }

}
