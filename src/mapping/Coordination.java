package mapping;

/**
 * @author NXATZ
 *
 */
public class Coordination {
	
	/**This method is Responsible to sort the images to smallest 
	 * latitude smallest longitude in order to find the image 
	 * nearest to the equinox and equator intersection
	 * 
	 * @param FBBA Flight Black Box Array
	 * @return FBBA 
	 */
	public static String[][] imageCenterSorting(String[][] FBBA){
		// sort table smallest latitude  // only for northeast quadrant
		
		// sort table smallest longitude
		
		
		return FBBA;
		
	}
	
	/**This method is responsible to adjust the log-lan coordinates 
	 * into standardize image coordinates (first image centralize with 
	 * coordinates (Height/2,Width/2) 
	 * the second second (height/2+difference, width/2+difference)
	 * 
	 * @param FBBA Flight Black Box Array
	 * @return FBBA
	 */
	public static String[][] imageCenterAdjustment(String[][] FBBA){
		// set first image coordinate 
		
		//float diflatitude = atoi from black box 
		//float diflongitude = atoi from black box 
		
		//for (int i = 0 ; i < Globalvar.numberofimages; i++)
		
		//float FBBA(yaxis) = height/2 + (FBBA(lat) - diflatitude)
		//float FBBA(xaxis) = width /2 + (FBBA(lon) - diflongitude)
		
		
		return FBBA;
		
	}
	
	/**This method calculate the distance beetween 2 coordinates 
	 * using the havrsine formula for long and lat coordinates
	 * 
	 * @param FBBA Flight Black Box Array
	 * @return FBBA
	 */
	public static String[][] point2pointDistance(String[][] FBBA){
		
		
//		var R = 6371e3; // metres
//		var φ1 = lat1.toRadians();
//		var φ2 = lat2.toRadians();
//		var Δφ = (lat2-lat1).toRadians();
//		var Δλ = (lon2-lon1).toRadians();
//
//		var a = Math.sin(Δφ/2) * Math.sin(Δφ/2) +
//		        Math.cos(φ1) * Math.cos(φ2) *
//		        Math.sin(Δλ/2) * Math.sin(Δλ/2);
//		var c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1-a));
//
//		var d = R * c;
		
		return FBBA;
		
		
	}
	

}
