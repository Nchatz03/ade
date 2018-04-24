package DroneImageAlgorithm;

/**
 * Area Object Interface
 * 
 * @author NXATZ
 *
 */
public interface AreaInterface {
	/**
	 * Get Image height.
	 * <p>
	 * Object Method that returns the real image height
	 *
	 * @return height - The real height in meters
	 */
	public double getHeight();

	/**
	 * Get Image width.
	 * <p>
	 * Object Method that returns the real image width
	 *
	 * @return width - The real width in meters
	 */
	public double getWidth();

	/**
	 * Change image height.
	 * <p>
	 * Object Method that returns the changed height
	 *
	 * @param height
	 *            - The change
	 */
	public void changeHeight(double height);

	/**
	 * Change image width.
	 * <p>
	 * Object Method that returns the changed width
	 *
	 * @param width
	 *            - The change
	 */
	public void changeWidth(double width);


}
