package JUnitTesting;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

/**
 * JUnit Suite Test for all classes
 * 
 * @author NXATZ
 *
 */
@RunWith(Suite.class)

@SuiteClasses({ TestJUnitDrone.class, TestJUnitArea.class, TestJUnitCP.class })

public class JunitTestSuit {

}
