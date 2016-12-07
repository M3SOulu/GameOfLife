package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import classes.Cell;
import classes.NegativeCoordinateException;

public class TestCell {
	@Test
	public void makeADeadCellAlive(){
		Cell cell = null;
		try {
			cell = new Cell();
		}
		catch (NegativeCoordinateException e) {
			// TODO: handle exception
		}
		
		cell.makeDead();
		
		assertEquals(cell.isAlive(), false);
	}
	
	@Test
	public void makeAAliveCellDead(){
		Cell cell = null;
		try {
			cell = new Cell();
		}
		catch (NegativeCoordinateException e) {
			// TODO: handle exception
		}
		
		cell.makeAlive();
		
		assertEquals(cell.isAlive(), true);
		
		
	}
}
