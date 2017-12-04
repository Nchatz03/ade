package mapping;

import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class ImageDecoding {

	public static void getTXTfromBMP(String path){
		
		
		File oldfile = new File(path);
        String filename = oldfile.getName();
        String newfilename ="";
        System.out.println(filename);
        for(int i=0; i < filename.length(); i++){
        	newfilename += filename.charAt(i);
        	if(filename.charAt(i) == '.'){
                  break;
        	}
        }
        newfilename += "txt";
        System.out.println(newfilename);
        File file2 = new File("./images/"+newfilename);
		// Rename file (or directory)
		boolean success = oldfile.renameTo(file2);
		if (!success)
		{
		   System.out.println("File was not successfully renamed");
		}
		
		
	}
	
	public static void getBMPfromTXT(String path){
		
		
		File oldfile = new File(path);
        String filename = oldfile.getName();
        String newfilename ="";
        System.out.println(filename);
        for(int i=0; i < filename.length(); i++){
        	newfilename += filename.charAt(i);
        	if(filename.charAt(i) == '.'){
                  break;
        	}
        }
        newfilename += "bmp";
        System.out.println(newfilename);
        File file2 = new File("./images/"+newfilename);
		// Rename file (or directory)
		boolean success = oldfile.renameTo(file2);
		if (!success)
		{
		   System.out.println("File was not successfully renamed");
		}
		
		
	}

	public static void main(String args[]) throws IOException {

		getTXTfromBMP("./images/DJI_0707.bmp");
		//getBMPfromTXT("./images/DJI_0707.txt");

	}
}