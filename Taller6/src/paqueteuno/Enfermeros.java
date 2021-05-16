/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqueteuno;

/**
 *
 * @author USER
 */
public class Enfermeros {

    private String nombre;
    private String tipo;
    private double Smensual;

    public Enfermeros(String n, String t, double s) {

        nombre = n;
        tipo = t;
        Smensual = s;

    }

    public void establecerNombre(String n) {
        nombre = n;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public void establecerTipo(String n) {
        tipo = n;
    }

    public String obtenerTipo() {
        return tipo;
    }

    public void establecerSmensual(double n) {
        Smensual = n;
    }

    public double obtenerSmensual() {
        return Smensual;
    }
}
