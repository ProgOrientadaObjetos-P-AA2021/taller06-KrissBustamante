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
public class Ciudad {

    private String ciudad;
    private String provincia;

    public Ciudad(String c, String p) {

        ciudad = c;
        provincia = p;

    }

    public void establecerCiudad(String n) {
        ciudad = n;
    }

    public String obtenerCiudad() {
        return ciudad;
    }

    public void establecerProvincia(String n) {
        provincia = n;
    }

    public String obtenerProvincia() {
        return provincia;
    }
}
