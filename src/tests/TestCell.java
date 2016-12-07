package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import classes.Cell;
import classes.NegativeCoordinateException;
public class TestCell {
	
	Cell cell;
	
	@Before
	public void initialize() throws NegativeCoordinateException{
		cell = new Cell();
	}
	
	@Test
	public void testCellState(){
		assertFalse(cell.getState);
	}
}
