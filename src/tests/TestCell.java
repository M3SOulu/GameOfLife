package tests;

import org.junit.Before;
import org.junit.Test;

import classes.Cell;
public class TestCell {
	
	Cell cell;
	
	@Before
	public void setUp(){
		cell = new Cell();
	}
	
	@Test
	public void firstCellTest(){
		boolean isAlive = false;
		isAlive = cell.getState();
		
		if(isAlive == true){
			assertTrue(isAlive,true);
		}else{
			assertTrue(isAlive,false);
		}
	}
}
