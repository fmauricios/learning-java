package me.mauricioserna.conductor;

import me.mauricioserna.vehiculo.Taxi;

/**
 * Created by mauricio on 8/06/17.
 */
public class ConductorTaxi extends Conductor {
    private Taxi taxi;

    public ConductorTaxi(String nombre, String tipoLicencia, Taxi taxi) {
        super(nombre, tipoLicencia);
        this.taxi = taxi;
    }

    public Taxi getTaxi() {
        return taxi;
    }

    public void setTaxi(Taxi taxi) {
        this.taxi = taxi;
    }

    @Override
    public void mostrarVehiculo() {
        super.mostrarVehiculo();
        System.out.println(getTaxi().getMatricula());
        System.out.println(getTaxi().getMarca());
    }
}
