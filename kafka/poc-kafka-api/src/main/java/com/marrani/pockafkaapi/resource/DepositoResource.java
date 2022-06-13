package com.marrani.pockafkaapi.resource;

import com.marrani.pockafkaapi.domain.Deposito;
import com.marrani.pockafkaapi.service.DepositoService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/deposito")
@AllArgsConstructor
public class DepositoResource {

    private final DepositoService depositoService;

    @PostMapping
    public ResponseEntity<String> deposito(@RequestBody Deposito request) {

        depositoService.depositar(request);
        return ResponseEntity.ok("Deposito realizado com sucesso");
    }
}
