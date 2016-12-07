package classes;

import java.util.ArrayList;

public class Grid {
	private ArrayList<Cell> cells;
	private int width;
	private int height;
	private Cell[][] grid;


	public Grid(ArrayList<Cell> cells, int w, int h) throws CellCoordinateOutOfBoundariesException{
		setWidth(w);
		setHeight(h);
		grid = new Cell[width][height];
		this.cells = cells;
		for(int i = 0; i<cells.size(); i++){
			if(cells.get(i).getX()>w || cells.get(i).getY()>h )
				throw new CellCoordinateOutOfBoundariesException("");
			else
				grid[cells.get(i).getX()][cells.get(i).getY()] = cells.get(i);
		}
	}
	
	public Grid(int w, int h) throws CellCoordinateOutOfBoundariesException {
		this(new ArrayList<Cell>(), w, h);
	}

	public String print() {
	    return null;
	}
	
	public Grid tick() throws NegativeCoordinateException {
		ArrayList<Cell> tickedCells = new ArrayList<Cell>();
		
		for(int i = 0; i<2; i++){
			for(int j = 0; j<2; j++){
				if(grid[i][j].isAlive() && countAliveNeighbors(i, j)<2)
					tickedCells.add(new Cell(i, j, false));	
				else if(grid[i][j].isAlive() && (countAliveNeighbors(i, j)==2 || countAliveNeighbors(i, j)==3))
					tickedCells.add(new Cell(i, j, true));
				else if(!grid[i][j].isAlive() && countAliveNeighbors(i, j)==3)
					tickedCells.add(new Cell(i, j, true));
			}
		}
		
	    return new Grid(tickedCells, width, height);
	}
	
	private int countAliveNeighbors(int x, int y){
		int count = 0;
		//Upper-Left Angle
		if(grid[0][1].isAlive())
			count++;
		if(grid[1][0].isAlive())
			count++;
		if(grid[1][1].isAlive())
			count++;
		
		return count;
	}

	public ArrayList<Cell> getCells() {
		return cells;
	}

	public void setCells(ArrayList<Cell> cells) {
		this.cells = cells;
	}

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
}
