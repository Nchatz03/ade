package mapping;

import java.io.IOException;
import java.util.ArrayList;

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
	 * @throws InterruptedException  ok
	 */
	public static void main(String args[]) throws IOException, InterruptedException {

		GlobalVar.setPATH(args[0]);
		GlobalVar.setDEBUGFLAG(args[1]);

		// |----------------------|
		// | PHASE 1 : CONVERTION |
		// |----------------------|

		PhaseExecution.execPhase1();
		//System.exit(0);

		// |----------------------|
		// |PHASE 2 : INPUT |
		// |----------------------|

		// PHASE 2.1 : Image object
		// PHASE 2.2 : Add data to Image object

		ArrayList<ImgRGB24> ImageList = new ArrayList<ImgRGB24>();
		
		 if (GlobalVar.getDEBUGFLAG().equals("-P")) {
		 Messages.succeedPhase2_1();
		 }
		
		 for (int i = 0; i < GlobalVar.getNumberOfImages(); i++) {
		 
		 ImgRGB24 image = new ImgRGB24();
		 System.out.println(i);
		 System.gc();
		 Thread.sleep(5000);
		 System.out.println(i);
		 
		 try {
		 // image.modifyImageTitle(flightBlackBox[GlobalVar.IMGFILENAME]);
		
		 image = InputMethods.readImageData("./images/DJI_0707.txt");
		 if (GlobalVar.getDEBUGFLAG().equals("-P")) {
		 // Messages.succeedPhase2_2(flightBlackBox[GlobalVar.IMGFILENAME]);
		 }
		 } catch (IOException e) {
		 e.printStackTrace();
		 }
		 ImageList.add(image);
		
		 }

		// PHASE 2.2 : Add data to Image object

		// |----------------------|
		// | PHASE 2: CORDINATION |
		// |----------------------|

		// PHASE 2.1 : Calculate GPS distance

		// PHASE 2.2 : Image distance

		// PHASE 2.3 : Create array with distance and centers

		// PHASE 2.4 : Canvas dimension calculation

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
