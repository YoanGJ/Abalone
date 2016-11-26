import javafx.event.EventHandler;
import javafx.scene.control.Control;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;

public class CustomControl extends Control {

	private Board board;
	
	public CustomControl() {
		setSkin(new CustomControlSkin(this));
		board = new Board();
		getChildren().add(board);
		
		// add a mouse clicked listener that will try to place a piece
		setOnMouseClicked(new EventHandler<MouseEvent>() { // overridden handle method
		@Override
		public void handle(MouseEvent event) {
		            board.placePiece(event.getX(), event.getY());
		      }
		});
		
		setOnKeyPressed(new EventHandler<KeyEvent>() {
			// overridden handle method
			@Override
			public void handle(KeyEvent event) {
			if(event.getCode() == KeyCode.SPACE) board.resetGame();
				}
			});
	}
	
	public void resize(double width, double height) {
	     // update the size of the rectangle
	     super.resize(width, height);
	     board.resize(width, height);
	}
	
	
	
}
