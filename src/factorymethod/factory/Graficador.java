/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorymethod.factory;

import factorymethod.antena.Yagi;
import factorymethod.antena.Antena;
import factorymethod.antena.LogPeriodica;
import factorymethod.antena.Microstrip;

/**
 *
 * @author jgale
 */
public class Graficador {

    public Antena diseñaAntena(String tipoAntena) {
        switch (tipoAntena) {
            case "Yagi":
                return new Yagi();
            case "Microstrip":
                return new Microstrip();
            case "LogPeriodica":
                return new LogPeriodica();
            default:
                return null;
        }
    }
}
