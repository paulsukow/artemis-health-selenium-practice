package component.library;

import org.openqa.selenium.WebDriver;

public class WatchDemoPageJava {

    private static final String URL = "https://www.artemishealth.com/watch-demo";
    private static final String PAGE_TITLE = "Artemis Health | Watch a Demo";

    private WebDriver driver;

    public WatchDemoPageJava(WebDriver driver) {
        this.driver = driver;
    }

    public void get() {
        driver.get(URL);
    }

    public boolean isOpen() {
        return PAGE_TITLE.equals(driver.getTitle());
    }
}
