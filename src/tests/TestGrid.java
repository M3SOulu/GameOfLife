package tests;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import classes.Cell;
import classes.Grid;


public class TestGrid {
	
	private Grid grid;
	private ArrayList<Cell> cell;
	private int x;
	private int y;

	@Before
	public void inizialize() {
		grid = new Grid(x,y);
		
	}
	
	@Test
	public void GridCoordinate(){
		assertEquals(y,x);
	}
}
