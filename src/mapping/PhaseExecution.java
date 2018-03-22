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
	public static void execPhase1_4(BlackBox fbba) throws IOException {

		fbba.BlackBoxFileWriter(fbba);

	}

	/**
	 * @param fbba
	 *            array
	 * 
	 */
	public static void execPhase6_1(BlackBox fbba) {
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

		execPhase1_1();
		BlackBox fbba = new BlackBox(GlobalVar.numberOfImages, GlobalVar.BLACKBOX_LENGTH);
		fbba = execPhase1_2(fbba);
		execPhase1_3(fbba);
		execPhase1_4(fbba);
		execPhase6_1(fbba);

	}

}
