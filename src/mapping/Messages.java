package mapping;

import java.io.File;

/**
 * @author NXATZ
 *
 */
public class Messages {

	/**
	 * Message for NULL pointer File Exception
	 */
	public static void printFileNullPointerException() {
		System.out.println("|=================================================|");
		System.out.println("| FILE NULL POINTER EXCEPTION                     |");
		System.out.println("|-------------------------------------------------|");
		System.out.println("| REASON OF FAILURE: FILE DESTINATION NOT EXISTED |");
		System.out.println("|=================================================|");
		System.out.println("| PROGRAM UNEXPECTED TERMINATED                   |");
		System.out.println("|=================================================|");
		System.exit(0);
		System.out.println();
	}

	/**
	 * 
	 */
	public static void printArrayIndexOOB() {
		System.out.println("|============================================|");
		System.out.println("| ARRAY INDEX OUT OF BOUNDS EXCEPTION        |");
		System.out.println("|--------------------------------------------|");
		System.out.println("| REASON OF FAILURE: NO BMPS IN DESTINATION  |");
		System.out.println("|============================================|");
		System.out.println("| PROGRAM UNEXPECTED TERMINATED              |");
		System.out.println("|============================================|");
		System.exit(0);
		System.out.println();
	}

	/**
	 * Message for succeed PHASE 1.1
	 */
	public static void succeedPhase1_1() {
		System.out.println("|============================================|");
		System.out.println("| InputMethods.getNumOfImages()  SUCCEED     |");
		System.out.println("|============================================|");
		System.out.println();

	}

	/**
	 * Message for failed PHASE 1.1
	 */
	public static void failedPhase1_1() {
		System.out.println("|============================================|");
		System.out.println("| InputMethods.getNumOfImages()  FAILED      |");
		System.out.println("|--------------------------------------------|");
		System.out.println("| REASON OF FAILURE: FILE EMPTY              |");
		System.out.println("|============================================|");
		System.out.println();

	}

	/**
	 * Message for returning value of PHASE 1.1
	 */
	public static void retvalPhase1_1() {
		System.out.println("==============================================");
		System.out.println("NUMBER OF IMAGES = " + GlobalVar.getNumberOfImages());
		System.out.println("==============================================");
		System.out.println();
	}

	/**
	 * Message for file not found exception
	 */
	public static void printFileNotFoundException() {
		System.out.println("|============================================|");
		System.out.println("| FILE NOT FOUND EXCEPTION                   |");
		System.out.println("|--------------------------------------------|");
		System.out.println("| REASON OF FAILURE: FILE NOT OPEN           |");
		System.out.println("|============================================|");
		System.out.println("| PROGRAM UNEXPECTED TERMINATED              |");
		System.out.println("|============================================|");
		System.exit(0);
		System.out.println();
	}

	/**
	 * Message for file IO exception
	 */
	public static void printFileIOException() {
		System.out.println("|============================================|");
		System.out.println("| FILE INPUT OUTPUT EXCEPTION                |");
		System.out.println("|--------------------------------------------|");
		System.out.println("| REASON OF FAILURE: FILE IS NOT READABLE    |");
		System.out.println("|============================================|");
		System.out.println("| PROGRAM UNEXPECTED TERMINATED              |");
		System.out.println("|============================================|");
		System.exit(0);
		System.out.println();
	}

	/**
	 * Message for succeed PHASE 1.2
	 */
	public static void succeedPhase1_2() {
		System.out.println("|============================================|");
		System.out.println("| InputMethods.dataLogInput()   SUCCEED      |");
		System.out.println("|============================================|");
		System.out.println();

	}

	/**
	 * Message for failed PHASE 1.2
	 */
	public static void failedPhase1_2() {
		System.out.println("|============================================|");
		System.out.println("| InputMethods.dataLogInput()   FAILED       |");
		System.out.println("|--------------------------------------------|");
		System.out.println("| REASON OF FAILURE: FILE NOT STRUCTURED WELL|");
		System.out.println("|============================================|");
		System.out.println();

	}

	/**
	 * Message for returning value of PHASE 1.2
	 * 
	 * @param fbba
	 *            Table of FBBA
	 * 
	 * 
	 */
	public static void retvalPhase1_2(BlackBox fbba) {
		System.out.println("|======================================================================================================================|");
		System.out.println("|                                             FLIGHT BLACK BOX ARRAY                                                   |");
		System.out.println("|============|====================|====================|====================|==========|==========|====================|");
		System.out.println("| IMG FORMAT |   IMAGE TITLE      |    FBBA LATITUDE   |   FBBA LONGITUDE   |  X-AXIS  |  Y-AXIS  |       DISTANCE     |");
		System.out.println("|============|====================|====================|====================|==========|==========|====================|");
		for (int i = 0; i < GlobalVar.getNumberOfImages(); i++) {
			int j = 0;
			
			System.out.printf("|%-12s|",fbba.getSpecifiedElement(i, j));
			System.out.printf("%-20s|",fbba.getSpecifiedElement(i, j+1));
			System.out.printf("%-20s|",fbba.getSpecifiedElement(i, j+2));
			System.out.printf("%-20s|",fbba.getSpecifiedElement(i, j+3));
			System.out.printf("%-10s|",fbba.getSpecifiedElement(i, j+4));
			System.out.printf("%-10s|",fbba.getSpecifiedElement(i, j+5));
			System.out.printf("%-20s|",fbba.getSpecifiedElement(i, j+6));
			System.out.println();
		}

		System.out.println("|======================================================================================================================|");
		System.out.println();
	}

	/**
	 * Message for succeed PHASE 1.3
	 * 
	 * @param oldfile
	 *            old file name
	 * @param newfile
	 *            new file name
	 */
	public static void succeedPhase1_3(File oldfile, String newfile) {
		System.out.println();
		System.out.println("     FILE CONVERTION ==> CONVERT " + oldfile + " ==> " + newfile
				+ "  ==>  CONVERTION SUCCEED");
		System.out.println();
		System.out.println();
	}

	/**
	 * Message for succeed PHASE 1.3
	 * 
	 * @param oldfile
	 *            old file name
	 */
	public static void failedPhase1_3(File oldfile) {
		System.out.println();
		System.out.println("FILE CONVERTION ==> CONVERT " + oldfile + " ==>  CONVERTION FAILED");
		System.out.println();
		System.out.println();
	}

	/**
	 * Message for succeed PHASE 2.1
	 */
	public static void succeedPhase2_1() {
		System.out.println("|============================================|");
		System.out.println("| IMAGE LIST CREATION SUCCEED                |");
		System.out.println("|============================================|");
		System.out.println();

	}

	/**
	 * Message for succeed PHASE 2.2
	 * 
	 * @param Filename
	 *            image filename
	 */
	public static void succeedPhase2_2(String[] Filename) {
		System.out.println("|============================================|");
		System.out.println("| IMAGE: " + Filename + " INSERTION SUCCEED    |");
		System.out.println("|============================================|");
		System.out.println();

	}

}
