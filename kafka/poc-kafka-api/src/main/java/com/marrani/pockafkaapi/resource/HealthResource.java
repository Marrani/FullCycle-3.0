package com.marrani.pockafkaapi.resource;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;


@RestController
@AllArgsConstructor
public class HealthResource {

    @GetMapping(value = "/health")
    public ResponseEntity<String> healthCheck() {
        return ResponseEntity.ok(new Date().toString());
    }
}
