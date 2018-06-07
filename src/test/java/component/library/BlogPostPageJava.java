package component.library;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BlogPostPageJava {

    private WebDriver driver;

    public BlogPostPageJava(WebDriver driver) {
        this.driver = driver;
    }

    public String getBlogPostTitle() {
        return driver.findElement(By.cssSelector("div.hero h1")).getText();
    }
}
