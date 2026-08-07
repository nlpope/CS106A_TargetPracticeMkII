/**
 * File: CS106A_TargetPracticeMkII.java
 * ----------------------------
 * This Java program draws a target to the canvas using more
 * streamlined center variables (cx,cy) and methods 
 * (createFilledCircle) than its predecessor.
 * 
 */

import acm.program.*;
import acm.graphics.*;
import java.awt.*;

public class CS106A_TargetPracticeMkII extends GraphicsProgram
{	
	/** Omission of below invokes java's auto-empty default constructor */
	/** Omission of super() inside of below invokes java's auto-invisible super() call */
	/**
	public CS106A_TargetPracticeMkII()
	{
		super();
	}
	*/
	
	public void run()
	{ 
		createTarget();
	}
	
	
	private void createTarget()
	{	
		//center x & y
		double cx = getWidth() / 2;
		double cy = getHeight() / 2;
		
		for(int i = 0; i < 5; i++){
			//add an x, add a y every time 
			double x = cx;
			double y = cy;
			double r = OUTER_RADIUS - (i * INNER_RADIUS + 20);
			Color circleColor = i % 2 == 0 ? Color.PINK : Color.WHITE;
			GOval newCircle = createFilledCircle(x, y, r, circleColor);
			add(newCircle);
		}
		
	}
	
	
	private GOval createFilledCircle(
			double x, double y,
			double r, Color color)
	{
		GOval circle = new GOval(x-r, y-r, 2*r, 2*r);
		circle.setColor(color);
		circle.setFilled(true);
		return circle;
	}
	
	private static final int N_CIRCLES = 5;
	private static final double OUTER_RADIUS = 75;
	private static final double INNER_RADIUS = 10;
}