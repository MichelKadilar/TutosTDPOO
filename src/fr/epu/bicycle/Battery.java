package fr.epu.bicycle;

public class Battery {

    private int charge;

    private int maxCharge;

    public Battery(int maxCharge) { // Je ne sais pas si ce constructeur est vraiment celui voulu par la prof.
        // Mais c'est du détail.
        this.maxCharge = maxCharge;
        this.charge = maxCharge;
    }

    public void addCharge(int chargeToAdd) {
        if (this.charge + chargeToAdd >= 0 && this.charge + chargeToAdd <= 100) {
            this.charge += chargeToAdd;
        }
    }

    public int getMaxCharge(){
        return this.maxCharge;
    }
    public int getCharge() {
        return this.charge;
    }
}
