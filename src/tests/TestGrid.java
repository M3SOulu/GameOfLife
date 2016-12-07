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
	
	@Test 
	public void trickingALiveCellWithLessThan2LiveNeighborsMakesItDie() throws NegativeCoordinateException{
		//Arrange
		Cell liveCell = new Cell(5,5, true);
		Cell deadNeighbor1 = new Cell(4,5, false);
		Cell deadNeighbor2 = new Cell(6,5, false);
		Cell deadNeighbor3 = new Cell(5,4, false);
		Cell deadNeighbor4 = new Cell(5,6, false);
		Cell deadNeighbor5 = new Cell(4,4, false);
		Cell deadNeighbor6 = new Cell(6,4, false);
		Cell deadNeighbor7 = new Cell(4,6, false);
		Cell deadNeighbor8 = new Cell(6,6, false);
		cells.add(liveCell);
		cells.add(deadNeighbor1);
		cells.add(deadNeighbor2);
		cells.add(deadNeighbor3);
		cells.add(deadNeighbor4);
		cells.add(deadNeighbor5);
		cells.add(deadNeighbor6);
		cells.add(deadNeighbor7);
		cells.add(deadNeighbor8);
		grid = new Grid(cells, 10, 10);
		//Act
		grid.tick(5, 5);
		//Assert
		
		
		
		
	}
}
