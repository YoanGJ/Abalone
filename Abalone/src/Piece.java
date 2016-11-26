import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Line;
import javafx.scene.transform.Translate;

public class Piece extends Group {

	private Line l1, l2;
	private Ellipse e;
	private int type;
	private Translate pos;
	
	public Piece(int type) {
		// create a new translate object and take a copy of the type
		pos = new Translate();
		this.type = type;
		
		if(type == 1) {
			// we have an X piece generate two lines and add them to // as render nodes add in the translate for our lines
			e = new Ellipse();
			getChildren().addAll(e);
			e.getTransforms().add(pos);
			e.setStroke(Color.WHITE);
		} else {
			// we have an O piece generate an oval and add it as a // render node
			e = new Ellipse();
			getChildren().addAll(e);
			e.getTransforms().add(pos);
			e.setStroke(Color.BLACK);
		}
	}
	
	// overridden version of the resize method
	@Override
	public void resize(double width, double height) {
		// call the super class method
		super.resize(width, height);
		
		// update depending on the type
		    
		// recenter the ellipse
		e.setCenterX(width / 2); e.setCenterY(height / 2);
		e.setRadiusX(width / 2); e.setRadiusY(height / 2);
	}
	
	// overridden version of the relocate method
	@Override
	public void relocate(double x, double y) {
		// call the superclass method and update the position
		super.relocate(x, y);
		pos.setX(x);
		pos.setY(y);
	}
	
}
