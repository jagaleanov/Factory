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
public abstract class Antena {

    private String patron;
    private double swr;
    private double potencia;

    public void setPatron(String patron) {
        this.patron = patron;
    }

    public void setSwr(double swr) {
        this.swr = swr;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    public String getPatron() {
        return patron;
    }

    public double getSwr() {
        return swr;
    }

    public double getPotencia() {
        return potencia;
    }
}
