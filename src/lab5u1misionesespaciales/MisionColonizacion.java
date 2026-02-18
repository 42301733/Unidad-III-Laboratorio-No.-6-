/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab5u1misionesespaciales;

/**
 *
 * @author Jorge
 */
public class MisionColonizacion extends MisionEspacial
        implements Autoreparable {

    private int numColonos;

    public MisionColonizacion(int numColonos, String nombre,
            String destino, double distanciaKM, int duracionDias) {

        super(nombre, destino, distanciaKM, duracionDias);
        this.numColonos = numColonos;
    }

    @Override
    public double calcularCostoOperacion() {

        double costoBase = (getDistanciaKM() * 100000)
                + (getDuracionDias() * 500000);

        double costoColonos = numColonos * 100000;

        return costoBase + costoColonos;
    }

    public void mostrarDetalles() {
        System.out.println("Tipo: Colonizacion");
        System.out.println("Nombre: " + getNombre());
        System.out.println("Destino: " + getDestino());
        System.out.println("Numero de colonos: " + numColonos);
        System.out.println("Costo total: $" + calcularCostoOperacion());
    }

    @Override
    public String ejecutarAutoreparacion() {
        return "Efectúa autoreparación";
    }
}
