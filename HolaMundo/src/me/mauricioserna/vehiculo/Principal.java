package me.mauricioserna.vehiculo;

import java.util.ArrayList;

/**
 * Created by mauricio on 8/06/17.
 */
public class Principal {
    public static void main(String[] args) {

        Vehiculo vehiculo = new Vehiculo("POI55E", "KTM", "Duke", 2016);

        ArrayList<Vehiculo> vehiculos = new ArrayList<Vehiculo>();

        vehiculos.add(vehiculo);
        vehiculos.add(new Vehiculo("BHI887", "Renault", "S10", 2017));
        vehiculos.add(new Vehiculo("JKI890", "MiniCooper"));

        vehiculos.forEach(vehiculoActual -> {
            System.out.println(vehiculoActual.getMatricula());
            System.out.println(vehiculoActual.getMarca());
            System.out.println(vehiculoActual.getModelo());
            System.out.println(vehiculoActual.getAnio());

            System.out.println("-----------------------------");
        });

        /*
        System.out.println("Matricula: " + vehiculo.getMatricula());
        System.out.println("Marca: " + vehiculo.getMarca());
        System.out.println("Modelo: " + vehiculo.getModelo());
        System.out.println("Anio: " + vehiculo.getAnio());
        */

        /*
        vehiculo.arrancar();
        vehiculo.frenar();
        vehiculo.reversa();
        vehiculo.arrancar();
        */
    }
}
