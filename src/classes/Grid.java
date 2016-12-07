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

	public int getAliveCells( ArrayList<Cell> cells ) {
		// TODO Auto-generated method stub
		int count = 0;

		for( Cell cell : cells ){
			if( cell.isAlive() ){
				count++;
			}
		}

		return count;
	}
	
	public Grid tick() throws NegativeCoordinateException {
		ArrayList<Cell> cells = new ArrayList<>();
		
		for( int i = 0; i < cells.size(); i++ ){
			if( getCornerValues().contains( i ) ){	//corner cell
				ArrayList<Cell> neighbors = getCornerNeighbors(i);
				int aliveCells = getAliveCells( neighbors );
				if( aliveCells < 2 ){
					cells.add(new Cell(false, cells.get(i).getX(), cells.get(i).getY()));
				}
				else{
					cells.add(new Cell(cells.get(i).isAlive(), cells.get(i).getX(), cells.get(i).getY()));
				}
			}
		}
		
		return new Grid(cells, width, height);
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

		if( (width*height)%2 == 0 && 
				aliveCells != deadCells  ){
			return false;

		}
		else if( (width*height)%2 != 0 && 
				aliveCells != (deadCells+1) && 
				deadCells != (aliveCells+1) ){
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
	
	
	
	private ArrayList<Cell> getCornerNeighbors( int index ){
		ArrayList<Cell> neighbors = new ArrayList<>();
		
		if( index == 0 ){	//first corner
			neighbors.add( cells.get(1) );
			neighbors.add( cells.get(width) );
			neighbors.add( cells.get( width+1 ) );
		}
		else if( index == width-1 ){	//second corner
			neighbors.add( cells.get(width-2) );
			neighbors.add( cells.get(width*2 -2) );
			neighbors.add( cells.get( width*2 -1 ) );
		}
		else if( index == width*height - width ){	//third corner
			neighbors.add( cells.get(width*height - (width*2)) );
			neighbors.add( cells.get(width*height - (width*2) + 1) );
			neighbors.add( cells.get(width*height - (width-1)) );
		}
		else if( index == width*height -1 ){	//fourth corner
			neighbors.add( cells.get(width*height -2) );
			neighbors.add( cells.get(width*height - width - 1) );
			neighbors.add( cells.get(width*height - width - 2 ) );
		}
		
		return neighbors;
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
	 * @return a list with indexes of inside positions in 2D square grid
	 */
	private ArrayList<Integer> getInsideTheGridValues(){
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
		if( getInsideTheGridValues().contains(index) ){	//inside the grid cell			
			return 8;
		}
		

		return 0;
	}
	
	public ArrayList<Cell> getNeighbors(int index) {
		// TODO Auto-generated method stub
		if( getCornerValues().contains( index ) ){	//corner cell
			return getCornerNeighbors( index );
		}
		

		return null;
	}
}
