package fr.epu.bicycle2;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Station {
    private List<Bike> stationBikes;
    private Position position;

    public Station(Position position) {
        this.stationBikes = new ArrayList<>();
        this.position = position;
    }

    public void addBikeToStation(Bike bike) {
        this.stationBikes.add(bike);
        bike.setPosition(position);
    }

    public void removeBikeFromStation(Bike bike) {
        this.stationBikes.remove(bike);
        bike.setPosition(null);
    }

    public Optional<Position> findBikePositionInStation(Bike bike) {
        if (isBikeInStation(bike)) {
            Optional<Position> positionOptional = bike.getPosition();
            if (positionOptional.isPresent()) {
                return positionOptional;
            }
        }
        return Optional.empty();
    }

    private boolean isBikeInStation(Bike bike) {
        return stationBikes.contains(bike);
    }


    public List<Bike> getStationBikes() {
        return this.stationBikes;
    }

    public Position getPosition() {
        return this.position;
    }
}
