/**
* @author Brendan
* @version Lab 01
* @version CPE102-03
*/

import java.awt.Color;
import java.awt.Point;
import java.util.ArrayList;
import java.lang.Math; 

public interface Shape {

	double getArea();

	Color getColor();

	void setColor(Color color);

	boolean getFilled();

	void setFilled(boolean filled);

	void move(Point point);

}