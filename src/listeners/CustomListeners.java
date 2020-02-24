package listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class CustomListeners implements ITestListener {

    // This belong to ITestListener and will execute before starting of Test set/batch
    public void onStart(ITestContext arg){
        System.out.println("Starts Test executing........" +arg.getName());
    }

    // This belong to ITestListener and will execute after starting of Test set/batch
    public void onFinish(ITestContext arg){
        System.out.println("Finish Test executing........" +arg.getName());
    }

    // This belong to ITestListener and will execute before main test start i.e @Test
    public void onTestStart(ITestResult arg){
        System.out.println("Starts Test........" +arg.getName());
    }

    // This belong to ITestListener and will execute when a test is skipped
    public void onTestSkip(ITestResult arg0){
        System.out.println("Skipping Test........" +arg0.getName());
    }

    // This belong to ITestListener and will execute when a test is passed
    public void onTestSuccess(ITestResult arg0){
        System.out.println("Passing Test........" +arg0.getName());
    }

    // This belong to ITestListener and will execute when a test is failed
    public void onTestFailure(ITestResult arg0){
        System.out.println("Failed Test........" +arg0.getName());
    }

    // Not so important..ignore this as of now
    public void onTestFailedButWithinSuccessPercentage(ITestResult arg0){
        // TODO Auto-genrated method stub
    }

}
