package classes;

import java.util.ArrayList;
import java.util.Iterator;

public class Grid {
	private ArrayList<Cell> cells;
	private int width;
	private int height;
	
	Iterator<Cell>cellIterator;

	

	public Grid(ArrayList<Cell> cells, int w, int h) throws CellCoordinateOutOfBoundariesException{
		if(w!=h)throw new CellCoordinateOutOfBoundariesException("griglia non quadrata");
		if(cells.size()!=(w*h))throw new CellCoordinateOutOfBoundariesException("errore fuori indice");
		width=w;
		height=h;
		this.cells=new ArrayList<>(cells.size());
	}
	
	public Grid(int w, int h) throws CellCoordinateOutOfBoundariesException {
		if(w!=h)throw new CellCoordinateOutOfBoundariesException("griglia non quadrata");
		width=w;
		height=h;
		this.cells=new ArrayList<>(w*h);
		
	}

	public String print() {
	    return null;
	}
	
	public Grid tick() {
	    return null;
	}
	
	public boolean isEqualsAliveDead(){
		int alive=0;
		int dead=0;
		while(cellIterator.hasNext()){
			if(cellIterator.next().getAlive()==true){
				alive++;
			}else{
				dead++;
			}
		}
		return alive==dead;
	}
	
	
	
	
}
