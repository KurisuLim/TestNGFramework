import org.testng.annotations.Test;

public class SecondTestCase {
    public void setup(){
        System.out.println("This is setup test");
    }

    @Test(priority = 1)
    public void login(){
        System.out.println("This is login test");
    }

    @Test(priority = 2)
    public void searchingCustomer(){
        System.out.println("This is search customer");
    }

    @Test(priority = 3)
    public void addingCustomer(){
        System.out.println("This is adding customer");
    }

    @Test(priority = 4)
    public void tearDown(){
        System.out.println("Closing browser");
    }
}
