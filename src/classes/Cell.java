package classes;

import java.util.Iterator;

public class Cell {
	private int x;
	private int y;
	private boolean alive;
	
	Iterator<Cell>cellIterator;

	public Cell() throws NegativeCoordinateException {
		this(0,0,false);
	}

	public Cell(int x, int y,boolean t) throws NegativeCoordinateException {
		if (x < 0 || y < 0)
			throw new NegativeCoordinateException("Coordinate negative");
		this.x = x;
		this.y = y;
		alive=t;
	}
	
	public boolean getAlive(){
		return alive;
	}
	
	
	
	
}
