package classes;

public class Cell {
	private int x;
	private int y;
	private boolean alive;
	public Cell() throws NegativeCoordinateException {
	}
	
	public Cell(int x, int y, boolean alive) throws NegativeCoordinateException {
		if(x<=0 || y<=0) throw new NegativeCoordinateException("");
		this.x=x;
		this.y=y;
		this.setAlive(alive);
	}

	public boolean getAlive() {
		return alive;
	}

	public void setAlive(boolean alive) {
		this.alive = alive;
	}
}
