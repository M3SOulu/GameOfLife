package classes;

public class Cell {
	private int x;
	private int y;
	private boolean alive=false;
	int neighbors = 0;
	public Cell() throws NegativeCoordinateException {
	}
	
	public Cell(int x,int y) throws NegativeCoordinateException {
		this.x=x;
		this.y=y;
	}
	
	public Cell(int x,int y, String state) throws NegativeCoordinateException {
		this.x=x;
		this.y=y;
		setState(state);
	}
	
	public String getState(){
		if(alive)
			return "alive";
		else return "dead";
	}
	
	public void setState(String state){
		if(state.equals("alive"))
			alive = true;
		else alive = false;
	}
	
	public int getX(){
		return x;
	}
	
	public int getY(){
		return y;
	}
	
	public int getNeighbors(){
		return neighbors;
	}

	public void setNeighbors(int n){
		neighbors=n;
	}
	
	
}
