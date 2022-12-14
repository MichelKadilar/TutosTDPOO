package fr.epu.bicycle2;

import java.util.Optional;

public class ElectricVehicle implements Trackable {

    protected int km;

    protected GPS gps;

    protected Battery battery;


    public ElectricVehicle(int maxCharge) {
        gps = new GPS();
        battery = new Battery(maxCharge);
    }

    /**
     * dgefqjeh
     *
     * @param nbKmToAdd le nombre de km à ajouter à l'attribut km
     */
    public void addKm(int nbKmToAdd) {
        if (nbKmToAdd > 0) {
            this.km += nbKmToAdd;
        }
    }

    @Override
    public Optional<Position> getPosition() {
        if (this.getCharge() > 0) {
            return Optional.of(this.gps.getPosition());
        }
        return Optional.empty();
    }

    public int getCharge() {
        return this.battery.getCharge();
    }

    /**
     * @return un entier représentant le nombre de km parcourus par le EBike.
     */
    public int getKm() {
        return this.km;
    }

    protected void setKm(int kmToSet) {
        this.km = kmToSet;
    }
}
