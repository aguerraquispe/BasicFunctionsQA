import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGExample6 extends Base{
    @Test
    @Parameters({"myName","myAge","suiteParameter"})
    public void testExample6_1(String myName, String myAge, String suiteParameter){
        System.out.println("Test 6_1");
        System.out.println("My name is: "+myName);
        System.out.println("My age is: "+myAge);
        System.out.println(suiteParameter);
    }

    @Test
    @Parameters({"myUniversity","myPC"})
    public void testExample6_2(String myUniversity, String myPC){
        System.out.println("Test 6_2");
        System.out.println("My University is: "+myUniversity);
        System.out.println("My PC is: "+myPC);
    }
}
