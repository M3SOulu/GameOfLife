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
	Grid griglia;
	ArrayList<Cell> cells;
	Cell primaCella;
	Cell secondaCella;
	Cell terzaCella;
	Cell quartaCella;

	@Before
	public void setUp() throws NegativeCoordinateException {
		primaCella = new Cell(0, 0, true);
		secondaCella = new Cell(0, 1, true);
		terzaCella = new Cell(1, 0, false);
		quartaCella = new Cell(1, 1, false);
	}

	@Test
	public void firstGridTest() {

	}

	@Test(expected = CellCoordinateOutOfBoundariesException.class)
	public void grigliaErrataException() {
		griglia = new Grid(50, 10);
	}

	@Test(expected = CellCoordinateOutOfBoundariesException.class)
	public void grigliaErrataWithCellException() throws NegativeCoordinateException {
		griglia = new Grid(cells, 50, 10);
	}

	@Test
	public void grigliaQuadrataCorretta() {
		griglia = new Grid(10, 10);
	}

	@Test
	public void cellsIsEqualDeadOrAlive() throws NegativeCoordinateException {
		cells = new ArrayList<>(4);
		cells.add(primaCella);
		cells.add(secondaCella);
		cells.add(terzaCella);
		cells.add(quartaCella);
		griglia = new Grid(cells, 2, 2);

	}
}
