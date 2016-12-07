package tests;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

import classes.Cell;
import classes.CustomLifeException;
import classes.Grid;
import classes.NegativeCoordinateException;


public class TestGrid {

	@Test (expected = CustomLifeException.class)
	public void isGridNotASquareArrengment() throws CustomLifeException, NegativeCoordinateException  {
		
		Grid grid = new Grid(30, 20);

	}
	
	@Test
	public void CellHasTheRightCoordinateX() throws CustomLifeException, NegativeCoordinateException {
		Grid grid = new Grid(1, 1);
		
		ArrayList<Cell> gCells = grid.getCells();
		
		int x = -1;

		
		for (Cell c : gCells) {
			x = c.getX();
	
		}
		
		assertEquals(1, x);
		
	}
	
	@Test
	public void areCellsInGridInizializedWell() throws CustomLifeException, NegativeCoordinateException  {
		
		Grid grid = new Grid(2, 2);
		
		
		
		assertEquals(grid.print(), "*-\n-*");
		

	}
	
	
}
