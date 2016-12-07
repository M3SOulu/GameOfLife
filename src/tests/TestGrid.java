package tests;

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
	public void areCellsInGridInizializedHalfDeadHalfAlive() throws CustomLifeException, NegativeCoordinateException  {
		
		Grid grid = new Grid(2, 2);
		

	}
	
	
}
