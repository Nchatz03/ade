package mapping;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author NXATZ
 *
 */
public class BlackBox implements BlackBoxInterface {

	private String[][] BlackBoxArray;

	/**
	 * Default Constructor of Black Box
	 * 
	 */
	public BlackBox() {

	}

	/**
	 * Constructor of Black Box
	 * 
	 * @param NumOfImages
	 *            number of images
	 * @param FBBAFileds
	 *            number of BlackBox fields
	 */
	public BlackBox(int NumOfImages, int FBBAFileds) {

		this.setBlackBox(new String[NumOfImages][FBBAFileds]);

	}

	public String[][] getBlackBox() {
		return BlackBoxArray;
	}

	public void setBlackBox(String[][] blackBox) {
		this.BlackBoxArray = blackBox;
	}

	public String getSpecifiedElement(int Row, int Col) {
		return BlackBoxArray[Row][Col];

	}

	public void setSpecifiedElement(String element, int Row, int Col) {
		this.BlackBoxArray[Row][Col] = element;

	}

	public void BlackBoxReader(String path, int num) {

		
		String fileName = path;

		boolean flag = false;
		String[] temp;
		int counter = 0;

		
		String line = null;

		try {
			
			FileReader fileReader = new FileReader(fileName);

			
			BufferedReader bufferedReader = new BufferedReader(fileReader);

			while ((line = bufferedReader.readLine()) != null) {

				if (line.contains("place:")) {
					flag = false;
				}

				if (flag == true) {
					temp = line.split(" ");
					
					this.BlackBoxArray[counter][2] = temp[0];
					this.BlackBoxArray[counter][3] = temp[1];
					this.BlackBoxArray[counter][1] = temp[2];
					if (temp[2].contains("JPG")){
						this.BlackBoxArray[counter][0] = "JPG";
					}
					if (temp[2].contains("bmp")){
						this.BlackBoxArray[counter][0] = "bmp";
					}
					
					counter++;
				}

				if (line.contains("LatLong")) {
					flag = true;
					continue;
				}

			}

			bufferedReader.close();
		} catch (FileNotFoundException ex) {
			Messages.printFileNotFoundException();

		} catch (IOException e) {
			Messages.printFileIOException();

		} catch (ArrayIndexOutOfBoundsException es) {
			Messages.printArrayIndexOOB();

		}
	}



	public void BlackBoxFileWriter(BlackBox fbba) throws IOException {
		
	    FileWriter fileWriter = new FileWriter("Phase1.outp1");
	    PrintWriter printWriter = new PrintWriter(fileWriter);
	    
	    printWriter.println("{");
	    for(int i =0; i< GlobalVar.numberOfImages; i++){
	    	
	    		printWriter.println("[");
	    	    printWriter.println("INITFORMAT : "+fbba.getSpecifiedElement(i,GlobalVar.BLACKBOX_IMAGE_FORMAT));
	    		printWriter.println("FILENAME : "+fbba.getSpecifiedElement(i,GlobalVar.BLACKBOX_FILENAME));
	    	    printWriter.println("LATITUDE : "+fbba.getSpecifiedElement(i,GlobalVar.BLACKBOX_LATITUDE));
	    	    printWriter.println("LONGITUDE : "+fbba.getSpecifiedElement(i,GlobalVar.BLACKBOX_LONGITUDE));
	    	    printWriter.println("XAXIS : "+fbba.getSpecifiedElement(i,GlobalVar.BLACKBOX_CENTER_XAXIS));
	    	    printWriter.println("YAXIS : "+fbba.getSpecifiedElement(i,GlobalVar.BLACKBOX_CENTER_YAXIS));
	    	    printWriter.println("INTERCECT : "+fbba.getSpecifiedElement(i,GlobalVar.BLACKBOX_INTERCECT_DISTANCE));
	    	    printWriter.println("]");
	    	    
	    }
	    printWriter.println("}");
	    printWriter.flush();
	    printWriter.close();
		
	}
	
	
	
	

}
