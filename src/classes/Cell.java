package classes;

public class Cell {
	private int x;
	private int y;
	private boolean alive;
	public Cell() throws NegativeCoordinateException {
		
	}
	
	public String getState(){
		if(alive)
			return "alive";
		else return "dead";
	}
	
	
}
