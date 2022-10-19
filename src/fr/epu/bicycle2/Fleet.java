package fr.epu.bicycle2;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Fleet {

    private List<Trackable> trackableVehicles;

    public Fleet() {
        trackableVehicles = new ArrayList<>();
    }

    public void addVehicleToFleet(Trackable vehicle) {
        this.trackableVehicles.add(vehicle);
    }

    public List<Trackable> around(Position position, int distanceMax) {
        List<Trackable> trackableVehicleAround = new ArrayList<>();
        for (Trackable vehicle : this.trackableVehicles) {
            Optional<Position> positionOptional = vehicle.getPosition();
            if (positionOptional.isPresent()) {
                Position posVehicle = positionOptional.get();
                if (posVehicle.distance(position) <= distanceMax) {
                    trackableVehicleAround.add(vehicle);
                }
            }
        }
        return trackableVehicleAround;
    }

    public int numberOfVehicles() {
        return this.trackableVehicles.size();
    }
}
