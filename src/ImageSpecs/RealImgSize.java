package ImageSpecs;


public class RealImgSize {
	
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
	 * Constructor that create an object type of Real_Image_Size
	 * for the real dimension cover by photo
	 * 
	 * @param height  - real height in meters 
	 * @param width   - real width in meters
	 */
	public RealImgSize(double height, double width) {

		this.height = height;
		this.width = width;
	}

	/**
	 * Real_Image_Size default constructor
	 * <p>
	 * Constructor that create an object type of Real_Image_Size
	 * 
	 */
	public RealImgSize() {

		height = 0.0;
		width = 0.0;
	}
	
	/**
	 * Get Image height.
	 * <p>
	 * Object Method that returns the real
	 * image height
	 *
	 * @return height - The real height in meters
	 */
	public double getHeight() {

		return height;
	}
	
	/**
	 * Get Image width.
	 * <p>
	 * Object Method that returns the real
	 * image width
	 *
	 * @return width - The real width in meters
	 */
	public double getWidth() {

		return width;
	}

	/**
	 * Change image height.
	 * <p>
	 * Object Method that returns the changed height
	 *
	 * @param  height - The change
	 * @return 
	 */
	public void changeHeight(double height) {
		this.height = height;

	}
	
	/**
	 * Change image width.
	 * <p>
	 * Object Method that returns the changed width
	 *
	 * @param  width - The change
	 */
	public void changeWidth(double width) {
		this.width = width;

	}
	
	
	

}
