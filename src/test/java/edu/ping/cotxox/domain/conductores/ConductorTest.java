package edu.ping.cotxox.domain.conductores;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConductorTest {

    private Conductor conductor = null;

    @Before
    public void setupConductor() {
        conductor = new Conductor("Maquina");
    }

    @Test
    public void constructorTest() {
        assertNotNull(conductor);
    }

    @Test
    public void getNombreTest() {
        assertEquals("Maquina", conductor.getNombre());
    }

    @Test
    public void getMatriculaTest() {
        conductor.setMatricula("8888");
        assertEquals("8888", conductor.getMatricula());
    }

    @Test
    public void getModeloTest() {
        conductor.setModelo("Delorean");
        assertEquals("Delorean", conductor.getModelo());
    }

    @Test
    public void getValoracionTest() {
        conductor.setValoracion((byte) 10);
        assertEquals(10, conductor.getValoracion(), 0);
    }

    @Test
    public void setValoracionTest() {
        conductor.setValoracion((byte) 4);
        conductor.setValoracion((byte) 6);
        conductor.setValoracion((byte) 5);
        assertEquals(5, conductor.getValoracion(), 0);
    }

    @Test
    public void isOcupadoTest() {
        conductor.setOcupado(true);
        assertTrue(conductor.isOcupado());
        conductor.setOcupado(false);
        assertFalse(conductor.isOcupado());
    }


}
