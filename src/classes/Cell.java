package classes;

public class Cell {
	private int x;
	private int y;
	private boolean alive;
	
	public int getX() {
		return x;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public int getY() {
		return y;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public boolean isAlive() {
		return alive;
	}
	
	public void setAlive(boolean alive) {
		this.alive = alive;
	}
	
	public Cell(int x, int y, boolean alive) throws NegativeCoordinateException {
		//if (x < 0 || y < 0) throw ;
	}
	
	public Cell() throws NegativeCoordinateException {
	}
}
