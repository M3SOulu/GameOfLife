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
	}
	
	public Grid(int w, int h) throws CellCoordinateOutOfBoundariesException {
	}

	public String print() {
	    return null;
	}
	
	public Grid tick() {
	    return null;
	}
}
