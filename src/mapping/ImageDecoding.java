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
	 * @return String new filename
	 */
	public static String getTXTfromAny(String path) {

		File oldfile = new File(path);
		String filename = oldfile.getName();
		String newfile = "";
		
		for (int i = 0; i < filename.length(); i++) {
			newfile += filename.charAt(i);
			if (filename.charAt(i) == '.') {
				break;
			}
		}
		newfile += "txt";
		
		File file2 = new File("./images/"+ newfile);
		boolean success = oldfile.renameTo(file2);
		if (!success) {
			Messages.failedPhase1_3(oldfile);
		}else{
			Messages.succeedPhase1_3(oldfile, newfile);
			
		}
		return newfile;

	}
	
	/**
	 * Convert BMP files to JPEG files
	 * 
	 * @param path
	 *            file path
	 * @return the new filename
	 */
	public static String getJPGfromAny(String path) {

		File oldfile = new File(path);
		String filename = oldfile.getName();
		String newfile = "";
		
		for (int i = 0; i < filename.length(); i++) {
			newfile += filename.charAt(i);
			if (filename.charAt(i) == '.') {
				break;
			}
		}
		newfile += "JPG";
		File file2 = new File( "./images/"+ newfile);
		boolean success = oldfile.renameTo(file2);
		if (!success) {
			Messages.failedPhase1_3(oldfile);
			
		}else{
			Messages.succeedPhase1_3(oldfile, newfile);
			
		}
		return newfile;

	}

	/**
	 * Converts text files to BMP files
	 * 
	 * @param path
	 *            file path
	 * @return the new filename
	 */
	public static String getBMPfromAny(String path) {

		File oldfile = new File(path);
		System.out.println(oldfile);
		String filename = oldfile.getName();
		String newfile = "";
		
		for (int i = 0; i < filename.length(); i++) {
			newfile += filename.charAt(i);
			if (filename.charAt(i) == '.') {
				break;
			}
		}
		newfile += "bmp";
		File file2 = new File("./images/"+ newfile);
		boolean success = oldfile.renameTo(file2);
		if (!success) {
			Messages.failedPhase1_3(oldfile);
		}else{
			Messages.succeedPhase1_3(oldfile, newfile);
			
		}
		return newfile;

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
		

//        /**Any -> TXT **/
//		
//		getTXTfromAny("./images/DJI_0707.txt");
//		getTXTfromAny("./images/DJI_0708.txt");
//		getTXTfromAny("./images/DJI_0709.txt");
//		getTXTfromAny("./images/DJI_0710.txt");
//		getTXTfromAny("./images/DJI_0711.txt");
//		getTXTfromAny("./images/DJI_0712.txt");
		
		/**Any -> BMP **/
//		getBMPfromAny("./images/DJI_0707.JPG");
//		getBMPfromAny("./images/DJI_0708.JPG");
//		getBMPfromAny("./images/DJI_0709.JPG");
//		getBMPfromAny("./images/DJI_0710.JPG");
//		getBMPfromAny("./images/DJI_0711.JPG");
//		getBMPfromAny("./images/DJI_0712.JPG");
		
//		/**Any -> JPG **/
		getJPGfromAny("./images/DJI_0707.txt");
		getJPGfromAny("./images/DJI_0708.txt");
		getJPGfromAny("./images/DJI_0709.txt");
		getJPGfromAny("./images/DJI_0710.txt");
		getJPGfromAny("./images/DJI_0711.txt");
		getJPGfromAny("./images/DJI_0712.txt");

	}
}