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
	 * Main method for method test files
	 * 
	 * @param args
	 *            command line arguments
	 * 
	 * @throws IOException
	 *             for file IO
	 */
	public static void main(String args[]) throws IOException {

		getTXTfromBMP("./images/DJI_0707.bmp");
		// getBMPfromTXT("./images/DJI_0707.txt");

	}
}