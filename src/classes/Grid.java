package classes;

import java.util.ArrayList;

public class Grid {
	private ArrayList<Cell> cells;
	private int width;
	private int height;


	public Grid(ArrayList<Cell> cells, int w, int h) throws CellCoordinateOutOfBoundariesException{
		if(cells.size()!=(w*h))throw new CellCoordinateOutOfBoundariesException("errore fuori indice");
		width=w;
		height=h;
		this.cells=new ArrayList<>(cells.size());
	}
	
	public Grid(int w, int h) throws CellCoordinateOutOfBoundariesException {
		if(w!=h)throw new CellCoordinateOutOfBoundariesException("griglia non quadrata");
		
		
	}

	public String print() {
	    return null;
	}
	
	public Grid tick() {
	    return null;
	}
	
	
	
	
}
