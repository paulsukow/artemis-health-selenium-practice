import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver
import spock.lang.Specification

import static java.util.concurrent.TimeUnit.SECONDS

class SampleTest extends Specification {

    private WebDriver driver

    def 'sample test'() {
        when:
        driver = new ChromeDriver()
        driver.manage().timeouts().implicitlyWait(10, SECONDS)

        driver.get('https://www.google.com')

        then:
        driver.getTitle() == 'Google'
    }
}
