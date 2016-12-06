import java.util.ArrayList;

public class Cell {
	
	private int type;
	private int x;
	private int y;
	private ArrayList<Cell> neighbors;
	private AbaloneBoard board;
	
	public Cell(int type, int y, int x) {
		this.x = x;
		this.y = y;
		this.type = type;
		this.neighbors = new ArrayList<Cell>(6);
	}
	
	public void initNeighborsAndBoard(AbaloneBoard board) {
		this.board = board;
		
		if(board.getBoard()[y][x + 1].getType() != -1)
		this.neighbors.add(board.getBoard()[y][x + 1]);
		else this.neighbors.add(null);
		
		if (y < 4) {
			if(board.getBoard()[y + 1][x + 1].getType() != -1)
				this.neighbors.add(board.getBoard()[y + 1][x + 1]);
			else this.neighbors.add(null);
		} else this.neighbors.add(null);
		
		if (y < 8) {
			if (board.getBoard()[y + 1][x].getType() != -1)
				this.neighbors.add(board.getBoard()[y + 1][x]);
			else this.neighbors.add(null);
		} else this.neighbors.add(null);
		
		if (x - 1 >= 0) 
		this.neighbors.add(board.getBoard()[y][x - 1]);
		else this.neighbors.add(null);
		
		if (x - 1 >= 0 && y - 1 >= 0)
		this.neighbors.add(board.getBoard()[y - 1][x - 1]);
		else this.neighbors.add(null);
		
		if (y - 1 >= 0) {
			this.neighbors.add(board.getBoard()[y - 1][x]);
		} else this.neighbors.add(null);
	}
	
	
	public int getType() {
		return this.type;
	}
}
