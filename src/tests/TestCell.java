package tests;

import static org.junit.Assert.*;
import org.junit.Test;

import classes.Cell;
public class TestCell {
	
	Cell cella;
	
	@Test
	public void firstCellTest(){
		
	}
	
	@Test(expected=NegativeCoordinateException.class)
	public void testNegativeCoordinateForCell(){
		cella=new Cell(-1,-1);
	}

	
}
