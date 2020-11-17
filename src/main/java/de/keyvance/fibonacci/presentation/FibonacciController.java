package de.keyvance.fibonacci.presentation;

import de.keyvance.fibonacci.model.FibonacciResponse;
import de.keyvance.fibonacci.service.FibonacciService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author torsten
 */
@RestController
public class FibonacciController {
    @Autowired
    private FibonacciService fibonacciService;
    
    @GetMapping("/fibonacci/{count}")
    public FibonacciResponse calculate(@PathVariable(value = "count") int anzahl) {
        FibonacciResponse response = new FibonacciResponse();
        
        response.setStatus(0);
        response.setFibonaccis(fibonacciService.berechneFibonaccis(anzahl));

        return response;
    }

}
