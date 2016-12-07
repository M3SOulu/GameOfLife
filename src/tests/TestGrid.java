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
	ArrayList<Cell> cells;
	
	@Before
	public void setup(){
		cells = new ArrayList<Cell>();
	}

	@Test(expected = CellCoordinateOutOfBoundariesException.class)
	public void ifACellIsOutOfTheGridLimitsAnExceptionShouldBeRised() throws CellCoordinateOutOfBoundariesException, NegativeCoordinateException{
		//Arrange
		Cell cell = new Cell(5,5, true);
		cells.add(cell);
		//Act
		grid = new Grid(cells, 4, 4);
	}
}
