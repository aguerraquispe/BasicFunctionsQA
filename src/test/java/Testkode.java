import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Testkode extends Base {
    @BeforeTest
    public void initialize(){
        driver = initializeDriver();
        driver.get("https://courses.letskodeit.com/practice");

    }

    @Test
    public void testVerify(){
        String actualTitle;
        String expectedTitle1 = "Practice Page";
        String expectedTitle2 = "Title Example";
        actualTitle = driver.getTitle();

        String actualUrl;
        String expectedUrl1 = "https://courses.letskodeit.com/practice";
        String expectedUrl2 = "www.google.com.pe";
        actualUrl = driver.getCurrentUrl();

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(expectedTitle1,actualTitle);//correcto
        softAssert.assertNotEquals(expectedTitle2,actualTitle);//correcto

        softAssert.assertEquals(actualUrl,expectedUrl1); // correcto
        softAssert.assertEquals(actualUrl,expectedUrl2); // falla

        System.out.println("Texto de prueba");

        softAssert.assertAll();//para cerrar la colección de asserts

    }

    public void testHardAssert(){
        String actualTitle;
        String expectedTitle1 = "Practice Page";
        String expectedTitle2 = "Title Example";
        actualTitle = driver.getTitle();

        String actualUrl;
        String expectedUrl1 = "https://courses.letskodeit.com/practice";
        String expectedUrl2 = "www.google.com.pe";
        actualUrl = driver.getCurrentUrl();

        Assert.assertEquals(expectedTitle1,actualTitle);//correcto
        Assert.assertEquals(expectedTitle2,actualTitle);//falla

        System.out.println("hola mundo");

    }

    @AfterTest
    public void closeDriver(){
        driver.close();
    }
}
