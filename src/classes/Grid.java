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
	
	public Grid(ArrayList<Cell> cells, int w, int h) throws CustomLifeException, CellCoordinateOutOfBoundariesException{
		if (w != h) {
			throw new CustomLifeException("cell outside limits");
		}
		for(Cell c: cells){
			if(c.getX() > w || c.getY() > h){
				throw new CellCoordinateOutOfBoundariesException("cell outside limits");
			}
		}
		
		this.cells = cells;
		setHeight(h);
		setWidth(w);
	}
	
	public Grid(int w, int h) throws CustomLifeException {
		if (w != h) {
			throw new CustomLifeException("cell outside limits");
		}
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
