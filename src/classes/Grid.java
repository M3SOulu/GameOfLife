package classes;

import java.util.ArrayList;

public class Grid {
	private ArrayList<Cell> cells;
	private int width;
	private int height;


	public Grid(ArrayList<Cell> cells, int w, int h) throws CellCoordinateOutOfBoundariesException{
		if(w!=h)throw new CellCoordinateOutOfBoundariesException("griglia non quadrata");
		width=w;
		height=h;
		this.cells=new ArrayList<>(cells.size());
	}
	
	public Grid(int w, int h) throws CellCoordinateOutOfBoundariesException {
		this(new ArrayList<Cell>(w*h),w,h);
		
	}

	public String print() {
	    for(int i=0;i<cells.size();i++){
	    	
	    }
	}
	
	public Grid tick() {
	    return null;
	}
	
	
}
