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

		if( (width*height)%2 == 0 && aliveCells != deadCells  ){
			return false;

		}
		else if( (width*height)%2 != 0 && aliveCells != (deadCells+1) && deadCells != (aliveCells+1) ){
			return false;
		}

		return true;
	}

	/**
	 * 
	 * @return a list with indexes of corner positions in 2D square grid
	 */
	private ArrayList<Integer> getCornerValues(){
		ArrayList<Integer> indexes = new ArrayList<>();

		indexes.add(0);
		indexes.add( width-1 );
		indexes.add( width*height - width );
		indexes.add( width*height -1 );

		return indexes;
	}

	/**
	 * 
	 * @return a list with indexes of border positions in 2D square grid
	 */
	private ArrayList<Integer> getBorderValues(){
		if( width <= 2 ){
			return null;
		}

		ArrayList<Integer> indexes = new ArrayList<>();

		for( int i = 1; i < width-1; i++ ){	//border values first row
			indexes.add(i);
		}

		int j = width;		//border values rows in the middle
		int count = 0;
		while( j < (width*height)-width ){
			indexes.add(j);

			count++;
			if( (count%2) == 0 )
				j++;
			else
				j += (width-1);
		}

		for( int i = (width*height)-width+1; i < (width*height-1); i++ ){	//border values last row
			indexes.add(i);
		}

		return indexes;
	}
	
	/**
	 * 
	 * @return a list with indexes of inside the 2D square grid positions
	 */
	private ArrayList<Integer> getInsideValues(){
		if( width <= 2 ){
			return null;
		}

		ArrayList<Integer> indexes = new ArrayList<>();

		for( int i = 0; i < (width*height); i++ ){
			indexes.add(i);
		}
		
		indexes.removeAll( getCornerValues() );
		indexes.removeAll( getBorderValues() );

		return indexes;
	}

	public int getNeighborsNumber(int index) {
		// TODO Auto-generated method stub
		if( getCornerValues().contains( index ) ){	//corner cell
			return 3;
		}
		if( getBorderValues().contains(index) ){	//border cell			
			return 5;
		}
		if( getInsideValues().contains(index) ){	//border cell			
			return 8;
		}
		

		return 0;
	}
}
