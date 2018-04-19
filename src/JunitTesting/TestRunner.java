package JunitTesting;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import junit.framework.TestCase;

/**
 * @author NXATZ
 *
 */
public class TestRunner extends TestCase  {

	/**
	 * Main method
	 * 
	 * @param args
	 *            command line
	 */
	public static void main(String[] args) {
		Result result = JUnitCore.runClasses(JunitTestSuit.class);

		for (Failure failure : result.getFailures()) {
			System.out.println(failure.toString());
		}


		
		System.out.println("------------------------------------------------");
		System.out.println("JUNIT TESTING STATISTICS");
		System.out.println("------------------------------------------------");
		System.out.println("Test succeed          : "+result.wasSuccessful());
		System.out.println("Test duration         : "+result.getRunTime()+ " milliseconds");
		System.out.println("Testcases tested      : "+result.getRunCount());
		System.out.println("Testcases ignored     : "+result.getIgnoreCount());
		System.out.println("Testcases Failed      : "+result.getFailureCount());
		System.out.println("Percentage of Success : "+(((result.getRunCount()-result.getFailureCount())*100)/result.getRunCount())+" %");
		System.out.println("------------------------------------------------");
	}


}
