package com.app.service.a;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

/**
 * @author Anish Panthi
 */
@org.springframework.web.bind.annotation.RestController
public class RestController {

    private RestTemplate restTemplate;

    @Autowired
    public RestController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @GetMapping("/get-service-b-health")
    public ResponseEntity<String> getHealth() {

        String response = restTemplate.getForObject("http://service-b/get-service-b-health", String.class);
        return new ResponseEntity<>("Health of Service-B: " + response, HttpStatus.OK);
    }
}
