package tests;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import classes.Cell;
import classes.CellConformityException;
import classes.CellCoordinateDuplicate;
import classes.CellCoordinateOutOfBoundariesException;
import classes.Grid;
import classes.NegativeCoordinateException;


public class TestGrid {

	Grid grid;
	ArrayList<Cell> arrayCell;
	
	
	@Test
	public void testGridSize(){
		grid = new Grid(3,3);
		assertTrue(grid.getWidth()==grid.getHeight());
	}
	
	@Test(expected=CellCoordinateOutOfBoundariesException.class)
	public void testCellCoordinate() throws CellCoordinateOutOfBoundariesException, CellCoordinateDuplicate, NegativeCoordinateException{
		arrayCell = new ArrayList<Cell>();
		arrayCell.add(new Cell(1,4));	
		grid = new Grid(arrayCell,3,3);
	}
	
	@Test(expected=CellCoordinateDuplicate.class)
	public void testCellCoordinateDuplicate() throws NegativeCoordinateException, CellCoordinateOutOfBoundariesException, CellCoordinateDuplicate{
		arrayCell = new ArrayList<Cell>();
		arrayCell.add(new Cell(1,3));
		arrayCell.add(new Cell(1,3));
		grid = new Grid(arrayCell,3,3);
	}
	
	@Test(expected=CellConformityException.class)
	public void testCellConformity() throws NegativeCoordinateException, CellCoordinateOutOfBoundariesException, CellCoordinateDuplicate{
		arrayCell = new ArrayList<Cell>();
		arrayCell.add(new Cell(1,1));
		arrayCell.add(new Cell(1,2));
		arrayCell.add(new Cell(2,1));
		arrayCell.add(new Cell(2,2));
		grid = new Grid(arrayCell,2,2);
		
		
	}
	
	
	
}
