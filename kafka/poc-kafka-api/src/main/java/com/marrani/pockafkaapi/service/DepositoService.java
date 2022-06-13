package com.marrani.pockafkaapi.service;

import com.marrani.pockafkaapi.domain.Deposito;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@AllArgsConstructor
public class DepositoService {

    private static final String TOPICO_VOTACAO = "deposito";

    private final KafkaTemplate<Object, Object> template;

    public void depositar(Deposito request) {
        template.send(TOPICO_VOTACAO, request);
    }
}
