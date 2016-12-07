package classes;

import java.util.ArrayList;

public class Grid {
	private ArrayList<Cell> cells;
	private int width;
	private int height;

	public Grid(ArrayList<Cell> cells, int w, int h)
			throws CellCoordinateOutOfBoundariesException, CellCoordinateDuplicate {
		width = w;
		height = h;
		this.cells = new ArrayList<Cell>();
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

	private boolean controlCellsConformity(ArrayList<Cell> arrayCells) {
		int alive = 0;
		int dead = 0;

		for (Cell cell : arrayCells) {
			if (cell.getState().equals("alive"))
				alive++;
			else
				dead++;
		}

		if (alive == dead)
			return true;
		else
			return false;
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
