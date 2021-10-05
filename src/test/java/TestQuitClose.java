import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class TestQuitClose extends Base{
    @BeforeTest
    public void initialize(){
        driver = initializeDriver();
        driver.get("https://the-internet.herokuapp.com/windows");
    }

    @Test
    public void testDirverQuitClose() throws InterruptedException {
        WebElement clickHere = driver.findElement(By.linkText("Click Here"));
        for (int i = 0; i < 4; i++) {
            clickHere.click();
        }

        Set<String> handlessSet = driver.getWindowHandles();//se identifica ventanas abiertas
        List<String> handlessList = new ArrayList<String>(handlessSet);

        driver.switchTo().window(handlessList.get(0)); //sirve para cambiar foco a pestaña, alerta, frame

        driver.close();//cierra una pestaña

        Thread.sleep(3000);

        driver.quit();//cierra el navegador
    }

    @AfterTest
    public void closeDriver(){
        driver.close();
    }
}
