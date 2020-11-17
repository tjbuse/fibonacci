package de.keyvance.fibonacci.service.impl;

import de.keyvance.fibonacci.service.FibonacciService;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author torsten
 */
@Service
public class FibonacciServiceDummyImpl implements FibonacciService {
    
    @Override
    public List<BigInteger> berechneFibonaccis(int anzahl) {
        ArrayList<BigInteger> numbers = new ArrayList<>();
        
        numbers.add(BigInteger.ZERO);
        numbers.add(BigInteger.ONE);
        numbers.add(BigInteger.ONE);
        numbers.add(new BigInteger("2"));
        numbers.add(new BigInteger("3"));
        numbers.add(new BigInteger("5"));
        numbers.add(new BigInteger("8"));
        numbers.add(new BigInteger("13"));

        return numbers;
    }    
}
