import java.util.ArrayList;

//imports for the class
import javafx.event.EventHandler;
import javafx.scene.control.Control;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;

//class definition for a custom control
class CustomControl extends Control {
	//private fields of the class
	ArrayList<ArrayList<Circle>> circles = new ArrayList<>();
	private AbaloneBoard board;
	
	//constructor for the class
	public CustomControl() {
		// set a default skin and generate a game board
		setSkin(new CustomControlSkin(this));
		/*xoboard = new XOUltimateBoard();
		getChildren().add(xoboard);*/
		ArrayList<Circle> lign1 = new ArrayList<>();
		ArrayList<Circle> lign2 = new ArrayList<>();
		ArrayList<Circle> lign3 = new ArrayList<>();
		ArrayList<Circle> lign4 = new ArrayList<>();
		ArrayList<Circle> lign5 = new ArrayList<>();
		ArrayList<Circle> lign6 = new ArrayList<>();
		ArrayList<Circle> lign7 = new ArrayList<>();
		ArrayList<Circle> lign8 = new ArrayList<>();
		ArrayList<Circle> lign9 = new ArrayList<>();
		circles.add(lign1);
		circles.add(lign2);
		circles.add(lign3);
		circles.add(lign4);
		circles.add(lign5);
		circles.add(lign6);
		circles.add(lign7);
		circles.add(lign8);
		circles.add(lign9);
		
				
		board = new AbaloneBoard();
		
		Polygon polygon = new Polygon();
	    polygon.getPoints().addAll(new Double[]{200.0, 0.0, 
                500.0, 0.0, 
                650.0, 275.0, 
                500.0, 550.0, 
                200.0, 550.0, 
                050.0, 275.0,
                200.0, 0.0 });
	    polygon.setFill(Color.WHITE);
	    getChildren().add(polygon);
	    
	    int count = 0;
	    for (int i = 0; i < 61; i++, count++) {
		    if (i < 5)
		    	addCircle(0, count, 0, -120, -240);
		    else if (i < 11) 
		    	addCircle(1, count, 5, -150, -180);
		    else if (i < 18)
		    	addCircle(2, count, 11, -180, -120);
		    else if (i < 26)
		    	addCircle(3, count, 18, -210, -60);
		    else if (i < 35)
		    	addCircle(4, count, 26, -240, 0);
		    else if (i < 43)
		    	addCircle(5, count, 35, -210, 60);
		    else if (i < 50)
		    	addCircle(6, count, 43, -180, 120);
		    else if (i < 56)
		    	addCircle(7, count, 50, -150, 180);
		    else if (i < 61)
		    	addCircle(8, count, 56, -120, 240);

	    }
	    
		setOnKeyPressed(new	EventHandler<KeyEvent>() {
			// overridden handle method
			@Override public void handle(KeyEvent	event) {
			}
		});
	}
	
	public void  addCircle(int line, int count, int lineCount, int translateX, int translateY) {
	    circles.get(line).add(new Circle());
    	circles.get(line).get(count-lineCount).setTranslateX(translateX + (count-lineCount)*60);
    	circles.get(line).get(count-lineCount).setTranslateY(translateY);
	    circles.get(line).get(count-lineCount).setRadius(25.0f);
	    if (board.getBoard()[line][count-lineCount].getType() == 0)
	    	circles.get(line).get(count-lineCount).setFill(Color.GRAY);
	    else if  (board.getBoard()[line][count-lineCount].getType() == 1)
	    	circles.get(line).get(count-lineCount).setFill(Color.BLACK);
	    else
	    	circles.get(line).get(count-lineCount).setFill(Color.GREEN);
	    
	    circles.get(line).get(count-lineCount).setOnMouseClicked(new EventHandler<MouseEvent>() {
			// overridden handle method
				@Override
				public void handle(MouseEvent event) {
					int tmpcount = count-lineCount;
					System.out.println("click Piece : " + line + " / " + tmpcount);
				}
			});
	    
	    getChildren().add(circles.get(line).get(count-lineCount));
	}
	
	public void initCells() {
		
	}
	//override the resize method
	@Override
	public void resize(double width, double height) {
		// update the size of the rectangle
		super.resize(width, height);
	}
}
