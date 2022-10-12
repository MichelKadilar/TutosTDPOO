package fr.epu.bicycle;

/**
 * EBike est la classe représentant un vélo électrique ; TOTOTOTOTOOTO
 *
 * @author Michel K
 * @see GPS
 * @see Battery
 */
public class EBike {

    private int km;

    private GPS gps;

    private Battery battery;

    public static final int INITIAL_DISTANCE = 1;

    public EBike() {
        this.km = INITIAL_DISTANCE;
        gps = new GPS();
        battery = new Battery(100); // valeur au hasard, 100% de charge maximum est logique pour le moment.
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

    public Position getPosition() {
        return this.gps.getPosition();
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

    private void setKm(int kmToSet) {
        this.km = kmToSet;
    }
}
