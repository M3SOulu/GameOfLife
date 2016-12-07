package tests;

import static org.junit.Assert.*;
import org.junit.Test;

import classes.Cell;
import classes.NegativeCoordinateException;
public class TestCell {
	
	
	@Test
	public void cellAliveTest() throws NegativeCoordinateException{
		assertEquals(true, new Cell( true ).isAlive());
	}
	
	@Test
	public void cellNotAliveTest() throws NegativeCoordinateException{
		assertEquals(false, new Cell( false ).isAlive());
	}
	
	@Test
	public void getXYCell() throws NegativeCoordinateException{
		Cell cell = new Cell(alive, 3, 2);
		assertEquals(3, cell.getX());
		assertEquals(2. cell.getY());
	}
	
}
