import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.transform.Translate;

public class AbaloneBoard extends Pane {
	
	private Cell[][] board = {
		{new Cell(1, 0, 0), new Cell(1, 0, 1), new Cell(1, 0, 2), new Cell(1, 0, 3), new Cell(1, 0, 4), new Cell(-1, 0, 5)},
		{new Cell(1, 1, 0), new Cell(1, 1, 1), new Cell(1, 1, 2), new Cell(1, 1, 3), new Cell(1, 1, 4), new Cell(1, 1, 5), new Cell(-1, 1, 6)},
		{new Cell(0, 2, 0), new Cell(0, 2, 1), new Cell(1, 2, 2), new Cell(1, 2, 3), new Cell(1, 2, 4), new Cell(0, 2, 5), new Cell(0, 2, 6), new Cell(-1, 2, 7)},
		{new Cell(0, 3, 0), new Cell(0, 3, 1), new Cell(1, 3, 2), new Cell(1, 3, 3), new Cell(1, 3, 4), new Cell(0, 3, 5), new Cell(0, 3, 6), new Cell(0, 3, 7), new Cell(-1, 3, 8)},
		{new Cell(0, 4, 0), new Cell(0, 4, 1), new Cell(1, 4, 2), new Cell(1, 4, 3), new Cell(1, 4, 4), new Cell(0, 4, 5), new Cell(0, 4, 6), new Cell(0, 4, 7), new Cell(0, 4, 8), new Cell(-1, 4, 9)},
		{new Cell(0, 5, 0), new Cell(0, 5, 1), new Cell(1, 5, 2), new Cell(1, 5, 3), new Cell(1, 5, 4), new Cell(0, 5, 5), new Cell(0, 5, 5), new Cell(0, 5, 7), new Cell(-1, 5, 8)},
		{new Cell(0, 6, 0), new Cell(0, 6, 1), new Cell(2, 6, 2), new Cell(2, 6, 3), new Cell(2, 6, 4), new Cell(0, 6, 5), new Cell(0, 6, 6), new Cell(-1, 6, 7)},
		{new Cell(2, 7, 0), new Cell(2, 7, 1), new Cell(2, 7, 2), new Cell(2, 7, 3), new Cell(2, 7, 4), new Cell(2, 7, 5), new Cell(-1, 7, 6)},
		{new Cell(2, 8, 0), new Cell(2, 8, 1), new Cell(2, 8, 2), new Cell(2, 8, 3), new Cell(2, 8, 4), new Cell(-1, 8, 5)},
	};
	
	public AbaloneBoard() {
		
		int x = 0;
		int y = 0;
		int max = 5;
		boolean dec = false;
		
		while (y <= 8) {
			while(x < max) {
				this.board[y][x].initNeighborsAndBoard(this);
				x++;
			}
			
			if (max == 9 ) dec = true;
			if (dec == false) max++;
			else max--;
			
			y++;
			x = 0;
		}
	}
	
	public void resize(double width, double height) {
		super.resize(width, height);
		
	}
	
	public void resetGame() {

	}
	
	public void placePiece(final double x, final double y) {
	
	}
	
	public Cell[][] getBoard() {
		return this.board;
	}
}
