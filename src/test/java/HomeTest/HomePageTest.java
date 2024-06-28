package HomeTest;

import Base.BaseClass;
import Pages.TestPages;
import org.testng.annotations.Test;

public class HomePageTest extends BaseClass {

    //@Test is TestNg notation and our test method.
    // another pre-requirement is required in BaseClass which is @BeforeTest
    @Test
    public void HomePageMethod() throws InterruptedException {
        TestPages homepage = new TestPages(driver);
        homepage.VerifyEnglish();
        Thread.sleep(4000);
        homepage.AboutSaf();
        Thread.sleep(4000);
//        homepage.tuwaiqAcademy();
//        Thread.sleep(2000);


    }
}
