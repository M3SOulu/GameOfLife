package classes;

import java.util.ArrayList;

public class Grid {
	private ArrayList<Cell> cells;
	private int width;
	private int height;


	public Grid(ArrayList<Cell> cells, int w, int h) throws CellCoordinateOutOfBoundariesException{
		for(int i = 0; i<cells.size(); i++)
			if(cells.get(i).getX()>w || cells.get(i).getY()>h )
				throw new CellCoordinateOutOfBoundariesException("");
		setWidth(w);
		setHeight(h);
	}
	
	public Grid(int w, int h) throws CellCoordinateOutOfBoundariesException {
		this(new ArrayList<Cell>(), w, h);
	}

	public String print() {
	    return null;
	}
	
	public Grid tick(int x, int y) {
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
