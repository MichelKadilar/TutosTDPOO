package fr.epu.bicycle2;

/**
 * EBike est la classe représentant un vélo électrique ; TOTOTOTOTOOTO
 *
 * @author Michel K
 * @see GPS
 * @see Battery
 */
public class Scooter extends BorrowableElectricVehicle {

    private int vitesseMaximum;

    public Scooter(int vitesseMaximum) {
        super(300);
        this.km = 0;
        this.vitesseMaximum = vitesseMaximum;
    }

    public int getVitesseMaximum() {
        return this.vitesseMaximum;
    }
}
