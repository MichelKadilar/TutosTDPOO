package fr.epu.bicycle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class EBikeTest {

    @Test
    void testCreateEBike() {
        EBike eBike = new EBike();
        assertEquals(EBike.INITIAL_DISTANCE, eBike.getKm());
    }

    @Test
    void addKm() {
        EBike eBike = new EBike();
        eBike.addKm(5);
        assertEquals(EBike.INITIAL_DISTANCE + 5, eBike.getKm());
    }

    @Test
    void testAddNegativeKm() {
        EBike bike = new EBike();
        int value = -5;
        bike.addKm(value);
        assertEquals(EBike.INITIAL_DISTANCE,bike.getKm());
    }
}