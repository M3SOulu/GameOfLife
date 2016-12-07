package classes;

import java.util.ArrayList;

public class Grid {
	private ArrayList<Cell> cells;
	private int width;
	private int height;

	public ArrayList<Cell> getCells() {
		return  this.cells;
	}
	

	
	
	public Grid(ArrayList<Cell> cells, int w, int h) throws CellCoordinateOutOfBoundariesException, CustomLifeException{
	this.cells = cells;
	this.width = w;
	this.height = h;
	if (w != h) {
		throw new CustomLifeException("Generic Error");
	}
	}
	
	public Grid(int w, int h) throws CellCoordinateOutOfBoundariesException, CustomLifeException, NegativeCoordinateException {
		this.cells = new ArrayList<Cell>();
		if (w != h) {
			throw new CustomLifeException("Generic Error");
		}
		
		this.width = w;
		this.height = h;
		
		
		int iW = 1;
		int iH = 1;
		for (int i = 0; i < w * h; i++) {
			
			Cell cell = new Cell();
			
			
			cell.setX(iW);
			cell.setY(iH++);
			
			if(this.height == iH-1) {
				iH = 1;
				iW++;
			}
			
			if((float)cell.getX() % 2 == 0 && cell.getY() % 2 == 0) { //riga pari, colonna pari
				cell.makeAlive();
			}
			
			if((float)cell.getX() % 2 != 0 && cell.getY() % 2 == 0) {  //riga dispari, colonna pari
				cell.makeDead();
			}
			
			if((float)cell.getX() % 2 == 0 && cell.getY() % 2 != 0) { //riga pari, colonna dispari
				cell.makeDead();
			}
			
			if((float)cell.getX() % 2 != 0 && cell.getY() % 2 != 0) {  //riga dispari, colonna dispari
				cell.makeAlive();
			}
			
			this.cells.add(cell);
		}
		
		
	}

	public String print() {
		String sGrid = "";
			for (Cell c : cells) {
				
				String state;
				if(c.isAlive()) {
					state = "*";
				} else {
					state = "-";
				}
				sGrid = sGrid + state;
				if(c.getY() == height && c.getX() != width) {
					sGrid = sGrid + "\n";
				}
			}
		
		
	    return sGrid;
	}
	
	public Grid tick() {
	    return null;
	}
}
