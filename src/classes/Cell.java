package classes;


public class Cell {
	private int x;
	private int y;
	private boolean alive;

	public Cell(int x, int y, boolean t) throws NegativeCoordinateException {
		if (x < 0 || y < 0)
			throw new NegativeCoordinateException("Coordinate negative");
		this.x = x;
		this.y = y;
		alive = t;
	}

	public Cell() throws NegativeCoordinateException {
		this(0, 0, false);
	}

	public boolean getAlive() {
		return alive;
	}
	
	public int getX(){
		return x;
	}
	
	public int getY(){
		return y;
	}
	

	
	

}
