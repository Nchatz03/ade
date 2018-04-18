package mapping;

import java.io.IOException;

import blackbox.BlackBox;

/**
 * @author NXATZ
 *
 */
public class PhaseExecution {

	/**
	* 
	*/
	public static void execPhase1_1() {

		GlobalVar.setNumberOfImages(InputMethods.getNumofImages(GlobalVar.getPATH()));
		if (GlobalVar.getDEBUGFLAG().equals("-P")) {

			if (GlobalVar.getNumberOfImages() > 0) {

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

		fbba.BlackBoxReader("data.txt", GlobalVar.getNumberOfImages());

		if (GlobalVar.getDEBUGFLAG().equals("-P")) {

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

		for (int i = 0; i < GlobalVar.getNumberOfImages(); i++) {

			String file = null;

			file = ImageDecoding
					.getBMPfromAny("./images/" + fbba.getSpecifiedElement(i, GlobalVar.getBlackboxFilename()));
			fbba.setSpecifiedElement(file, i, GlobalVar.getBlackboxFilename());
			file = ImageDecoding
					.getTXTfromAny("./images/" + fbba.getSpecifiedElement(i, GlobalVar.getBlackboxFilename()));
			fbba.setSpecifiedElement(file, i, GlobalVar.getBlackboxFilename());
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
	 * @param fbba
	 *            blackbox
	 * @return fbba
	 * 
	 */
	public static BlackBox execPhase2_1(BlackBox fbba) {

		fbba = Coordination.imageCenterSorting(fbba);

		return fbba;

	}

	/**
	 * @param fbba
	 *            array
	 * 
	 */
	public static void execPhase6_2(BlackBox fbba) {
		for (int i = 0; i < GlobalVar.getNumberOfImages(); i++) {

			@SuppressWarnings("unused")
			String file = null;

			if (fbba.getSpecifiedElement(i, GlobalVar.getBlackboxImageFormat()) == "JPG") {
				file = ImageDecoding
						.getJPGfromAny("./images/" + fbba.getSpecifiedElement(i, GlobalVar.getBlackboxFilename()));
			}

			if (fbba.getSpecifiedElement(i, GlobalVar.getBlackboxImageFormat()) == "bmp") {
				file = ImageDecoding
						.getBMPfromAny("./images/" + fbba.getSpecifiedElement(i, GlobalVar.getBlackboxFilename()));
			}

		}

		Messages.retvalPhase1_2(fbba);

	}

	/**
	 * @param fbba
	 *            blackbox array
	 * @return
	 * @throws IOException
	 *             exception
	 * 
	 */
	public static BlackBox execPhase1(BlackBox fbba) throws IOException {

		// PHASE 1 INPUT

		// PHASE 1.1 : Count the images
		execPhase1_1();

		// PHASE 1.2 : Create BlackBox
		fbba = execPhase1_2(fbba);

		// PHASE 1.3 : bitmap to text
		execPhase1_3(fbba);

		return fbba;

		// PHASE 1 OUTPUT
		// execPhase1_Out(fbba);

		// PHASE 2.1 : Calculate GPS distance

		// PHASE 2.2 : Image distance

		// PHASE 2.3 : Canvas dimension calculation

		//

	}

	/**
	 * @param fbba
	 *            array
	 * 
	 */
	public static BlackBox execPhase2(BlackBox fbba) {

		// PHASE 2.1 : Calculate GPS distance from earth center and sort

		return fbba = execPhase2_1(fbba);

	}

	/**
	 * @param fbba
	 *            rfrf
	 * @return rfrf
	 * 
	 */
	public static BlackBox execPhase3(BlackBox fbba) {

		// PHASE 3.1 read images

		return fbba;

	}

	public static BlackBox execPhase4(BlackBox fbba) {

		// PHASE 4.1: Recalculate new image centers

		// PHASE 4.2 : Canvas dimension calculation and creation

		// PHASE 4.3 : Copy color pixels of images on canvas

		// PHASE 4.4 : Minimize Map height

		// PHASE 4.5 : Minimize Map width

		// PHASE 4.6 : PREVENT PADDING

		return fbba;

	}

	public static BlackBox execPhase5(BlackBox fbba) {

		// PHASE 5.1 : Generate new Bitmap

		// PHASE 5.2 : Add Canvas data to Bitmap

		// PHASE 5.3 : Save Bitmap

		return fbba;

	}

	/**
	 * @param fbba
	 *            array
	 * @return
	 */
	public static BlackBox execPhase6(BlackBox fbba) {

		// PHASE 6.2 : Recover BMP files
		execPhase6_2(fbba);
		return fbba;

	}

	/**
	 * @throws IOException
	 *             Io exception
	 */
	public static void execAllPhases() throws IOException {

		BlackBox fbba = new BlackBox(GlobalVar.getNumberOfImages(), GlobalVar.getBlackboxLength());

		fbba = execPhase1(fbba);
		fbba = execPhase2(fbba);
		fbba = execPhase3(fbba);
		fbba = execPhase4(fbba);
		fbba = execPhase5(fbba);
		fbba = execPhase6(fbba);

	}

}
