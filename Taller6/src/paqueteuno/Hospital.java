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
public class Hospital {

    private String nHospital;
    private int nEspecialidades;
    private String direccion;
    private Medico[] medicos;
    private Enfermeros[] enfermeros;
    private double sueldoTotal;
    private Ciudad ciudad;

    public Hospital(Medico[] c, Enfermeros[] a, String b, int d, String e) {
        medicos = c;
        enfermeros = a;
        nHospital = b;
        nEspecialidades = d;
        direccion = e;

    }

    public void establecerMedicos(Medico[] n) {
        medicos = n;
    }

    public Medico[] obtenerMedico() {
        return medicos;
    }

    public void establecerEnfermeros(Enfermeros[] n) {
        enfermeros = n;
    }

    public Enfermeros[] obtenerEnfermeros() {
        return enfermeros;
    }

    public void establecerNHospital(String n) {
        nHospital = n;
    }

    public String obtenerNHospital() {
        return nHospital;
    }

    public void establecerNEspecialidades(int n) {
        nEspecialidades = n;
    }

    public int obtenerNEspecialidades() {
        return nEspecialidades;
    }

    public void establecerDireccion(String n) {
        direccion = n;
    }

    public String obtenerDireccion() {
        return direccion;
    }

    public void establecerCiudad(Ciudad n) {
        ciudad = n;
    }

    public Ciudad obtenerCiudad() {
        return ciudad;
    }

    public void calcularSueldoTotal() {
        double suma = 0;

        for (int i = 0; i < medicos.length; i++) {
            suma = suma + medicos[i].obtenerSmensual();

        }
        for (int i = 0; i < enfermeros.length; i++) {
            suma = suma + enfermeros[i].obtenerSmensual();

        }
        sueldoTotal = suma;

    }

    public double obtenerSueldoTotal() {

        return sueldoTotal;
    }

    @Override
    public String toString() {
String cadena ="";
        cadena = String.format("Hospital %s\n"
                + "Direccion: %s\nCiudad: %s\n"
                + "Provincia: %s\nNumero de especialidades%d\n",
                obtenerNHospital(), obtenerDireccion(),
                obtenerCiudad().obtenerCiudad(),
                obtenerCiudad().obtenerProvincia(), obtenerNEspecialidades());
        for (int i = 0; i < obtenerMedico().length; i++) {
            cadena = String.format("Listado de medicos\n"
                    + "%s -%s- Sueldo:%.2f- %s\n", cadena,
                    obtenerMedico()[i].obtenerDoctor(),
                    obtenerMedico()[i].obtenerSmensual(),
                    obtenerMedico()[i].obtenerEspecialidad());
        }
        for (int i = 0; i < obtenerEnfermeros().length; i++) {
            cadena = String.format("Listado de enfermeros(as)\n"
                    + "%s -%s- Sueldo:%.2f- %s\n", cadena,
                    obtenerEnfermeros()[i].obtenerNombre(),
                    obtenerEnfermeros()[i].obtenerSmensual(),
                    obtenerEnfermeros()[i].obtenerTipo());
        }
        cadena = String.format("%sTotal de sueldos a pagar por mes: %.2f\n",
                 cadena, obtenerSueldoTotal());
        return cadena;
    }

}
