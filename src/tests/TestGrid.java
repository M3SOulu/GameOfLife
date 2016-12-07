package tests;

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

	@Before
	public void setUp() throws NegativeCoordinateException{
		int j=0;
		cells = new ArrayList();
		width = 50;
		height = width;
		for (int i = 0; i < width * height; i++) {
			Cell c = new Cell(j,i);
			if(i == width){
				j++;
			}
		}
	}

	@Test(expected = CustomLifeException.class)
	public void gridWithDifferentWidthAndHeight() {
		Grid g = new Grid(cells, 30, 40);
	}

	@Test
	public void firstGridTest() {
		Grid g = new Grid(cells, 40, 40);
	}
}
