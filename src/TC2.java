import org.testng.annotations.*;

public class TC2 {

    @BeforeClass
    public void beforeClass(){
        System.out.println("This will execute before the class");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("This will execute after the class");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("This is will execute before every method");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("This is will execute after every method");
    }

    @Test
    public void test3(){
        System.out.println("This is test3...");
    }

    @Test
    public void test4(){
        System.out.println("This is test4...");
    }

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("This is execute before the Test Suite");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("This is execute after the Test Suite");
    }
}
