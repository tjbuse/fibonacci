package de.keyvance.fibonacci.model;

import java.math.BigInteger;
import java.util.List;

/**
 *
 * @author torsten
 */
public class Response {
    private List<BigInteger> fibonaccis;
    private int status;
    
    public List<BigInteger> getFibonaccis() {
        return fibonaccis;
    }

    public void setFibonaccis(List<BigInteger> fibonaccis) {
        this.fibonaccis = fibonaccis;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
    
}
