package mapping;

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
	 */
	public static void main(String args[]) {

		GlobalVar.PATH = args[0];
		GlobalVar.DEBUGFLAG = args[1];

		// |----------------------|
		// |PHASE 1 : CONVERTION |
		// |----------------------|

		// PHASE 1.1 : Count the images

		GlobalVar.numberOfImages = InputMethods.getNumofImages(GlobalVar.PATH);
		if (GlobalVar.DEBUGFLAG.equals("-P")) {

			if (GlobalVar.numberOfImages > 0) {

				Messages.succeedPhase1_1();
			} else {

				Messages.failedPhase1_1();
			}

			Messages.retvalPhase1_1();
		}

		// PHASE 1.2 : Create BlackBoxarray

		String[][] flightBlackBox = new String[GlobalVar.numberOfImages][GlobalVar.FBBAlength];

		// PHASE 1.3 : bitmap to text

		for (int i = 0; i < GlobalVar.numberOfImages; i++) {
			ImageDecoding.getTXTfromBMP("./images" + "/" + flightBlackBox[i][GlobalVar.IMGFILENAME]);
		}

		// |----------------------|
		// |PHASE 2 : INPUT |
		// |----------------------|

		// PHASE 2.1 : Image object

		// PHASE 2.2 : Add data to Image object

		// |----------------------|
		// |PHASE 3: CORDINATION |
		// |----------------------|

		// PHASE 3.1 : Calculate GPS distance

		// PHASE 3.2 : Image distance

		// PHASE 3.3 : Create array with distance and centers

		// PHASE 3.4 : Canvas dimension calculation

		// |----------------------|
		// |PHASE 4: MAP |
		// |----------------------|

		// PHASE 4.1: Recalculate new image centers

		// PHASE 4.2 : Pin new centers on canvas

		// PHASE 4.3 : Copy color pixels of images on canvas

		// PHASE 4.4 : Minimize Map height

		// PHASE 4.5 : Minimize Map width

		// PHASE 4.6 : Add padding

		// |----------------------|
		// |PHASE 5: CONVERTION |
		// |----------------------|

		// PHASE 5.1 : Generate new Bitmap

		// PHASE 5.2 : Add Canvas data to Bitmap

		// |----------------------|
		// |PHASE 6: OUTPUT |
		// |----------------------|

		// PHASE 6.1 : Save Map's BMP

		// PHASE 6.2 : Recover BMP files

	}

}
