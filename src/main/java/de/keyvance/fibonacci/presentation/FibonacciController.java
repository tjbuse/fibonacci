package de.keyvance.fibonacci.presentation;

import de.keyvance.fibonacci.model.FibonacciRequest;
import de.keyvance.fibonacci.model.FibonacciResponse;
import de.keyvance.fibonacci.service.FibonacciService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
        
        try {
            response.setFibonaccis(fibonacciService.berechneFibonaccis(anzahl));
        } catch (Exception e) {
            response.setStatus(-1);
            response.setMessage(e.getMessage());
        }

        return response;
    }

    @PostMapping("/fibonacci")
    public FibonacciResponse search(@RequestBody FibonacciRequest request) {
        FibonacciResponse response = new FibonacciResponse();
        try {
            response.setFibonaccis(fibonacciService.naechsteFibonacci(request.getSuchNummer(), request.getAnzahlFibonaccis()));
        } catch (Exception e) {
            response.setStatus(-1);
            response.setMessage(e.getMessage());
        }        

        return response;
    }
}
