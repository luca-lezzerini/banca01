package com.polis.banca01;

/**
 *
 * @author use
 */
public class ContoCorrente {

    private String iban = "";
    private double saldo = 0.0;

    public ContoCorrente(String iban, double saldo) {
        this.iban = iban;
        this.saldo = saldo;
    }
    
    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "ContoCorrente{" + "iban=" + iban + ", saldo=" + saldo + '}';
    }

}
