/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejecutor;

import java.util.Scanner;
import paqueteuno.Hospital;
import paqueteuno.Medico;
import paqueteuno.Enfermeros;
import paqueteuno.Ciudad;

public class Principal {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int numMedicos;
        int numEnfermeros;
        Medico[] medicos;
        Enfermeros[] enfermeros;
        String nHospital;
        int nEspecialidades;
        String direccion;
        String ciudad;
        String provincia;

        String nomMe;
        String especialidad;
        double sueldom;

        String nomEn;
        String tipo;
        double sueldoe;

        System.out.println("Ingrese el nombre del Hospital");
        nHospital = entrada.nextLine();

        System.out.println("Ingrese la direccion del Hospital");
        direccion = entrada.nextLine();
        
        
        System.out.println("Ingrese la ciudad del Hospital");
        ciudad = entrada.nextLine();

        System.out.println("Ingrese la provincia de la ciudad");
        provincia = entrada.nextLine();
        entrada.nextLine();
        

        System.out.println("Ingrese el número de  Especialidades el Hospital");
        nEspecialidades = entrada.nextInt();

        System.out.println("Ingrese el numero de Medicos");
        numMedicos = entrada.nextInt();

        System.out.println("Ingrese el número de  Enfermer@s");
        numEnfermeros = entrada.nextInt();

        medicos = new Medico[numMedicos];
        enfermeros = new Enfermeros[numEnfermeros];

        for (int i = 0; i < numMedicos; i++) {
            System.out.printf("Ingrese el nombre del medico %d\n", i + 1);
            nomMe = entrada.nextLine();
entrada.nextLine();
            System.out.printf("Ingrese la especialidad del medico %d\n", i + 1);
            especialidad = entrada.nextLine();
            entrada.nextLine();
                    
            System.out.printf("Ingrese el sueldo mensual del medico %d\n", i + 1);
            sueldom = entrada.nextDouble();
            entrada.nextLine();

            // con las variables se procede
            // a crear un objeto de tipo Medico
            Medico m = new Medico(nomMe, especialidad, sueldom);

            // Se agrega el objeto  creado al arreglo "medicos"
            medicos[i] = m;

        }
        //ahora procedemos a hacer lo mismo para el arreglo de enfermer@s 
        // cambiando las variables ;)

        for (int i = 0; i < numEnfermeros; i++) {
            System.out.printf("Ingrese el nombre del enfermer@ %d\n", i + 1);
            nomEn = entrada.nextLine();

            System.out.printf("Ingrese el tipo de enfermero"
                    + "(nombramiento, contrato) %d\n", i + 1);
            tipo = entrada.nextLine();
            entrada.nextLine();

            System.out.printf("Ingrese el sueldo mensual del enfermer@ %d\n",
                    i + 1);
            sueldoe = entrada.nextDouble();

            entrada.nextLine();
            // con las variables se procede
            // a crear un objeto de tipo enfermeros
            Enfermeros e = new Enfermeros(nomEn, tipo, sueldoe);

            // Se agrega el objeto  creado al arreglo "medicos"
            enfermeros[i] = e;

        }
        //  Se procede a crear el objeto de tipo "hospital" ""

        Hospital h = new Hospital(medicos, enfermeros, nHospital,
                nEspecialidades, direccion);
        
        Ciudad c = new Ciudad(ciudad ,provincia);

        h.calcularSueldoTotal();

        System.out.println(h.toString());
    }

}
