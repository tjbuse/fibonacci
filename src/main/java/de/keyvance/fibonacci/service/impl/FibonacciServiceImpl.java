package de.keyvance.fibonacci.service.impl;

import de.keyvance.fibonacci.service.FibonacciService;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/**
 *
 * @author torsten
 */
@Service
public class FibonacciServiceImpl implements FibonacciService {

    @Override
    public List<BigInteger> berechneFibonaccis(int anzahl) {
        ArrayList<BigInteger> numbers = new ArrayList<>();        
        BigInteger t1 = BigInteger.ZERO;
        BigInteger t2 = BigInteger.ONE;
        
        for (int i = 1; i <= anzahl; ++i) {
            System.out.println(t1 + " + ");
            numbers.add(t1);
            BigInteger sum = t1.add(t2);
            t1 = t2;
            t2 = sum;
        }

        return numbers;
    }    

    @Override
    public List<BigInteger> naechsteFibonacci(BigInteger suchNummer, int anzahl) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
