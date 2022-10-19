package fr.epu.bicycle2;

import java.util.Optional;

public class Bike implements Trackable {

    private Position position;

    public Bike() {
        position = new Position();
    }

    @Override
    public Optional<Position> getPosition() {
        return Optional.ofNullable(this.position);
    }

    public void setPosition(Position position) {
        this.position = position;
    }
}
