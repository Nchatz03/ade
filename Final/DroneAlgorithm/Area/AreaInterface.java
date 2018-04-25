package Area;

import java.io.IOException;
import java.util.LinkedList;

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


	/**
	 * Get Image title.
	 * <p>
	 * Object Method that returns the real image title
	 *
	 * @return width - The real title 
	 */
	public String getImagetitle();

	/**
	 * Change image title.
	 * <p>
	 * Object Method that returns the changed title
	 * 
	 * @param imagetitle
	 *            image title
	 */
	public void changeImagetitle(String imagetitle);
	
	/**Print in a file the report 
	 * 
	 * @param arealist area list
	 * @throws IOException IO exception
	 */
	public void areaReport(LinkedList<Area> arealist) throws IOException;

}
