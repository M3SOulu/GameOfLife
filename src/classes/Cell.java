package classes;

public class Cell {
	private int x;
	private int y;
	private boolean alive;
	
	
	public Cell() throws NegativeCoordinateException {
		
	}


	public Cell(boolean alive) throws NegativeCoordinateException{
		// TODO Auto-generated constructor stub
		this();
		this.alive = alive;
	}
}
