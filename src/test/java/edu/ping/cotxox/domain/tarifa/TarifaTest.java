package edu.ping.cotxox.domain.tarifa;

import edu.ping.cotxox.domain.carrera.Carrera;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TarifaTest {


    @Test
    public void getCosteDistanciaTest() {
        assertEquals(74.25, Tarifa.getCosteDistancia(55), 0);
    }

    @Test
    public void getCosteTiempoTest() {
        assertEquals(3.50, Tarifa.getCosteTiempo(10), 0);
    }

    @Test
    public void getCosteTotalEsperadoTest() {
        Carrera carrera = new Carrera("123456789");
        carrera.setDistancia(7.75);
        carrera.setTiempoEsperado(10);
        assertEquals(13.9625, Tarifa.getCosteTotalEsperado(carrera), 0);

        Carrera carrera2 = new Carrera("123456789");
        assertEquals(5, Tarifa.getCosteTotalEsperado(carrera2), 0);
    }

}
