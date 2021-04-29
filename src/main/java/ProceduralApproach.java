import processing.core.PApplet;

public class ProceduralApproach extends PApplet{
    private final int HEIGHT = 640;
    private final int WIDTH = 640;
    private int x = 0;
    private int y = HEIGHT/5;
    private final int DIAMETER = 25;

    public static void main(String[] args) {
        PApplet.main("ProceduralApproach",args);
    }
    @Override
    public void settings() {
        super.settings();
        size(WIDTH,HEIGHT);
    }

    @Override
    public void draw() {
        ellipse(x,y,DIAMETER,DIAMETER);
        x++;
    }
}
