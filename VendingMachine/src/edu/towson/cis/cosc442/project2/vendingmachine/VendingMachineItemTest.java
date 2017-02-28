package edu.towson.cis.cosc442.project2.vendingmachine;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class VendingMachineItemTest {

	private VendingMachineItem item;
	
	@Before
	public void setUp() throws Exception {
		item = new VendingMachineItem("Dat item", 2.5);
	}

	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Tests the VendingMachineItem constructor
	 */
	@Test
	public void testVendingMachineItem() {
		assertEquals("Dat item", item.getName());
		assertEquals(2.5, item.getPrice(), 0.001);
	}

	/**
	 * Tests the getName method
	 */
	@Test
	public void testGetName() {
		assertEquals("Dat item", item.getName());
	}

	/**
	 * Tests the getPrice method
	 */
	@Test
	public void testGetPrice() {
		assertEquals(2.5, item.getPrice(), 0.001);
	}
	
	/**
	 * Testing that constructor throws exception if price < 0
	 */
	@Test(expected=VendingMachineException.class)
	public void vendingMachineItemLessThanZeroTest() {
		item = new VendingMachineItem("Test Item", -1.00);
	}

}
