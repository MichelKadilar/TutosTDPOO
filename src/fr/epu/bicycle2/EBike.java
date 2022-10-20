package fr.epu.bicycle2;

/**
 * EBike est la classe représentant un vélo électrique ; TOTOTOTOTOOTO
 *
 * @author Michel K
 * @see GPS
 * @see Battery
 */
public class EBike extends BorrowableElectricVehicle implements Borrowable {
    public static final int INITIAL_DISTANCE = 1;

    public EBike() {
        super(300);
        this.km = INITIAL_DISTANCE;
    }

    @Override
    public boolean isBorrowable() {
        return !this.isBorrowed &&
                (this.battery.getCharge() > ((double) 10 / 100) * this.battery.getMaxCharge());
    }
}
