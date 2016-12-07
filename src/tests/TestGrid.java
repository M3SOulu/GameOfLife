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
	public void setup() {
		cells = new ArrayList<Cell>();
	}

	@Test(expected = CellCoordinateOutOfBoundariesException.class)
	public void ifACellIsOutOfTheGridLimitsAnExceptionShouldBeRised()
			throws CellCoordinateOutOfBoundariesException, NegativeCoordinateException {
		// Arrange
		Cell cell = new Cell(5, 5, true);
		cells.add(cell);
		// Act
		grid = new Grid(cells, 4, 4);
	}

	@Test
	public void tickingAnAngleAliveCellWithLessThan2AliveNeighborsMakesItDie() throws NegativeCoordinateException {
		// Arrange
		Cell liveCell = new Cell(0, 0, true);
		Cell liveNeighbor1 = new Cell(0, 1, true);
		Cell deadNeighbor2 = new Cell(1, 0, false);
		Cell deadNeighbor3 = new Cell(1, 1, false);

		cells.add(liveCell);
		cells.add(liveNeighbor1);
		cells.add(deadNeighbor2);
		cells.add(deadNeighbor3);

		grid = new Grid(cells, 2, 2);
		// Act
		grid = grid.tick();
		// Assert
		assertTrue(!grid.getGrid()[0][0].isAlive());
	}
	
	@Test
	public void tickingAnAngleDeadCellWith3AliveNeighborsMakesItAlive() throws NegativeCoordinateException {
		// Arrange
		Cell cell = new Cell(0, 0, false);
		Cell neighbor1 = new Cell(0, 1, true);
		Cell neighbor2 = new Cell(1, 0, true);
		Cell neighbor3 = new Cell(1, 1, true);

		cells.add(cell);
		cells.add(neighbor1);
		cells.add(neighbor2);
		cells.add(neighbor3);

		grid = new Grid(cells, 2, 2);
		// Act
		grid = grid.tick();
		// Assert
		assertTrue(grid.getGrid()[0][0].isAlive());
	}
	
	@Test
	public void tickingAnAngleAliveCellWith2Or3AliveNeighborsMakesItStayAlive() throws NegativeCoordinateException {
		// Arrange
		Cell cell = new Cell(0, 0, true);
		Cell neighbor1 = new Cell(0, 1, true);
		Cell neighbor2 = new Cell(1, 0, false);
		Cell neighbor3 = new Cell(1, 1, true);

		cells.add(cell);
		cells.add(neighbor1);
		cells.add(neighbor2);
		cells.add(neighbor3);

		grid = new Grid(cells, 2, 2);
		// Act
		grid = grid.tick();
		// Assert
		assertTrue(grid.getGrid()[0][0].isAlive());
	}
	
	@Test
	public void tickingAnUpperSideAliveCellWithMoreThan3AliveNeighborsMakesItDie() throws NegativeCoordinateException {
		// Arrange
		Cell cell = new Cell(0, 1, true);
		Cell neighbor1 = new Cell(0, 0, true);
		Cell neighbor2 = new Cell(0, 2, false);
		Cell neighbor3 = new Cell(1, 0, true);
		Cell neighbor4 = new Cell(1, 1, true);
		Cell neighbor5 = new Cell(1, 2, true);
		
	
		cells.add(cell);
		cells.add(neighbor1);
		cells.add(neighbor2);
		cells.add(neighbor3);
		cells.add(neighbor4);
		cells.add(neighbor5);

		grid = new Grid(cells, 2, 3);
		// Act
		grid = grid.tick();
		// Assert
		assertTrue(!grid.getGrid()[0][1].isAlive());
	}
	
	@Test
	public void tickingABottomSideAliveCellWithMoreThan3AliveNeighborsMakesItDie() throws NegativeCoordinateException {
		// Arrange
		Cell cell = new Cell(1, 1, true);
		Cell neighbor1 = new Cell(1, 0, true);
		Cell neighbor2 = new Cell(1, 2, false);
		Cell neighbor3 = new Cell(0, 0, true);
		Cell neighbor4 = new Cell(0, 1, true);
		Cell neighbor5 = new Cell(0, 2, true);
		
	
		cells.add(cell);
		cells.add(neighbor1);
		cells.add(neighbor2);
		cells.add(neighbor3);
		cells.add(neighbor4);
		cells.add(neighbor5);

		grid = new Grid(cells, 2, 3);
		// Act
		grid = grid.tick();
		// Assert
		assertTrue(!grid.getGrid()[1][1].isAlive());
	}
	
	@Test
	public void tickingALeftSideAliveCellWithMoreThan3AliveNeighborsMakesItDie() throws NegativeCoordinateException {
		// Arrange
		Cell cell = new Cell(1, 0, true);
		Cell neighbor1 = new Cell(0, 0, true);
		Cell neighbor2 = new Cell(2, 0, false);
		Cell neighbor3 = new Cell(0, 1, true);
		Cell neighbor4 = new Cell(1, 1, true);
		Cell neighbor5 = new Cell(2, 1, true);
		
	
		cells.add(cell);
		cells.add(neighbor1);
		cells.add(neighbor2);
		cells.add(neighbor3);
		cells.add(neighbor4);
		cells.add(neighbor5);

		grid = new Grid(cells, 2, 3);
		// Act
		grid = grid.tick();
		// Assert
		assertTrue(!grid.getGrid()[1][1].isAlive());
	}
}
