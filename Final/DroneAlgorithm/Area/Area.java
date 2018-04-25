package Area;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedList;

/**
 * Area Object where we submit the results of algorithm
 * 
 * @author NXATZ
 *
 */
public class Area implements AreaInterface {

	/**
	 * Image title
	 */
	private String imagetitle;
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
	 * @param imagetitle
	 *            image title
	 * 
	 * @param height
	 *            - real height in meters
	 * @param width
	 *            - real width in meters
	 */
	public Area(String imagetitle, double height, double width) {

		this.imagetitle = imagetitle;
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

	public String getImagetitle() {
		return imagetitle;
	}

	public void changeImagetitle(String imagetitle) {
		this.imagetitle = imagetitle;
	}

	public void areaReport(LinkedList<Area> arealist) throws IOException {

		FileWriter fileWriter = new FileWriter("DroneReport.txt");
		PrintWriter printWriter = new PrintWriter(fileWriter);
		int counter = arealist.size();

		printWriter.println("DRONE FOOTPRINT REPORT");
		printWriter.println("{");
		for (int i = 0; i < counter; i++) {

			Area temp = arealist.removeFirst();

			printWriter.println("[");
			printWriter.println("TITLE : " + temp.getImagetitle());
			printWriter.println("REAL_HEIGHT : " + temp.getHeight() + " Meters");
			printWriter.println("REAL_WIDTH : " + temp.getWidth() + " Meters");
			printWriter.println("]");

		}
		printWriter.println("}");
		printWriter.flush();
		printWriter.close();
	}

}
