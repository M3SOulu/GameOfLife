package tests;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import classes.Cell;
import classes.CellCoordinateOutOfBoundariesException;
import classes.CustomLifeException;
import classes.Grid;
import classes.NegativeCoordinateException;


public class TestGrid {
	

	ArrayList<Cell> cells;

	@Test(expected = CustomLifeException.class)
	public void squareGridTest() throws CellCoordinateOutOfBoundariesException, CustomLifeException{
		//Assign
		Grid grid1 = new Grid(10,5);
		//Act
		int w = grid1.getWidth();
		int h = grid1.getHeight();
		//Assert
		assertEquals(10,w);
		assertEquals(5,h);
	}
	

	@Test/*(expected = CustomLifeException.class)*/
	public void secondGridTest() throws CellCoordinateOutOfBoundariesException, CustomLifeException, NegativeCoordinateException{
		
		Cell cell1 = new Cell();
		cell1.setXY(10);
		
		Cell cell2 = new Cell();
		cell2.setXY(5);
		

		
		
	}
}
