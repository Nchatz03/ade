package mapping;

/**
 * @author NXATZ
 *
 */
public class GlobalVar {

	//////////////// GLOBAL VARIABLES /////////////////////

	/**
	 * number of Images in the directory path
	 */
	public static int numberOfImages = 0;

	/**
	 * Length of Flight Black Box Array
	 */
	public static final int BLACKBOX_LENGTH = 7;
	
	/**
	 * Initial image formats
	 */
	public static final int BLACKBOX_IMAGE_FORMAT = 0;
	
	/**
	 * Image File Name
	 */
	public static final int BLACKBOX_FILENAME = 1;

	/**
	 * Image latitude
	 */
	public static final int BLACKBOX_LATITUDE = 2;

	/**
	 * Image longitude
	 */
	public static final int BLACKBOX_LONGITUDE = 3;

	/**
	 * Image New Center y-axis
	 */
	public static final int BLACKBOX_CENTER_XAXIS = 4;

	/**
	 * Image New Center x-axis
	 */
	public static final int BLACKBOX_CENTER_YAXIS = 5;

	/**
	 * Image distance from intercept point
	 */
	public static final int BLACKBOX_INTERCECT_DISTANCE = 6;

	/**
	 * Earth's radius in meters
	 */
	public static final int EARTH_RADIUS = 6371000;
	
	/**
	 * Earth's center latitude
	 */
	public static final double EE_INTERC_LAT = 0;
	
	/**
	 * Earth's center longitude
	 */
	public static final double EE_INTERC_LONG = 0;

	/**
	 * Path to images' folder
	 */
	public static String PATH = "";

	/**
	 * Path to images' folder
	 */
	public static String DEBUGFLAG = "";

	/**
	 * Image width
	 */
	public static int IMAGEWIDTH = 0;

	/**
	 * Image height
	 */
	public static int IMAGEHEIGHT = 0;

}
