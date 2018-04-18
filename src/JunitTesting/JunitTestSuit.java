package JunitTesting;

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

@SuiteClasses({ TestJUnitBlackBox.class, TestJUnitImgRGB24.class })

public class JunitTestSuit {

}
