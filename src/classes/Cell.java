package classes;

import java.util.ArrayList;
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
	
	public Cell(int x, int y, boolean alive) throws NegativeCoordinateException {
		if(x<0 || y<0){
			throw new NegativeCoordinateException("negative coordinate");
		}
		
		this.alive = alive;
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
	
	public boolean getStateAfterTick(ArrayList<Cell> neighCells){
		int liveNeigh = 0;
		for(Cell c : neighCells){
			if(c.getState()){
				liveNeigh++;
			}
		}
		
		if(this.getState()){
			if(liveNeigh < 2 || liveNeigh > 3)
				return false;
			else
				return true;
		}				
		else{
			if(liveNeigh == 3)
				return true;
			else
				return false;
		}
	}

	
}
