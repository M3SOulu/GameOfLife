package tests;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import classes.Cell;
import classes.Grid;
import classes.NegativeCoordinateException;


public class TestGrid {

	@Test
	public void gridTest(){
		Grid grid = new Grid(10, 10);
		assertEquals(10, grid.getWidth());
		assertEquals(10, grid.getHeight());
	}
	
	@Test
	public void eachCellShallBeAccessibleByUniqueXY() throws NegativeCoordinateException{
		ArrayList<Cell> cells = new ArrayList<>();
		cells.add(new Cell(true, 1, 1));
		cells.add(new Cell(true, 1, 2));
		cells.add(new Cell(true, 2, 1));
		cells.add(new Cell(true, 2, 2));
		
		Grid grid = new Grid(cells, 2, 2);
		assertEquals(2, grid.get( 2, 1 ));
	}
}
