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
	public void trickingAnAngleAliveCellWithLessThan2LiveNeighborsMakesItDie() throws NegativeCoordinateException {
		// Arrange
		Cell liveCell = new Cell(0, 0, true);
		Cell liveNeighbor1 = new Cell(0, 1, true);
		Cell deadNeighbor2 = new Cell(1, 0, false);
		Cell deadNeighbor3 = new Cell(1, 1, false);

		cells.add(liveCell);
		cells.add(liveNeighbor1);
		cells.add(deadNeighbor2);
		cells.add(deadNeighbor3);

		grid = new Grid(cells, 3, 3);
		// Act
		grid = grid.tick();
		// Assert
		assertTrue(!grid.getCells().get(0).isAlive());
	}
}
