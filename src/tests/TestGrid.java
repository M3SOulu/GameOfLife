package tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import classes.Cell;
import classes.CellCoordinateOutOfBoundariesException;
import classes.Grid;
import classes.NegativeCoordinateException;


public class TestGrid {
	Grid grid;
	@Before
	public void setUp() throws Exception{
		
	}
	
	@After
	public void TearDown() throws Exception{
		
		
	}
	

	@Test(expected = CellCoordinateOutOfBoundariesException.class)
	public void testCellCoordinateOutOfBoundariesException() throws CellCoordinateOutOfBoundariesException, NegativeCoordinateException{
		//Arrange
		//Act
		grid=new Grid(null, 10, 4);
		//Assert
	}
	
	@Test(expected = NegativeCoordinateException.class)
	public void testNegativeCoordinateException() throws CellCoordinateOutOfBoundariesException, NegativeCoordinateException{
		//Arrange
		//Act
		grid=new Grid(null, -10, -10);
		//Assert
	}
}
