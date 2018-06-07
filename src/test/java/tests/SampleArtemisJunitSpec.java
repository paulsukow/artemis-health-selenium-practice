package tests;

import component.library.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.util.concurrent.TimeUnit.SECONDS;


public class SampleArtemisJunitSpec {

    private WebDriver driver;

    @Before
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, SECONDS);
    }

    @After
    public void tearDown() {
        driver.close();
    }

    @Test
    public void test() {
        HomePageJava homePage = new HomePageJava(driver);
        homePage.get();

        assert homePage.isOpen();

        homePage.watchDemoFromHeroSectionButton().click();

        WatchDemoPageJava watchDemoPage = new WatchDemoPageJava(driver);
        assert watchDemoPage.isOpen();

        NavigationBarJava navigationBar = new NavigationBarJava(driver);
        navigationBar.selectBlogFromInsightsDropDownMenu();

        BlogPageJava blogPage = new BlogPageJava(driver);
        assert blogPage.isOpen();

        String firstFeaturedBlogPostTitle = blogPage.getFirstFeaturedBlogPostTitle();
        blogPage.selectFirstFeaturedBlogPost();

        BlogPostPageJava blogPostPage = new BlogPostPageJava(driver);
        assert firstFeaturedBlogPostTitle.equals(blogPostPage.getBlogPostTitle());
    }
}
