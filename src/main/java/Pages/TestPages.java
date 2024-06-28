package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import static ObjectsPath.TestHome.*;
public class TestPages {
    WebDriver driver = null;
    public TestPages(WebDriver driver) {
        this.driver = driver;
    }
    public void VerifyEnglish() {
        WebElement english = driver.findElement(language);
        english.click();
    }
    public void AboutSaf() {

        WebElement aboutSafBtn = driver.findElement(aboutSAFCSP);
        aboutSafBtn.click();
        //driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL, Keys.END);
    }
}

//    public void tuwaiqAcademy(){
//
//        WebElement academyBtn = driver.findElement(tuwaiqAcademy);
//        academyBtn.click();
//        boolean sentence = driver.findElement(assertTuwaiqAcademy).isDisplayed();
//        Assert.assertTrue(sentence,"Unable to locate About Tuwaiq Academy text label!");
//    }
//}
