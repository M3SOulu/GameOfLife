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


	public Cell(boolean alive, int x, int y) throws NegativeCoordinateException {
		// TODO Auto-generated constructor stub
		this( alive );
		this.x = x;
		this.y = y;
	}


	public Object isAlive() {
		// TODO Auto-generated method stub
		return alive;
	}


	public int getX() {
		// TODO Auto-generated method stub
		return x;
	}


	public int getY() {
		// TODO Auto-generated method stub
		return y;
	}
}
