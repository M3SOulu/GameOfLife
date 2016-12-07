package classes;

import java.util.Random;

public class Cell {
	private int x;
	private int y;
	private boolean alive;
	
	
	public Cell() throws NegativeCoordinateException {
		
		
		if(this.x < 0 && this.y < 0) {
			throw new NegativeCoordinateException("Coordinate negative");
		}
		
		
	}
	
	public void setX(int x)throws NegativeCoordinateException {
		if(x < 0) {
			throw new NegativeCoordinateException("Coordinate negative");
		}
		this.x = x;
	}
	
	public void setY(int y)throws NegativeCoordinateException {
		if(y < 0) {
			throw new NegativeCoordinateException("Coordinate negative");
		}
		this.y = y;
	}
	
	public void makeAlive() {
		this.alive = true;
	}
	
	public void makeDead() {
		this.alive = false;
	}
	
	public boolean isAlive() {
		return this.alive;
	}
	
}
