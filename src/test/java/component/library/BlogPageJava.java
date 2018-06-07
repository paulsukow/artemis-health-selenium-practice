package component.library;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class BlogPageJava {

    private static final String URL = "https://www.artemishealth.com/blog";
    private static final String PAGE_TITLE = "Artemis Health | News";

    private WebDriver driver;

    public BlogPageJava(WebDriver driver) {
        this.driver = driver;
    }

    public void get() {
        driver.get(URL);
    }

    public boolean isOpen() {
        return PAGE_TITLE.equals(driver.getTitle());
    }

    public void selectFirstFeaturedBlogPost() {
        featuredFeedElements().get(0).click();
    }

    public String getFirstFeaturedBlogPostTitle() {
        return featuredFeedElements().get(0).findElement(By.tagName("h3")).getText();
    }

    private List<WebElement> featuredFeedElements() {
        return driver.findElements(By.className("feed-featured-item"));
    }
}
