package component.library

import org.openqa.selenium.By
import org.openqa.selenium.WebDriver

class BlogPostPage {

    private WebDriver driver

    public BlogPostPage(WebDriver driver) {
        this.driver = driver
    }

    public String getBlogPostTitle() {
        driver.findElement(By.cssSelector('div.hero h1')).getText()
    }
}
