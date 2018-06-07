import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver
import spock.lang.Specification

import static java.util.concurrent.TimeUnit.SECONDS

class SampleArtemisHealthSpec extends Specification {

    private WebDriver driver

    def setup() {
        driver = new ChromeDriver()
        driver.manage().timeouts().implicitlyWait(10, SECONDS)
    }

    def cleanup() {
        driver.close()
    }

    def 'should be able to reach the artemis health home page'() {
        when: 'you go to the artemis health website'
        driver.get('https://www.artemishealth.com/')

        then: 'the artemis health home page should load'
        driver.getTitle() == 'Artemis Health | Unlock the power of your benefits data.'
    }
}
