package classes;

public class Cell {
	private int x;
	private int y;
	private boolean alive;

	public Cell() throws NegativeCoordinateException {
		
	}

	public Cell(int x, int y,boolean t) throws NegativeCoordinateException {
		if (x < 0 || y < 0)
			throw new NegativeCoordinateException("Coordinate negative");
		this.x = x;
		this.y = y;
		alive=t;
	}
	
	
}
