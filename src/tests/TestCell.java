package tests;

import static org.junit.Assert.*;
import org.junit.Test;

import classes.Cell;
public class TestCell {
	
	
	@Test
	public void cellAliveTest(){
		assertEquals(true, new Cell( true ));
	}
}
