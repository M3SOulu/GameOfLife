package classes;

public class Cell {
	private int x;
	private int y;
	private boolean alive;
	
	
	public Cell() throws NegativeCoordinateException {
		
		this.x = x;
		this.y = y;
		
		if(this.x < 0 && this.y < 0) {
			throw NegativeCoordinateException();
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
