package tests;

import static org.junit.Assert.*;
import org.junit.Test;

import classes.CellCoordinateOutOfBoundariesException;
import classes.Grid;


public class TestGrid {
	Grid griglia;

	@Test
	public void firstGridTest(){
		fail("implement some proper tests");
	}
	
	@Test(expected=CellCoordinateOutOfBoundariesException.class)
	public void grigliaErrataException(){
		griglia=new Grid(50,10);
	}
}
