package mapping;

public class ImgRGB24 {

	/////////////////// BMP HEADER////////////////////////

	/* ID field size: 2 */
	private String Signature;

	/* Size of the BMP file size: 4 */
	private String Size;

	/* Application specific size:2 */
	private String AppSpec1;

	/* Application specific size:2 */
	private String AppSpec2;

	/* Offset where the pixel array (bitmap data) can be found size:4 */
	private String Offset;

	/////////////////////////////////////////////////////

	///////////////////// DIB HEADER//////////////////////

	/* Number of bytes in the DIB header (from this point) size:4 */
	private String DIBsize;

	/* Width of the bitmap in pixels size:4 */
	private String Width;

	/*
	 * Height of the bitmap in pixels. Positive for bottom to top pixel order
	 * size:4
	 */
	private String Height;

	/* Number of color planes being used size:2 */
	private String NumofPlanes;

	/* Number of bits per pixel size:2 */
	private String BitperPx;

	/* BI_RGB, no pixel array compression used size:4 */
	private String CompressionArray;

	/* Size of the raw bitmap data (including padding) size:4 */
	private String RawBitmapData;

	/*
	 * Print resolution of the image width (including padding) 72 DPI × 39.3701
	 * inches per metre yields 2834.6472 size:4
	 */
	private String PrintResolutionWidth;

	/*
	 * Print resolution of the image height (including padding) 72 DPI × 39.3701
	 * inches per metre yields 2834.6472 size:4
	 */
	private String PrintResolutionHeight;

	/* Number of colors in the palette size: 4 */
	private String NumOfColorsPallete;

	/* 0 means all colors are important size:4 */
	private String ImportantColors;

	/////////////////////////////////////////////////////

	///////////////////// BITMAP DATA/////////////////////

	/* size 3 per pixel entry except padding size 2 */
	private String[][] ColorArray;

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

	public ImgRGB24() {


	}

	public void modifyBMPHEADER(String Signature, String Size, String AppSpec1, String AppSpec2, String Offset) {

		this.Signature = Signature;
		this.Size = Size;
		this.AppSpec1 = AppSpec1;
		this.AppSpec2 = AppSpec2;
		this.Offset = Offset;
	}

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

	public void modifyBMPDATA(String[][] ColorArray) {

		this.ColorArray = ColorArray;
	}

	public void modifySignature(String Signature) {

		this.Signature = Signature;
	}

	public void modifySize(String Size) {

		this.Size = Size;
	}

	public void modifyAppSpec1(String AppSpec1) {

		this.AppSpec1 = AppSpec1;
	}

	public void modifyAppSpec2(String AppSpec2) {

		this.AppSpec2 = AppSpec2;
	}

	public void modifyOffset(String Offset) {

		this.Offset = Offset;
	}

	public void modifyDIBsize(String DIBsize) {

		this.DIBsize = DIBsize;
	}

	public void modifyWidth(String Width) {

		this.Width = Width;
	}

	public void modifyHeight(String Height) {

		this.Height = Height;
	}

	public void modifyNumofPlanes(String NumofPlanes) {

		this.NumofPlanes = NumofPlanes;
	}

	public void modifyBitperPx(String BitperPx) {

		this.BitperPx = BitperPx;
	}

	public void modifyCompressionArray(String CompressionArray) {

		this.CompressionArray = CompressionArray;
	}

	public void modifyRawBitmapData(String RawBitmapData) {

		this.RawBitmapData = RawBitmapData;
	}

	public void modifyPrintResolutionWidth(String PrintResolutionWidth) {

		this.PrintResolutionWidth = PrintResolutionWidth;
	}

	public void modifyPrintResolutionHeight(String PrintResolutionHeight) {

		this.PrintResolutionHeight = PrintResolutionHeight;
	}

	public void modifyNumOfColorsPallete(String NumOfColorsPallete) {

		this.NumOfColorsPallete = NumOfColorsPallete;
	}

	public void modifyImportantColors(String ImportantColors) {

		this.ImportantColors = ImportantColors;
	}

	public String[][] getBMPDATA() {

		return ColorArray;
	}

	public String getSignature() {

		return Signature;
	}

	public String getSize() {

		return Size;
	}

	public String getAppSpec1() {

		return AppSpec1;
	}

	public String getAppSpec2() {

		return AppSpec2;
	}

	public String getOffset() {

		return Offset;
	}

	public String getDIBsize() {

		return DIBsize;
	}

	public String getWidth() {

		return Width;
	}

	public String getHeight() {

		return Height;
	}

	public String getNumofPlanes() {

		return NumofPlanes;
	}

	public String getBitperPx() {

		return BitperPx;
	}

	public String getCompressionArray() {

		return CompressionArray;
	}

	public String getRawBitmapData() {

		return RawBitmapData;
	}

	public String getPrintResolutionWidth() {

		return PrintResolutionWidth;
	}

	public String getPrintResolutionHeight() {

		return PrintResolutionHeight;
	}

	public String getNumOfColorsPallete() {

		return NumOfColorsPallete;
	}

	public String getImportantColors() {

		return ImportantColors;
	}

}
