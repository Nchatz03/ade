package mapping;

import java.io.File;
import java.io.IOException;

/**
 * @author NXATZ
 *
 */
public class ImageDecoding {

	/**
	 * Convert BMP files to text files
	 * 
	 * @param path
	 *            file path
	 */
	public static void getTXTfromBMP(String path) {

		File oldfile = new File(path);
		String filename = oldfile.getName();
		String newfilename = "";
		System.out.println(filename);
		for (int i = 0; i < filename.length(); i++) {
			newfilename += filename.charAt(i);
			if (filename.charAt(i) == '.') {
				break;
			}
		}
		newfilename += "txt";
		System.out.println(newfilename);
		File file2 = new File("./images/" + newfilename);
		// Rename file (or directory)
		boolean success = oldfile.renameTo(file2);
		if (!success) {
			System.out.println("File was not successfully renamed");
		}

	}
	
	/**
	 * Convert BMP files to JPEG files
	 * 
	 * @param path
	 *            file path
	 */
	public static void getJPGfromBMP(String path) {

		File oldfile = new File(path);
		String filename = oldfile.getName();
		String newfilename = "";
		System.out.println(filename);
		for (int i = 0; i < filename.length(); i++) {
			newfilename += filename.charAt(i);
			if (filename.charAt(i) == '.') {
				break;
			}
		}
		newfilename += "JPG";
		System.out.println(newfilename);
		File file2 = new File("./images/" + newfilename);
		// Rename file (or directory)
		boolean success = oldfile.renameTo(file2);
		if (!success) {
			System.out.println("File was not successfully renamed");
		}

	}

	/**
	 * Converts text files to BMP files
	 * 
	 * @param path
	 *            file path
	 */
	public static void getBMPfromTXT(String path) {

		File oldfile = new File(path);
		String filename = oldfile.getName();
		String newfilename = "";
		System.out.println(filename);
		for (int i = 0; i < filename.length(); i++) {
			newfilename += filename.charAt(i);
			if (filename.charAt(i) == '.') {
				break;
			}
		}
		newfilename += "bmp";
		System.out.println(newfilename);
		File file2 = new File("./images/" + newfilename);
		// Rename file (or directory)
		boolean success = oldfile.renameTo(file2);
		if (!success) {
			System.out.println("File was not successfully renamed");
		}

	}
	
	/**
	 * Converts JPG files to BMP files
	 * 
	 * @param path
	 *            file path
	 */
	public static void getBMPfromJPG(String path) {

		File oldfile = new File(path);
		String filename = oldfile.getName();
		String newfilename = "";
		System.out.println(filename);
		for (int i = 0; i < filename.length(); i++) {
			newfilename += filename.charAt(i);
			if (filename.charAt(i) == '.') {
				break;
			}
		}
		newfilename += "bmp";
		System.out.println(newfilename);
		File file2 = new File("./images/" + newfilename);
		// Rename file (or directory)
		boolean success = oldfile.renameTo(file2);
		if (!success) {
			System.out.println("File was not successfully renamed");
		}

	}

	/**
	 * Main method for method test files
	 * 
	 * @param args
	 *            command line arguments
	 * 
	 * @throws IOException
	 *             for file IO
	 */
	public static void main(String args[]) throws IOException {
		
		/**JPG -> BMP **/
//		getBMPfromJPG("./images/DJI_0707.txt");
//		getBMPfromJPG("./images/DJI_0708.txt");
//		getBMPfromJPG("./images/DJI_0709.txt");
//		getBMPfromJPG("./images/DJI_0710.txt");
//		getBMPfromJPG("./images/DJI_0711.txt");
//		getBMPfromJPG("./images/DJI_0712.txt");

        /**BMP -> TXT **/
		
//		getTXTfromBMP("./images/DJI_0707.txt");
//		getTXTfromBMP("./images/DJI_0708.txt");
//		getTXTfromBMP("./images/DJI_0709.txt");
//		getTXTfromBMP("./images/DJI_0710.txt");
//		getTXTfromBMP("./images/DJI_0711.txt");
//		getTXTfromBMP("./images/DJI_0712.txt");
		
		/**TXT -> BMP **/
		getBMPfromTXT("./images/DJI_0707.txt");
		getBMPfromTXT("./images/DJI_0708.txt");
		getBMPfromTXT("./images/DJI_0709.txt");
		getBMPfromTXT("./images/DJI_0710.txt");
		getBMPfromTXT("./images/DJI_0711.txt");
		getBMPfromTXT("./images/DJI_0712.txt");
		
		/**BMP -> JPG **/
//		getJPGfromBMP("./images/DJI_0707.txt");
//		getJPGfromBMP("./images/DJI_0708.txt");
//		getJPGfromBMP("./images/DJI_0709.txt");
//		getJPGfromBMP("./images/DJI_0710.txt");
//		getJPGfromBMP("./images/DJI_0711.txt");
//		getJPGfromBMP("./images/DJI_0712.txt");

	}
}