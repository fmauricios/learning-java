package me.mauricioserna.conductor;

import me.mauricioserna.vehiculo.Bus;

/**
 * Created by mauricio on 8/06/17.
 */

public class ConductorBus extends Conductor{
    private Bus bus;

    public ConductorBus(String nombre, String tipoLicencia, Bus bus) {
        super(nombre, tipoLicencia);
        this.bus = bus;
    }

    public Bus getBus() {
        return bus;
    }

    public void setBus(Bus bus) {
        this.bus = bus;
    }

    @Override
    public void mostrarVehiculo() {
        super.mostrarVehiculo();
        System.out.println(getBus().getMatricula());

        getBus().getEstaciones().forEach(estacion -> {
            System.out.println(estacion);
        });
    }
}
