package mapping;

import java.io.IOException;

/**
 * @author NXATZ
 *
 */
public class PhaseExecution {

	/**
	* 
	*/
	public static void execPhase1_1() {

		GlobalVar.numberOfImages = InputMethods.getNumofImages(GlobalVar.PATH);
		if (GlobalVar.DEBUGFLAG.equals("-P")) {

			if (GlobalVar.numberOfImages > 0) {

				Messages.succeedPhase1_1();
			} else {

				Messages.failedPhase1_1();
			}

			Messages.retvalPhase1_1();
		}

	}

	/**
	 * @param fbba
	 *            BlackBox Array
	 * @return BlackBox
	 * 
	 */
	public static BlackBox execPhase1_2(BlackBox fbba) {

		fbba.BlackBoxReader("data.txt", GlobalVar.numberOfImages);

		if (GlobalVar.DEBUGFLAG.equals("-P")) {

			Messages.succeedPhase1_2();

			Messages.retvalPhase1_2(fbba);
		}
		return fbba;

	}

	/**
	 * @param fbba
	 *            BlackBox Array
	 */
	public static void execPhase1_3(BlackBox fbba) {

		for (int i = 0; i < GlobalVar.numberOfImages; i++) {

			String file = null;

			file = ImageDecoding.getBMPfromAny("./images/" + fbba.getSpecifiedElement(i, GlobalVar.BLACKBOX_FILENAME));
			fbba.setSpecifiedElement(file, i, GlobalVar.BLACKBOX_FILENAME);
			file = ImageDecoding.getTXTfromAny("./images/" + fbba.getSpecifiedElement(i, GlobalVar.BLACKBOX_FILENAME));
			fbba.setSpecifiedElement(file, i, GlobalVar.BLACKBOX_FILENAME);
		}

		Messages.retvalPhase1_2(fbba);
	}

	/**
	 * @param fbba
	 *            array
	 * @throws IOException
	 *             exception
	 */
	public static void execPhase1_Out(BlackBox fbba) throws IOException {

		fbba.BlackBoxFileWriter(fbba);

	}
	
	
	/**
	 * @param fbba blackbox
	 * @return fbba
	 * 
	 */
	public static BlackBox execPhase2_1(BlackBox fbba){
		
		return fbba = Coordination.imageCenterSorting(fbba);
		
	}
	
	/**
	 * @param fbba
	 *            array
	 * 
	 */
	public static void execPhase6_2(BlackBox fbba) {
		for (int i = 0; i < GlobalVar.numberOfImages; i++) {

			@SuppressWarnings("unused")
			String file = null;

			if (fbba.getSpecifiedElement(i, GlobalVar.BLACKBOX_IMAGE_FORMAT) == "JPG") {
				file = ImageDecoding
						.getJPGfromAny("./images/" + fbba.getSpecifiedElement(i, GlobalVar.BLACKBOX_FILENAME));
			}

			if (fbba.getSpecifiedElement(i, GlobalVar.BLACKBOX_IMAGE_FORMAT) == "bmp") {
				file = ImageDecoding
						.getBMPfromAny("./images/" + fbba.getSpecifiedElement(i, GlobalVar.BLACKBOX_FILENAME));
			}

		}

		Messages.retvalPhase1_2(fbba);

	}

	/**
	 * @throws IOException
	 *             exception
	 * 
	 */
	public static void execPhase1() throws IOException {
		
		
		// PHASE 1 INPUT
		
		// PHASE 1.1 : Count the images
		execPhase1_1();
		
		// PHASE 1.2 : Create BlackBox
		BlackBox fbba = new BlackBox(GlobalVar.numberOfImages, GlobalVar.BLACKBOX_LENGTH);
		fbba = execPhase1_2(fbba);
		
		// PHASE 1.3 : bitmap to text
		execPhase1_3(fbba);
		
		// PHASE 1 OUTPUT
		execPhase1_Out(fbba);
		
		
		// PHASE 2.1 : Calculate GPS distance

		// PHASE 2.2 : Image distance

		// PHASE 2.3 : Canvas dimension calculation
		
		
		// 
		
		

	}
	
	/**
	 * @param fbba array
	 * 
	 */
	public static void execPhase2(BlackBox fbba){
		
		
		// PHASE 2.1 : Calculate GPS distance
		
		fbba = execPhase2_1(fbba);

		// PHASE 2.2 : Image distance
		
		

		// PHASE 2.4 : Canvas dimension calculation
		
		
	}
	
	/**
	 * 
	 */
	public static void execPhase3(){
		
	}
	
	/**
	 * @param fbba array
	 */
	public static void execPhase6(BlackBox fbba){
		
		
		// PHASE 6.2 : Recover BMP files
		execPhase6_2(fbba);
		
	}

}
