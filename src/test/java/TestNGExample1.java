import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGExample1 extends Base{

    @BeforeTest
    public void initialize(){
        driver = initializeDriver();
    }

    @Test
    public void testExample1(){
        driver.get("https://www.google.com");
        System.out.println("Abrimos Google");
    }

    @Test
    public void testExample2(){
        driver.get("https://www.sony.com");
        System.out.println("Abrimos Sony");
    }
    @AfterTest
    public void closeDriver(){
        driver.close();
    }
}
