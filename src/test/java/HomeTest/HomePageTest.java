package HomeTest;

import Base.BaseClass;
import Pages.TestPages;
import org.testng.annotations.Test;

public class HomePageTest extends BaseClass {

    @Test
    public void HomePageMethod() throws InterruptedException {
        TestPages homepage = new TestPages(driver);
        homepage.VerifyEnglish();
        Thread.sleep(3000);
        homepage.AboutSaf();
        Thread.sleep(3000);
//        homepage.tuwaiqAcademy();
//        Thread.sleep(2000);


    }
}
