package mapping;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * @author NXATZ
 *
 */
public class InputMethods {

	/**
	 * Retrieve the number of BMP files in the specified folder
	 * 
	 * @param path
	 *            image folder path
	 * 
	 * @return the number of BMP files
	 */
	public static int getNumofImages(String path) {

		int Num = 0;

		try {

			File folder = new File(path);
			String[] fileNames = folder.list();

			for (int i = 0; i < fileNames.length; i++) {
				if (fileNames[i].contains(".bmp")) {
					Num++;
				}
				if (fileNames[i].contains(".JPG")) {
					Num++;
				}
			}

		} catch (NullPointerException e) {

			Messages.printFileNullPointerException();
			System.exit(0);

		}

		return Num;

	}

/*	*//**
	 * Retrieve the table with flight's data BMP title,latitude and longitude
	 * coordinates
	 * 
	 * @param path
	 *            path to flight data log file
	 * @param num
	 *            number of images taken from drone
	 * 
	 * @return The table with flight data
	 *//*
	public static String[][] dataLogInput(String path, int num) {

		// this is the filename of text file (static path)
		String fileName = path;

		String[][] flightBlackBox = new String[num][3];

		boolean flag = false;
		String[] temp;
		int counter = 0;

		// This will reference one line at a time
		String line = null;

		try {
			// FileReader reads text files in the default encoding.
			FileReader fileReader = new FileReader(fileName);

			// Always wrap FileReader in BufferedReader.
			BufferedReader bufferedReader = new BufferedReader(fileReader);

			while ((line = bufferedReader.readLine()) != null) {

				if (line.contains("place:")) {
					flag = false;
				}

				if (flag == true) {
					temp = line.split(" ");
					flightBlackBox[counter][0] = temp[0];
					flightBlackBox[counter][1] = temp[1];
					flightBlackBox[counter][2] = temp[2];
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
			
		} catch (ArrayIndexOutOfBoundsException es){
			Messages.printArrayIndexOOB();
			
		}

		return flightBlackBox;

	}*/

	/**
	 * reader used as driver for Image data
	 * 
	 * @param path
	 *            file path
	 * 
	 * @throws IOException
	 *             file IO exception
	 */
	public static void readImageDataexp(String path) throws IOException {

		FileInputStream file = new FileInputStream(path);

		byte headerdata[] = new byte[54];
		byte pixeldata[] = new byte[9000];
		int i = 0;
		int len;
		len = file.read(headerdata);
		System.out.printf("Signature = %02X%02X \n", headerdata[0], headerdata[1]);
		System.out.printf("Size = %02X%02X %02X%02X \n", headerdata[2], headerdata[3], headerdata[4], headerdata[5]);
		System.out.printf("AppSpec1 = %02X%02X \n", headerdata[6], headerdata[7]);
		System.out.printf("AppSpec2 = %02X%02X \n", headerdata[8], headerdata[9]);
		System.out.printf("Offset = %02X%02X %02X%02X \n", headerdata[10], headerdata[11], headerdata[12],
				headerdata[13]);
		System.out.printf("DIBsize = %02X%02X %02X%02X \n", headerdata[14], headerdata[15], headerdata[16],
				headerdata[17]);
		System.out.printf("Width = %02X%02X %02X%02X \n", headerdata[18], headerdata[19], headerdata[20],
				headerdata[21]);
		System.out.printf("Height = %02X%02X %02X%02X \n", headerdata[22], headerdata[23], headerdata[24],
				headerdata[25]);
		System.out.printf("NumofPlanes = %02X%02X \n", headerdata[26], headerdata[27]);
		System.out.printf("BitperPx = %02X%02X \n", headerdata[28], headerdata[29]);
		System.out.printf("CompressionArray = %02X%02X %02X%02X \n", headerdata[30], headerdata[31], headerdata[32],
				headerdata[33]);
		System.out.printf("RawBitmapData = %02X%02X %02X%02X \n", headerdata[34], headerdata[35], headerdata[36],
				headerdata[37]);
		System.out.printf("PrintResolutionWidth = %02X%02X %02X%02X \n", headerdata[38], headerdata[39], headerdata[40],
				headerdata[41]);
		System.out.printf("PrintResolutionHeight = %02X%02X %02X%02X \n", headerdata[42], headerdata[43],
				headerdata[44], headerdata[45]);
		System.out.printf("NumOfColorsPallete = %02X%02X %02X%02X \n", headerdata[46], headerdata[47], headerdata[48],
				headerdata[49]);
		System.out.printf("ImportantColors = %02X%02X %02X%02X \n", headerdata[50], headerdata[51], headerdata[52],
				headerdata[53]);

		do {

			len = file.read(pixeldata);
			for (int j = 0; j < len; j = j + 3) {
				System.out.printf("#%02X%02X%02X", pixeldata[j], pixeldata[j + 1], pixeldata[j + 2]);
			}
			System.out.println("interation : " + i++);
		} while (len != -1);

		file.close();
		return;
	}

	/**
	 * Converts bytes array to string
	 * 
	 * @param data
	 *            byte array reader
	 * @param len
	 *            array length
	 * 
	 * @return the converted string
	 */
	public static String convertByte2String(byte[] data, int len) {

		String convertion = null;



		if (len == 3) {
			return convertion = String.format("%02X %02X %02X", data[0], data[1], data[2]);
		}else

		if (len == 4) {
			return convertion = String.format("%02X %02X %02X %02X", data[0], data[1], data[2], data[3]);
		}else

		if (len == 2) {
			return convertion = String.format("%02X %02X", data[0], data[1]);
			
		}
		return convertion;
		
	}

	/**
	 * Reversion of the string
	 * 
	 * @param data
	 *            String with data
	 * 
	 * @param len
	 *            length of string
	 * 
	 * @return the converted string
	 */
	public static String reverseString(String data, int len) {

		String[] temp;
		String convertion = null;
		temp = data.split(" ");

		if (len == 2) {

			convertion = temp[1] + temp[0];

		}

		if (len == 3) {

			convertion = temp[2] + temp[1] + temp[0];

		}

		if (len == 4) {

			convertion = temp[3] + temp[2] + temp[1] + temp[0];

		}

		return convertion;

	}

	/**
	 * Convert hexadecimal string to decimal string
	 * 
	 * @param hexstring
	 *            the hex String
	 * 
	 * @return the converted decimal string
	 */
	public static int convertHEX2DEC(String hexstring) {
 
		int convertion = Integer.parseUnsignedInt(hexstring, 16);

		return convertion;

	}

	/**
	 * Image data reader
	 * 
	 * @param path
	 *            file path
	 * 
	 * @return returns the image object
	 * 
	 * @throws IOException
	 *             File IO exception
	 */
	public static  ImgRGB24 readImageData(String path) throws IOException {

		FileInputStream file = new FileInputStream(path);

		ImgRGB24 image = new ImgRGB24();

		byte headerdata[] = new byte[54];
		int len = file.read(headerdata);
		byte data2Byte[] = new byte[2];
		byte data4Byte[] = new byte[4];
		byte colorRGB[] = new byte[3];

		data2Byte[0] = headerdata[0];
		data2Byte[1] = headerdata[1];

		image.modifySignature(convertByte2String(data2Byte, 2));

		data4Byte[0] = headerdata[2];
		data4Byte[1] = headerdata[3];
		data4Byte[2] = headerdata[4];
		data4Byte[3] = headerdata[5];

		image.modifySize(convertByte2String(data4Byte, 4));

		data2Byte[0] = headerdata[6];
		data2Byte[1] = headerdata[7];

		image.modifyAppSpec1(convertByte2String(data2Byte, 2));

		data2Byte[0] = headerdata[8];
		data2Byte[1] = headerdata[9];

		image.modifyAppSpec2(convertByte2String(data2Byte, 2));

		data4Byte[0] = headerdata[10];
		data4Byte[1] = headerdata[11];
		data4Byte[2] = headerdata[12];
		data4Byte[3] = headerdata[13];

		image.modifyOffset(convertByte2String(data4Byte, 4));

		data4Byte[0] = headerdata[14];
		data4Byte[1] = headerdata[15];
		data4Byte[2] = headerdata[16];
		data4Byte[3] = headerdata[17];

		image.modifyDIBsize(convertByte2String(data4Byte, 4));

		data4Byte[0] = headerdata[18];
		data4Byte[1] = headerdata[19];
		data4Byte[2] = headerdata[20];
		data4Byte[3] = headerdata[21];

		image.modifyWidth(convertByte2String(data4Byte, 4));
		// get image width as integer
		
		GlobalVar.IMAGEWIDTH = convertHEX2DEC(reverseString(image.getWidth(), 4));

		data4Byte[0] = headerdata[22];
		data4Byte[1] = headerdata[23];
		data4Byte[2] = headerdata[24];
		data4Byte[3] = headerdata[25];

		image.modifyHeight(convertByte2String(data4Byte, 4));
		// get image height as integer
		GlobalVar.IMAGEHEIGHT = convertHEX2DEC(reverseString(image.getHeight(), 4));
		
		data2Byte[0] = headerdata[26];
		data2Byte[1] = headerdata[27];

		image.modifyNumofPlanes(convertByte2String(data2Byte, 2));

		data2Byte[0] = headerdata[28];
		data2Byte[1] = headerdata[29];

		image.modifyBitperPx(convertByte2String(data2Byte, 2));

		data4Byte[0] = headerdata[30];
		data4Byte[1] = headerdata[31];
		data4Byte[2] = headerdata[32];
		data4Byte[3] = headerdata[33];

		image.modifyCompressionArray(convertByte2String(data4Byte, 4));

		data4Byte[0] = headerdata[34];
		data4Byte[1] = headerdata[35];
		data4Byte[2] = headerdata[36];
		data4Byte[3] = headerdata[37];

		image.modifyRawBitmapData(convertByte2String(data4Byte, 4));

		data4Byte[0] = headerdata[38];
		data4Byte[1] = headerdata[39];
		data4Byte[2] = headerdata[40];
		data4Byte[3] = headerdata[41];

		image.modifyPrintResolutionWidth(convertByte2String(data4Byte, 4));

		data4Byte[0] = headerdata[42];
		data4Byte[1] = headerdata[43];
		data4Byte[2] = headerdata[44];
		data4Byte[3] = headerdata[45];

		image.modifyPrintResolutionHeight(convertByte2String(data4Byte, 4));

		data4Byte[0] = headerdata[46];
		data4Byte[1] = headerdata[47];
		data4Byte[2] = headerdata[48];
		data4Byte[3] = headerdata[49];

		image.modifyNumOfColorsPallete(convertByte2String(data4Byte, 4));

		data4Byte[0] = headerdata[50];
		data4Byte[1] = headerdata[51];
		data4Byte[2] = headerdata[52];
		data4Byte[3] = headerdata[53];

		image.modifyImportantColors(convertByte2String(data4Byte, 4));
		System.gc();

		String[][] tempimage = new String[GlobalVar.IMAGEHEIGHT][GlobalVar.IMAGEWIDTH];
		byte pixeldata[] = new byte[GlobalVar.IMAGEWIDTH * 3];


		int row = 0;

		do {

			len = file.read(pixeldata);
			int column = GlobalVar.IMAGEWIDTH -1;

			for (int j = 0; j < len; j = j + 3) {
				colorRGB[0] = pixeldata[j];
				colorRGB[1] = pixeldata[j + 1];
				colorRGB[2] = pixeldata[j + 2];

				tempimage[row][column] = convertByte2String(colorRGB, 3);
				column--;

			}

			row++;
			System.out.println(row);

			if (row == GlobalVar.IMAGEHEIGHT)
				break;

		} while (len != -1);

		image.modifyBMPDATA(tempimage);

		file.close();
		return image;

	}

	/**
	 * Main method for test drivers
	 * 
	 * @param args
	 *            command line argument
	 * 
	 * @throws IOException
	 *             File IO exception
	 */
	public static void main(String args[]) throws IOException {

		int numofIMG = getNumofImages("./images");

		String[][] flightBlackBox = new String[numofIMG][3];

		//flightBlackBox = dataLogInput("data.txt", numofIMG);

		for (int i = 0; i < 6; i++)
			for (int j = 0; j < 3; j++)
				System.out.println(flightBlackBox[i][j]);

		// ImgRGB24 image = new ImgRGB24();

		// image = readImageData("./images/DJI_0707.txt");
		// readImageDataexp("./images/DJI_0707.txt");

		// String temp1 = image.getHeight();
		// String temp2 = reverseString(temp1,4);
		// int i = convertHEX2DEC(temp2);

	}
}
