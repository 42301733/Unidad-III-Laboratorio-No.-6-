/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab5u1misionesespaciales;

/**
 *
 * @author Jorge
 */
public class MisionExploracion extends MisionEspacial
        implements Comunicable, Autoreparable {

    private int nivelDificultad;

    public MisionExploracion(int nivelDificultad, String nombre,
            String destino, double distanciaKM, int duracionDias) {

        super(nombre, destino, distanciaKM, duracionDias);
        this.nivelDificultad = nivelDificultad;
    }

    @Override
    public double calcularCostoOperacion() {

        double costoBase = (getDistanciaKM() * 100000)
                + (getDuracionDias() * 500000);

        double costoExtra = 0;

        switch (nivelDificultad) {
            case 1:
                costoExtra = 30000;
                break;
            case 2:
                costoExtra = 50000;
                break;
            case 3:
                costoExtra = 80000;
                break;
        }

        return costoBase + costoExtra;
    }

    public void mostrarDetalles() {
        System.out.println("Tipo: Exploracion");
        System.out.println("Nombre: " + getNombre());
        System.out.println("Destino: " + getDestino());
        System.out.println("Costo total: $" + calcularCostoOperacion());
    }

    @Override
    public String transmitirDatos() {
        return "Transmite datos";
    }

    @Override
    public String ejecutarAutoreparacion() {
        return "Efectua autoreparación";
    }
}
