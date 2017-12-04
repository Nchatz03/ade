package mapping;

/**
 * @author NXATZ
 *
 */
public class ImgRGB24 {

	/////////////////// BMP HEADER////////////////////////

	/** ID field size: 2 */

	private String Signature;

	/** Size of the BMP file size: 4 */
	private String Size;

	/** Application specific size:2 */
	private String AppSpec1;

	/** Application specific size:2 */
	private String AppSpec2;

	/** Offset where the pixel array (bitmap data) can be found size:4 */
	private String Offset;

	/////////////////////////////////////////////////////

	///////////////////// DIB HEADER//////////////////////

	/** Number of bytes in the DIB header (from this point) size:4 */
	private String DIBsize;

	/** Width of the bitmap in pixels size:4 */
	private String Width;

	/**
	 * Height of the bitmap in pixels. Positive for bottom to top pixel order
	 * size:4
	 */
	private String Height;

	/** Number of color planes being used size:2 */
	private String NumofPlanes;

	/** Number of bits per pixel size:2 */
	private String BitperPx;

	/** BI_RGB, no pixel array compression used size:4 */
	private String CompressionArray;

	/** Size of the raw bitmap data (including padding) size:4 */
	private String RawBitmapData;

	/**
	 * Print resolution of the image width (including padding) 72 DPI × 39.3701
	 * inches per metre yields 2834.6472 size:4
	 */
	private String PrintResolutionWidth;

	/**
	 * Print resolution of the image height (including padding) 72 DPI × 39.3701
	 * inches per metre yields 2834.6472 size:4
	 */
	private String PrintResolutionHeight;

	/** Number of colors in the palette size: 4 */
	private String NumOfColorsPallete;

	/** 0 means all colors are important size:4 */
	private String ImportantColors;

	/////////////////////////////////////////////////////

	///////////////////// BITMAP DATA/////////////////////

	/** size 3 per pixel entry except padding size 2 */
	private String[][] ColorArray;

	/**Image constructor
	 * 
	 * @param Signature File format signature
	 * @param Size Size of file
	 * @param AppSpec1 Always set to 00 00 
	 * @param AppSpec2 Always set to 00 00 
	 * @param Offset Offset size to the pixel data
	 * @param DIBsize Size of header
	 * @param Width Image width
	 * @param Height Image Height
	 * @param NumofPlanes Number of planes on image
	 * @param BitperPx Size per pixel : 24 bit 
	 * @param CompressionArray Compression array standards
	 * @param RawBitmapData Image size without header
	 * @param PrintResolutionWidth Screen resolution width 
	 * @param PrintResolutionHeight Screen resolution height
	 * @param NumOfColorsPallete Number of colors in the pallete
	 * @param ImportantColors Important colors 
	 * @param ColorArray Image pixel colors 
	 */
	/////////////////////////////////////////////////////

	public ImgRGB24(String Signature, String Size, String AppSpec1, String AppSpec2, String Offset, String DIBsize,
			String Width, String Height, String NumofPlanes, String BitperPx, String CompressionArray,
			String RawBitmapData, String PrintResolutionWidth, String PrintResolutionHeight, String NumOfColorsPallete,
			String ImportantColors, String[][] ColorArray) {

		this.Signature = Signature;
		this.Size = Size;
		this.AppSpec1 = AppSpec1;
		this.AppSpec2 = AppSpec2;
		this.Offset = Offset;
		this.DIBsize = DIBsize;
		this.Width = Width;
		this.Height = Height;
		this.NumofPlanes = NumofPlanes;
		this.BitperPx = BitperPx;
		this.CompressionArray = CompressionArray;
		this.RawBitmapData = RawBitmapData;
		this.PrintResolutionWidth = PrintResolutionWidth;
		this.PrintResolutionHeight = PrintResolutionHeight;
		this.NumOfColorsPallete = NumOfColorsPallete;
		this.ImportantColors = ImportantColors;
		this.ColorArray = ColorArray;

	}

	/**
	 * Image Object default constructor
	 */
	public ImgRGB24() {


	}

	/**BMP header setter
	 * 
	 * @param Signature File format signature
	 * @param Size Size of file
	 * @param AppSpec1 Always set to 00 00 
	 * @param AppSpec2 Always set to 00 00 
	 * @param Offset Offset size to the pixel data
	 */
	public void modifyBMPHEADER(String Signature, String Size, String AppSpec1, String AppSpec2, String Offset) {

		this.Signature = Signature;
		this.Size = Size;
		this.AppSpec1 = AppSpec1;
		this.AppSpec2 = AppSpec2;
		this.Offset = Offset;
	}

	/**DIB header setter
	 * 
	 * @param DIBsize Size of Dibheader header
	 * @param Width Image width
	 * @param Height Image Height
	 * @param NumofPlanes Number of planes on image
	 * @param BitperPx Size per pixel : 24 bit 
	 * @param CompressionArray Compression array standards
	 * @param RawBitmapData Image size without header
	 * @param PrintResolutionWidth Screen resolution width 
	 * @param PrintResolutionHeight Screen resolution height
	 * @param NumOfColorsPallete Number of colors in the pallete
	 * @param ImportantColors Important colors 
	 */
	public void modifyDIBHEADER(String DIBsize, String Width, String Height, String NumofPlanes, String BitperPx,
			String CompressionArray, String RawBitmapData, String PrintResolutionWidth, String PrintResolutionHeight,
			String NumOfColorsPallete, String ImportantColors) {

		this.DIBsize = DIBsize;
		this.Width = Width;
		this.Height = Height;
		this.NumofPlanes = NumofPlanes;
		this.BitperPx = BitperPx;
		this.CompressionArray = CompressionArray;
		this.RawBitmapData = RawBitmapData;
		this.PrintResolutionWidth = PrintResolutionWidth;
		this.PrintResolutionHeight = PrintResolutionHeight;
		this.NumOfColorsPallete = NumOfColorsPallete;
		this.ImportantColors = ImportantColors;
	}

	/**BMP Pixel array setter
	 * 
	 * @param ColorArray Image pixel colors 
	 */
	public void modifyBMPDATA(String[][] ColorArray) {

		this.ColorArray = ColorArray;
	}

	/**Signature setter
	 * 
	 * @param Signature File format signature
	 */
	public void modifySignature(String Signature) {

		this.Signature = Signature;
	}

	/**Size setter
	 * 
	 * @param Size Size of file
	 */
	public void modifySize(String Size) {

		this.Size = Size;
	}

	/**AppSpec1 setter
	 * @param AppSpec1 Always set to 00 00 
	 */
	public void modifyAppSpec1(String AppSpec1) {

		this.AppSpec1 = AppSpec1;
	}

	/**AppSpec2 setter
	 * 
	 * @param AppSpec2 Always set to 00 00 
	 */
	public void modifyAppSpec2(String AppSpec2) {

		this.AppSpec2 = AppSpec2;
	}

	/**Offset setter
	 * 
	 * @param Offset Offset size to the pixel data
	 */
	public void modifyOffset(String Offset) {

		this.Offset = Offset;
	}

	/**DIB size setter
	 * 
	 * @param DIBsize Size of Dibheader header
	 */
	public void modifyDIBsize(String DIBsize) {

		this.DIBsize = DIBsize;
	}

	/**Width setter
	 * 
	 * @param Width Image width
	 */
	public void modifyWidth(String Width) {

		this.Width = Width;
	}

	/**Height setter
	 * 
	 * @param Height Image Height
	 */
	public void modifyHeight(String Height) {

		this.Height = Height;
	}

	/**NumofPlanes setter
	 * 
	 * @param NumofPlanes Number of planes on image
	 */
	public void modifyNumofPlanes(String NumofPlanes) {

		this.NumofPlanes = NumofPlanes;
	}

	/**BitperPx setter
	 * 
	 * @param BitperPx Size per pixel : 24 bit
	 */
	public void modifyBitperPx(String BitperPx) {

		this.BitperPx = BitperPx;
	}

	/**CompressionArray setter
	 * 
	 * @param CompressionArray Compression array standards
	 */
	public void modifyCompressionArray(String CompressionArray) {

		this.CompressionArray = CompressionArray;
	}

	/**RawBitmapData setter
	 * 
	 * @param RawBitmapData Image size without header
	 */
	public void modifyRawBitmapData(String RawBitmapData) {

		this.RawBitmapData = RawBitmapData;
	}

	/**PrintResolutionWidth setter
	 * 
	 * @param PrintResolutionWidth Screen resolution width 
	 */
	public void modifyPrintResolutionWidth(String PrintResolutionWidth) {

		this.PrintResolutionWidth = PrintResolutionWidth;
	}

	/**PrintResolutionHeight setter
	 * 
	 * @param PrintResolutionHeight Screen resolution height 
	 */
	public void modifyPrintResolutionHeight(String PrintResolutionHeight) {

		this.PrintResolutionHeight = PrintResolutionHeight;
	}

	/**NumOfColorsPallete setter
	 * 
	 * @param NumOfColorsPallete Number of colors in the pallete
	 */
	public void modifyNumOfColorsPallete(String NumOfColorsPallete) {

		this.NumOfColorsPallete = NumOfColorsPallete;
	}

	/** ImportantColors setter
	 * 
	 * @param ImportantColors Important colors 
	 */
	public void modifyImportantColors(String ImportantColors) {

		this.ImportantColors = ImportantColors;
	}

	/**ColorArray getter
	 * 
	 * @return ColorArray
	 */
	public String[][] getBMPDATA() {

		return ColorArray;
	}

	/** Signature getter
	 * 
	 * @return Signature
	 */
	public String getSignature() {

		return Signature;
	}

	/**Size getter
	 * 
	 * @return Size
	 */
	public String getSize() {

		return Size;
	}

	/**AppSpec1 getter
	 * 
	 * @return AppSpec1
	 */
	public String getAppSpec1() {

		return AppSpec1;
	}

	/**AppSpec2 getter
	 * 
	 * @return AppSpec2
	 */
	public String getAppSpec2() {

		return AppSpec2;
	}

	/**Offset getter
	 * 
	 * @return Offset
	 */
	public String getOffset() {

		return Offset;
	}

	/**DIBsize getter
	 * 
	 * @return DIBsize
	 */
	public String getDIBsize() {

		return DIBsize;
	}

	/**Width getter
	 * 
	 * @return Width
	 */
	public String getWidth() {

		return Width;
	}

	/**Height getter
	 * 
	 * @return Height
	 */
	public String getHeight() {

		return Height;
	}

	/**NumofPlanes getter
	 * 
	 * @return NumofPlanes
	 */
	public String getNumofPlanes() {

		return NumofPlanes;
	}

	/**BitperPx getter
	 * 
	 * @return BitperPx
	 */
	public String getBitperPx() {

		return BitperPx;
	}

	
	/**CompressionArray getter
	 * 
	 * @return CompressionArray
	 */
	public String getCompressionArray() {

		return CompressionArray;
	}

	/**RawBitmapData getter
	 * 
	 * @return RawBitmapData
	 */
	public String getRawBitmapData() {

		return RawBitmapData;
	}

	/**PrintResolutionWidth getter
	 * 
	 * @return PrintResolutionWidth
	 */
	public String getPrintResolutionWidth() {

		return PrintResolutionWidth;
	}

	/**PrintResolutionHeight getter
	 * 
	 * @return PrintResolutionHeight
	 */
	public String getPrintResolutionHeight() {

		return PrintResolutionHeight;
	}

	/**NumOfColorsPallete getter
	 * 
	 * @return NumOfColorsPallete
	 */
	public String getNumOfColorsPallete() {

		return NumOfColorsPallete;
	}

	/**ImportantColors getter
	 * 
	 * @return ImportantColors
	 */
	public String getImportantColors() {

		return ImportantColors;
	}

}
