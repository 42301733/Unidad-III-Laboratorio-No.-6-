/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab5u1misionesespaciales;

/**
 *
 * @author Jorge
 */
public abstract class MisionEspacial {

    private String nombre;
    private String destino;
    private double distanciaKM;
    private int duracionDias;

    public MisionEspacial(String nombre, String destino, double distanciaKM, int duracionDias) {
        this.nombre = nombre;
        this.destino = destino;
        this.distanciaKM = distanciaKM;
        this.duracionDias = duracionDias;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the destino
     */
    public String getDestino() {
        return destino;
    }

    /**
     * @param destino the destino to set
     */
    public void setDestino(String destino) {
        this.destino = destino;
    }

    /**
     * @return the distanciaKM
     */
    public double getDistanciaKM() {
        return distanciaKM;
    }

    /**
     * @param distanciaKM the distanciaKM to set
     */
    public void setDistanciaKM(double distanciaKM) {
        this.distanciaKM = distanciaKM;
    }

    /**
     * @return the duracionDias
     */
    public int getDuracionDias() {
        return duracionDias;
    }

    /**
     * @param duracionDias the duracionDias to set
     */
    public void setDuracionDias(int duracionDias) {
        this.duracionDias = duracionDias;
    }

    public void iniciarMision() {
        System.out.println("La mision: " + getNombre() + "con destino a " + getDestino() + " ha sido iniciada");
    }

    public void finalizarMision() {
        System.out.println("La mision: " + getNombre() + " ha sido finalizada");
    }

    public abstract double calcularCostoOperacion();
    public abstract void mostrarDetalles();
}
