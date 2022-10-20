package fr.epu.bicycle2;

public abstract class BorrowableElectricVehicle extends ElectricVehicle implements BorrowableVehicle {
    protected boolean isBorrowed;

    public BorrowableElectricVehicle(int maxCharge) {
        super(maxCharge);
        this.isBorrowed = false;
    }

    public void setBorrowed(boolean borrowed) {
        this.isBorrowed = borrowed;
    }

    @Override
    public abstract boolean isBorrowable();
}
