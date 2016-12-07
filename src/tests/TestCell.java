package tests;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import org.junit.Before;
import org.junit.Test;

import classes.Cell;
import classes.NegativeCoordinateException;

public class TestCell {

	Cell cell;

	@Before
	public void setUp() {
		cell = new Cell();
	}

	@Test
	public void firstCellTest() {
		boolean isAlive = false;
		isAlive = cell.getState();

		if (isAlive == true) {
			assertTrue(isAlive);
		} else {
			assertFalse(isAlive);
		}
	}
	
	@Test (expected = NegativeCoordinateException.class)
	public void negativeCoordinateOfCell() throws NegativeCoordinateException{
		cell = new Cell(1,-3);
	}

}
