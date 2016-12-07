package tests;

import static org.junit.Assert.*;

import java.util.ArrayList;

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
	public void testGridSize() {
		grid = new Grid(3, 3);
		assertTrue(grid.getWidth() == grid.getHeight());
	}

	@Test(expected = CellCoordinateOutOfBoundariesException.class)
	public void testCellCoordinate() throws CellCoordinateOutOfBoundariesException, CellCoordinateDuplicate,
			NegativeCoordinateException, CellConformityException {
		arrayCell = new ArrayList<Cell>();
		arrayCell.add(new Cell(1, 1, "alive"));
		arrayCell.add(new Cell(1, 4, "dead"));
		grid = new Grid(arrayCell, 3, 3);
	}

	@Test(expected = CellCoordinateDuplicate.class)
	public void testCellCoordinateDuplicate() throws NegativeCoordinateException,
			CellCoordinateOutOfBoundariesException, CellCoordinateDuplicate, CellConformityException {
		arrayCell = new ArrayList<Cell>();
		arrayCell.add(new Cell(1, 1, "alive"));
		arrayCell.add(new Cell(1, 2, "alive"));
		arrayCell.add(new Cell(1, 3, "dead"));
		arrayCell.add(new Cell(1, 3, "dead"));
		grid = new Grid(arrayCell, 3, 3);
	}

	@Test(expected = CellConformityException.class)
	public void testCellConformity() throws NegativeCoordinateException, CellCoordinateOutOfBoundariesException,
			CellCoordinateDuplicate, CellConformityException {
		arrayCell = new ArrayList<Cell>();
		arrayCell.add(new Cell(1, 1, "alive"));
		arrayCell.add(new Cell(1, 2, "alive"));
		arrayCell.add(new Cell(2, 1, "dead"));
		grid = new Grid(arrayCell, 2, 2);

	}

	@Test
	public void testCalculateNeighbors() throws NegativeCoordinateException, CellCoordinateOutOfBoundariesException, CellCoordinateDuplicate, CellConformityException{
		
		//Inizializza un array di celle con lo stesso numero di celle "vive" e "morte"
		arrayCell = new ArrayList<Cell>();
		String state;
		int x=1;
		int y=1;
		//Dimensione array
		int n=4;
		for (int i = 0;i<(n*n); i++){
			if(i % 2 == 0)
				state = "alive";
			else state = "dead";
			arrayCell.add(new Cell(x, y, state));
			y++;
			if (y>n){
				y=1;
				x++;
			}
		}
		grid = new Grid(arrayCell, 4, 4);
		grid.calculateNeighbors();
		Cell cell = new Cell(2,2);
		for (Cell newCell : arrayCell){
			if(cell.equals(newCell)){
				cell=newCell;
				break;
			}
		}
		assertTrue(cell.getNeighbors()==8);
	}
	

}
