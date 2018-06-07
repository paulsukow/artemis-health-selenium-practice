package component.library

import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement

class HomePage {

    private static final String URL = 'https://www.artemishealth.com/'
    private static final String PAGE_TITLE = 'Artemis Health | Unlock the power of your benefits data.'

    private WebDriver driver

    public HomePage(WebDriver driver) {
        this.driver = driver
    }

    public void get() {
        driver.get(URL)
    }

    public boolean isOpen() {
        driver.getTitle() == PAGE_TITLE
    }

    public WebElement watchDemoFromHeroSectionButton() {
        heroSection().findElement(By.partialLinkText('Watch Demo'))
    }

    private WebElement heroSection() {
        driver.findElement(By.className('container-hero-home'))
    }


}
