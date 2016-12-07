package tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import classes.Cell;
import classes.NegativeCoordinateException;
public class TestCell {
	Cell cell;
	@Before
	public void setUp() throws Exception{
		
	}
	
	@After
	public void TearDown() throws Exception{
		
		
	}
	
	
	@Test
	public void firstCellTest() throws NegativeCoordinateException{
		//Arrange
		
		//Act
		//Assert
		
	}
	
	
	@Test(expected = NegativeCoordinateException.class)
	public void s() throws NegativeCoordinateException{
		//Arrange
		//Act
		cell=new Cell(-1, 5, true);
		//Assert
	}
}
