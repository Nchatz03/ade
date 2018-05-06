package DroneImageAlgorithm;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;

import Area.Area;
import Drone.Drone;

/**
 * Phase executioner to adapt in algorithm
 * 
 * @author NXATZ
 *
 */
public class PhaseExecution {

	/**
	 * Number of fileds in info array
	 */
	private static final int FIELDNUMBER = 2;

	/**
	 * Field 0 is Height in infoarray
	 */
	private static final int HEIGHT = 0;

	/**
	 * Field 1 is Width in infoarray
	 */
	private static final int WIDTH = 1;

	/**
	 * Image counter
	 */
	private static int imageCount = 0;

	/**
	 * List of drones pointer
	 */
	private static LinkedList<Drone> dronelist = null;

	/**
	 * List of area pointer
	 */
	private static LinkedList<Area> arealist = null;

	/**
	 * Info array
	 */
	private static double[][] infoarray = null;
	
	/**
	 * Default file to save
	 */
	public static String defaultsave = "Dronedata.txt";

	/**
	 * Phase 1 executioner
	 * 
	 * --- Phase 1.1 : creating Drone Object --- Phase 1.2 : Get Images Specs
	 * 
	 * @param path
	 *            The path of dronedata.txt
	 */
	public static void Phase1_Executioner(String path) {

		// Phase 1.1 : creating Drone Object
		// Phase 1.2 : Get Images Specs
		boolean flag = false;
		String line = null;
		
	    System.out.println("edee");

		try {

			FileReader fileReader = new FileReader(path);

			BufferedReader bufferedReader = new BufferedReader(fileReader);

			while ((line = bufferedReader.readLine()) != null) {

				
				if (flag == true) {

					Drone tempDrone = new Drone();
					tempDrone = tempDrone.GetSpecs(line);
					System.out.println("lat"+tempDrone.getLatitude());
					dronelist.addLast(tempDrone);

				}

				if (line.contains("dronedata:")) {
					flag = true;
					System.out.println("hi");
					continue;
				}

			}

			bufferedReader.close();
		} catch (FileNotFoundException ex) {
			System.out.println("error1");
			//Messages.printFileNotFoundException();

		} catch (IOException e) {
			// Messages.printFileIOException();
			System.out.println("error2");
		} catch (ArrayIndexOutOfBoundsException es) {
			// Messages.printArrayIndexOOB();

		}

		imageCount = dronelist.size();

	}

	/**
	 * Phase 2 executioner
	 * 
	 * ---Phase 2.1 : Calculate Heigth ---Phase 2.2 : Calculate Width
	 */
	public static void Phase2_Executioner() {

		LinkedList<Drone> dronelist2 = new LinkedList<Drone>();

		for (int i = 0; i < imageCount; i++) {

			Drone temp = dronelist.removeFirst();

			// Phase 2.1 : Calculate Height
			infoarray[i][HEIGHT] = CalculationProcedures.calculateHofPF(temp);

			// Phase 2.2 : Calculate Width
			infoarray[i][WIDTH] = CalculationProcedures.calculateWofPF(temp);

			dronelist2.addLast(temp);

		}

		dronelist = dronelist2;

	}

	/**
	 * Phase 3 executioner
	 * 
	 * ---Phase 3.1: Creating Area Object ---Phase 3.2: Get Output Report
	 * 
	 * @throws IOException
	 *             IO exception
	 */
	public static void Phase3_Executioner() throws IOException {

		// Phase 3.1: Creating Area Object

		for (int i = 0; i < imageCount; i++) {
			Drone temp1 = new Drone();

			temp1 = dronelist.removeFirst();

			Area temp = new Area(temp1.getImagetitle(), infoarray[i][HEIGHT], infoarray[i][WIDTH]);

			arealist.addLast(temp);

		}

		// Phase 3.2: Get Output Report

		Area temp = new Area();

		temp.areaReport(arealist,defaultsave);

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

		System.out.println("dwd    "+path);
		dronelist = new LinkedList<Drone>();
		arealist = new LinkedList<Area>();
		// PHASE 1: Drone Object creation
		Phase1_Executioner(path);

		// PHASE 2: Calculate Variables
		infoarray = new double[imageCount][FIELDNUMBER];
		Phase2_Executioner();
		
		if ( dronelist.isEmpty() == true){
			System.out.println("dkedked");
		}

		// PHASE 3: Area Object Creation
		try {
			Phase3_Executioner();
		} catch (IOException e) {

			e.printStackTrace();
		}
		return arealist;

	}

}
