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

		int R = GlobalVar.getEarthRadius();
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

		for (int i = 0; i < GlobalVar.getNumberOfImages(); i++) {

			imglongitude = Double.parseDouble(fbba.getSpecifiedElement(i, GlobalVar.getBlackboxLongitude()));
			imglatitude = Double.parseDouble(fbba.getSpecifiedElement(i, GlobalVar.getBlackboxLatitude()));

			distance = point2pointDistance(GlobalVar.getEeIntercLong(), imglongitude, GlobalVar.getEeIntercLat(),
					imglatitude);

			fbba.setSpecifiedElement(String.format("%.20", distance), i, GlobalVar.getBlackboxIntercectDistance());

		}

		String[] swaparray = new String[GlobalVar.getBlackboxLength()];
		double compare1 = 0.0;
		double compare2 = 0.0;

		for (int i = 0; i < GlobalVar.getNumberOfImages(); i++) {
			for (int j = 1; j < (GlobalVar.getNumberOfImages() - i); j++) {

				compare1 = Double.parseDouble(fbba.getSpecifiedElement(j - 1, GlobalVar.getBlackboxIntercectDistance()));
				compare2 = Double.parseDouble(fbba.getSpecifiedElement(j, GlobalVar.getBlackboxIntercectDistance()));

				if (compare1 > compare2) {

					// temp = arr[j-1];
					swaparray[GlobalVar.getBlackboxImageFormat()] = fbba.getSpecifiedElement(j - 1,
							GlobalVar.getBlackboxImageFormat());
					swaparray[GlobalVar.getBlackboxFilename()] = fbba.getSpecifiedElement(j - 1,
							GlobalVar.getBlackboxFilename());
					swaparray[GlobalVar.getBlackboxLatitude()] = fbba.getSpecifiedElement(j - 1,
							GlobalVar.getBlackboxLatitude());
					swaparray[GlobalVar.getBlackboxLongitude()] = fbba.getSpecifiedElement(j - 1,
							GlobalVar.getBlackboxLongitude());
					swaparray[GlobalVar.getBlackboxCenterXaxis()] = fbba.getSpecifiedElement(j - 1,
							GlobalVar.getBlackboxCenterXaxis());
					swaparray[GlobalVar.getBlackboxCenterYaxis()] = fbba.getSpecifiedElement(j - 1,
							GlobalVar.getBlackboxCenterYaxis());
					swaparray[GlobalVar.getBlackboxIntercectDistance()] = fbba.getSpecifiedElement(j - 1,
							GlobalVar.getBlackboxIntercectDistance());

					// arr[j-1] = arr[j];
					fbba.setSpecifiedElement(fbba.getSpecifiedElement(j, GlobalVar.getBlackboxImageFormat()), j - 1,
							GlobalVar.getBlackboxImageFormat());
					fbba.setSpecifiedElement(fbba.getSpecifiedElement(j, GlobalVar.getBlackboxFilename()), j - 1,
							GlobalVar.getBlackboxFilename());
					fbba.setSpecifiedElement(fbba.getSpecifiedElement(j, GlobalVar.getBlackboxLatitude()), j - 1,
							GlobalVar.getBlackboxLatitude());
					fbba.setSpecifiedElement(fbba.getSpecifiedElement(j, GlobalVar.getBlackboxLongitude()), j - 1,
							GlobalVar.getBlackboxLongitude());
					fbba.setSpecifiedElement(fbba.getSpecifiedElement(j, GlobalVar.getBlackboxCenterXaxis()), j - 1,
							GlobalVar.getBlackboxCenterXaxis());
					fbba.setSpecifiedElement(fbba.getSpecifiedElement(j, GlobalVar.getBlackboxCenterYaxis()), j - 1,
							GlobalVar.getBlackboxCenterYaxis());
					fbba.setSpecifiedElement(fbba.getSpecifiedElement(j, GlobalVar.getBlackboxIntercectDistance()), j - 1,
							GlobalVar.getBlackboxIntercectDistance());

					// arr[j] = temp;
					fbba.setSpecifiedElement(swaparray[GlobalVar.getBlackboxImageFormat()], j,
							GlobalVar.getBlackboxImageFormat());
					fbba.setSpecifiedElement(swaparray[GlobalVar.getBlackboxFilename()], j, GlobalVar.getBlackboxFilename());
					fbba.setSpecifiedElement(swaparray[GlobalVar.getBlackboxLatitude()], j, GlobalVar.getBlackboxLatitude());
					fbba.setSpecifiedElement(swaparray[GlobalVar.getBlackboxLongitude()], j, GlobalVar.getBlackboxLongitude());
					fbba.setSpecifiedElement(swaparray[GlobalVar.getBlackboxCenterXaxis()], j,
							GlobalVar.getBlackboxCenterXaxis());
					fbba.setSpecifiedElement(swaparray[GlobalVar.getBlackboxCenterYaxis()], j,
							GlobalVar.getBlackboxCenterYaxis());
					fbba.setSpecifiedElement(swaparray[GlobalVar.getBlackboxIntercectDistance()], j,
							GlobalVar.getBlackboxIntercectDistance());
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

		double distance = point2pointDistance(GlobalVar.getEeIntercLong(), 33.40915679931637, GlobalVar.getEeIntercLat(),
				35.14206867277194);

		System.out.println(distance);

	}

}
