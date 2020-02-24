import org.testng.Assert;
import org.testng.annotations.Test;

public class DependencyExample {

    @Test
    public static void startCar(){
        System.out.println("Car started");
        Assert.fail(); // make sure the test failed
    }

    @Test(dependsOnMethods = {"startCar"}) // depending on the startCar method to run first
    public static void driveCar(){
        System.out.println("Car driving");
    }

    @Test(dependsOnMethods = {"driveCar"})
    public static void stopCar(){
        System.out.println("Car stopped");
    }

    @Test(dependsOnMethods = {"driveCar", "stopCar"}, alwaysRun = true) //it always run even the other test failed
    public static void parkCar(){
        System.out.println("Car parked");
    }
}
