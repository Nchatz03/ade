package ImageSpecs;

public class DroneVariables {
	
	
	/**
	 * Width of sensor in millimeters (mm)
	 * 
	 */
	private double x_sensor;
	
	/**
	 * Height of sensor in millimeters (mm)
	 * 
	 */
	private double y_sensor;  
	
	/**
	 * X-axis gimbal angle in degrees (o)
	 * 
	 */
	private double x_gimbal_angle;
	
	/**
	 * Y-axis gimbal angle in degrees (o)
	 * 
	 */
	private double y_gimbal_angle;
	
	/**
	 *  Height of drone in meters (m)
	 * 
	 */
	private double altitude;
	
	/**
	 * Focal length of lens in millimeters (mm)
	 * 
	 */
	private double focallen;
	
	/**
	 * latitude of drone in degrees(o)
	 * 
	 */
	private double latitude;
	
	/**
	 * longitude of drone in degrees(o)
	 * 
	 */
	private double longitude;
	
	/**
	 * DroneVariables constructor
	 * <p>
	 * Constructor that create an object type of DroneVariables
	 * extracted from drone 
	 * 
	 * @param x_sensor       - 
	 * @param y_sensor       -
	 * @param x_gimbal_angle -
	 * @param y_gimbal_angle - 
	 * @param altitude       - 
	 * @param focallen       - 
	 * @param latitude       -
	 * @param longitude      - 
	 * 
	 */
	public DroneVariables(double x_sensor, double y_sensor, double x_gimbal_angle, double y_gimbal_angle , double altitude , double focallen , double latitude , double longitude) {

		this.x_sensor = x_sensor;
		this.y_sensor = y_sensor;
		this.x_gimbal_angle = x_gimbal_angle;
		this.y_gimbal_angle = y_gimbal_angle;
		this.altitude = altitude;
		this.focallen = focallen;
		this.latitude = latitude;
		this.longitude = longitude;
	}

	/**
	 * DroneVariables default constructor
	 * <p>
	 * Constructor that create an object type of DroneVariables
	 * 
	 */
	public DroneVariables() {
		
		x_sensor = 0;
		y_sensor = 0;
		x_gimbal_angle = 0;
		y_gimbal_angle = 0;
		altitude = 0;
		focallen = 0;
		latitude = 0.0;
		longitude = 0.0;

		
	}
	
	/**
	 * Get x_sensor.
	 * <p>
	 * Object Method that returns x_sensor
	 *
	 * @return x_sensor - 
	 */
	public double getX_sensor() {

		return x_sensor;
	}
	
	/**
	 * Get y_sensor.
	 * <p>
	 * Object Method that returns y_sensor
	 *
	 * @return y_sensor
	 */
	public double getY_sensor() {

		return y_sensor;
	}
	
	/**
	 * Get x_gimbal_angle.
	 * <p>
	 * Object Method that returns x_gimbal_angle
	 *
	 * @return x_gimbal_angle
	 */
	public double getX_gimbal_angle() {

		return x_gimbal_angle;
	}
	
	/**
	 * Get y_gimbal_angle.
	 * <p>
	 * Object Method that returns the y_gimbal_angle
	 *
	 * @return y_gimbal_angle
	 */
	public double getY_gimbal_angle() {

		return y_gimbal_angle;
	}
	
	/**
	 * Get altitude.
	 * <p>
	 * Object Method that returns the altitude
	 *
	 * @return altitude
	 */
	public double getAltitude() {

		return altitude;
	}
	
	/**
	 * Get focallen.
	 * <p>
	 * Object Method that returns the focallen
	 *
	 * @return focallen
	 */
	public double getFocallen() {

		return focallen;
	}
	
	/**
	 * Get latitude.
	 * <p>
	 * Object Method that returns the latitude
	 *
	 * @return latitude
	 */
	public double getLatitude() {

		return latitude;
	}
	
	/**
	 * Get longitude.
	 * <p>
	 * Object Method that returns the longitude
	 *
	 * @return longitude - longitude
	 */
	public double getLongitude() {

		return longitude;
	}
	
	/**
	 * Change x_sensor
	 * <p>
	 * Object Method that returns the changed x_sensor
	 *
	 * @param x_sensor - x sensor
	 */
	public void changeX_sensor(double x_sensor) {
		this.x_sensor = x_sensor;

	}
	
	
	/**
	 * Change y_sensor
	 * <p>
	 * Object Method that returns the changed y_sensor
	 *
	 * @param y_sensor - y_sensor
	 */
	public void changeY_sensor(double y_sensor) {
		this.y_sensor = y_sensor;

	}
	
	/**
	 * Change x_gimbal_angle
	 * <p>
	 * Object Method that returns the changed x_gimbal_angle
	 *
	 * @param x_gimbal_angle - x_gimbal_angle
	 */
	public void changeX_gimbal_angle(double x_gimbal_angle) {
		this.x_gimbal_angle = x_gimbal_angle;

	}
	
	/**
	 * Change y_gimbal_angle
	 * <p>
	 * Object Method that returns the changed y_gimbal_angle
	 *
	 * @param y_gimbal_angle - y_gimbal_angle
	 */
	public void changeY_gimbal_angle(double y_gimbal_angle) {
		this.y_gimbal_angle = y_gimbal_angle;

	}
	
	/**
	 * Change altitude.
	 * <p>
	 * Object Method that returns the changed altitude
	 *
	 * @param  altitude - altitude
	 */
	public void changeAltitude(double altitude) {
		this.altitude = altitude;

	}
	
	/**
	 * Change focallen
	 * <p>
	 * Object Method that returns the changed focallen
	 *
	 * @param  focallen - focallen
	 */
	public void changeWidth(double focallen) {
		this.focallen = focallen;

	}
	
	/**
	 * Change image latitude
	 * <p>
	 * Object Method that returns the changed latitude
	 *
	 * @param  latitude - latitude
	 */
	public void changeLatitude(double latitude) {
		this.latitude = latitude;

	}
	
	/**
	 * Change longitude
	 * <p>
	 * Object Method that returns the changed longitude
	 *
	 * @param  longitude -longitude
	 */
	public void changeLongitude(double longitude) {
		this.longitude = longitude;

	}
	
	


}
