package tests;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import classes.Cell;
import classes.CellCoordinateOutOfBoundariesException;
import classes.Grid;
import classes.NegativeCoordinateException;


public class TestGrid {
	Grid griglia;
	ArrayList<Cell> cells;

	@Test
	public void firstGridTest(){
		
	}
	
	@Test(expected=CellCoordinateOutOfBoundariesException.class)
	public void grigliaErrataException(){
		griglia=new Grid(50,10);
	}
	
	@Test(expected=CellCoordinateOutOfBoundariesException.class)
	public void grigliaErrataWithCellException() throws NegativeCoordinateException{
		griglia=new Grid(cells,50,10);
	}
	
	@Test
	public void grigliaQuadrataCorretta(){
		griglia=new Grid(10,10);
	}
	
	@Test
	public void cellsIsEqualDeadOrAlive(){
		cells=new ArrayList<>(100);
		griglia=new Grid(10,10);
		
	}
}
