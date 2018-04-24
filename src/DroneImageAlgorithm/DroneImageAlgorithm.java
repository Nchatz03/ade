/*
 * 
 */
package DroneImageAlgorithm;

import mapping.GlobalVar;

/**
 * This is the class of the main method where the Algorithm call to execute and
 * produce information
 * 
 * @author NXATZ
 *
 */
public class DroneImageAlgorithm {

	/**
	 * @param args
	 *            command line arguments
	 */
	public static void main(String args[]) {

		String path = args[0];
		PhaseExecution.PhaseExecutioner(path);
		

	}

}
