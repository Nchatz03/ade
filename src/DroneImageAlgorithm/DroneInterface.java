package DroneImageAlgorithm;

/**
 * Drone Object Interface
 * 
 * @author NXATZ
 *
 */
public interface DroneInterface {

	/**
	 * Get x_sensor.
	 * <p>
	 * Object Method that returns x_sensor
	 *
	 * @return x_sensor -
	 */
	public double getX_sensor();

	/**
	 * Get y_sensor.
	 * <p>
	 * Object Method that returns y_sensor
	 *
	 * @return y_sensor
	 */
	public double getY_sensor();

	/**
	 * Get x_gimbal_angle.
	 * <p>
	 * Object Method that returns x_gimbal_angle
	 *
	 * @return x_gimbal_angle
	 */
	public double getX_gimbal_angle();

	/**
	 * Get y_gimbal_angle.
	 * <p>
	 * Object Method that returns the y_gimbal_angle
	 *
	 * @return y_gimbal_angle
	 */
	public double getY_gimbal_angle();

	/**
	 * Get altitude.
	 * <p>
	 * Object Method that returns the altitude
	 *
	 * @return altitude
	 */
	public double getAltitude();

	/**
	 * Get focallen.
	 * <p>
	 * Object Method that returns the focallen
	 *
	 * @return focallen
	 */
	public double getFocallen();

	/**
	 * Get latitude.
	 * <p>
	 * Object Method that returns the latitude
	 *
	 * @return latitude
	 */
	public double getLatitude();

	/**
	 * Get longitude.
	 * <p>
	 * Object Method that returns the longitude
	 *
	 * @return longitude - longitude
	 */
	public double getLongitude();

	/**
	 * Change x_sensor
	 * <p>
	 * Object Method that returns the changed x_sensor
	 *
	 * @param x_sensor
	 *            - x sensor
	 */
	public void changeX_sensor(double x_sensor);

	/**
	 * Change y_sensor
	 * <p>
	 * Object Method that returns the changed y_sensor
	 *
	 * @param y_sensor
	 *            - y_sensor
	 */
	public void changeY_sensor(double y_sensor);

	/**
	 * Change x_gimbal_angle
	 * <p>
	 * Object Method that returns the changed x_gimbal_angle
	 *
	 * @param x_gimbal_angle
	 *            - x_gimbal_angle
	 */
	public void changeX_gimbal_angle(double x_gimbal_angle);

	/**
	 * Change y_gimbal_angle
	 * <p>
	 * Object Method that returns the changed y_gimbal_angle
	 *
	 * @param y_gimbal_angle
	 *            - y_gimbal_angle
	 */
	public void changeY_gimbal_angle(double y_gimbal_angle);

	/**
	 * Change altitude.
	 * <p>
	 * Object Method that returns the changed altitude
	 *
	 * @param altitude
	 *            - altitude
	 */
	public void changeAltitude(double altitude);

	/**
	 * Change focallen
	 * <p>
	 * Object Method that returns the changed focallen
	 *
	 * @param focallen
	 *            - focallen
	 */
	public void changeWidth(double focallen);

	/**
	 * Change image latitude
	 * <p>
	 * Object Method that returns the changed latitude
	 *
	 * @param latitude
	 *            - latitude
	 */
	public void changeLatitude(double latitude);

	/**
	 * Change longitude
	 * <p>
	 * Object Method that returns the changed longitude
	 *
	 * @param longitude
	 *            -longitude
	 */
	public void changeLongitude(double longitude);

	/**
	 * Get Drone type
	 * 
	 * @return dronetype drone type
	 */
	public String getDronetype();

	/**
	 * Change drone type
	 * 
	 * @param dronetype
	 *            drone type to change
	 */
	public void changeDronetype(String dronetype);
	
	/**Get drone image title
	 * 
	 * @return image
	 */
	public String getImagetitle();

	/**Change drone image title
	 * 
	 * @param imagetitle image title change
	 */
	public void changeImagetitle(String imagetitle);
	
	
	/**read and get drone specs 
	 * 
	 * @param specs Drone specs
	 * 
	 * @return Drone object
	 */
	public Drone GetSpecs(String specs);

}
