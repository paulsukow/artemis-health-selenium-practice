package tests

import component.library.BlogPage
import component.library.BlogPostPage
import component.library.HomePage
import component.library.NavigationBar
import component.library.WatchDemoPage
import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver
import spock.lang.Specification
import spock.lang.Stepwise

import static java.util.concurrent.TimeUnit.SECONDS

@Stepwise
class SampleArtemisHealthSpec extends Specification {

    private static WebDriver driver

    def setupSpec() {
        driver = new ChromeDriver()
        driver.manage().timeouts().implicitlyWait(10, SECONDS)
    }

    def cleanupSpec() {
        driver.close()
    }

    def 'should be able to reach the artemis health home page'() {
        when: 'you go to the artemis health website'
        HomePage homePage = new HomePage(driver)
        homePage.get()

        then: 'the artemis health home page should load'
        homePage.isOpen()
    }

    def 'should be able to reach the artemis health demo page'() {
        when: 'you click on the watch demo button from the hero section'
        HomePage homePage = new HomePage(driver)
        homePage.watchDemoFromHeroSectionButton().click()

        then: 'you are redirected to the demo page'
        WatchDemoPage watchDemoPage = new WatchDemoPage(driver)
        watchDemoPage.isOpen()
    }

    def 'should be able to read some blog articles'() {
        when: 'you select the blog from the insights menu'
        NavigationBar navigationBar = new NavigationBar(driver)
        navigationBar.selectBlogFromInsightsDropDownMenu()

        then: 'you are redirected to the blog page'
        BlogPage blogPage = new BlogPage(driver)
        blogPage.isOpen()
    }

    def 'should be able to open the first blog post'() {
        when: 'you click on the first blog post'
        BlogPage blogPage = new BlogPage(driver)
        String firstFeaturedBlogPostTitle = blogPage.getFirstFeaturedBlogPostTitle()
        blogPage.selectFirstFeaturedBlogPost()

        then: 'the first featured blog post should open'
        BlogPostPage blogPostPage = new BlogPostPage(driver)
        blogPostPage.getBlogPostTitle() == firstFeaturedBlogPostTitle
    }
}
