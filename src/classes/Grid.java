package classes;

import java.util.ArrayList;
import java.util.Iterator;

public class Grid {
	private ArrayList<Cell> cells;
	private int width;
	private int height;

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

	public Grid(ArrayList<Cell> cells, int w, int h) throws CellCoordinateOutOfBoundariesException{
	}
	
	public Grid(int w, int h) throws CellCoordinateOutOfBoundariesException {
	}

	public String print() {
		
		String state = null;
		int i;
		ArrayList<Cell> cell = new ArrayList<Cell>();
		Grid grid = new Grid(cell,10,10);
		//if(grid.getHeight() != grid.getWidth()) state = "Grid invalid";	
	
		return state;   
		for(i = 0; i < cell.size();i++) {
			if(cell.ge)
		}
			
	}
	
	public Grid tick() {
	    return null;
	}


}
