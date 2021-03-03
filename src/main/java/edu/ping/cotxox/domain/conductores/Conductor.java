package edu.ping.cotxox.domain.conductores;

import java.util.ArrayList;
import java.util.List;

public class Conductor {

    private String nombre = null;
    private String matricula = null;
    private String modelo = null;
    private double valoracionMedia = 0d;
    private boolean ocupado = false;
    private final List<Byte> valoraciones = new ArrayList<Byte>();

    public Conductor(String nombre) {
        this.nombre = nombre;
    }

    public Conductor() {
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getMatricula() {
        return this.matricula;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }

    public boolean isOcupado() {
        return this.ocupado;
    }

    public double getValoracion() {
        return this.valoracionMedia;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setValoracion(byte valoracion) {
        this.valoraciones.add(valoracion);
        calcularValoracionMedia();
    }

    public int getNumeroValoraciones() {
        return this.valoraciones.size();
    }

    public void calcularValoracionMedia() {
        double total = this.valoraciones.stream().mapToInt(num -> Integer.parseInt(String.valueOf(num)))
                .sum();
        this.valoracionMedia = total / getNumeroValoraciones();
    }

    @Override
    public String toString() {
        return "Nombre: " + getNombre() + '\n' +
                "Vehiculo: " + getModelo() + '\n' +
                "Matricula: " + getMatricula() + '\n' +
                "Valoración: " + getValoracion() + '\n';
    }


}
