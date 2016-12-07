package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import classes.Grid;


public class TestGrid {

	Grid grid;
	
	@Before
	public void initialize(){
		grid = new Grid(3,3);
	}
	
	@Test
	public void testGridSize(){

		assertEqual(grid.getWidth,grid.getHeight);
	}
	
	@Test
	public void firstGridTest(){
		fail("implement some proper tests");
	}
}
