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
	public static final int BLACKBOX_LENGTH = 6;

	/**
	 * Image latitude
	 */
	public static final int BLACKBOX_LATITUDE = 0;

	/**
	 * Image longitude
	 */
	public static final int BLACKBOX_LONGITUDE = 1;

	/**
	 * Image File Name
	 */
	public static final int BLACKBOX_FILENAME = 2;

	/**
	 * Image New Center y-axis
	 */
	public static final int BLACKBOX_CENTER_YAXIS = 3;

	/**
	 * Image New Center x-axis
	 */
	public static final int BLACKBOX_CENTER_XAXIS = 4;

	/**
	 * Image distance from intercept point
	 */
	public static final int BLACKBOX_INTERCECT_DISTANCE = 5;

	/**
	 * Earth's radius in meters
	 */
	public static final int EARTH_RADIUS = 6371000;

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
