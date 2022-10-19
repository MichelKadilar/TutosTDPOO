package fr.epu.bicycle2;

/**
 * EBike est la classe représentant un vélo électrique ; TOTOTOTOTOOTO
 *
 * @author Michel K
 * @see GPS
 * @see Battery
 */
public class EBike extends ElectricVehicle {
    public static final int INITIAL_DISTANCE = 1;

    public EBike() {
        this.km = INITIAL_DISTANCE;
    }
}
