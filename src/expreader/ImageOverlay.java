package expreader;
/**
 * @Author Kushal Paudyal
 * www.sanjaal.com/java
 * Last Modified On: 2009-11-20
 *
 * ImageOverLay.java
 *
 * Overlays one image over another image.
 */
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
 
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;
 
/**
 * @author NXATZ 
 *
 */
public class ImageOverlay {
 
    /**
     * @param args jhh
     */
    public static void main(String args[]) {
 
        /**
         * Read a background image
         */
        BufferedImage bgImage = readImage("./mission/photos/DJI_0708.JPG");
 
        /**
         * Read a foreground image
         */
        BufferedImage fgImage = readImage("./mission/photos/DJI_0709.JPG");
 
        /**
         * Do the overlay of foreground image on background image
         */
        BufferedImage overlayedImage = overlayImages(bgImage, fgImage);
 
        /**
         * Write the overlayed image back to file
         */
        if (overlayedImage != null){
            writeImage(overlayedImage, "./mission/overLayedImage.jpg", "JPG");
            System.out.println("Overlay Completed...");
        }else
            System.out.println("Problem With Overlay...");
 
    }
 
    /**
     * Method to overlay Images
     *
     * @param bgImage --> The background Image
     * @param fgImage --> The foreground Image
     * @return --> overlayed image (fgImage over bgImage)
     */
    public static BufferedImage overlayImages(BufferedImage bgImage,
            BufferedImage fgImage) {
 
        /**
         * Doing some preliminary validations.
         * Foreground image height cannot be greater than background image height.
         * Foreground image width cannot be greater than background image width.
         *
         * returning a null value if such condition exists.
         */
        if (fgImage.getHeight() > bgImage.getHeight()
                || fgImage.getWidth() > fgImage.getWidth()) {
            JOptionPane.showMessageDialog(null,
                    "Foreground Image Is Bigger In One or Both Dimensions"
                            + "nCannot proceed with overlay."
                            + "nn Please use smaller Image for foreground");
            return null;
        }
 
        /**Create a Graphics  from the background image**/
        Graphics2D g = bgImage.createGraphics();
        /**Set Antialias Rendering**/
        g.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
        /**
         * Draw background image at location (0,0)
         * You can change the (x,y) value as required
         */
        g.drawImage(bgImage, 0, 0, null);
 
        /**
         * Draw foreground image at location (0,0)
         * Change (x,y) value as required.
         */
        g.drawImage(fgImage, 0, 0, null);
 
        g.dispose();
        return bgImage;
    }
 
    /**
     * This method reads an image from the file
     * @param fileLocation -- > eg. "C:/testImage.jpg"
     * @return BufferedImage of the file read
     */
    public static BufferedImage readImage(String fileLocation) {
        BufferedImage img = null;
        try {
            img = ImageIO.read(new File(fileLocation));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return img;
    }
 
    /**
     * This method writes a buffered image to a file
     * @param img -- > BufferedImage
     * @param fileLocation --> e.g. "C:/testImage.jpg"
     * @param extension --> e.g. "jpg","gif","png"
     */
    public static void writeImage(BufferedImage img, String fileLocation,
            String extension) {
        try {
            BufferedImage bi = img;
            File outputfile = new File(fileLocation);
            ImageIO.write(bi, extension, outputfile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}