package listeners;

import org.junit.Test;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;

@Listeners(listeners.CustomListeners.class)
public class ListenerTest {

    @Test
    public void test1(){
        System.out.println("This is Test1");
        Assert.assertEquals("A","A");
    }

    @Test
    public void test2(){
        System.out.println("This is Test2");
        Assert.assertEquals(1,2);
    }

    @Test
    public void test3(){
        System.out.println("This is Test3");
        throw new SkipException("This is skip exception...");
    }
}
