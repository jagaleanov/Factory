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
public class Microstrip extends Antena {

    public Microstrip() {
        setPatron("Microstrip");
        setSwr((double)1);
        setPotencia((double)8);
    }
}
