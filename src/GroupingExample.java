import org.testng.annotations.Test;

public class GroupingExample {

    @Test(groups = {"Sanity"})
    public void test1(){
        System.out.println("This is Test1...");
    }

    @Test(groups = {"Sanity"})
    public void test2(){
        System.out.println("This is Test2...");
    }

    @Test(groups = {"Regression"})
    public void test3(){
        System.out.println("This is Test3...");
    }

    @Test(groups = {"Regression"})
    public void test4(){
        System.out.println("This is Test4...");
    }

    @Test(groups = {"Sanity", "Regression"})
    public void test5(){
        System.out.println("This is Test5...");
    }
}
