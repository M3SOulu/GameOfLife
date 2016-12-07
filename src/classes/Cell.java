package classes;

import java.util.Random;

public class Cell {
	private int x;
	private int y;
	private boolean alive;
	private Random r;
	public Cell(){
		r = new Random();
		alive = r.nextBoolean();
	}
	
	public Cell(int x, int y) throws NegativeCoordinateException {
		if(x<0 || y<0){
			throw new NegativeCoordinateException("negative coordinate");
		}
		r = new Random();
		
		alive = r.nextBoolean();
		this.x = x;
		this.y = y;
		
	}
	
	public int getX(){
		return x;
	}
	
	public int getY(){
		return y;
	}
	
	public boolean getState(){
		return alive;
	}

	public void setState(boolean state) {
		this.alive = state;
	}
}
