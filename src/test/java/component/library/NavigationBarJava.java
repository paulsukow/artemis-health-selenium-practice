package component.library;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NavigationBarJava {

    private WebDriver driver;

    public NavigationBarJava(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement artemisHealthIcon() {
        return navBarContainer().findElement(By.className("nav-site-logo"));
    }

    public WebElement forPartners() {
        return navBarContainer().findElement(By.linkText("For Partners"));
    }

    public void selectBlogFromInsightsDropDownMenu() {
        insightsDropDown().click();
        blog().click();
    }

    public void selectResourcesFromInsightsDropDownMenu() {
        insightsDropDown().click();
        resources().click();
    }

    public WebElement insightsDropDown() {
        return navBarContainer().findElement(By.xpath("//div[contains(text(), 'Insights')]"));
    }

    public WebElement blog() {
        return navBarContainer().findElement(By.linkText("Blog"));
    }

    public WebElement resources() {
        return navBarContainer().findElement(By.linkText("Resources"));
    }

    public WebElement signIn() {
        return navBarContainer().findElement(By.linkText("Sign In"));
    }

    public WebElement requestDemo() {
        return navBarContainer().findElement(By.linkText("Re;quest Demo"));
    }

    private WebElement navBarContainer() {
        return driver.findElement(By.className("main-nav"));
    }
}
