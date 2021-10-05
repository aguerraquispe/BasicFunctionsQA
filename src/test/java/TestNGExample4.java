import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGExample4 extends Base{
    @BeforeTest(alwaysRun = true)
    public void initialize(){
        driver = initializeDriver();
    }

    @Test(groups = {"work","salesforce"})
    public void testExample4_1(){
        driver.get("https://www.google.com.pe");
        System.out.println("Abrimos Google");
    }
    @Test(groups = {"work","hira"})
    public void testExample4_2(){
        driver.get("https://www.linkedin.com");
        System.out.println("Abrimos Linkedin");
    }
    @Test(groups = {"crm","salesforce"})
    public void testExample4_3(){
        driver.get("https://www.salesforce.com");
        System.out.println("Abrimos Salesforce");
    }

    @AfterTest(alwaysRun = true)
    public void closeDriver(){
        driver.close();
    }
}
