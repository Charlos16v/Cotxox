package edu.ping.cotxox.domain.tarifa;

public class Tarifa {

    private final double costeMilla = 1.35;
    private final double costeMinuto = 0.35;
    private final int costeMinimo = 5;
    private final int porcentajeComision = 20;

    public double getCosteDistancia(double distancia) {
        return costeMinimo + (distancia * costeMilla);
    }
}
