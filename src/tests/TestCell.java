package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import classes.Cell;
import classes.NegativeCoordinateException;
public class TestCell {
	
	Cell cell;
	
	@Test(expected = NegativeCoordinateException.class)
	public void constructingACellWithNegativeXShouldRiseAnException() throws NegativeCoordinateException{
		//Arrange & Act
		cell = new Cell(-1, 0, true);
	}
	
	@Test(expected = NegativeCoordinateException.class)
	public void constructingACellWithNegativeYShouldRiseAnException() throws NegativeCoordinateException{
		//Arrange & Act
		cell = new Cell(0, 1, true);
	}
}
