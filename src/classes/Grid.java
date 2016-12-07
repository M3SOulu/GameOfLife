package classes;

import java.util.ArrayList;

public class Grid {
	private ArrayList<Cell> cells;
	private int width;
	private int height;


	public Grid(ArrayList<Cell> cells, int w, int h) throws CellCoordinateOutOfBoundariesException{
		this( w, h );
		this.cells = cells;
	}

	public Grid(int w, int h) throws CellCoordinateOutOfBoundariesException {
		this.width = w;
		this.height = h;
	}



	public String print() {
		return null;
	}

	public Grid tick() {
		return null;
	}

	public int getWidth() {
		// TODO Auto-generated method stub
		return width;
	}

	public int getHeight() {
		// TODO Auto-generated method stub
		return height;
	}

	/**
	 * 
	 * @param x
	 * @param y
	 * @return a cell at (x, y) coordinate
	 */
	public Cell get(int x, int y) {
		// TODO Auto-generated method stub
		for( Cell cell: cells ){
			if( cell.getX() == x && cell.getY() == y ){
				return cell;
			}
		}

		return null;
	}

	public int getAliveCells() {
		// TODO Auto-generated method stub
		int count = 0;

		for( Cell cell : cells ){
			if( cell.isAlive() ){
				count++;
			}
		}

		return count;
	}

	public int getDeadCells() {
		// TODO Auto-generated method stub
		int count = 0;

		for( Cell cell : cells ){
			if( ! cell.isAlive() ){
				count++;
			}
		}

		return count;
	}

	public boolean areCellsUniformlyInitialized(){
		int aliveCells = getAliveCells();
		int deadCells = getDeadCells();

		if( (width*height)%2 == 0  ){
			if(aliveCells != deadCells)
				return false;

		}
		else if( aliveCells != (deadCells+1) && deadCells != (aliveCells+1) ){
			return false;
		}

		return true;
	}

	/**
	 * 
	 * @param index
	 * @return true if the cell at "index" is in the corner of sqaure grid
	 */
	private boolean isCornerCell( int index ){
		if( index == 0 || 
				index == (width-1) || 
				index == (width*height - width) || 
				index == (width*height -1) ){
			return true;
		}

		return false;
	}
	
	private ArrayList<Integer> getBorderValues(){
		return null;
	}

	public int getNeighborsNumber(int index) {
		// TODO Auto-generated method stub
		if( isCornerCell( index ) ){	//corner cell
			return 3;
		}
		if( getBorderValues().contains(index) ){				
			return 5;
		}

		return 0;
	}
}
