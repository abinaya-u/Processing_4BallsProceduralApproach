import processing.core.PApplet;

public class ProceduralApproach extends PApplet {
    private final int HEIGHT = 640;
    private final int WIDTH = 640;
    private int xCoordinate = 0;
    private int x1Coordinate = 0;
    private int x2Coordinate = 0;
    private int x3Coordinate = 0;
    private int yCoordinate = HEIGHT / 5;
    private int y1Coordinate = HEIGHT * 2 / 5;
    private int y2Coordinate = HEIGHT * 3 / 5;
    private int y3Coordinate = HEIGHT * 4 / 5;
    private final int DIAMETER = 25;

    public static void main(String[] args) {
        PApplet.main("ProceduralApproach", args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void draw() {
        ellipse(xCoordinate, yCoordinate, DIAMETER, DIAMETER);
        ellipse(x1Coordinate, y1Coordinate, DIAMETER, DIAMETER);
        ellipse(x2Coordinate, y2Coordinate, DIAMETER, DIAMETER);
        ellipse(x3Coordinate, y3Coordinate, DIAMETER, DIAMETER);
        xCoordinate++;
        x1Coordinate += 2;
        x2Coordinate += 3;
        x3Coordinate += 4;

    }
}
