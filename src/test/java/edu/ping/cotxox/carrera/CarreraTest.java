package edu.ping.cotxox.carrera;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class CarreraTest {

    private Carrera carrera = null;

    @Before
    public void setupCarrera() {
        carrera = new Carrera("123456789");
    }

    @Test
    public void constructorTest() {
        assertNotNull(carrera);
    }

    @Test
    public void setOrigenTest() {
        carrera.setOrigen("MasterLand");
        assertEquals("MasterLand", this.carrera.getOrigen());
    }

    @Test
    public void setDestinoTest() {
        carrera.setDestino("Noruega");
        assertEquals("Noruega", this.carrera.getDestino());
    }

    @Test
    public void setDistanciaTest() {
        carrera.setDistancia(69.00);
        assertEquals(69.00, this.carrera.getDistancia(), 0);
    }

    @Test
    public void setTiempoEsperadoTest() {
        carrera.setTiempoEsperado(10);
        assertEquals(10, this.carrera.getTiempoEsperado());
    }
}
