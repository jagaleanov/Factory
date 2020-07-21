/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorymethod.antena;

/**
 *
 * @author jgale
 */
public class LogPeriodica extends Antena {

    public LogPeriodica() {
        setPatron("LogPeriodica");
        setSwr((double)0);
        setPotencia((double)16);
    }

}
