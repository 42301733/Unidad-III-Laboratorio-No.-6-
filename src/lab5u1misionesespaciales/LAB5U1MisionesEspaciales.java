/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab5u1misionesespaciales;

import java.util.ArrayList;

/**
 *
 * @author Jorge
 */
public class LAB5U1MisionesEspaciales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<MisionEspacial> misiones = new ArrayList<>();
        MisionExploracion misionexp = new MisionExploracion(1, "Terranova", "Marte", 3000, 10);
        MisionColonizacion misioncol = new MisionColonizacion(5, "Jupiter", "Pandora", 4000, 3000);
        MisionInvestigacion misioninves = new MisionInvestigacion(4, 3, "LabRicardi", "Saturno", 6000, 7);
        misiones.add(misionexp);
        misiones.add(misioncol);
        misiones.add(misioninves);
        for(MisionEspacial m : misiones){
            m.iniciarMision();
            m.mostrarDetalles();
            m.finalizarMision();
        }
    }
}
