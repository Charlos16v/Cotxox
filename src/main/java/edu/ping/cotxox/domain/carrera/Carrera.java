package edu.ping.cotxox.domain.carrera;

import edu.ping.cotxox.domain.conductores.Conductor;
import edu.ping.cotxox.domain.conductores.PoolConductores;
import edu.ping.cotxox.domain.tarifa.Tarifa;

public class Carrera {

    private final String tarjetaCredito;
    private String origen;
    private String destino;
    private double distancia;
    private int tiempoEsperadoMinutos;
    private double costeTotal;
    private double propina;


    private Conductor conductor = null;

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

    public int getTiempoEsperado() {
        return this.tiempoEsperadoMinutos;
    }

    public double getCosteEsperado() {
        return Tarifa.getCosteTotalEsperado(this);
    }

    public Conductor getConductor() {
        return this.conductor;
    }

    public void setConductor(Conductor conductor) {
        this.conductor = conductor;
    }

    public void asignarConductor(PoolConductores conductores) {
        setConductor(conductores.asignarConductor());
    }

    public void realizarPago(double costeEsperado) {
        this.costeTotal = costeEsperado;
    }

    public void liberarConductor() {
        conductor.setOcupado(false);
    }

    public void recibirPropina(int propina) {
        this.propina = propina;
    }

    public double getPropina() {
        return this.propina;
    }

    public double getCosteTotal() {
        return this.costeTotal;
    }
}
