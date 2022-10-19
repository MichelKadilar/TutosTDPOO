package fr.epu.bicycle2;

import fr.epu.bicycle2.Position;

import java.util.Optional;

public interface Trackable {

    Optional<Position> getPosition();
}
