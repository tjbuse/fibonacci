package de.keyvance.fibonacci.presentation;

import de.keyvance.fibonacci.model.Response;
import de.keyvance.fibonacci.service.FibonacciService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author torsten
 */
@RestController
public class FibonacciController {
    @Autowired
    private FibonacciService fibonacciService;
    
    @GetMapping("/fibonacci")
    public Response calculate() {
        Response response = new Response();
        
        response.setStatus(0);
        response.setFibonaccis(fibonacciService.berechneFibonaccis());

        return response;
    }

}
