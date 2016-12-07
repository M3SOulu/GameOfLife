package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import classes.Cell;
import classes.NegativeCoordinateException;

public class TestCell {
	
	private Cell cell;
	
	
	@Before
	public void inizialize() throws NegativeCoordinateException{
		cell = new Cell();
	}
	
	@Test
	public void NegativeCoordinateExceptionTest(){
		assertEquals("","");
	}
}
