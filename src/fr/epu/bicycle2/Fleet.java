package fr.epu.bicycle2;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Fleet {

    private List<EBike> eBikeFleet;

    public Fleet() {
        eBikeFleet = new ArrayList<>();
    }

    public void addEbikeToFleet(EBike ebike) {
        this.eBikeFleet.add(ebike);
    }

    public List<EBike> around(Position position, int distanceMax) {
        List<EBike> ebikesAround = new ArrayList<>();
        for (EBike bike : this.eBikeFleet) {
            Optional<Position> positionOptional = bike.getPosition();
            if (positionOptional.isPresent()) {
                Position posEbike = positionOptional.get();
                if (posEbike.distance(position) <= distanceMax) {
                    ebikesAround.add(bike);
                }
            }
        }
        return ebikesAround;
    }

    public int numberOfVehicles() {
        return this.eBikeFleet.size();
    }
}
