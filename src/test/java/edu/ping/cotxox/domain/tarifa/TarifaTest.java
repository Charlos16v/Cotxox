package edu.ping.cotxox.domain.tarifa;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class TarifaTest {

    Tarifa tarifa = null;

    @Before
    public void setupTarifa() {
        tarifa = new Tarifa();
    }

    @Test
    public void constructorTest() {
        assertNotNull(tarifa);
    }

    @Test
    public void getCosteDistanciaTest() {
        assertEquals(79.25, tarifa.getCosteDistancia(55), 0);
    }

}
