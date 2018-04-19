/**
 * 
 */
package JunitTesting;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Test;

import imgRGB24.ImgRGB24;

/**
 * @author NXATZ
 *
 */
public class TestJUnitImgRGB24 {
	static {
		System.out.println(
				"=====================================================================================================");
		System.out.println("                     ****** IMGRGB24 TEST INITIALLIZING******");
		System.out.println(
				"=====================================================================================================");
		System.out.println("ImgRGB24 image = new ImgRGB24();");
		System.out.println(
				"String [][] colorarray = new String[][] {{\"0000FF\",\"FFFFFF\",\"0000\",\"FF0000\",\"00FF00\",\"0000\"}};");
		System.out.println("ImgRGB24 image2 = new ImgRGB24(\"424D\", \"4600 0000\", \"0000\", \"0000\", \"3600 0000\", "
				+ "\"2800 0000\", \"0200 0000\", \"0200 0000\", \"0100\", \"1800\", \"0000 0000\", \"1000 0000\", \"130B 0000\","
				+ " \"130B 0000\", \"0000 0000\", \"0000 0000\",colorarray);");
		System.out.println("");
		System.out.println(
				"=====================================================================================================");
		System.out.println();
		System.out.println();
	}

	ImgRGB24 image = new ImgRGB24();

	String[][] colorarray = new String[][] { { "0000FF", "FFFFFF", "0000", "FF0000", "00FF00", "0000" } };
	ImgRGB24 image2 = new ImgRGB24("424D", "4600 0000", "0000", "0000", "3600 0000", "2800 0000", "0200 0000",
			"0200 0000", "0100", "1800", "0000 0000", "1000 0000", "130B 0000", "130B 0000", "0000 0000", "0000 0000",
			colorarray);

	/**
	 * Test method for {@link imgRGB24.ImgRGB24#ImgRGB24()}.
	 */
	@Test
	public final void testImgRGB24() {

		System.out.println(
				"=====================================================================================================");
		System.out.println("Testing 18 ");
		System.out.println(
				"=====================================================================================================");
		System.out.println("ImgRGB24 im = new ImgRGB24();");
		System.out.println("assertNotNull(im);");
		ImgRGB24 im = new ImgRGB24();
		assertNotNull(im);
		System.out.println();
		System.out.println();
	}


	/**
	 * Test method for
	 * {@link imgRGB24.ImgRGB24#modifySignature(java.lang.String)}.
	 */
	@Test
	public final void testModifySignature() {
		System.out.println(
				"=====================================================================================================");
		System.out.println("Testing 16 ");
		System.out.println(
				"=====================================================================================================");
		System.out.println("assertNull(image.getSignature());");
		System.out.println("image.modifySignature(\"success\");");
		System.out.println("assertNotNull(image.getSignature());");
		System.out.println("assertEquals(image.getSignature(), \"success\");");

		assertNull(image.getSignature());
		image.modifySignature("success");
		assertNotNull(image.getSignature());
		assertEquals(image.getSignature(), "success");

		System.out.println();
		System.out.println();
	}

	/**
	 * Test method for {@link imgRGB24.ImgRGB24#modifySize(java.lang.String)}.
	 */
	@Test
	public final void testModifySize() {
		System.out.println(
				"=====================================================================================================");
		System.out.println("Testing 22 ");
		System.out.println(
				"=====================================================================================================");
		System.out.println("assertNull(image.getSize());");
		System.out.println("image.modifySize(\"success\");");
		System.out.println("assertNotNull(image.getSize());");
		System.out.println("assertEquals(image.getSize(),\"success\");");

		assertNull(image.getSize());
		image.modifySize("success");
		assertNotNull(image.getSize());
		assertEquals(image.getSize(), "success");

		System.out.println();
		System.out.println();
	}

	/**
	 * Test method for
	 * {@link imgRGB24.ImgRGB24#modifyAppSpec1(java.lang.String)}.
	 */
	@Test
	public final void testModifyAppSpec1() {
		System.out.println(
				"=====================================================================================================");
		System.out.println("Testing 20 ");
		System.out.println(
				"=====================================================================================================");
		System.out.println("assertNull(image.getAppSpec1());");
		System.out.println("image.modifyAppSpec1(\"success\");");
		System.out.println("assertNotNull(image.getAppSpec1());");
		System.out.println("assertEquals(image.getAppSpec1(),\"success\");");

		assertNull(image.getAppSpec1());
		image.modifyAppSpec1("success");
		assertNotNull(image.getAppSpec1());
		assertEquals(image.getAppSpec1(), "success");

		System.out.println();
		System.out.println();
	}

	/**
	 * Test method for
	 * {@link imgRGB24.ImgRGB24#modifyAppSpec2(java.lang.String)}.
	 */
	@Test
	public final void testModifyAppSpec2() {
		System.out.println(
				"=====================================================================================================");
		System.out.println("Testing 21 ");
		System.out.println(
				"=====================================================================================================");
		System.out.println("assertNull(image.getAppSpec2());");
		System.out.println("image.modifyAppSpec2(\"success\");");
		System.out.println("assertNotNull(image.getAppSpec2());");
		System.out.println("assertEquals(image.getAppSpec2(),\"success\");");

		assertNull(image.getAppSpec2());
		image.modifyAppSpec2("success");
		assertNotNull(image.getAppSpec2());
		assertEquals(image.getAppSpec2(), "success");

		System.out.println();
		System.out.println();
	}

	/**
	 * Test method for {@link imgRGB24.ImgRGB24#modifyOffset(java.lang.String)}.
	 */
	@Test
	public final void testModifyOffset() {
		System.out.println(
				"=====================================================================================================");
		System.out.println("Testing 25 ");
		System.out.println(
				"=====================================================================================================");
		System.out.println("assertNull(image.getOffset());");
		System.out.println("image.modifyOffset(\"success\");");
		System.out.println("assertNotNull(image.getOffset());");
		System.out.println("assertEquals(image.getOffset(), \"success\");");

		assertNull(image.getOffset());
		image.modifyOffset("success");
		assertNotNull(image.getOffset());
		assertEquals(image.getOffset(), "success");

		System.out.println();
		System.out.println();
	}

	/**
	 * Test method for
	 * {@link imgRGB24.ImgRGB24#modifyDIBsize(java.lang.String)}.
	 */
	@Test
	public final void testModifyDIBsize() {
		System.out.println(
				"=====================================================================================================");
		System.out.println("Testing 31 ");
		System.out.println(
				"=====================================================================================================");
		System.out.println("assertNull(image.getDIBsize());");
		System.out.println("image.modifyDIBsize(\"success\");");
		System.out.println("assertNotNull(image.getDIBsize());");
		System.out.println("assertEquals(image.getDIBsize(), \"success\");");

		assertNull(image.getDIBsize());
		image.modifyDIBsize("success");
		assertNotNull(image.getDIBsize());
		assertEquals(image.getDIBsize(), "success");

		System.out.println();
		System.out.println();
	}

	/**
	 * Test method for {@link imgRGB24.ImgRGB24#modifyWidth(java.lang.String)}.
	 */
	@Test
	public final void testModifyWidth() {
		System.out.println(
				"=====================================================================================================");
		System.out.println("Testing 4 ");
		System.out.println(
				"=====================================================================================================");
		System.out.println("assertNull(image.getWidth());");
		System.out.println("image.modifyWidth(\"success\");");
		System.out.println("assertNotNull(image.getWidth());");
		System.out.println("assertEquals(image.getWidth(), \"success\");");

		assertNull(image.getWidth());
		image.modifyWidth("success");
		assertNotNull(image.getWidth());
		assertEquals(image.getWidth(), "success");

		System.out.println();
		System.out.println();
	}

	/**
	 * Test method for {@link imgRGB24.ImgRGB24#modifyHeight(java.lang.String)}.
	 */
	@Test
	public final void testModifyHeight() {
		System.out.println(
				"=====================================================================================================");
		System.out.println("Testing 23 ");
		System.out.println(
				"=====================================================================================================");
		System.out.println("assertNull(image.getHeight());");
		System.out.println("image.modifyHeight(\"success\");");
		System.out.println("assertNotNull(image.getHeight());");
		System.out.println("assertEquals(image.getHeight(),\"success\");");

		assertNull(image.getHeight());
		image.modifyHeight("success");
		assertNotNull(image.getHeight());
		assertEquals(image.getHeight(), "success");

		System.out.println();
		System.out.println();
	}

	/**
	 * Test method for
	 * {@link imgRGB24.ImgRGB24#modifyNumofPlanes(java.lang.String)}.
	 */
	@Test
	public final void testModifyNumofPlanes() {
		System.out.println(
				"=====================================================================================================");
		System.out.println("Testing 13 ");
		System.out.println(
				"=====================================================================================================");
		System.out.println("assertNull(image.getNumofPlanes());");
		System.out.println("image.modifyNumofPlanes(\"success\");");
		System.out.println("assertNotNull(image.getNumofPlanes());");
		System.out.println("assertEquals(image.getNumofPlanes(),\"success\");");

		assertNull(image.getNumofPlanes());
		image.modifyNumofPlanes("success");
		assertNotNull(image.getNumofPlanes());
		assertEquals(image.getNumofPlanes(), "success");

		System.out.println();
		System.out.println();
	}

	/**
	 * Test method for
	 * {@link imgRGB24.ImgRGB24#modifyBitperPx(java.lang.String)}.
	 */
	@Test
	public final void testModifyBitperPx() {
		System.out.println(
				"=====================================================================================================");
		System.out.println("Testing 19 ");
		System.out.println(
				"=====================================================================================================");
		System.out.println("assertNull(image.getBitperPx());");
		System.out.println("image.modifyBitperPx(\"success\");");
		System.out.println("assertNotNull(image.getBitperPx());");
		System.out.println("assertEquals(image.getBitperPx(),\"success\");");

		assertNull(image.getBitperPx());
		image.modifyBitperPx("success");
		assertNotNull(image.getBitperPx());
		assertEquals(image.getBitperPx(), "success");

		System.out.println();
		System.out.println();
	}

	/**
	 * Test method for
	 * {@link imgRGB24.ImgRGB24#modifyCompressionArray(java.lang.String)}.
	 */
	@Test
	public final void testModifyCompressionArray() {
		System.out.println(
				"=====================================================================================================");
		System.out.println("Testing 29");
		System.out.println(
				"=====================================================================================================");
		System.out.println("assertNull(image.getCompressionArray());");
		System.out.println("image.modifyCompressionArray(\"success\");");
		System.out.println("assertNotNull(image.getCompressionArray());");
		System.out.println("assertEquals(image.getCompressionArray(),\"success\");");

		assertNull(image.getCompressionArray());
		image.modifyCompressionArray("success");
		assertNotNull(image.getCompressionArray());
		assertEquals(image.getCompressionArray(), "success");

		System.out.println();
		System.out.println();
	}

	/**
	 * Test method for
	 * {@link imgRGB24.ImgRGB24#modifyRawBitmapData(java.lang.String)}.
	 */
	@Test
	public final void testModifyRawBitmapData() {
		System.out.println(
				"=====================================================================================================");
		System.out.println("Testing 2 ");
		System.out.println(
				"=====================================================================================================");
		System.out.println("assertNull(image.getRawBitmapData());");
		System.out.println("image.modifyRawBitmapData(\"success\");");
		System.out.println("assertNotNull(image.getRawBitmapData());");
		System.out.println("assertEquals(image.getRawBitmapData(),\"success\");");

		assertNull(image.getRawBitmapData());
		image.modifyRawBitmapData("success");
		assertNotNull(image.getRawBitmapData());
		assertEquals(image.getRawBitmapData(), "success");

		System.out.println();
		System.out.println();
	}

	/**
	 * Test method for
	 * {@link imgRGB24.ImgRGB24#modifyPrintResolutionWidth(java.lang.String)}.
	 */
	@Test
	public final void testModifyPrintResolutionWidth() {
		System.out.println(
				"=====================================================================================================");
		System.out.println("Testing 12 ");
		System.out.println(
				"=====================================================================================================");
		System.out.println("assertNull(image.getPrintResolutionWidth());");
		System.out.println("image.modifyPrintResolutionWidth(\"success\");");
		System.out.println("assertNotNull(image.getPrintResolutionWidth());");
		System.out.println("assertEquals(image.getPrintResolutionWidth(), \"success\");");

		assertNull(image.getPrintResolutionWidth());
		image.modifyPrintResolutionWidth("success");
		assertNotNull(image.getPrintResolutionWidth());
		assertEquals(image.getPrintResolutionWidth(), "success");

		System.out.println();
		System.out.println();
	}

	/**
	 * Test method for
	 * {@link imgRGB24.ImgRGB24#modifyPrintResolutionHeight(java.lang.String)}.
	 */
	@Test
	public final void testModifyPrintResolutionHeight() {
		System.out.println(
				"=====================================================================================================");
		System.out.println("Testing 10 ");
		System.out.println(
				"=====================================================================================================");
		System.out.println("assertNull(image.getPrintResolutionHeight());");
		System.out.println("image.modifyPrintResolutionHeight(\"success\");");
		System.out.println("assertNotNull(image.getPrintResolutionHeight());");
		System.out.println("assertEquals(image.getPrintResolutionHeight(), \"success\");");

		assertNull(image.getPrintResolutionHeight());
		image.modifyPrintResolutionHeight("success");
		assertNotNull(image.getPrintResolutionHeight());
		assertEquals(image.getPrintResolutionHeight(), "success");

		System.out.println();
		System.out.println();

	}

	/**
	 * Test method for
	 * {@link imgRGB24.ImgRGB24#modifyNumOfColorsPallete(java.lang.String)}.
	 */
	@Test
	public final void testModifyNumOfColorsPallete() {

		System.out.println(
				"=====================================================================================================");
		System.out.println("Testing 1 ");
		System.out.println(
				"=====================================================================================================");
		System.out.println("assertNull(image.getNumOfColorsPallete());");
		System.out.println("image.modifyNumOfColorsPallete(\"success\");");
		System.out.println("assertNotNull(image.getNumOfColorsPallete());");
		System.out.println("assertEquals(image.getNumOfColorsPallete(),\"success\");");

		assertNull(image.getNumOfColorsPallete());
		image.modifyNumOfColorsPallete("success");
		assertNotNull(image.getNumOfColorsPallete());
		assertEquals(image.getNumOfColorsPallete(), "success");

		System.out.println();
		System.out.println();

	}

	/**
	 * Test method for
	 * {@link imgRGB24.ImgRGB24#modifyImportantColors(java.lang.String)}.
	 */
	@Test
	public final void testModifyImportantColors() {
		System.out.println(
				"=====================================================================================================");
		System.out.println("Testing 27 ");
		System.out.println(
				"=====================================================================================================");
		System.out.println("assertNull(image.getImportantColors());");
		System.out.println("image.modifyImportantColors(\"success\");");
		System.out.println("assertNotNull(image.getImportantColors());");
		System.out.println("assertEquals(image.getImportantColors(),\"success\");");

		assertNull(image.getImportantColors());
		image.modifyImportantColors("success");
		assertNotNull(image.getImportantColors());
		assertEquals(image.getImportantColors(), "success");

		System.out.println();
		System.out.println();
	}

	/**
	 * Test method for {@link imgRGB24.ImgRGB24#getSignature()}.
	 */
	@Test
	public final void testGetSignature() {
		System.out.println(
				"=====================================================================================================");
		System.out.println("Testing 33 ");
		System.out.println(
				"=====================================================================================================");
		System.out.println("assertNull(image.getSignature());");
		System.out.println("assertEquals(image2.getSignature(), \"424D\");");

		assertNull(image.getSignature());
		assertEquals(image2.getSignature(), "424D");

		System.out.println();
		System.out.println();
	}

	/**
	 * Test method for {@link imgRGB24.ImgRGB24#getSize()}.
	 */
	@Test
	public final void testGetSize() {
		System.out.println(
				"=====================================================================================================");
		System.out.println("Testing 14 ");
		System.out.println(
				"=====================================================================================================");
		System.out.println("assertNull(image.getSize());");
		System.out.println("assertEquals(image2.getSize(), \"4600 0000\");");

		assertNull(image.getSize());
		assertEquals(image2.getSize(), "4600 0000");

		System.out.println();
		System.out.println();
	}

	/**
	 * Test method for {@link imgRGB24.ImgRGB24#getAppSpec1()}.
	 */
	@Test
	public final void testGetAppSpec1() {
		System.out.println(
				"=====================================================================================================");
		System.out.println("Testing 6 ");
		System.out.println(
				"=====================================================================================================");
		System.out.println("assertNull(image.getAppSpec1());");
		System.out.println("assertEquals(image2.getAppSpec1(), \"0000\");");

		assertNull(image.getAppSpec1());
		assertEquals(image2.getAppSpec1(), "0000");

		System.out.println();
		System.out.println();
	}

	/**
	 * Test method for {@link imgRGB24.ImgRGB24#getAppSpec2()}.
	 */
	@Test
	public final void testGetAppSpec2() {
		System.out.println(
				"=====================================================================================================");
		System.out.println("Testing 7 ");
		System.out.println(
				"=====================================================================================================");
		System.out.println("assertNull(image.getAppSpec2());");
		System.out.println("assertEquals(image2.getAppSpec2(), \"0000\");");

		assertNull(image.getAppSpec2());
		assertEquals(image2.getAppSpec2(), "0000");

		System.out.println();
		System.out.println();
	}

	/**
	 * Test method for {@link imgRGB24.ImgRGB24#getOffset()}.
	 */
	@Test
	public final void testGetOffset() {
		System.out.println(
				"=====================================================================================================");
		System.out.println("Testing 28 ");
		System.out.println(
				"=====================================================================================================");
		System.out.println("assertNull(image.getOffset());");
		System.out.println("assertEquals(image2.getOffset(), \"3600 0000\");");

		assertNull(image.getOffset());
		assertEquals(image2.getOffset(), "3600 0000");

		System.out.println();
		System.out.println();
	}

	/**
	 * Test method for {@link imgRGB24.ImgRGB24#getDIBsize()}.
	 */
	@Test
	public final void testGetDIBsize() {
		System.out.println(
				"=====================================================================================================");
		System.out.println("Testing 24 ");
		System.out.println(
				"=====================================================================================================");
		System.out.println("assertNull(image.getDIBsize());");
		System.out.println("assertEquals(image2.getDIBsize(), \"2800 0000\");");

		assertNull(image.getDIBsize());
		assertEquals(image2.getDIBsize(), "2800 0000");

		System.out.println();
		System.out.println();
	}

	/**
	 * Test method for {@link imgRGB24.ImgRGB24#getWidth()}.
	 */
	@Test
	public final void testGetWidth() {
		System.out.println(
				"=====================================================================================================");
		System.out.println("Testing 8 ");
		System.out.println(
				"=====================================================================================================");
		System.out.println("assertNull(image.getWidth());");
		System.out.println("assertEquals(image2.getWidth(), \"0200 0000\");");

		assertNull(image.getWidth());
		assertEquals(image2.getWidth(), "0200 0000");

		System.out.println();
		System.out.println();
	}

	/**
	 * Test method for {@link imgRGB24.ImgRGB24#getHeight()}.
	 */
	@Test
	public final void testGetHeight() {
		System.out.println(
				"=====================================================================================================");
		System.out.println("Testing 26 ");
		System.out.println(
				"=====================================================================================================");
		System.out.println("assertNull(image.getHeight());");
		System.out.println("assertEquals(image2.getHeight(), \"0200 0000\");");

		assertNull(image.getHeight());
		assertEquals(image2.getHeight(), "0200 0000");

		System.out.println();
		System.out.println();
	}

	/**
	 * Test method for {@link imgRGB24.ImgRGB24#getNumofPlanes()}.
	 */
	@Test
	public final void testGetNumofPlanes() {
		System.out.println(
				"=====================================================================================================");
		System.out.println("Testing 17 ");
		System.out.println(
				"=====================================================================================================");
		System.out.println("assertNull(image.getNumofPlanes());");
		System.out.println("assertEquals(image2.getNumofPlanes(), \"0100\");");

		assertNull(image.getNumofPlanes());
		assertEquals(image2.getNumofPlanes(), "0100");

		System.out.println();
		System.out.println();
	}

	/**
	 * Test method for {@link imgRGB24.ImgRGB24#getBitperPx()}.
	 */
	@Test
	public final void testGetBitperPx() {
		System.out.println(
				"=====================================================================================================");
		System.out.println("Testing 5 ");
		System.out.println(
				"=====================================================================================================");
		System.out.println("assertNull(image.getBitperPx());");
		System.out.println("assertEquals(image2.getBitperPx(), \"1800\");");

		assertNull(image.getBitperPx());
		assertEquals(image2.getBitperPx(), "1800");

		System.out.println();
		System.out.println();
	}

	/**
	 * Test method for {@link imgRGB24.ImgRGB24#getCompressionArray()}.
	 */
	@Test
	public final void testGetCompressionArray() {
		System.out.println(
				"=====================================================================================================");
		System.out.println("Testing 11 ");
		System.out.println(
				"=====================================================================================================");
		System.out.println("		assertNull(image.getCompressionArray());");
		System.out.println("assertEquals(image2.getCompressionArray(), \"0000 0000\");");

		assertNull(image.getCompressionArray());
		assertEquals(image2.getCompressionArray(), "0000 0000");

		System.out.println();
		System.out.println();
	}

	/**
	 * Test method for {@link imgRGB24.ImgRGB24#getRawBitmapData()}.
	 */
	@Test
	public final void testGetRawBitmapData() {
		System.out.println(
				"=====================================================================================================");
		System.out.println("Testing 15 ");
		System.out.println(
				"=====================================================================================================");
		System.out.println("assertNull(image.getRawBitmapData());");
		System.out.println("assertEquals(image2.getRawBitmapData(), \"1000 0000\");");

		assertNull(image.getRawBitmapData());
		assertEquals(image2.getRawBitmapData(), "1000 0000");

		System.out.println();
		System.out.println();
	}

	/**
	 * Test method for {@link imgRGB24.ImgRGB24#getPrintResolutionWidth()}.
	 */
	@Test
	public final void testGetPrintResolutionWidth() {
		System.out.println(
				"=====================================================================================================");
		System.out.println("Testing 30 ");
		System.out.println(
				"=====================================================================================================");
		System.out.println("assertNull(image.getPrintResolutionWidth());");
		System.out.println("assertEquals(image2.getPrintResolutionWidth(), \"130B 0000\");");

		assertNull(image.getPrintResolutionWidth());
		assertEquals(image2.getPrintResolutionWidth(), "130B 0000");

		System.out.println();
		System.out.println();
	}

	/**
	 * Test method for {@link imgRGB24.ImgRGB24#getPrintResolutionHeight()}.
	 */
	@Test
	public final void testGetPrintResolutionHeight() {
		System.out.println(
				"=====================================================================================================");
		System.out.println("Testing 9 ");
		System.out.println(
				"=====================================================================================================");
		System.out.println("assertNull(image.getPrintResolutionHeight());");
		System.out.println("assertEquals(image2.getPrintResolutionHeight(), \"130B 0000\");");

		assertNull(image.getPrintResolutionHeight());
		assertEquals(image2.getPrintResolutionHeight(), "130B 0000");

		System.out.println();
		System.out.println();
	}

	/**
	 * Test method for {@link imgRGB24.ImgRGB24#getNumOfColorsPallete()}.
	 */
	@Test
	public final void testGetNumOfColorsPallete() {
		System.out.println(
				"=====================================================================================================");
		System.out.println("Testing 3 ");
		System.out.println(
				"=====================================================================================================");
		System.out.println("assertNull(image.getNumOfColorsPallete());");
		System.out.println("assertEquals(image2.getNumOfColorsPallete(),\"0000 0000\");");

		assertNull(image.getNumOfColorsPallete());
		assertEquals(image2.getNumOfColorsPallete(), "0000 0000");

		System.out.println();
		System.out.println();
	}

	/**
	 * Test method for {@link imgRGB24.ImgRGB24#getImportantColors()}.
	 */
	@Test
	public final void testGetImportantColors() {
		System.out.println(
				"=====================================================================================================");
		System.out.println("Testing 32 ");
		System.out.println(
				"=====================================================================================================");
		System.out.println("assertNull(image.getImportantColors());");
		System.out.println("assertEquals(image2.getImportantColors(),\"0000 0000\");");

		assertNull(image.getImportantColors());
		assertEquals(image2.getImportantColors(), "0000 0000");

		System.out.println();
		System.out.println();
	}

}
