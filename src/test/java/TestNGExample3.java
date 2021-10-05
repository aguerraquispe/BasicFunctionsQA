import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGExample3 extends Base{

    @BeforeTest
    public void initialize(){
        driver = initializeDriver();
    }

    @Test(enabled = false)
    public void testExample3_1(){
        driver.get("https://www.google.com.pe");
        System.out.println("Abrimos Google");
    }
    @Test
    public void testExample3_2(){
        driver.get("https://www.amazon.com");
        System.out.println("Abrimos Amazon");
    }

    @AfterTest
    public void closeDriver(){
        driver.close();
    }
}
