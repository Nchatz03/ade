package Junit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.IOException;
import java.util.LinkedList;

import org.junit.Test;

import Area.Area;

/**
 * JUnit test for Area Object Class and interface
 * 
 * @author NXATZ
 *
 */
public class TestJUnitArea {

	static {
		System.out.println(
				"=====================================================================================================");
		System.out.println("                      ****** AREA TEST INITIALLIZING******");
		System.out.println(
				"=====================================================================================================");
		System.out.println("Area test1 = new Area(\"ToChange\",0,0);");
		System.out.println("Area test2 = new Area(\"List1\", 1.1, 1.2);");
		System.out.println("Area test3 = new Area(\"List2\", 2.1, 2.2);");
		System.out.println("LinkedList<Area> testlist = new LinkedList<Area>();");
		System.out.println(
				"=====================================================================================================");
		System.out.println();
		System.out.println();
	}

	Area test1 = new Area("ToChange",0,0);
	Area test2 = new Area("List1", 1.1, 1.2);
	Area test3 = new Area("List2", 2.1, 2.2);
	String result = null;
	LinkedList<Area> testlist = new LinkedList<Area>();

	/**
	 * Test method for {@link Area#Area(java.lang.String, double, double)}.
	 */
	@Test
	public final void testAreaStringDoubleDouble() {
		
		System.out.println(
				"=====================================================================================================");
		System.out.println("Testing 2 ");
		System.out.println(
				"=====================================================================================================");
		System.out.println("Area t1 = new Area(\"test\",2.2,2.2);");
		System.out.println("assertEquals(t1.getImagetitle(),\"test\" );");
		System.out.println();
		System.out.println();
		Area t1 = new Area("test",2.2,2.2);
		assertEquals(t1.getImagetitle(),"test" );
		
	}

	/**
	 * Test method for {@link Area#Area()}.
	 */
	@Test
	public final void testArea() {
		
		System.out.println(
				"=====================================================================================================");
		System.out.println("Testing 3 ");
		System.out.println(
				"=====================================================================================================");
		System.out.println("Area t1 = new Area();");
		System.out.println("assertNotNull(t1);");
		System.out.println();
		System.out.println();
		Area t1 = new Area();
		assertNotNull(t1);
	}

	/**
	 * Test method for {@link Area#getImagetitle()}.
	 */
	@Test
	public final void testGetImagetitle() {
		System.out.println(
				"=====================================================================================================");
		System.out.println("Testing 5 ");
		System.out.println(
				"=====================================================================================================");
		System.out.println("assertEquals(test1.getImagetitle(),\"ToChange\");");
		System.out.println();
		System.out.println();
	
		assertEquals(test1.getImagetitle(),"ToChange");
	}

	/**
	 * Test method for {@link Area#changeImagetitle(java.lang.String)}.
	 */
	@Test
	public final void testChangeImagetitle() {
		
		System.out.println(
				"=====================================================================================================");
		System.out.println("Testing 1 ");
		System.out.println(
				"=====================================================================================================");
		System.out.println("assertEquals(test1.getImagetitle(),\"ToChange\");");
		System.out.println("test1.changeImagetitle(\"Success\");");
		System.out.println("assertEquals(test1.getImagetitle(), \"Success\");");
		System.out.println();
		System.out.println();
	
		assertEquals(test1.getImagetitle(),"ToChange");
		test1.changeImagetitle("Success");
		assertEquals(test1.getImagetitle(), "Success");
		
	}

	/**
	 * Test method for {@link Area#areaReport(java.util.LinkedList,String)}.
	 */
	@Test
	public final void testAreaReport() {
		
		System.out.println(
				"=====================================================================================================");
		System.out.println("Testing 4 ");
		System.out.println(
				"=====================================================================================================");
		System.out.println("testlist.addFirst(test2);");
		System.out.println("testlist.addFirst(test3);");
		System.out.println("test1.areaReport(testlist);");
		System.out.println("!!!!  Check DroneReport.txt  !!!!");
		System.out.println();
		System.out.println();
		testlist.addFirst(test2);
		testlist.addFirst(test3);
		try {
			test1.areaReport(testlist,"dronereporttest.txt");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
