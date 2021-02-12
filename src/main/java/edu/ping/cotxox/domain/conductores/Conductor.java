package edu.ping.cotxox.domain.conductores;

public class Conductor {

    private final String nombre;
    private String matricula;
    private String modelo;
    private byte valoracion;

    public String getNombre() {
        return this.nombre;
    }

    public String getMatricula() {
        return this.matricula;
    }

    public String getModelo() {
        return this.modelo;
    }

    public byte getValoracion() {
        return this.valoracion;
    }

    public Conductor(String nombre) {
        this.nombre = nombre;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setValoracion(byte valoracion) {
        this.valoracion = valoracion;

    }

}
