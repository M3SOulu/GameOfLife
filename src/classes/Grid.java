package classes;

import java.util.ArrayList;


//HO ASSUNTO CHE L'INDICE DELLLA GRIGLIA PARTA DA UNO 
//E CHE LA GRIGLIA VENGA COMPLETAMENTE RIEMPITA DI CELLE PER CALCOLARE IL NUMERO DI VICINI 

public class Grid {
	private ArrayList<Cell> cells;
	private int width;
	private int height;

	public Grid(ArrayList<Cell> cells, int w, int h)
			throws CellCoordinateOutOfBoundariesException, CellCoordinateDuplicate, CellConformityException {
		width = w;
		height = h;
		this.cells = new ArrayList<Cell>();
		controlCellsConformity(cells);
		for (Cell cell : cells) {
			if (cell.getX() > height || cell.getY() > width)
				throw new CellCoordinateOutOfBoundariesException("CellCoordinateOutOfBoundaries");

			for (Cell newCell : this.cells) {
				if (newCell.getX() == cell.getX() && newCell.getY() == cell.getY())
					throw new CellCoordinateDuplicate("CellCordinateDuplicate");
			}

			this.cells.add(cell);
		}

	}

	public Grid(int w, int h) throws CellCoordinateOutOfBoundariesException {
		width = w;
		height = h;

	}

	private void controlCellsConformity(ArrayList<Cell> arrayCells) throws CellConformityException {
		int alive = 0;
		int dead = 0;

		for (Cell cell : arrayCells) {
			if (cell.getState().equals("alive"))
				alive++;
			else
				dead++;
		}

		if (alive != dead)
			throw new CellConformityException("Number of alive != numbere of dead");
	}
	
	public void calculateNeighbors(){
		int neighbors=0;
		
		for (Cell cell : cells){
			Cell newCell = new Cell(cell.getX(), cell.getY());
			if(cells.contains(newCell))
	
		}
		
		
	
	}
	

	public String print() {
		return null;
	}

	public Grid tick() {
		return null;
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

}
