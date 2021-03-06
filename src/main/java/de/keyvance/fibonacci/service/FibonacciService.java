package de.keyvance.fibonacci.service;

import java.math.BigInteger;
import java.util.List;

/**
 *
 * @author torsten
 */
public interface FibonacciService {
    List<BigInteger> berechneFibonaccis(int anzahl);
    List<BigInteger> naechsteFibonacci(BigInteger suchNummer, int anzahlFibonaccis);
}
