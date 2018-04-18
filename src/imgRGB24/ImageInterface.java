package imgRGB24;

/**
 * @author NXATZ
 *
 */
public interface ImageInterface {

	/**
	 * BMP header setter
	 * 
	 * @param Signature
	 *            File format signature
	 * @param Size
	 *            Size of file
	 * @param AppSpec1
	 *            Always set to 00 00
	 * @param AppSpec2
	 *            Always set to 00 00
	 * @param Offset
	 *            Offset size to the pixel data
	 */

	public void modifyBMPHEADER(String Signature, String Size, String AppSpec1, String AppSpec2, String Offset);

	/**
	 * DIB header setter
	 * 
	 * @param DIBsize
	 *            Size of Dibheader header
	 * @param Width
	 *            Image width
	 * @param Height
	 *            Image Height
	 * @param NumofPlanes
	 *            Number of planes on image
	 * @param BitperPx
	 *            Size per pixel : 24 bit
	 * @param CompressionArray
	 *            Compression array standards
	 * @param RawBitmapData
	 *            Image size without header
	 * @param PrintResolutionWidth
	 *            Screen resolution width
	 * @param PrintResolutionHeight
	 *            Screen resolution height
	 * @param NumOfColorsPallete
	 *            Number of colors in the pallete
	 * @param ImportantColors
	 *            Important colors
	 */
	public void modifyDIBHEADER(String DIBsize, String Width, String Height, String NumofPlanes, String BitperPx,
			String CompressionArray, String RawBitmapData, String PrintResolutionWidth, String PrintResolutionHeight,
			String NumOfColorsPallete, String ImportantColors);

	/**
	 * ImageTitle setter
	 * 
	 * @param flightBlackBox
	 *            Image filename
	 * 
	 */
	public void modifyImageTitle(String[] flightBlackBox);
	
	/**
	 * BMP Pixel array setter
	 * 
	 * @param ColorArray
	 *            Image pixel colors
	 */
	public void modifyBMPDATA(String[][] ColorArray);
	
	/**
	 * Signature setter
	 * 
	 * @param Signature
	 *            File format signature
	 */
	public void modifySignature(String Signature);
	
	/**
	 * Size setter
	 * 
	 * @param Size
	 *            Size of file
	 */
	public void modifySize(String Size);
	
	/**
	 * AppSpec1 setter
	 * 
	 * @param AppSpec1
	 *            Always set to 00 00
	 */
	public void modifyAppSpec1(String AppSpec1);
	
	/**
	 * AppSpec2 setter
	 * 
	 * @param AppSpec2
	 *            Always set to 00 00
	 */
	public void modifyAppSpec2(String AppSpec2);
	
	/**
	 * Offset setter
	 * 
	 * @param Offset
	 *            Offset size to the pixel data
	 */
	public void modifyOffset(String Offset);
	
	/**
	 * DIB size setter
	 * 
	 * @param DIBsize
	 *            Size of Dibheader header
	 */
	public void modifyDIBsize(String DIBsize);
	
	/**
	 * Width setter
	 * 
	 * @param Width
	 *            Image width
	 */
	public void modifyWidth(String Width);
	
	/**
	 * Height setter
	 * 
	 * @param Height
	 *            Image Height
	 */
	public void modifyHeight(String Height);
	
	/**
	 * NumofPlanes setter
	 * 
	 * @param NumofPlanes
	 *            Number of planes on image
	 */
	public void modifyNumofPlanes(String NumofPlanes);
	
	/**
	 * BitperPx setter
	 * 
	 * @param BitperPx
	 *            Size per pixel : 24 bit
	 */
	public void modifyBitperPx(String BitperPx);
	
	/**
	 * CompressionArray setter
	 * 
	 * @param CompressionArray
	 *            Compression array standards
	 */
	public void modifyCompressionArray(String CompressionArray);
	
	/**
	 * RawBitmapData setter
	 * 
	 * @param RawBitmapData
	 *            Image size without header
	 */
	public void modifyRawBitmapData(String RawBitmapData) ;

	/**
	 * PrintResolutionWidth setter
	 * 
	 * @param PrintResolutionWidth
	 *            Screen resolution width
	 */
	public void modifyPrintResolutionWidth(String PrintResolutionWidth) ;

	/**
	 * PrintResolutionHeight setter
	 * 
	 * @param PrintResolutionHeight
	 *            Screen resolution height
	 */
	public void modifyPrintResolutionHeight(String PrintResolutionHeight) ;

	/**
	 * NumOfColorsPallete setter
	 * 
	 * @param NumOfColorsPallete
	 *            Number of colors in the pallete
	 */
	public void modifyNumOfColorsPallete(String NumOfColorsPallete) ;

	/**
	 * ImportantColors setter
	 * 
	 * @param ImportantColors
	 *            Important colors
	 */
	public void modifyImportantColors(String ImportantColors) ;

	/**
	 * ColorArray getter
	 * 
	 * @return ColorArray
	 */
	public String[][] getBMPDATA() ;

	/**
	 * ImageTitle getter
	 * 
	 * @return ImageTitle
	 */
	public String[] getImageTitle() ;

	/**
	 * Signature getter
	 * 
	 * @return Signature
	 */
	public String getSignature() ;

	/**
	 * Size getter
	 * 
	 * @return Size
	 */
	public String getSize() ;

	/**
	 * AppSpec1 getter
	 * 
	 * @return AppSpec1
	 */
	public String getAppSpec1() ;

	/**
	 * AppSpec2 getter
	 * 
	 * @return AppSpec2
	 */
	public String getAppSpec2() ;
	/**
	 * Offset getter
	 * 
	 * @return Offset
	 */
	public String getOffset() ;

	/**
	 * DIBsize getter
	 * 
	 * @return DIBsize
	 */
	public String getDIBsize() ;

	/**
	 * Width getter
	 * 
	 * @return Width
	 */
	public String getWidth() ;
	/**
	 * Height getter
	 * 
	 * @return Height
	 */
	public String getHeight() ;

	/**
	 * NumofPlanes getter
	 * 
	 * @return NumofPlanes
	 */
	public String getNumofPlanes() ;

	/**
	 * BitperPx getter
	 * 
	 * @return BitperPx
	 */
	public String getBitperPx() ;

	/**
	 * CompressionArray getter
	 * 
	 * @return CompressionArray
	 */
	public String getCompressionArray() ;

	/**
	 * RawBitmapData getter
	 * 
	 * @return RawBitmapData
	 */
	public String getRawBitmapData() ;

	/**
	 * PrintResolutionWidth getter
	 * 
	 * @return PrintResolutionWidth
	 */
	public String getPrintResolutionWidth() ;

	/**
	 * PrintResolutionHeight getter
	 * 
	 * @return PrintResolutionHeight
	 */
	public String getPrintResolutionHeight() ;

	/**
	 * NumOfColorsPallete getter
	 * 
	 * @return NumOfColorsPallete
	 */
	public String getNumOfColorsPallete() ;

	/**
	 * ImportantColors getter
	 * 
	 * @return ImportantColors
	 */
	public String getImportantColors() ;
	

}
