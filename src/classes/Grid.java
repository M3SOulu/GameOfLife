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
		Cell currentCell;
		ArrayList<Cell> cells = new ArrayList<Cell>();
		Grid grid = new Grid(cells,10,10);	
		Iterator<Cell> iterator = cells.iterator();
		int alive = 0;
		int dead = 0;
		
		while(iterator.hasNext()) {
			currentCell = iterator.next();
			if(currentCell.isAlive()){
				alive++;
			}
			else dead++;
		}
		
		if(dead != alive) state = null;
		
		return state;   			
	}
	
	public Grid tick() {
	    return null;
	}


}
