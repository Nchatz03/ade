package mapping;

/**
 * @author NXATZ
 *
 */
public class Coordination {

	/**
	 * This method calculate the distance between 2 coordinates using the
	 * haversine formula for long and lat coordinates
	 * 
	 * Haversine formula:
	 * 
	 * f1 = angle of lat1 f2 = angle of lat2 DF = difference of lat1 and lat2 DL
	 * = difference of lon1 and lon2
	 * 
	 * a = sin²(DF/2) + cos(f1) * cos(f2) * sin²(DL/2) c = 2 * atan2( √a, √(1−a)
	 * ) d = R * c
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

		double c = 2 * Math.atan2(Math.sqrt(var), Math.sqrt(1 - var));
		double distance = R * c;

		return distance;

	}

	/**
	 * This method is Responsible to sort the images to smallest latitude
	 * smallest longitude in order to find the image nearest to the equinox and
	 * equator intersection
	 * 
	 * @param fbba
	 *            array
	 * 
	 * @return FBBA
	 */
	public static BlackBox imageCenterSorting(BlackBox fbba) {

		double distance = 0.0;
		double imglatitude = 0.0;
		double imglongitude = 0.0;

		for (int i = 0; i < GlobalVar.numberOfImages; i++) {

			imglongitude = Double.parseDouble(fbba.getSpecifiedElement(i, GlobalVar.BLACKBOX_LONGITUDE));
			imglatitude = Double.parseDouble(fbba.getSpecifiedElement(i, GlobalVar.BLACKBOX_LONGITUDE));

			distance = point2pointDistance(GlobalVar.EE_INTERC_LONG, imglongitude, GlobalVar.EE_INTERC_LAT,
					imglatitude);

			fbba.setSpecifiedElement(String.format("%.20", distance), i, GlobalVar.BLACKBOX_INTERCECT_DISTANCE);

		}

		String[] swaparray = new String[GlobalVar.BLACKBOX_LENGTH];
		double compare1 = 0.0;
		double compare2 = 0.0;

		for (int i = 0; i < GlobalVar.numberOfImages; i++) {
			for (int j = 1; j < (GlobalVar.numberOfImages - i); j++) {

				compare1 = Double.parseDouble(fbba.getSpecifiedElement(j - 1, GlobalVar.BLACKBOX_INTERCECT_DISTANCE));
				compare2 = Double.parseDouble(fbba.getSpecifiedElement(j, GlobalVar.BLACKBOX_INTERCECT_DISTANCE));

				if (compare1 > compare2) {

					// temp = arr[j-1];
					swaparray[GlobalVar.BLACKBOX_IMAGE_FORMAT] = fbba.getSpecifiedElement(j - 1,
							GlobalVar.BLACKBOX_IMAGE_FORMAT);
					swaparray[GlobalVar.BLACKBOX_FILENAME] = fbba.getSpecifiedElement(j - 1,
							GlobalVar.BLACKBOX_FILENAME);
					swaparray[GlobalVar.BLACKBOX_LATITUDE] = fbba.getSpecifiedElement(j - 1,
							GlobalVar.BLACKBOX_LATITUDE);
					swaparray[GlobalVar.BLACKBOX_LONGITUDE] = fbba.getSpecifiedElement(j - 1,
							GlobalVar.BLACKBOX_LONGITUDE);
					swaparray[GlobalVar.BLACKBOX_CENTER_XAXIS] = fbba.getSpecifiedElement(j - 1,
							GlobalVar.BLACKBOX_CENTER_XAXIS);
					swaparray[GlobalVar.BLACKBOX_CENTER_YAXIS] = fbba.getSpecifiedElement(j - 1,
							GlobalVar.BLACKBOX_CENTER_YAXIS);
					swaparray[GlobalVar.BLACKBOX_INTERCECT_DISTANCE] = fbba.getSpecifiedElement(j - 1,
							GlobalVar.BLACKBOX_INTERCECT_DISTANCE);

					// arr[j-1] = arr[j];
					fbba.setSpecifiedElement(fbba.getSpecifiedElement(j, GlobalVar.BLACKBOX_IMAGE_FORMAT), j - 1,
							GlobalVar.BLACKBOX_IMAGE_FORMAT);
					fbba.setSpecifiedElement(fbba.getSpecifiedElement(j, GlobalVar.BLACKBOX_FILENAME), j - 1,
							GlobalVar.BLACKBOX_FILENAME);
					fbba.setSpecifiedElement(fbba.getSpecifiedElement(j, GlobalVar.BLACKBOX_LATITUDE), j - 1,
							GlobalVar.BLACKBOX_LATITUDE);
					fbba.setSpecifiedElement(fbba.getSpecifiedElement(j, GlobalVar.BLACKBOX_LONGITUDE), j - 1,
							GlobalVar.BLACKBOX_LONGITUDE);
					fbba.setSpecifiedElement(fbba.getSpecifiedElement(j, GlobalVar.BLACKBOX_CENTER_XAXIS), j - 1,
							GlobalVar.BLACKBOX_CENTER_XAXIS);
					fbba.setSpecifiedElement(fbba.getSpecifiedElement(j, GlobalVar.BLACKBOX_CENTER_YAXIS), j - 1,
							GlobalVar.BLACKBOX_CENTER_YAXIS);
					fbba.setSpecifiedElement(fbba.getSpecifiedElement(j, GlobalVar.BLACKBOX_INTERCECT_DISTANCE), j - 1,
							GlobalVar.BLACKBOX_INTERCECT_DISTANCE);

					// arr[j] = temp;
					fbba.setSpecifiedElement(swaparray[GlobalVar.BLACKBOX_IMAGE_FORMAT], j,
							GlobalVar.BLACKBOX_IMAGE_FORMAT);
					fbba.setSpecifiedElement(swaparray[GlobalVar.BLACKBOX_FILENAME], j, GlobalVar.BLACKBOX_FILENAME);
					fbba.setSpecifiedElement(swaparray[GlobalVar.BLACKBOX_LATITUDE], j, GlobalVar.BLACKBOX_LATITUDE);
					fbba.setSpecifiedElement(swaparray[GlobalVar.BLACKBOX_LONGITUDE], j, GlobalVar.BLACKBOX_LONGITUDE);
					fbba.setSpecifiedElement(swaparray[GlobalVar.BLACKBOX_CENTER_XAXIS], j,
							GlobalVar.BLACKBOX_CENTER_XAXIS);
					fbba.setSpecifiedElement(swaparray[GlobalVar.BLACKBOX_CENTER_YAXIS], j,
							GlobalVar.BLACKBOX_CENTER_YAXIS);
					fbba.setSpecifiedElement(swaparray[GlobalVar.BLACKBOX_INTERCECT_DISTANCE], j,
							GlobalVar.BLACKBOX_INTERCECT_DISTANCE);
				}

			}
		}

		return fbba;

	}

	/**
	 * This method is responsible to adjust the lan-long coordinates into
	 * standardize image coordinates (first image centralize with coordinates
	 * (Height/2,Width/2) the second (height/2+difference, width/2+difference)
	 * 
	 * @param fbba
	 *            array
	 * 
	 * @return FBBA
	 */
	public static BlackBox imageCenterAdjustment(BlackBox fbba) {
		// set first image coordinate

		// float diflatitude = atoi from black box
		// float diflongitude = atoi from black box

		// for (int i = 0 ; i < Globalvar.numberofimages; i++)

		// float FBBA(yaxis) = height/2 + (FBBA(lat) - diflatitude)
		// float FBBA(xaxis) = width /2 + (FBBA(lon) - diflongitude)

		return fbba;

	}

	/**
	 * @param args
	 *            command line arguments
	 */
	public static void main(String args[]) {

		double distance = point2pointDistance(GlobalVar.EE_INTERC_LONG, 33.40915679931637, GlobalVar.EE_INTERC_LAT,
				35.14206867277194);

		System.out.println(distance);

	}

}
