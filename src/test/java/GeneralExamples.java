import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GeneralExamples extends Base {

    @BeforeTest
    public void initialize(){
        driver = initializeDriver();
    }

    @Test
    public void test() throws InterruptedException {
        driver.get("https://www.google.com.pe");
        Thread.sleep(3000);
        driver.get("https://www.google.com.ar");
        Thread.sleep(3000);
        driver.get("https://www.rpp.pe");
        Thread.sleep(3000);
    }

    @Test
    public void testBackForward() throws InterruptedException {
        driver.get("https://www.google.com.pe");
        Thread.sleep(1000);
        driver.get("https://www.rpp.pe");
        Thread.sleep(1000);
        driver.navigate().back();
        Thread.sleep(1000);
    }

    @Test
    public void testForward() throws InterruptedException {
        driver.get("https://www.google.com.pe");
        Thread.sleep(1000);
        driver.get("https://www.rpp.pe");
        Thread.sleep(1000);
        driver.navigate().back();
        Thread.sleep(1000);
        driver.navigate().forward();
    }

    @Test
    public void testGetCurrentUrl(){
        String url;
        driver.get("https://www.google.com.pe");
        url = driver.getCurrentUrl();
        System.out.println(url);
    }

    @Test
    public void testGetCurrentTitle(){
        String title;
        driver.get("https://www.google.com.pe");
        title = driver.getTitle();
        System.out.println(title);
    }

    @AfterTest
    public void closeDriver(){
        driver.close();
    }
}
