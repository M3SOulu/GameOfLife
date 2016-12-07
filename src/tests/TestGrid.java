package tests;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import classes.Cell;
import classes.CellCoordinateOutOfBoundariesException;
import classes.Grid;
import classes.NegativeCoordinateException;

public class TestGrid {
	Grid grid;

	@Before
	public void setUp() throws Exception {

	}

	@After
	public void TearDown() throws Exception {

	}

	@Test(expected = CellCoordinateOutOfBoundariesException.class)
	public void testCellCoordinateOutOfBoundariesException()
			throws CellCoordinateOutOfBoundariesException, NegativeCoordinateException {
		// Arrange
		// Act
		grid = new Grid(null, 10, 4);
		// Assert
	}

	@Test(expected = NegativeCoordinateException.class)
	public void testNegativeCoordinateException()
			throws CellCoordinateOutOfBoundariesException, NegativeCoordinateException {
		// Arrange
		// Act
		grid = new Grid(null, -10, -10);
		// Assert
	}

	@Test
	public void printGridGameOfLife() throws CellCoordinateOutOfBoundariesException, NegativeCoordinateException {
		// Arrange
		ArrayList<Cell> cells = new ArrayList<>();
		cells.add(new Cell(0, 0, true));
		cells.add(new Cell(0, 1, true));
		cells.add(new Cell(0, 2, false));
		cells.add(new Cell(1, 0, true));
		cells.add(new Cell(1, 1, false));
		cells.add(new Cell(1, 2, false));
		cells.add(new Cell(2, 0, true));
		cells.add(new Cell(2, 1, true));
		cells.add(new Cell(2, 2, false));
		// Act
		grid = new Grid(cells, 3, 3);
		// Assert
		assertEquals("**-/n*--/n**-", grid.print());

	}

	@Test
	public void tickTest() throws CellCoordinateOutOfBoundariesException, NegativeCoordinateException{
		// Arrange
		ArrayList<Cell> cells = new ArrayList<>();
		cells.add(new Cell(0, 0, true));
		cells.add(new Cell(0, 1, true));
		cells.add(new Cell(0, 2, false));
		cells.add(new Cell(1, 0, true));
		cells.add(new Cell(1, 1, false));
		cells.add(new Cell(1, 2, false));
		cells.add(new Cell(2, 0, true));
		cells.add(new Cell(2, 1, true));
		cells.add(new Cell(2, 2, false));
		// Act
		grid = new Grid(cells, 3, 3);
		
		// Assert
		assertEquals("***/n**-/n---", grid.tick().print());

	}

}
