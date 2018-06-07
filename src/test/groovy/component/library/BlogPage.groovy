package component.library

import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement

class BlogPage {

    private static final String URL = 'https://www.artemishealth.com/blog'
    private static final String PAGE_TITLE = 'Artemis Health | News'

    private WebDriver driver

    public BlogPage(WebDriver driver) {
        this.driver = driver
    }

    public void get() {
        driver.get(URL)
    }

    public boolean isOpen() {
        driver.getTitle() == PAGE_TITLE
    }


    public void selectFirstFeaturedBlogPost() {
        featuredFeedElements()[0].click()
    }

    public String getFirstFeaturedBlogPostTitle() {
        featuredFeedElements()[0].findElement(By.tagName('h3')).getText()
    }

    private List<WebElement> featuredFeedElements() {
        driver.findElements(By.className('feed-featured-item'))
    }
}
