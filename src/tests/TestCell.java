package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import classes.Cell;
import classes.Grid;
import classes.NegativeCoordinateException;
public class TestCell {
	
	Cell cell;
	@Before
	public void initialize() throws NegativeCoordinateException{
		cell = new Cell();
	}
	
	@Test
	public void testCellState(){
		assertTrue(cell.getState().equals("dead"));
		
		cell.setState("alive");
		assertTrue(cell.getState().equals("alive"));
	}
	

	
}
