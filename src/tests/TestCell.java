package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import classes.Cell;
import classes.NegativeCoordinateException;
public class TestCell {
	
	Cell cell;
	
	@Before
	public void setUp() throws NegativeCoordinateException{
		cell = new Cell();
	}
	
	
	
	@Test
	public void statusCellTest(){
		//Act
		String status = cell.status();
		//Assert
		assertEquals("alive", status);
	}
	
	@Test
	public void changeStatusCellTest(){
		//Act
		cell.changeStatus();
		String status = cell.status();
		//Assert
		assertEquals("dead", status);
	}
	
	@Test
	public void coordinateCellTest() throws NegativeCoordinateException{
		//Act
		cell.setXY(10);
		int x = cell.getX();
		int y = cell.getY();
		//Assert
		assertEquals(10, x);
		assertEquals(10, y);
	}
	
	@Test(expected = NegativeCoordinateException.class)
	public void negativeCoordinateCellTest() throws NegativeCoordinateException{
		//Act
		cell.setXY(-1);
		int x = cell.getX();
		int y = cell.getY();
		//Assert
		assertEquals(-1, x);
		assertEquals(-1, y);
	}
	
	
	
}
