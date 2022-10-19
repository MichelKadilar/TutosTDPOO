package fr.epu.bicycle2;

/**
 * EBike est la classe représentant un vélo électrique ; TOTOTOTOTOOTO
 *
 * @author Michel K
 * @see GPS
 * @see Battery
 */
public class Scooter extends ElectricVehicle {

    private int vitesseMaximum;

    public Scooter(int vitesseMaximum) {
        this.km = 0;
        this.vitesseMaximum = vitesseMaximum;
    }

    public int getVitesseMaximum() {
        return this.vitesseMaximum;
    }
}
