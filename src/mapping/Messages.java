package mapping;

/**
 * @author NXATZ
 *
 */
public class Messages {
	
	/**
	 * Message for NULL pointer File Exception
	 */
	public static void printFileException(){
	System.out.println("|============================================|");
	System.out.println("| InputMethods.getNumOfImages()  FAILED      |");
	System.out.println("|--------------------------------------------|");
	System.out.println("| REASON OF FAILURE: FILE NOT EXISTED        |");
	System.out.println("|============================================|");
	System.out.println();
	}
	
	/**
	 * Message for succeed PHASE 1.1
	 */
	public static void succeedPhase1_1(){
		System.out.println("|============================================|");
		System.out.println("| InputMethods.getNumOfImages()  SUCCEED     |");
		System.out.println("|============================================|");
		System.out.println();
		
	}
	
	/**
	 * Message for failed PHASE 1.1
	 */
	public static void failedPhase1_1(){
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
	public static void retvalPhase1_1(){
		System.out.println("==============================================");
		System.out.println("NUMBER OF IMAGES = " + GlobalVar.numberOfImages);
		System.out.println("==============================================");
		System.out.println();
	}

}
