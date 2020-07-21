/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorymethod.factory;

import factorymethod.antena.Antena;
import javax.swing.*;

/**
 *
 * @author jgale
 */
public class FactoryMethod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Graficador antenaFactory = new Graficador();

        Antena nuevaAntena;
        nuevaAntena = null;

        Object[] selectionValues = {"Yagi", "Microstrip", "LogPeriodica"};

        try {
            String seleccion = (String) JOptionPane.showInputDialog(
                    null,
                    "Qué tipo de antena desea crear?",
                    "Fabrica de antenas",
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    selectionValues,
                    "Yagi");

            nuevaAntena = antenaFactory.diseñaAntena(seleccion);

            JOptionPane.showMessageDialog(
                    null,
                    "<html>"
                    + "Se ha creado una antena!<br>"
                    + "Patron: " + nuevaAntena.getPatron() + "<br>"
                    + "SWR: " + nuevaAntena.getSwr() + "<br>"
                    + "Potencia: " + nuevaAntena.getPotencia() + "<br>"
                    + "</html>"
            );

        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "No se ha recibido ningun dato.");
        }
    }
}
