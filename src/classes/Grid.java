package classes;

import java.util.ArrayList;
import java.util.Random;

public class Grid {
	private ArrayList<Cell> cells;
	private int width;
	private int height;

	public Grid(ArrayList<Cell> cells, int w, int h)
			throws CellCoordinateOutOfBoundariesException, NegativeCoordinateException {
		if (w != h)
			throw new CellCoordinateOutOfBoundariesException("");
		if (w < 0 || h < 0)
			throw new NegativeCoordinateException("");
		width = w;
		height = h;
		if (cells == null) {
			randomGrid();
		} else {
			this.cells = cells;
		}
	}

	public Grid(int w, int h) throws CellCoordinateOutOfBoundariesException, NegativeCoordinateException {
		this(null, w, h);
	}

	public String print() {
		String res = "";
		int count = 0;
		for (int i = 0; i < width * height; i++) {
			if (count - width == 0) {
				res += "/n";
				count = 0;
			}
			count++;
			if (cells.get(i).getAlive())
				res += "*";
			else
				res += "-";
		}
		return res;
	}

	public Grid tick() throws CellCoordinateOutOfBoundariesException, NegativeCoordinateException {
		ArrayList<Cell> newCells = new ArrayList<>();
		Cell temp;
		int numNeighborsLife;
		int w = 0;
		int h = 0;
		for (int i = 0; i < width * height; i++) {
			numNeighborsLife = neighborsLife(i);
			if (cells.get(i).getAlive()) {
				if (numNeighborsLife < 2 || numNeighborsLife > 3)
					temp = new Cell(w, h, false);
				else
					temp = new Cell(w, h, true);
			} else {
				if (numNeighborsLife == 3)
					temp = new Cell(w, h, true);
				else
					temp = new Cell(w, h, false);
			}
			if (h + 1 - width == 0) {
				h = 0;
				w++;
			} else {
				h++;
			}
			newCells.add(temp);
		}

		return new Grid(newCells, width, height);
	}

	private void randomGrid() throws NegativeCoordinateException {
		Cell cell;
		Random random = new Random();
		int r;
		for (int i = 0; i < width; i++) {
			for (int y = 0; y < height; y++) {
				r = random.nextInt(2);
				if (r == 0)
					cell = new Cell(i, y, true);
				else
					cell = new Cell(i, y, false);
				cells.add(cell);
			}
		}
	} 

	private int neighborsLife(int pos) {
		int p;
		int res = 0;
		int[] arrayNeighbors = { pos - 1, pos + 1, pos - width, pos - width + 1, pos - width - 1, pos + width,
				pos + width + 1, pos + width - 1 };

		for (int i = 0; i < 8; i++) {
			p=arrayNeighbors[i];
			if (p < 0 || p > width) {
				continue;
			} else {
				if (cells.get(p).getAlive())
					res++;
			}
		}

		return res;
	}
}
