package com.app.service.b;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Anish Panthi
 */
@org.springframework.web.bind.annotation.RestController
public class RestController {

    @GetMapping("/get-service-b-health")
    public ResponseEntity<String> getHealth(){
        return new ResponseEntity<>("OK", HttpStatus.OK);
    }
}
