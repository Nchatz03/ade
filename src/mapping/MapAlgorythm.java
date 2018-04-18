package mapping;

import java.io.IOException;

/**
 * @author NXATZ
 *
 */
public class MapAlgorythm {

	/**
	 * Algorithm executioner
	 * 
	 * -D: Argument to run debug -P: Detailed Execution (NO OPTION) : Execution
	 * 
	 * @param args
	 *            command line arguments
	 * @throws IOException
	 *             exception
	 * @throws InterruptedException
	 *             ok
	 */
	public static void main(String args[]) throws IOException, InterruptedException {

		if (args.length == 1 && args[0].equals(GlobalVar.JUNITFLAG)) {

			// run test
		}

		if (args.length == 1 && !(args[0].equals(GlobalVar.JUNITFLAG))) {

			GlobalVar.EXECFLAG = "ALL";
			GlobalVar.PATH = args[0];
			GlobalVar.DEBUGFLAG = "-NO";

		}

		if (args.length == 2) {

			GlobalVar.EXECFLAG = null;
			GlobalVar.PATH = args[0];
			GlobalVar.DEBUGFLAG = args[1];

		}

		if (args.length == 3) {

			GlobalVar.EXECFLAG = args[0];
			GlobalVar.PATH = args[1];
			GlobalVar.DEBUGFLAG = args[2];

		}

		PhaseExecution.execAllPhases();
		System.exit(0);

		// |---------------------|
		// |PHASE 1 : CONVERTION |
		// |---------------------|

		// |----------------------|
		// |PHASE 2 : CORDINATION |
		// |----------------------|

		// |----------------|
		// |PHASE 3 : INPUT |
		// |----------------|

		// |--------------|
		// |PHASE 4 : MAP |
		// |--------------|

		// |---------------------|
		// |PHASE 5 : CONVERTION |
		// |---------------------|

		// |-----------------|
		// |PHASE 6 : OUTPUT |
		// |-----------------|

	}

}
