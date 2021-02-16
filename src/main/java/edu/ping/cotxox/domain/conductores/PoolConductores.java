package edu.ping.cotxox.domain.conductores;

import java.util.ArrayList;
import java.util.List;

public class PoolConductores {

    private List<Conductor> poolConductores = new ArrayList<Conductor>();


    public PoolConductores(List<Conductor> poolConductores) {
        this.poolConductores = poolConductores;
    }


    public List<Conductor> getPoolConductores() {
        return this.poolConductores;
    }

    public Conductor asignarConductor() {

        /*
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
        */

        Conductor conductor = null;
        for (Conductor cond : poolConductores) {
            if (!cond.isOcupado()) {
                cond.setOcupado(true);
                conductor = cond;
                break;
            }
        }
        return conductor;

        //return getPoolConductores().stream().filter(conductor -> !conductor.isOcupado()).findAny();
    }
}
