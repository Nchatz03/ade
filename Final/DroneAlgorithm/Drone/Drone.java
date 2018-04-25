/*
 * 
 */
package Drone;

import java.util.StringTokenizer;

/**
 * This is the Object where we submit all known drone variables can be taken
 * from an image shot
 * 
 * @author NXATZ
 *
 */
public class Drone implements DroneInterface {

	/**
	 * Drone type
	 * 
	 */
	private String dronetype;

	/**
	 * Image title
	 * 
	 */
	private String imagetitle;

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
	 * Height of drone in meters (m)
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
	 * Drone constructor
	 * <p>
	 * Constructor that create an object type of Drone extracted from drone
	 * 
	 * @param imagetitle image title
	 * 
	 * @param dronetype drone model
	 * 
	 * @param x_sensor drone model x sensor
	 *            
	 * @param y_sensor drone model y sensor
	 *            
	 * @param x_gimbal_angle x gimbal angle of picture
	 *            
	 * @param y_gimbal_angle y gimbal angle of picture
	 *            
	 * @param altitude altitude of drone 
	 *            
	 * @param focallen focal length of camera 
	 *            
	 * @param latitude latitude 
	 *            
	 * @param longitude longitude
	 *            
	 * 
	 */
	public Drone(String imagetitle, String dronetype, double x_sensor, double y_sensor, double x_gimbal_angle,
			double y_gimbal_angle, double altitude, double focallen, double latitude, double longitude) {

		this.imagetitle = imagetitle;
		this.dronetype = dronetype;
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
	 * Drone default constructor
	 * <p>
	 * Constructor that create an object type of Drone
	 * 
	 */
	public Drone() {

		imagetitle = "";
		dronetype = "";
		x_sensor = 0;
		y_sensor = 0;
		x_gimbal_angle = 0;
		y_gimbal_angle = 0;
		altitude = 0;
		focallen = 0;
		latitude = 0.0;
		longitude = 0.0;

	}

	public double getX_sensor() {

		return x_sensor;
	}

	public double getY_sensor() {

		return y_sensor;
	}

	public double getX_gimbal_angle() {

		return x_gimbal_angle;
	}

	public double getY_gimbal_angle() {

		return y_gimbal_angle;
	}

	public double getAltitude() {

		return altitude;
	}

	public double getFocallen() {

		return focallen;
	}

	public double getLatitude() {

		return latitude;
	}

	public double getLongitude() {

		return longitude;
	}

	public void changeX_sensor(double x_sensor) {
		this.x_sensor = x_sensor;

	}

	public void changeY_sensor(double y_sensor) {
		this.y_sensor = y_sensor;

	}

	public void changeX_gimbal_angle(double x_gimbal_angle) {
		this.x_gimbal_angle = x_gimbal_angle;

	}

	public void changeY_gimbal_angle(double y_gimbal_angle) {
		this.y_gimbal_angle = y_gimbal_angle;

	}

	public void changeAltitude(double altitude) {
		this.altitude = altitude;

	}

	public void changeWidth(double focallen) {
		this.focallen = focallen;

	}

	public void changeLatitude(double latitude) {
		this.latitude = latitude;

	}

	public void changeLongitude(double longitude) {
		this.longitude = longitude;

	}

	public String getDronetype() {
		return dronetype;
	}

	public void changeDronetype(String dronetype) {
		this.dronetype = dronetype;
	}

	public String getImagetitle() {
		return imagetitle;
	}

	public void changeImagetitle(String imagetitle) {
		this.imagetitle = imagetitle;
	}

	public Drone GetSpecs(String specs) {

		StringTokenizer st = new StringTokenizer(specs, " ");
		Drone retval = new Drone();

		retval.imagetitle = st.nextToken();
		retval.latitude = Double.parseDouble(st.nextToken());
		retval.longitude = Double.parseDouble(st.nextToken());
		retval.altitude = Double.parseDouble(st.nextToken());
		retval.x_gimbal_angle = Double.parseDouble(st.nextToken());
		retval.y_gimbal_angle = Double.parseDouble(st.nextToken());
		retval.dronetype = st.nextToken();
		retval.x_sensor = Double.parseDouble(st.nextToken());
		retval.y_sensor = Double.parseDouble(st.nextToken());
		retval.focallen = Double.parseDouble(st.nextToken());

		return retval;
	}

}
