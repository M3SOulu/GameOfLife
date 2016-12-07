package classes;

public class Cell {
	private int x;
	private int y;
	private boolean alive;
	public Cell() throws NegativeCoordinateException {
		this.alive = true;
		
	}
	
	public String status(){
		String status = "dead";
		
		if(this.alive){
			status = "alive";
		}
		return status;
	}
	
	public void changeStatus(){
		if(this.alive){
			this.alive = false;
		}else{
			this.alive = true;
		}
	}
	
	public void setXY(int dim)throws NegativeCoordinateException{
		if(dim < 0){
			throw new NegativeCoordinateException("Error: cannot have negative coordinates");
			
		}
		this.x = dim;
		this.y = dim;
	}
	
	public int getX(){
		return this.x;
	}
	
	public int getY(){
		return this.y;
	}
}
