 
import processing.core.*;
/**
 * Click is a subclass of Processing applet.
 *    -It will initialize the applet.
 *    -Shapes and text are drawn on the screen.
 *    -Mouse and keyboard input are read in.
 */
public class Click extends PApplet {
    private static final int HEIGHT = 400;
    private static final int WIDTH = 400;

    private int white;
    private int black;
    private int color1;
    private int color2;

    private int rectangleColor;

    /**
     * Launch the Processing Application.
     *     Calls settings() once, then setup() once, then draw() 30 times per second.
     * @param args - Program arguments are ignored.
     */
    public static void main(String args[]) {
        String packageFilename = "Click";
        PApplet.main(new String[] { packageFilename });
    }

    /**
     * Sets the Application Properties.
     */
    public void settings() {
        size(WIDTH,HEIGHT); // Set size of screen
    }

    /**
     * Called once at the start
     */
    public void setup() {
        white = color(255,255,255); // (r, g, b) [0, 256)
        black = color(0,0,0);
        // TODO 1: Customize the two colors of the square
        color1 = color(0,255,255);
        color2 = color(255,255,0);
        rectangleColor = color1;
    }

    /**
     * Called once per frame until program exits.
     */
    public void draw() {
        background(white); // Fill background color with white
        
        fill(rectangleColor); // Set the color to fill in shapes (like rectangles)
        noStroke(); // When shapes are drawn, do not add a border.
        
        /**
         * TODO 3: Change the coordinates and size of the rectangle
         *      -Modify mousePressed so that it correctly identifies clicks on differently
         *         sized rectangles.
         */
        rect(100, 100, 200, 200); // upper-left corner x, upper left corner y, width, height
        
        // Write mouse position
        fill(black);
        textSize(16);
        textAlign(RIGHT, BOTTOM);
        String mouse = "x: " + mouseX + " y:" + mouseY;
        text(mouse, 400, 400);
    }

    /**
     * Handle Mouse press (Down)
     */
    public void mousePressed() {
        /**
         * TODO 2: Make mousePressed change the color only when the square is clicked on.
         *      -Find the values for the mouse's X and Y coordinates. See draw()
         *      -Check: Is the mouse X too far to left? (too small)
         *      -Check: Is the mouse X too far to the right? (too big)
         *      -Check: Is the mouse Y too far above? (too small)
         *      -Check: Is the mouse Y too far below? (too big)
         *      -When none of the above is true, change the color.
         */
        rectangleColor = color2;
    }

    /**
     * Handle Mouse release (Up)
     */
    public void mouseReleased() {
        rectangleColor = color1;
    }
}
