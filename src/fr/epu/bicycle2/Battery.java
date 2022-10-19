package fr.epu.bicycle2;

public class Battery {

    private int charge;

    private int maxCharge;

    public Battery(int maxCharge) {
        this.maxCharge = maxCharge;
        this.charge = maxCharge;
    }

    public void addCharge(int chargeToAdd) {
        if (this.charge + chargeToAdd >= 0 && this.charge + chargeToAdd <= 100) {
            this.charge += chargeToAdd;
        }
    }

    public int getMaxCharge() {
        return this.maxCharge;
    }

    public int getCharge() {
        return this.charge;
    }
}
