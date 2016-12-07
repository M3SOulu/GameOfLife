package classes;

import java.util.ArrayList;

public class Grid {
	private ArrayList<Cell> cells;
	private int width;
	private int height;


	public Grid(ArrayList<Cell> cells, int w, int h) throws CellCoordinateOutOfBoundariesException, CustomLifeException{
		if( w != h){
			throw new CustomLifeException("Error: the grid is square");
		}
		
		this.width = w;
		this.height = h;
		
		

		
	}
	
	public Grid(int w, int h) throws CellCoordinateOutOfBoundariesException, CustomLifeException {
		if( w != h){
			throw new CustomLifeException("Error: the grid is square");
		}
		
		this.width = w;
		this.height = h;
		
	}
	
	public int getWidth(){
		return this.width;
	}
	
	public int getHeight(){
		return this.height;
	}

	public String print() {
	    return null;
	}
	
	public Grid tick() {
	    return null;
	}
}
