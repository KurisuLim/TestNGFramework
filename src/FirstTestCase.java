import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/*
1. Setup
2. Login
3. Close
*/

public class FirstTestCase {

    @Test(priority = 0)
    public void setup(){
        System.out.println("This is setup test");
    }

    @Test(priority = 1)
    public void login(){
        System.out.println("This is login test");
    }

    @Test(priority = 2)
    public void tearDown(){
        System.out.println("Closing browser");
    }

}
