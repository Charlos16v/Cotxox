package edu.ping.cotxox.domain.tarifa;

import edu.ping.cotxox.domain.carrera.Carrera;

public class Tarifa {

    final static double COSTE_MILLA = 1.35;
    final static double COSTE_MINUTO = 0.35;
    final static double COSTE_MINIMO = 5.0;
    final static byte PORCENTAJE_COMISION = 20;


    public static double getCosteDistancia(double distancia) {
        return distancia * COSTE_MILLA;
    }

    public static double getCosteTiempo(double tiempo) {
        return tiempo * COSTE_MINUTO;
    }


    public static double getCosteTotalEsperado(Carrera carrera) {
        double coste = getCosteTiempo(carrera.getTiempoEsperado()) + getCosteDistancia(carrera.getDistancia());
        if (coste < COSTE_MINIMO) {
            return COSTE_MINIMO;
        } else {
            return coste;
        }
    }

}
