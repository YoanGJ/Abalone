package desserre_aymeric_2927762_assignment3;

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
	ArrayList<Circle> circles = new ArrayList<>();
	
	//constructor for the class
	public CustomControl() {
		// set a default skin and generate a game board
		setSkin(new CustomControlSkin(this));
		/*xoboard = new XOUltimateBoard();
		getChildren().add(xoboard);*/
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
		    circles.add(new Circle());
		    if (i < 5) {
		    	circles.get(i).setTranslateX(-120 + count*60);
		    	circles.get(i).setTranslateY(-240);
		    }
		    else if (i < 11) {
			    circles.get(i).setTranslateX(-150 + (count-5)*60);
			    circles.get(i).setTranslateY(-180);
		    }
		    else if (i < 18) {
			    circles.get(i).setTranslateX(-180 + (count-11)*60);
			    circles.get(i).setTranslateY(-120);
		    }
		    else if (i < 26) {
			    circles.get(i).setTranslateX(-210 + (count-18)*60);
			    circles.get(i).setTranslateY(-60);
		    }
		    else if (i < 35) {
			    circles.get(i).setTranslateX(-240 + (count-26)*60);
			    circles.get(i).setTranslateY(0);
		    }
		    else if (i < 43) {
			    circles.get(i).setTranslateX(-210 + (count-35)*60);
			    circles.get(i).setTranslateY(60);
		    }
		    else if (i < 50) {
			    circles.get(i).setTranslateX(-180 + (count-43)*60);
			    circles.get(i).setTranslateY(120);
		    }
		    else if (i < 56) {
			    circles.get(i).setTranslateX(-150 + (count-50)*60);
			    circles.get(i).setTranslateY(180);
		    }
		    else if (i < 61) {
			    circles.get(i).setTranslateX(-120 + (count-56)*60);
			    circles.get(i).setTranslateY(240);
		    }
		    circles.get(i).setRadius(25.0f);
		    circles.get(i).setFill(Color.GRAY);
		    getChildren().add(circles.get(i));
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
	
	//override the resize method
	@Override
	public void resize(double width, double height) {
		// update the size of the rectangle
		super.resize(width, height);
	}
}
