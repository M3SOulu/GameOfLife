package tests;

import static org.junit.Assert.*;
import org.junit.Test;

import classes.Grid;


public class TestGrid {

	@Test
	public void gridTest(){
		Grid grid = new Grid(10, 10);
		assertEquals(10, grid.getWidth());
		assertEquals(10, grid.getHeight());
	}
	
	
}
