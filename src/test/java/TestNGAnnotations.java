import org.testng.annotations.*;

public class TestNGAnnotations extends Base{

    @Test
    public void testCase1(){
        System.out.println("Test Case 1");
    }
    @Test
    public void testCase2(){
        System.out.println("Test Case 2");
    }

    @BeforeTest
    public void beforeTest(){
        System.out.println("BeforeClass");
    }
    @AfterTest
    public void afterTest(){System.out.println("AfterTest");}

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("BeforeMethod");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("AfterMethod");
    }

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("BeforeSuite");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.println("AfterSuite");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("BeforeClass");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("AfterClass");
    }
/*
    @AfterTest
    public void closeDriver(){
        driver.close();
    }*/
}
