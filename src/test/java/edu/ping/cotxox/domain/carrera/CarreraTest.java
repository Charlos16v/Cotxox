package edu.ping.cotxox.domain.carrera;

import edu.ping.cotxox.domain.conductores.Conductor;
import edu.ping.cotxox.domain.conductores.PoolConductores;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class CarreraTest {

    private Carrera carrera = null;
    private final List<Conductor> conductores = new ArrayList<Conductor>();
    private PoolConductores poolConductores;


    @Before
    public void setupCarrera() {
        this.carrera = new Carrera("123456789");
        Conductor conductor = new Conductor("Master");

        this.conductores.add(conductor);

        this.poolConductores = new PoolConductores(conductores);
    }

    @Test
    public void constructorTest() {
        assertNotNull(carrera);
    }

    @Test
    public void getTarjetaCreditoTest() {
        assertEquals("123456789", carrera.getTarjetaCredito());
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

    @Test
    public void getCosteTotalEsperadoTest() {
        Carrera carrera = new Carrera("123456789");
        carrera.setDistancia(7.75);
        carrera.setTiempoEsperado(10);
        assertEquals(13.9625, carrera.getCosteEsperado(), 0);
    }

    @Test
    public void setConductorGetConductorTest() {
        Conductor conductor = new Conductor("Master");
        carrera.setConductor(conductor);
        assertEquals("Master", carrera.getConductor().getNombre());
    }

    @Test
    public void recibirGetPropina() {
        carrera.recibirPropina(20);
        assertEquals(20, carrera.getPropina(), 0.01);
    }

    @Test
    public void liberarConductor() {
        Conductor conductor = new Conductor("Master");
        carrera.setConductor(conductor);
        carrera.liberarConductor();
        assertFalse(conductor.isOcupado());
    }

    @Test
    public void asignarConductorTest() {
        this.carrera.asignarConductor(poolConductores);
        assertTrue(carrera.getConductor().isOcupado());
    }

}
