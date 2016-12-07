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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cell other = (Cell) obj;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}
	
	
	
}
