package classes;

import java.util.ArrayList;
import java.util.Random;

public class Grid {
	private ArrayList<Cell> cells;
	private int width;
	private int height;

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public Grid(ArrayList<Cell> cells, int w, int h)
			throws CustomLifeException, CellCoordinateOutOfBoundariesException {
		if (w != h) {
			throw new CustomLifeException("width != height");
		}
		setHeight(h);
		setWidth(w);

		for (Cell c : cells) {
			if (c.getX() > w || c.getY() > h) {
				throw new CellCoordinateOutOfBoundariesException("cell outside limits");
			}
		}
		this.initialize(cells);
		if (this.isUniformlyInitialized(cells)) {
			this.setCells(cells);
		} else {
			throw new CustomLifeException("uniformly initialized");
		}
	}

	private void initialize(ArrayList<Cell> cells) {
		int i = 0;
		Random r = new Random();
		while (!this.isUniformlyInitialized(cells)) {
			i = r.nextInt(width * height);
			boolean state = cells.get(r.nextInt(width * height)).getState();
			cells.get(i).setState(!state);
		}
	}

	private boolean isUniformlyInitialized(ArrayList<Cell> cells) {
		int aliveCells = 0;
		int deadCells = 0;
		for (Cell c : cells) {
			if (c.getState()) {
				aliveCells++;
			} else {
				deadCells++;
			}
		}

		if ((width * height) % 2 == 0) {
			if (Math.abs(aliveCells - deadCells) == 0) {
				return true;
			} else {
				return false;
			}
		} else {
			if (Math.abs(aliveCells - deadCells) >= 0 && Math.abs(aliveCells - deadCells) <= 1) {
				return true;
			} else {
				return false;
			}
		}

	}

	public Grid(int w, int h) throws CustomLifeException {
		if (w != h) {
			throw new CustomLifeException("cell outside limits");
		}
		setHeight(h);
		setWidth(w);
	}

	public Grid tick() {
		ArrayList<Cell> cellsAfterTick = new ArrayList<>();
		ArrayList<Cell> neighbors = new ArrayList<>();
		for(Cell c: cells){
			neighbors = getNeighbors(c.getX(),c.getY());
		}
//			if(c.getX() == 0 && c.getY() == 0 || c.getX() == width && c.getY() == 0 ||
//				 c.getX() == 0 && c.getY() == height || c.getX() == width && c.getY() == height){
//				if(c.getX() == 0){
//					if(c.getY() == 0){
//						
//					}
//				}
//			}
//		}
	}
	
	private ArrayList<Cell> getNeighbors(int x, int y) {
		ArrayList<Cell> neighs = new ArrayList<>();
		Cell c = new Cell();
		for(Cell ce : this.cells){
		}
		neighs.add(c);
		return null;
	}

	public ArrayList<Cell> getCells() {
		ArrayList<Cell> cellsTemp = new ArrayList();
		cellsTemp = cells;
		return cellsTemp;
	}

	public void setCells(ArrayList<Cell> cells) {
		this.cells = cells;
	}

	public String print() {
		String state = "";

		for (Cell c : cells) {
			if (c.getState()) {
				state += "*";
			} else {
				state += "-";
			}
			if ((c.getY() + 1) % width == 0) {
				state += "\n";
			}
		}

		return state;
	}

}
