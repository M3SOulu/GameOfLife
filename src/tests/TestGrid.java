package tests;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import classes.Cell;
import classes.CellCoordinateOutOfBoundariesException;
import classes.Grid;
import classes.NegativeCoordinateException;


public class TestGrid {

	Grid grid;
	ArrayList<Cell> arrayCell;
	@Before
	public void initialize() throws NegativeCoordinateException{
		arrayCell.add(new Cell(1,1));
		arrayCell.add(new Cell(1,2));
		arrayCell.add(new Cell(1,4));
		grid = new Grid(3,3);
	}
	
	@Test
	public void testGridSize(){
		assertTrue(grid.getWidth()==grid.getHeight());
	}
	
	@Test(expected=CellCoordinateOutOfBoundariesException.class)
	public void testCellCoordinate(){
		grid = new Grid()
	}
	
}
