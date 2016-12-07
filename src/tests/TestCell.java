package tests;

import static org.junit.Assert.*;
import org.junit.Test;

import classes.Cell;
import classes.NegativeCoordinateException;
public class TestCell {
	
	
	@Test
	public void cellAliveTest() throws NegativeCoordinateException{
		assertEquals(true, new Cell( true ).isAlive());
	}
	
	@Test
	public void cellNotAliveTest() throws NegativeCoordinateException{
		assertEquals(false, new Cell( false ).isAlive());
	}
}
