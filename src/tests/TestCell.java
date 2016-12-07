package tests;

import static org.junit.Assert.*;
import org.junit.Test;

import classes.Cell;
import classes.NegativeCoordinateException;
public class TestCell {
	
	Cell cella;
	
	@Test
	public void firstCellTest(){
		
	}
	
	@Test(expected=NegativeCoordinateException.class)
	public void testNegativeCoordinateForCell() throws NegativeCoordinateException{
		cella=new Cell(-1,-1,true);
	}
	
	

	
}
