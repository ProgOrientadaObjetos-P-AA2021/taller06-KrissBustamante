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
public class Medico {

    private String doctor;
    private String especialidad;
    private double Smensual;

    public Medico(String d, String e, double s) {

        doctor = d;
        especialidad = e;
        Smensual = s;

    }

    public void establecerDoctor(String n) {
        doctor = n;
    }

    public String obtenerDoctor() {
        return doctor;
    }

    public void establecerEspecialidad(String n) {
        especialidad = n;
    }

    public String obtenerEspecialidad() {
        return especialidad;
    }

    public void establecerSmensual(double n) {
        Smensual = n;
    }

    public double obtenerSmensual() {
        return Smensual;
    }
}
