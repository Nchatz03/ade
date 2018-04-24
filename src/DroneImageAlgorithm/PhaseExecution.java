package DroneImageAlgorithm;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;

import mapping.Messages;

/**
 * Phase executioner to adapt in algorithm
 * 
 * @author NXATZ
 *
 */
public class PhaseExecution {

	private static final int FieldNumber = 2;
	/**
	 * Image counter
	 */
	public static int imageCount = 0;

	/**
	 * Phase 1 executioner
	 * 
	 * --- Phase 1.1 : creating Drone Object --- Phase 1.2 : Get Images Specs
	 * 
	 * @param path
	 *            The path of dronedata.txt
	 * 
	 * @return The linked list of drone objects
	 */
	public static LinkedList<Drone> Phase1_Executioner(String path) {

		// Phase 1.1 : creating Drone Object

		LinkedList<Drone> dronelist = new LinkedList<Drone>();

		// Phase 1.2 : Get Images Specs
		boolean flag = false;
		String line = null;

		try {

			FileReader fileReader = new FileReader(path);

			BufferedReader bufferedReader = new BufferedReader(fileReader);

			while ((line = bufferedReader.readLine()) != null) {

				if (flag == true) {

					Drone tempDrone = new Drone();
					tempDrone.GetSpecs(line);
					dronelist.add(tempDrone);

				}

				if (line.contains("dronedata:")) {
					flag = true;
					continue;
				}

			}

			bufferedReader.close();
		} catch (FileNotFoundException ex) {
			Messages.printFileNotFoundException();

		} catch (IOException e) {
			Messages.printFileIOException();

		} catch (ArrayIndexOutOfBoundsException es) {
			Messages.printArrayIndexOOB();

		}

		imageCount = dronelist.size();

		return dronelist;

	}

	/**
	 * Phase 2 executioner
	 * 
	 * ---Phase 2.1 : Calculate Heigth ---Phase 2.2 : Calculate Width
	 * 
	 * @param dronelist
	 *            the list with drone objects from phase 1 executioner
	 * 
	 * @return The array of information get from drone
	 */
	public static double[][] Phase2_Executioner(LinkedList<Drone> dronelist) {

		double infoarray[][] = new double[imageCount][FieldNumber];

		for (int i =0; i < imageCount; i++){
			
			Drone temp = dronelist.removeFirst();
			
			// Phase 2.1 : Calculate Height
			infoarray[i][0] = CalculationProcedures.calculateHofPF(temp);

			// Phase 2.2 : Calculate Width
			infoarray[i][0] = CalculationProcedures.calculateWofPF(temp);

		}
		
		return infoarray;

	}

	/**
	 * Phase 3 executioner
	 * 
	 * ---Phase 3.1: Creating Area Object ---Phase 3.2: Get Output Report
	 * 
	 * @param infoarray
	 *            The array from phase 2 Executioner
	 * 
	 * @return The Linked list of area objects
	 */
	public static LinkedList<Area> Phase3_Executioner(double[][] infoarray) {

		LinkedList<Area> arealist = new LinkedList<Area>();

		// Phase 3.1: Creating Area Object

		// Phase 3.2: Get Output Report

		// AreaReport();

		return arealist;
	}

	/**
	 * All Phases Executioner
	 * 
	 * ---PHASE 1: Drone Object creation ---PHASE 2: Calculate Variables
	 * ---PHASE 3: Area Object Creation
	 * 
	 * @param path
	 *            The path of dronedata.txt
	 * 
	 * @return The Linked list of area objects
	 * 
	 */
	public static LinkedList<Area> PhaseExecutioner(String path) {

		// PHASE 1: Drone Object creation

		LinkedList<Drone> dronelist = Phase1_Executioner(path);

		// PHASE 2: Calculate Variables

		double infoarray[][] = Phase2_Executioner(dronelist);

		// PHASE 3: Area Object Creation

		LinkedList<Area> arealist = Phase3_Executioner(infoarray);

		return arealist;

	}

}
