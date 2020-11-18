package de.keyvance.fibonacci.model;

import java.math.BigInteger;

/**
 *
 * @author torsten
 */
public class FibonacciRequest {
    private BigInteger suchNummer;
    private int anzahlFibonaccis;
    

    public BigInteger getSuchNummer() {
        return suchNummer;
    }

    public void setSuchNummer(BigInteger suchNummer) {
        this.suchNummer = suchNummer;
    }

    public int getAnzahlFibonaccis() {
        return anzahlFibonaccis;
    }

    public void setAnzahlFibonaccis(int anzahlFibonaccis) {
        this.anzahlFibonaccis = anzahlFibonaccis;
    }    
}
