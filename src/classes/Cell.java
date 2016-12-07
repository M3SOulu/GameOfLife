package classes;

public class Cell {
	private int x;
	private int y;
	private boolean alive;
	public Cell() throws NegativeCoordinateException {
	}
	
	public Cell(int x, int y) throws NegativeCoordinateException {
		if(x<0 || y<0){
			throw new NegativeCoordinateException("negative coordinate");
		}
		this.x = x;
		this.y = y;
	}
}
