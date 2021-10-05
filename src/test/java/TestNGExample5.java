import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGExample5 extends Base{
    @BeforeTest
    public void initialize(){
        driver = initializeDriver();
    }

    @Test(enabled = false)
    public void testExample5_1(){
        driver.get("https://www.google.com.pe");
        System.out.println("Abrimos Google");
    }

    @Test(dependsOnMethods = {"testExample5_1"})
    public void testExample5_2(){
        driver.get("https://www.amazon.com");
        System.out.println("Abrimos Amazon");
    }

    @Test(dependsOnMethods = {"testExample5_1","testExample5_2"})
    public void testExample5_3(){
        driver.get("https://www.salesforce.com");
        System.out.println("Abrimos Salesforce");
    }

    @AfterTest
    public void closeDriver(){
        driver.close();
    }
}
