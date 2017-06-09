package me.mauricioserna.poo;

/**
 * Created by mauricio on 8/06/17.
 */
public class Vehiculo {

    private String matricula;
    private String marca;
    private String modelo;
    private int anio;

    public Vehiculo(String matricula, String marca) {
        super();
        this.matricula = matricula;
        this.marca = marca;
    }


    public Vehiculo(String matricula, String marca, String modelo, int anio) {
        super();
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {

        if (matricula.length() == 6) {
            this.matricula = matricula;
        } else {
            System.out.println("La matricula debe ser de 6 caracteres.");
        }
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public void arrancar() {
        System.out.println("El vehiculo ha arrancado.");
    }

    public void frenar() {
        System.out.println("El vehiculo ha frenado.");
    }

    public void reversa() {
        System.out.println("El vehiculo esta reversando.");
    }
}
