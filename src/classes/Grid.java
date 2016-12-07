package classes;

import java.util.ArrayList;

public class Grid {
	private ArrayList<Cell> cells;
	private int width;
	private int height;


	public Grid(ArrayList<Cell> cells, int w, int h) throws CellCoordinateOutOfBoundariesException{
		width=w;
		height=h;
		this.cells=new ArrayList<Cell>();
		for(Cell cell : cells){
			if(cell.getX()>height || cell.getY()>width)
					throw new CellCoordinateOutOfBoundariesException("CellCoordinateOutOfBoundaries");
			
			this.cells.add(cell);
		}
		
	}
	
	public Grid(int w, int h) throws CellCoordinateOutOfBoundariesException {
		width=w;
		height=h;
		
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
