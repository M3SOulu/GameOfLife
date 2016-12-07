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
			System.out.println(cell.getX()+","+cell.getY());
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
	
	public static void main(String args[]) throws NegativeCoordinateException{
		System.out.println("gsgs");
		Grid grid;
		ArrayList<Cell> arrayCell;
		arrayCell = new ArrayList<Cell>();
		arrayCell.add(new Cell(1,1));
		arrayCell.add(new Cell(1,2));
		arrayCell.add(new Cell(1,4));
		grid = new Grid(arrayCell,3,3);
		
	}
	
}
