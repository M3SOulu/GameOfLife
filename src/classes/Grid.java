package classes;

import java.util.ArrayList;

public class Grid {
	private ArrayList<Cell> cells;
	private int width;
	private int height;


	public Grid(ArrayList<Cell> cells, int w, int h) throws CellCoordinateOutOfBoundariesException{
	}
	
	public Grid(int w, int h) throws CellCoordinateOutOfBoundariesException {
	}

	public String print() {
	    return null;
	}
	
	public Grid tick() {
	    return null;
	}
	
	public int getWidth(){
		return width;
	}
	
	public int getHeight(){
		return height;
	}
}
