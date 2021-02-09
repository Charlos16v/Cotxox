package edu.ping.cotxox.domain.tarifa;

import edu.ping.cotxox.domain.carrera.Carrera;

public class Tarifa {

    private final double costeMilla;
    private final double costeMinuto;
    private final int costeMinimo;
    private final int porcentajeComision;

    public Tarifa() {
        this.costeMilla = 1.35;
        this.costeMinuto = 0.35;
        this.costeMinimo = 5;
        this.porcentajeComision = 20;
    }

    public double getCosteDistancia(double distancia) {
        return distancia * costeMilla;
    }

    public double getCosteTiempo(double tiempo) {
        return tiempo * costeMinuto;
    }

    public double getCosteTotalEsperado(Carrera carrera) {
        double coste = getCosteTiempo(carrera.getTiempoEsperado()) + getCosteDistancia(carrera.getDistancia());
        if ( coste < costeMinimo) {
            return costeMinimo;
        } else {
            return coste;
        }
    }

}
