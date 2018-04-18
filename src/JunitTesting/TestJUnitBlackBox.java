/**
 * 
 */
package JunitTesting;

import static org.junit.Assert.*;

import org.junit.Test;

import blackbox.BlackBox;
import mapping.GlobalVar;

/**
 * @author NXATZ
 *
 */
public class TestJUnitBlackBox {

	static {
		System.out.println(
				"=====================================================================================================");
		System.out.println("INITIALLIZING TEST");
		System.out.println(
				"=====================================================================================================");
		System.out.println(
				"String[][] bba = new String[][] { { \"JPG\",\"image.JPG\", \"lat\", \"lon\", \"\", \"\", \"\"\" } };");
		System.out.println(
				"String[][] bba1 = new String[][] { { \"JPG\", \"image.JPG\", \"lat\", \"\", \"\", \"\", \"\" } };");
		System.out.println("BlackBox t3 = new BlackBox(GlobalVar.getBlackboxLength(),1);");
		System.out.println("BlackBox t1 = new BlackBox(GlobalVar.getBlackboxLength(),1);");
		System.out.println(
				"=====================================================================================================");
		System.out.println();
		System.out.println();
	}

	String[][] bba = new String[][] { { "JPG", "image.JPG", "lat", "lon", "", "", "" } };
	String[][] bba1 = new String[][] { { "JPG", "image.JPG", "lat", "", "", "", "" } };
	BlackBox t3 = new BlackBox(GlobalVar.getBlackboxLength(), 1);
	BlackBox t1 = new BlackBox(GlobalVar.getBlackboxLength(), 1);

	/**
	 * Test method for {@link blackbox.BlackBox#BlackBox(int, int)}.
	 */
	@Test
	public void testBlackBox() {

		System.out.println(
				"=====================================================================================================");
		System.out.println("Testing 2 ");
		System.out.println(
				"=====================================================================================================");
		System.out.println("BlackBox t2 = new BlackBox(1, GlobalVar.getBlackboxLength());");
		System.out.println("assertNotNull(t2);");
		BlackBox t2 = new BlackBox(1, GlobalVar.getBlackboxLength());
		assertNotNull(t2);
		System.out.println();
		System.out.println();
	}

	/**
	 * Test method for {@link blackbox.BlackBox#getBlackBox()}.
	 */
	@SuppressWarnings("deprecation")
	@Test
	public void testGetBlackBox() {

		System.out.println(
				"=====================================================================================================");
		System.out.println("Testing 4 ");
		System.out.println(
				"=====================================================================================================");
		System.out.println("assertNotEquals(t3.getBlackBox(), bba1);");

		assertNotEquals(t3.getBlackBox(), bba1);
		System.out.println();

		System.out.println("t3.setBlackBox(bba);");
		System.out.println("assertEquals(t3.getBlackBox(), bba);");
		t3.setBlackBox(bba);
		assertEquals(t3.getBlackBox(), bba);
		System.out.println();
		System.out.println();

	}

	/**
	 * Test method for {@link blackbox.BlackBox#getSpecifiedElement(int, int)}.
	 */
	@Test
	public void testGetSpecifiedElement() {

		System.out.println(
				"=====================================================================================================");
		System.out.println("Testing 3 ");
		System.out.println(
				"=====================================================================================================");
		System.out.println("assertNotEquals(t3.getSpecifiedElement(0, 0), \"JPG\");");

		assertNotEquals(t3.getSpecifiedElement(0, 0), "JPG");
		System.out.println();

		System.out.println("t3.setBlackBox(bba);");
		System.out.println("assertEquals(t3.getSpecifiedElement(0, 0), \"JPG\");");

		t3.setBlackBox(bba);
		assertEquals(t3.getSpecifiedElement(0, 0), "JPG");
		System.out.println();
		System.out.println();

	}

	/**
	 * Test method for
	 * {@link blackbox.BlackBox#setSpecifiedElement(java.lang.String, int, int)}.
	 */
	@Test
	public void testSetSpecifiedElement() {

		System.out.println(
				"=====================================================================================================");
		System.out.println("Testing 1 ");
		System.out.println(
				"=====================================================================================================");

		System.out.println("t3.setSpecifiedElement(\"JPEG\", 0, 0);");
		System.out.println("assertEquals(t3.getSpecifiedElement(0, 0), \"JPEG\");");

		t3.setSpecifiedElement("JPEG", 0, 0);
		assertEquals(t3.getSpecifiedElement(0, 0), "JPEG");

		System.out.println();
		System.out.println();
	}

}
