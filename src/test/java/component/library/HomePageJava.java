package component.library;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePageJava {

    private static final String URL = "https://www.artemishealth.com/";
    private static final String TITLE = "Artemis Health | Unlock the power of your benefits data.";

    private WebDriver driver;

    public HomePageJava(WebDriver driver) {
        this.driver = driver;
    }

    public void get() {
        driver.get(URL);
    }

    public boolean isOpen() {
        return TITLE.equals(driver.getTitle());
    }

    public WebElement watchDemoFromHeroSectionButton() {
        return heroSection().findElement(By.partialLinkText("Watch Demo"));
    }

    private WebElement heroSection() {
        return driver.findElement(By.className("container-hero-home"));
    }
}
