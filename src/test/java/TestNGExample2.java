import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGExample2 extends Base{

    @BeforeTest
    public void initialize(){
        driver = initializeDriver();
    }

    @Test
    public void testExample1(){
        driver.get("https://www.stackoverflow.com");
        System.out.println("Abrimos StackOverFlow");
    }

    @Test
    public void testExample2(){
        driver.get("https://www.mi.com");
        System.out.println("Abrimos Xiaomy");
    }
    @AfterTest
    public void closeDriver(){
        driver.close();
    }
}
