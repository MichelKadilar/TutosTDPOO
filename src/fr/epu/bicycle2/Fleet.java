package fr.epu.bicycle2;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Fleet {

    private List<BorrowableVehicle> borrowableVehicles;

    public Fleet() {
        borrowableVehicles = new ArrayList<>();
    }

    public void addVehicleToFleet(BorrowableVehicle vehicle) {
        this.borrowableVehicles.add(vehicle);
    }

    public List<BorrowableVehicle> around(Position position, int distanceMax) {
        List<BorrowableVehicle> borrowableVehicleAround = new ArrayList<>();
        for (BorrowableVehicle vehicle : this.borrowableVehicles) {
            Optional<Position> positionOptional = vehicle.getPosition();
            if (positionOptional.isPresent()) {
                Position posVehicle = positionOptional.get();
                if (posVehicle.distance(position) <= distanceMax && vehicle.isBorrowable()) {
                    borrowableVehicleAround.add(vehicle);
                }
            }
        }
        return borrowableVehicleAround;
    }

    public int numberOfVehicles() {
        return this.borrowableVehicles.size();
    }
}
