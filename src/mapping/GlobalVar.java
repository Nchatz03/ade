package mapping;

/**
 * @author NXATZ
 *
 */
public class GlobalVar {

	//////////////// GLOBAL VARIABLES /////////////////////

	private static int numberOfImages = 0;

	private static final int BLACKBOX_LENGTH = 7;
	
	private static final int BLACKBOX_IMAGE_FORMAT = 0;
	
	private static final int BLACKBOX_FILENAME = 1;

	private static final int BLACKBOX_LATITUDE = 2;

	private static final int BLACKBOX_LONGITUDE = 3;

	private static final int BLACKBOX_CENTER_XAXIS = 4;

	private static final int BLACKBOX_CENTER_YAXIS = 5;

	private static final int BLACKBOX_INTERCECT_DISTANCE = 6;

	private static final int EARTH_RADIUS = 6371000;
	
	private static final double EE_INTERC_LAT = 0;
	
	private static final double EE_INTERC_LONG = 0;

	private static String PATH = "";

	private static String DEBUGFLAG = "";

	private static int IMAGEWIDTH = 0;

	private static int IMAGEHEIGHT = 0;

	/**
	 * number of Images in the directory path
	 */
	public static int getNumberOfImages() {
		return numberOfImages;
	}

	public static void setNumberOfImages(int numberOfImages) {
		GlobalVar.numberOfImages = numberOfImages;
	}

	/**
	 * Length of Flight Black Box Array
	 */
	public static int getBlackboxLength() {
		return BLACKBOX_LENGTH;
	}

	/**
	 * Initial image formats
	 */
	public static int getBlackboxImageFormat() {
		return BLACKBOX_IMAGE_FORMAT;
	}

	/**
	 * Image File Name
	 */
	public static int getBlackboxFilename() {
		return BLACKBOX_FILENAME;
	}

	/**
	 * Image latitude
	 */
	public static int getBlackboxLatitude() {
		return BLACKBOX_LATITUDE;
	}

	/**
	 * Image longitude
	 */
	public static int getBlackboxLongitude() {
		return BLACKBOX_LONGITUDE;
	}

	/**
	 * Image New Center y-axis
	 */
	public static int getBlackboxCenterXaxis() {
		return BLACKBOX_CENTER_XAXIS;
	}

	/**
	 * Image New Center x-axis
	 */
	public static int getBlackboxCenterYaxis() {
		return BLACKBOX_CENTER_YAXIS;
	}

	/**
	 * Image distance from intercept point
	 */
	public static int getBlackboxIntercectDistance() {
		return BLACKBOX_INTERCECT_DISTANCE;
	}

	/**
	 * Earth's radius in meters
	 */
	public static int getEarthRadius() {
		return EARTH_RADIUS;
	}

	/**
	 * Earth's center latitude
	 */
	public static double getEeIntercLat() {
		return EE_INTERC_LAT;
	}

	/**
	 * Earth's center longitude
	 */
	public static double getEeIntercLong() {
		return EE_INTERC_LONG;
	}

	/**
	 * Path to images' folder
	 */
	public static String getPATH() {
		return PATH;
	}

	public static void setPATH(String PATH) {
		GlobalVar.PATH = PATH;
	}

	/**
	 * Path to images' folder
	 */
	public static String getDEBUGFLAG() {
		return DEBUGFLAG;
	}

	public static void setDEBUGFLAG(String DEBUGFLAG) {
		GlobalVar.DEBUGFLAG = DEBUGFLAG;
	}

	/**
	 * Image width
	 */
	public static int getIMAGEWIDTH() {
		return IMAGEWIDTH;
	}

	public static void setIMAGEWIDTH(int IMAGEWIDTH) {
	}
	/**
	 * Image height
	 */
	public static int getIMAGEHEIGHT() {
		return IMAGEHEIGHT;
	}

	public static void setIMAGEHEIGHT(int IMAGEHEIGHT) {
		GlobalVar.IMAGEHEIGHT = IMAGEHEIGHT;
	}
}
