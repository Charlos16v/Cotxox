package edu.ping.cotxox.carrera;

public class Carrera {

    private final String tarjetaCredito;
    private String origen;
    private String destino;
    private double distancia;
    private int tiempoEsperadoMinutos;

    public Carrera(String tarjetaCredito) {
        this.tarjetaCredito = tarjetaCredito;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public void setTiempoEsperado(int tiempoEsperadoMinutos) {
        this.tiempoEsperadoMinutos = tiempoEsperadoMinutos;
    }

    public String getTarjetaCredito() {
        return this.tarjetaCredito;
    }

    public String getOrigen() {
        return this.origen;
    }


    public String getDestino() {
        return this.destino;
    }


    public double getDistancia() {
        return this.distancia;
    }
}
