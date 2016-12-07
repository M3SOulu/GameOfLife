package classes;

import java.util.ArrayList;

public class Grid {
	private ArrayList<Cell> cells;
	private int width;
	private int height;
	private Cell[][] grid;


	public Grid(ArrayList<Cell> cells, int w, int h) throws CellCoordinateOutOfBoundariesException{
		grid = new Cell[width][height];
		for(int i = 0; i<cells.size(); i++)
			if(cells.get(i).getX()>w || cells.get(i).getY()>h )
				throw new CellCoordinateOutOfBoundariesException("");
			else
				grid[cells.get(i).getX()][cells.get(i).getY()] = cells.get(i);
		setWidth(w);
		setHeight(h);
	}
	
	public Grid(int w, int h) throws CellCoordinateOutOfBoundariesException {
		this(new ArrayList<Cell>(), w, h);
	}

	public String print() {
	    return null;
	}
	
	public Grid tick() {
		for(int i = 0; i<width; i++){
			for(int j = 0; j<width; j++){
				if(i > 0 && i<width-1 && j>0 && j<height-1){
					if()
				}
			}
		}
	    return new Grid()
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
