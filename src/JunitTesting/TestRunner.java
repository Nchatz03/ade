package JunitTesting;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
 * @author NXATZ
 *
 */
public class TestRunner  {

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

		System.out.println(result.wasSuccessful());
	}


}
