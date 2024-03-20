
public class BouncyBalls {

	public static void main(String[] args) {
		 // set the scale of the coordinate system
        StdDraw.setXscale(-1.0, 1.0);
        StdDraw.setYscale(-1.0, 1.0);

        // initial values
        double posicionX = 0.480, posicionY = 0.860;     // position
        double posicionX2 = -0.480, posicionY2 = -0.860;     // position
        double veloX = 0.015, veloY = 0.023;     // velocity
        double radius = 0.05;              // radius

        // main animation loop
        extracted(posicionX,posicionX2, posicionY, posicionY2, veloX, veloY, radius); 		
	}

	private static void extracted(double posicionX, double posicionXX, double posicionY, double posicionYY, double veloX, double veloY, double radius) {
		while (true)  { 

            // bounce off wall according to law of elastic collision
            if (Math.abs(posicionX + veloX) > 1.0 - radius) veloX = -veloX;
            if (Math.abs(posicionY + veloY) > 1.0 - radius) veloY = -veloY;

            // update position
            posicionX = posicionX + veloX; 
            posicionY = posicionY + veloY; 

            StdDraw.clear(StdDraw.PINK);
            
            dibujaCirculo(posicionX, posicionY, radius); 
            dibujaCirculo(posicionXX, posicionYY, radius); 
            StdDraw.clear(StdDraw.PINK);


    		

    		// display and pause for 20 ms
    		StdDraw.show(2);
        }
	}

	private static void dibujaCirculo(double posicionX, double posicionY, double radius) {
		// clear the background
		

		// draw ball on the screen
		StdDraw.setPenColor(StdDraw.BLACK); 
		StdDraw.filledCircle(posicionX, posicionY, radius); 
		

		// display and pause for 20 ms
		StdDraw.show(20);
	}

}
