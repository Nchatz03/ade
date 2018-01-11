package mapping;

/**
 * @author NXATZ
 *
 */
public class Coordination {

	/**
	 * This method is Responsible to sort the images to smallest latitude
	 * smallest longitude in order to find the image nearest to the equinox and
	 * equator intersection
	 * 
	 * @param FBBA
	 *            Flight Black Box Array
	 * @return FBBA
	 */
	public static String[][] imageCenterSorting(String[][] FBBA) {
		// sort table smallest latitude // only for northeast quadrant

		// sort table smallest longitude

		return FBBA;

	}

	/**
	 * This method is responsible to adjust the log-lan coordinates into
	 * standardize image coordinates (first image centralize with coordinates
	 * (Height/2,Width/2) the second (height/2+difference, width/2+difference)
	 * 
	 * @param FBBA
	 *            Flight Black Box Array
	 * @return FBBA
	 */
	public static String[][] imageCenterAdjustment(String[][] FBBA) {
		// set first image coordinate

		// float diflatitude = atoi from black box
		// float diflongitude = atoi from black box

		// for (int i = 0 ; i < Globalvar.numberofimages; i++)

		// float FBBA(yaxis) = height/2 + (FBBA(lat) - diflatitude)
		// float FBBA(xaxis) = width /2 + (FBBA(lon) - diflongitude)

		return FBBA;

	}

	/**
	 * This method calculate the distance between 2 coordinates using the
	 * haversine formula for long and lat coordinates 
	 * 
	 * Haversine formula:	
	 * 
	 * f1 = angle of lat1 
	 * f2 = angle of lat2
	 * DF = difference of lat1 and lat2
	 * DL = difference of lon1 and lon2
	 * 
	 * a = sin²(DF/2) + cos(f1) * cos(f2) * sin²(DL/2)
	 * c = 2 * atan2( √a, √(1−a) )
	 * d = R * c
	 * 
	 * @param lon1
	 *            point 1 longitude
	 * @param lon2
	 *            point 2 longitude
	 * @param lat1
	 *            point 1 latitude
	 * @param lat2
	 *            point 2 latitude
	 * 
	 * @return Distance
	 */
	public static double point2pointDistance(double lon1, double lon2, double lat1, double lat2) {

		int R = GlobalVar.EARTH_RADIUS;
		double f1 = Math.toRadians(lat1);
		double f2 = Math.toRadians(lat2);
		double DF = Math.toRadians(lat2 - lat1);
		double DL = Math.toRadians(lon2 - lon1);

		double var = Math.sin(DF / 2) * Math.sin(DF / 2)
				+ Math.cos(f1) * Math.cos(f2) * Math.sin(DL / 2) * Math.sin(DL / 2);
		
		double c = 2 * Math.atan2(Math.sqrt(var), Math.sqrt(1-var));
        double distance = R * c;

		return distance;

	}

	/**
	 * @param args
	 *            command line arguments
	 */
	public static void main(String args[]) {

	}

}
