package classes;

import java.util.ArrayList;

public class Grid {
	private ArrayList<Cell> cells;
	private int width;
	private int height;

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
//		if (w != h) {
//			throw new CellCoordinateOutOfBoundariesException("cell outside limits");
//		}
		this.cells = cells;
		setHeight(h);
		setWidth(w);
	}
	
	public Grid(int w, int h) throws CellCoordinateOutOfBoundariesException {
//		if (w != h) {
//			throw new CellCoordinateOutOfBoundariesException("cell outside limits");
//		}
		setHeight(h);
		setWidth(w);
	}

	public String print() {
	    return null;
	}
	
	public Grid tick() {
	    return null;
	}

	
}
