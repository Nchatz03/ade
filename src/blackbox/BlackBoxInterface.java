package blackbox;

import java.io.IOException;

/**
 * @author NXATZ
 *
 */
public interface BlackBoxInterface {

	/**
	 * Get the new black box array
	 * 
	 * @return the blackBox
	 */
	String[][] getBlackBox();

	/**
	 * Set update a new black box array
	 *
	 * @param blackBox
	 *            the blackBox to set
	 */
	public void setBlackBox(String[][] blackBox);

	/**
	 * Retrieve a specified position value
	 * 
	 * @param Row
	 *            the row
	 * @param Col
	 *            the column
	 * 
	 * @return the value of the position
	 */
	public String getSpecifiedElement(int Row, int Col);

	/**
	 * Modified a specified position value
	 * 
	 * @param element
	 *            the element to change
	 * @param Row
	 *            the row
	 * @param Col
	 *            the column
	 */
	public void setSpecifiedElement(String element, int Row, int Col);

	/**
	 * Retrieve the table with flight's data BMP title,latitude and longitude
	 * coordinates
	 * 
	 * @param path
	 *            path to flight data log file
	 * @param num
	 *            number of images taken from drone
	 */
	public void BlackBoxReader(String path, int num);
	
	/**
	 * @param fbba black box
	 * @throws IOException File Exception
	 * 
	 */
	public void BlackBoxFileWriter(BlackBox fbba) throws IOException;
	
}
