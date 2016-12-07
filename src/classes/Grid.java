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
		for (int i = 0; i < width * height; i++) {
			if (cells.get(i).getAlive())
				res += "*";
			else
				res += "-";
			if(i+1-width==0)
				res+="/n";
		}
		return res;
	}

	public Grid tick() {
		return null;
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
}
