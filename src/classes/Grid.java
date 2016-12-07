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
	
	public Grid(int w, int h) throws CellCoordinateOutOfBoundariesException, CustomLifeException, NegativeCoordinateException {
		
		if (w != h) {
			throw new CustomLifeException("Generic Error");
		}
		
		this.width = w;
		this.height = h;
		
		for (int i = 0; i < w * h; i++) {
			Cell cell = new Cell();
			this.cells.add(cell);
		}
		
		
	}

	public String print() {
	    return null;
	}
	
	public Grid tick() {
	    return null;
	}
}
