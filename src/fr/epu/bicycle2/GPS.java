package fr.epu.bicycle2;

public class GPS {

    private Position position;

    public GPS() {
        position = new Position();
    }

    public Position getPosition() {
        return this.position;
    }

    private void setPosition(int x, int y) {
        this.position.setX(x);
        this.position.setY(y);
    }

}
