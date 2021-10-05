import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGExample7 extends Base{
    @Test
    @Parameters({"myName","myAge","suiteParameter"})
    public void testExample7_1(String myName,String myAge, String suiteParameter){
        System.out.println("Test 7_1");
        System.out.println("My name is: "+myName);
        System.out.println("My age is: "+myAge);
        System.out.println(suiteParameter);
    }

    @Test
    @Parameters({"myUniversity","myPC","suiteParameter"})
    public void testExample7_2(String myUniversity, String myPC, String suiteParameter){
        System.out.println("Test 7_2");
        System.out.println("My University is: "+myUniversity);
        System.out.println("My PC is: "+myPC);
        System.out.println(suiteParameter);
    }

    @Test
    @Parameters({"username","password"})
    public void informData(String username, String password){
        System.out.println("Username: "+username);
        System.out.println("Password: "+password);
    }

    @DataProvider
    public Object[][] getData(){
        Object[][] data = new Object[3][2];

        //lst set
        data[0][0]="FirstUsername";
        data[0][1]="FirstPassword";
        //lst set
        data[1][0]="SecondUsername";
        data[1][1]="SecondPassword";
        //lst set
        data[2][0]="ThirdUsername";
        data[2][1]="ThirdPassword";

        return data;
    }

}
