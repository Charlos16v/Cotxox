package edu.ping.cotxox.domain.conductores;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PoolConductores {

    private List<Conductor> poolConductores = new ArrayList<Conductor>();


    public PoolConductores(List<Conductor> poolConductores) {
        this.poolConductores = poolConductores;
    }


    public List<Conductor> getPoolConductores() {
        return this.poolConductores;
    }

    public Conductor asignarConductor() {

        Conductor conductor = new Conductor();
        Random numeroAleatorio = new Random();
        boolean asignado = false;

        while (!asignado) {

            int index = numeroAleatorio.nextInt(getPoolConductores().size());
            conductor = getPoolConductores().get(index);

            //
            if (!conductor.isOcupado()) {

                conductor.setOcupado(true);
                asignado = true;
            }
        }
        return conductor;
    }
}
