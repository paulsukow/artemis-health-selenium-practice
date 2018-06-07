package component.library

import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement

class NavigationBar {

    private WebDriver driver

    public NavigationBar(WebDriver driver) {
        this.driver = driver
    }

    public WebElement artemisHealthIcon() {
        navBarContainer().findElement(By.className('nav-site-logo'))
    }

    public WebElement forPartners() {
        navBarContainer().findElement(By.linkText('For Partners'))
    }

    public void selectBlogFromInsightsDropDownMenu() {
        insightsDropDown().click()
        blog().click()
    }

    public void selectResourcesFromInsightsDropDownMenu() {
        insightsDropDown().click()
        resources().click()
    }

    public WebElement insightsDropDown() {
        navBarContainer().findElement(By.xpath("//div[contains(text(), 'Insights')]"))
    }

    public WebElement blog() {
        navBarContainer().findElement(By.linkText('Blog'))
    }

    public WebElement resources() {
        navBarContainer().findElement(By.linkText('Resources'))
    }

    public WebElement signIn() {
        navBarContainer().findElement(By.linkText('Sign In'))
    }

    public WebElement requestDemo() {
        navBarContainer().findElement(By.linkText('Request Demo'))
    }

    private WebElement navBarContainer() {
        driver.findElement(By.className('main-nav'))
    }
}
