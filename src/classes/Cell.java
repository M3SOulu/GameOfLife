package classes;

public class Cell {
	private int x;
	private int y;
	private boolean alive;
	
	
	public Cell() throws NegativeCoordinateException {

		
		if(this.x < 0 && this.y < 0) {
			throw new NegativeCoordinateException("Coordinate negative");
		}
		alive = true;
	}
	
	
	
	public void makeAlive() {
		this.alive = true;
	}
	
	public void makeDead() {
		this.alive = false;
	}
	
}
