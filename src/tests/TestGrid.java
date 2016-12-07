package tests;

import org.junit.Test;

import classes.CustomLifeException;
import classes.Grid;


public class TestGrid {

	@Test (expected = CustomLifeException)
	public void isGridNotASquareArrengment(){
		try {
			Grid grid = new Grid(20, 20);
		}
		catch (CustomLifeException e) {
			// to do
		}
		
		
		
	}
}
