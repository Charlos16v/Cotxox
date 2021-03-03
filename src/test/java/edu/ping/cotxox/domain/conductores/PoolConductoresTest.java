package edu.ping.cotxox.domain.conductores;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class PoolConductoresTest {

    private final List<Conductor> poolConductores = new ArrayList<Conductor>();
    private Conductor conductor;

    @Test
    public void constructorTest() {
        String[] nombres = {"Master", "Rick", "Spiderman"};
        for (String nombre : nombres) {
            Conductor conductor = new Conductor(nombre);
            poolConductores.add(conductor);
        }

        String[] matricula = {"4ABC123", "5DHJ444", "8888"};
        String[] modelos = {"BMW E30", "Toyota Supra", "Mercedes W124"};

        int index = 0;
        // conductora.getClass().getFields();
        for (Conductor conductora : poolConductores) {
            conductora.setMatricula(matricula[index]);
            conductora.setModelo(modelos[index]);
            // suponemos que las conductoras tienen una valoracion inicial de 4 stars
            conductora.setValoracion((byte) 4);
            index++;
        }
        PoolConductores conductores = new PoolConductores(poolConductores);

        List lista = conductores.getPoolConductores();

        lista.forEach(System.out::println);


    }
}
