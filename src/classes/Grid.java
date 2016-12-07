package classes;

import java.util.ArrayList;
import java.util.Iterator;

public class Grid {
	private ArrayList<Cell> cells;
	private int width;
	private int height;

	Iterator<Cell> cellIterator;

	public Grid(ArrayList<Cell> cells, int w, int h)
			throws CellCoordinateOutOfBoundariesException, CustomLifeException {
		if (w != h)
			throw new CellCoordinateOutOfBoundariesException("Rows and Columns not Equals");
		if (cells.size() != (w * h))
			throw new CellCoordinateOutOfBoundariesException("Index Out Of Boundaries");
		this.cells = new ArrayList<>(cells.size());
		if (!isEqualsAliveDead())
			throw new CustomLifeException("cells alive!=dead");
		width = w;
		height = h;
	}

	public Grid(int w, int h) throws CellCoordinateOutOfBoundariesException {
		if (w != h)
			throw new CellCoordinateOutOfBoundariesException("Rows and Columns not Equals");
		width = w;
		height = h;
		this.cells = new ArrayList<>(w * h);

	}

	public String print() {
		return null;
	}

	public Grid tick() {
		return null;
	}

	public boolean isEqualsAliveDead() {
		int alive = 0;
		int dead = 0;
		for (int i = 0; i < cells.size(); i++) {
			if (cells.get(i).getAlive() == true) {
				alive++;
			} else {
				dead++;
			}
		}
		return alive == dead;
	}

}
