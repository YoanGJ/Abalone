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

		    if (i < 5) {
			    circles.get(0).add(new Circle());
		    	circles.get(0).get(count).setTranslateX(-120 + count*60);
		    	circles.get(0).get(count).setTranslateY(-240);
			    circles.get(0).get(count).setRadius(25.0f);
			    if (board.getBoard()[0][count].getType() == 0)
			    	circles.get(0).get(count).setFill(Color.GRAY);
			    else if  (board.getBoard()[0][count].getType() == 1)
			    	circles.get(0).get(count).setFill(Color.BLACK);
			    else
			    	circles.get(0).get(count).setFill(Color.GREEN);
			    getChildren().add(circles.get(0).get(count));
		    }
		    else if (i < 11) {
		    	circles.get(1).add(new Circle());
			    circles.get(1).get(count-5).setTranslateX(-150 + (count-5)*60);
			    circles.get(1).get(count-5).setTranslateY(-180);
			    circles.get(1).get(count-5).setRadius(25.0f);
			    if (board.getBoard()[1][count-5].getType() == 0)
			    	circles.get(1).get(count-5).setFill(Color.GRAY);
			    else if  (board.getBoard()[1][count-5].getType() == 1)
			    	circles.get(1).get(count-5).setFill(Color.BLACK);
			    else
			    	circles.get(1).get(count-5).setFill(Color.GREEN);
			    getChildren().add(circles.get(1).get(count-5));
		    }
		    else if (i < 18) {
		    	circles.get(2).add(new Circle());
			    circles.get(2).get(count-11).setTranslateX(-180 + (count-11)*60);
			    circles.get(2).get(count-11).setTranslateY(-120);
			    circles.get(2).get(count-11).setRadius(25.0f);
			    if (board.getBoard()[2][count-11].getType() == 0)
			    	circles.get(2).get(count-11).setFill(Color.GRAY);
			    else if  (board.getBoard()[2][count-11].getType() == 1)
			    	circles.get(2).get(count-11).setFill(Color.BLACK);
			    else
			    	circles.get(2).get(count-11).setFill(Color.GREEN);
			    getChildren().add(circles.get(2).get(count-11));
		    }
		    else if (i < 26) {
		    	circles.get(3).add(new Circle());
			    circles.get(3).get(count-18).setTranslateX(-210 + (count-18)*60);
			    circles.get(3).get(count-18).setTranslateY(-60);
			    circles.get(3).get(count-18).setRadius(25.0f);
			    if (board.getBoard()[3][count-18].getType() == 0)
			    	circles.get(3).get(count-18).setFill(Color.GRAY);
			    else if  (board.getBoard()[3][count-18].getType() == 1)
			    	circles.get(3).get(count-18).setFill(Color.BLACK);
			    else
			    	circles.get(3).get(count-18).setFill(Color.GREEN);
			    getChildren().add(circles.get(3).get(count-18));
		    }
		    else if (i < 35) {
		    	circles.get(4).add(new Circle());
			    circles.get(4).get(count-26).setTranslateX(-240 + (count-26)*60);
			    circles.get(4).get(count-26).setTranslateY(0);
			    circles.get(4).get(count-26).setRadius(25.0f);
			    if (board.getBoard()[4][count-26].getType() == 0)
			    	circles.get(4).get(count-26).setFill(Color.GRAY);
			    else if  (board.getBoard()[4][count-26].getType() == 1)
			    	circles.get(4).get(count-26).setFill(Color.BLACK);
			    else
			    	circles.get(4).get(count-26).setFill(Color.GREEN);
			    getChildren().add(circles.get(4).get(count-26));
		    }
		    else if (i < 43) {
		    	circles.get(5).add(new Circle());
			    circles.get(5).get(count-35).setTranslateX(-210 + (count-35)*60);
			    circles.get(5).get(count-35).setTranslateY(60);
			    circles.get(5).get(count-35).setRadius(25.0f);
			    if (board.getBoard()[5][count-35].getType() == 0)
			    	circles.get(5).get(count-35).setFill(Color.GRAY);
			    else if  (board.getBoard()[5][count-35].getType() == 1)
			    	circles.get(5).get(count-35).setFill(Color.BLACK);
			    else
			    	circles.get(5).get(count-35).setFill(Color.GREEN);
			    getChildren().add(circles.get(5).get(count-35));
		    }
		    else if (i < 50) {
		    	circles.get(6).add(new Circle());
			    circles.get(6).get(count-43).setTranslateX(-180 + (count-43)*60);
			    circles.get(6).get(count-43).setTranslateY(120);
			    circles.get(6).get(count-43).setRadius(25.0f);
			    if (board.getBoard()[6][count-43].getType() == 0)
			    	circles.get(6).get(count-43).setFill(Color.GRAY);
			    else if  (board.getBoard()[6][count-43].getType() == 1)
			    	circles.get(6).get(count-43).setFill(Color.BLACK);
			    else
			    	circles.get(6).get(count-43).setFill(Color.GREEN);
			    getChildren().add(circles.get(6).get(count-43));
		    }
		    else if (i < 56) {
		    	circles.get(7).add(new Circle());
			    circles.get(7).get(count-50).setTranslateX(-150 + (count-50)*60);
			    circles.get(7).get(count-50).setTranslateY(180);
			    circles.get(7).get(count-50).setRadius(25.0f);
			    if (board.getBoard()[7][count-50].getType() == 0)
			    	circles.get(7).get(count-50).setFill(Color.GRAY);
			    else if  (board.getBoard()[7][count-50].getType() == 1)
			    	circles.get(7).get(count-50).setFill(Color.BLACK);
			    else
			    	circles.get(7).get(count-50).setFill(Color.GREEN);
			    getChildren().add(circles.get(7).get(count-50));
		    }
		    else if (i < 61) {
		    	circles.get(8).add(new Circle());
			    circles.get(8).get(count-56).setTranslateX(-120 + (count-56)*60);
			    circles.get(8).get(count-56).setTranslateY(240);
			    circles.get(8).get(count-56).setRadius(25.0f);
			    if (board.getBoard()[8][count-56].getType() == 0)
			    	circles.get(8).get(count-56).setFill(Color.GRAY);
			    else if  (board.getBoard()[8][count-56].getType() == 1)
			    	circles.get(8).get(count-56).setFill(Color.BLACK);
			    else
			    	circles.get(8).get(count-56).setFill(Color.GREEN);
			    getChildren().add(circles.get(8).get(count-56));
		    }
	    }
		
		// add a mouse clicked listener that will try to place a piece
		setOnMouseClicked(new EventHandler<MouseEvent>() {
		// overridden handle method
			@Override
			public void handle(MouseEvent event) {
				
			}
		});
		
		setOnKeyPressed(new	EventHandler<KeyEvent>() {
			// overridden handle method
			@Override public void handle(KeyEvent	event) {
			}
		});
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
