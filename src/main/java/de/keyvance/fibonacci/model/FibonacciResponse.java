package de.keyvance.fibonacci.model;

import java.math.BigInteger;
import java.util.List;

/**
 *
 * @author torsten
 */
public class FibonacciResponse {
    private List<BigInteger> fibonaccis;
    private int status = 0;
    private String message = "";
    
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

    public String getMessage() {
        return message;
    }

    public void setMessage(String errormessage) {
        this.message = errormessage;
    }
    
}
