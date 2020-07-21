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
public class Yagi extends Antena {

    public Yagi() {
        setPatron("Yagi");
        setSwr((double)2);
        setPotencia((double)3);
    }
}
