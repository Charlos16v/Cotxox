package edu.ping.cotxox.carrera;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class CarreraTest {

    private Carrera carrera = null;

    @Before
    public void setupCarrera() {
        carrera = new Carrera("123456789");
        assertNotNull(carrera);
    }

    @Test
    public void constructorTest() {
        assertNotNull(carrera);
    }
}
