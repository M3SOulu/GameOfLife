package tests;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import classes.Cell;
import classes.CustomLifeException;
import classes.Grid;
import classes.NegativeCoordinateException;

public class TestGrid {
	ArrayList<Cell> cells;
	int width;
	int height;
	Grid g;

	@Before
	public void setUp() throws NegativeCoordinateException {
		int j = 0;
		cells = new ArrayList();
		width = 9;
		height = width;
		for (int i = 0; i < width * height; i++) {
			if (j == 0) {
				if (i == width) {
					j++;
				}
			} else if (i == width * (j + 1)) {
				j++;
			}
			Cell c = new Cell(j, i - (width * j));
			cells.add(c);
		}
	}

	@Test
	public void firstGridTest() throws CustomLifeException {
		g = new Grid(cells, width, height);
	}

	@Test(expected = CustomLifeException.class)
	public void gridWithDifferentWidthAndHeight() throws CustomLifeException {
		g = new Grid(cells, width - 1, height);
	}
	
	@Test
	public void isCorrectlyInitialized() throws CustomLifeException {
		g = new Grid(cells, width, height);
		cells = g.getCells();

		int aliveCells = 0;
		int deadCells = 0;

		for (Cell c : cells) {
			if (c.getState()) {
				aliveCells++;
			} else {
				deadCells++;
			}
		}
		assertEquals(Math.min(aliveCells, deadCells), width * height / 2);
	}
	
	@Test
	public void gridStateStringIsCorrect() throws CustomLifeException{
		g = new Grid(cells, width, height);
		cells = g.getCells();
		char[] charOfState = g.printState().toCharArray();
		int i=0;
		
		for(Cell c:cells){
			if (c.getState()){
				assertEquals(charOfState[i++],'*');
			}
			else{
				assertEquals(charOfState[i++],'-');
			}
		}
		System.out.println(g.printState());
	}
}
