
package DroneImageAlgorithm;

/**
 * Area Object where we submit the results of algorithm
 * 
 * @author NXATZ
 *
 */
public class Area implements AreaInterface {

	/**
	 * Real height Dimension of Image in meters
	 */
	private double height;
	/**
	 * Real width Dimension of Image in meters
	 */
	private double width;

	/**
	 * Real_Image_Size constructor
	 * <p>
	 * Constructor that create an object type of Real_Image_Size for the real
	 * dimension cover by photo
	 * 
	 * @param height
	 *            - real height in meters
	 * @param width
	 *            - real width in meters
	 */
	public Area(double height, double width) {

		this.height = height;
		this.width = width;
	}

	/**
	 * Real_Image_Size default constructor
	 * <p>
	 * Constructor that create an object type of Real_Image_Size
	 * 
	 */
	public Area() {

		height = 0.0;
		width = 0.0;
	}

	public double getHeight() {

		return height;
	}

	public double getWidth() {

		return width;
	}

	public void changeHeight(double height) {
		this.height = height;

	}

	public void changeWidth(double width) {
		this.width = width;

	}

}
