package tests;

import org.junit.Test;

import classes.CustomLifeException;
import classes.Grid;


public class TestGrid {

	@Test (expected = CustomLifeException.class)
	public void isGridNotASquareArrengment() throws CustomLifeException  {
		
		Grid grid = new Grid(30, 20);
		
		
		
		
	}
}
