package edu.ping.cotxox.domain.tarifa;

import edu.ping.cotxox.domain.carrera.Carrera;
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
        assertEquals(74.25, tarifa.getCosteDistancia(55), 0);
    }

    @Test
    public void getCosteTiempoTest() {
        assertEquals(3.50, tarifa.getCosteTiempo(10), 0);
    }

    @Test
    public void getCosteTotalEsperadoTest() {
        Carrera carrera = new Carrera("123456789");
        carrera.setDistancia(7.75);
        carrera.setTiempoEsperado(10);
        assertEquals(13.9625, tarifa.getCosteTotalEsperado(carrera), 0);

        Carrera carrera2 = new Carrera("123456789");
        assertEquals(5, tarifa.getCosteTotalEsperado(carrera2), 0);
    }

}
