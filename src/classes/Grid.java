package classes;

import java.util.ArrayList;
import java.util.Iterator;

public class Grid {
	private ArrayList<Cell> cells;
	private int width;
	private int height;


	public Grid(ArrayList<Cell> cells, int w, int h) throws CellCoordinateOutOfBoundariesException{
	}
	
	public Grid(int w, int h) throws CellCoordinateOutOfBoundariesException {
	}

	public String print() {
		
		String state = null;
		ArrayList<Cell> cell = null;
		Grid grid = new Grid(cell,10,10);
		//if(grid.getHeight() != grid.getWidth()) state = "Grid invalid";	
		Iterator<Cell> i;
		return state;   
			
	}
	
	public Grid tick() {
	    return null;
	}

	public ArrayList<Cell> getCells() {
		return cells;
	}

	public void setCells(ArrayList<Cell> cells) {
		this.cells = cells;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
}
