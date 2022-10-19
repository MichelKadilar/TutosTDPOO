package fr.epu.bicycle2;

public class Position {

    private int x;
    private int y;

    private static final double EPSILON = 0.001;


    public Position(int posX, int posY) {
        this.x = posX;
        this.y = posY;
    }

    public Position() {
        this(0, 0);
    }


    public boolean isEquivalent(Position position) {
        return Math.abs(this.x - position.x) <= EPSILON && Math.abs(this.y - position.y) <= EPSILON;
    }

    public double distance(Position position) {
        double a = Math.pow(this.x - (double) position.x, 2.0);
        double b = Math.pow(this.y - (double) position.y, 2.0);
        return Math.sqrt(a + b);
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
}
