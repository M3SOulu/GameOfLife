package classes;

import java.util.ArrayList;
import java.util.Iterator;

public class Grid {
	private ArrayList<Cell> cells;
	private int width;
	private int height;

	public Grid(ArrayList<Cell> cells, int w, int h)
			throws CellCoordinateOutOfBoundariesException, CustomLifeException {
		if (w != h)
			throw new CellCoordinateOutOfBoundariesException("Rows and Columns not Equals");

		this.cells = new ArrayList<>(cells.size());

		if (cells.size() != (w * h))
			throw new CellCoordinateOutOfBoundariesException("Index Out Of Boundaries");

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

	public void countCellNeighbors(int w, int h) {
		int numberNeighborsAlive = 0;
		int numberNeighborsDead = 0;
		Cell altraCella;

		if (w == 0 && w == 0) {

		} else {
			for (int i = w - 1; i <= w; i++) {
				for (int j = h - 1; j <= h; j--) {
					if(cells.contains(altraCella.get))){
						
					}
				}
			}
		}

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
