package fr.epu.bicycle;

public class Position {

    private int x;
    private int y;

    private static final double EPSILON = 0.001;

    public Position() {
        this.x = 0;
        this.y = 0;
    }


    public boolean isEquivalent(Position position) {
        return Math.abs(this.x - position.x) <= EPSILON && Math.abs(this.y - position.y) <= EPSILON;
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
