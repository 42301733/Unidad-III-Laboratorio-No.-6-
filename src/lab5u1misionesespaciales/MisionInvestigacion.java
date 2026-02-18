/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab5u1misionesespaciales;

/**
 *
 * @author Jorge
 */
public class MisionInvestigacion extends MisionEspacial
        implements Comunicable, Autoreparable {

    private int numeroExperimentos;
    private int numeroCientificos;

    public MisionInvestigacion(int numeroExperimentos, int numeroCientificos,
            String nombre, String destino, double distanciaKM, int duracionDias) {

        super(nombre, destino, distanciaKM, duracionDias);
        this.numeroExperimentos = numeroExperimentos;
        this.numeroCientificos = numeroCientificos;
    }

    @Override
    public double calcularCostoOperacion() {
        double costoBase;
        costoBase = (getDistanciaKM() * 100000) + (getDuracionDias() * 500000);

        double costoExtra = (numeroExperimentos * 100000)
                + (numeroCientificos * 10000);

        return costoBase + costoExtra;
    }

    public void mostrarDetalles() {
        System.out.println("Tipo: Investigacion");
        System.out.println("Nombre: " + getNombre());
        System.out.println("Destino: " + getDestino());
        System.out.println("Experimentos: " + numeroExperimentos);
        System.out.println("Cientificos: " + numeroCientificos);
        System.out.println("Costo total: $" + calcularCostoOperacion());
    }

    @Override
    public String transmitirDatos() {
        return "Transmite datos";
    }

    @Override
    public String ejecutarAutoreparacion() {
        return "Efectúa autoreparacion";
    }
}
