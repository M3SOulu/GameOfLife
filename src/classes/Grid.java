package classes;

import java.util.ArrayList;

public class Grid {
	private ArrayList<Cell> cells;
	private int width;
	private int height;


	public Grid(ArrayList<Cell> cells, int w, int h) throws CellCoordinateOutOfBoundariesException, CustomLifeException{
	this.cells = cells;
	this.width = w;
	this.height = h;
	if (w != h) {
		throw new CustomLifeException("Generic Error");
	}
	}
	
	public Grid(int w, int h) throws CellCoordinateOutOfBoundariesException, CustomLifeException {
		
		if (w != h) {
			throw new CustomLifeException("Generic Error");
		}
		
		this.width = w;
		this.height = h;
		
		
	}

	public String print() {
	    return null;
	}
	
	public Grid tick() {
	    return null;
	}
}
