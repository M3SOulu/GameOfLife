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

	public String print() {
		return null;
	}

	public Grid tick() {
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

	public String printState() {
		String state = "";

		for (Cell c : cells) {
			if (c.getState()) {
				state += "*";
			} else {
				state += "-";
			}
		}
		
		return state;
	}

}
