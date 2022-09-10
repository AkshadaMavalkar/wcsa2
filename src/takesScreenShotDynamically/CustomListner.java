package takesScreenShotDynamically;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
//to get all the below methods of ITestListener interface, Right click on ITestListener>source>override implements>selecteverythings >click on next..

public class CustomListner  extends BaseTest implements ITestListener
{

	@Override
	public void onTestStart(ITestResult result) {
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		failed();
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	@Override
	public void onStart(ITestContext context) {
		
	}

	@Override
	public void onFinish(ITestContext context)
	{
		
	}
}
