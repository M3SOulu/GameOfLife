package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import classes.CustomLifeException;
import classes.Grid;
import classes.NegativeCoordinateException;


public class TestGrid {

	@Test (expected = CustomLifeException.class)
	public void isGridNotASquareArrengment() throws CustomLifeException, NegativeCoordinateException  {
		
		Grid grid = new Grid(30, 20);

	}
	
	@Test
	public void areCellsInGridInizializedWell() throws CustomLifeException, NegativeCoordinateException  {
		
		Grid grid = new Grid(2, 2);
		
		assertEquals(grid.print(), "*-\n");
		

	}
	
	
}
