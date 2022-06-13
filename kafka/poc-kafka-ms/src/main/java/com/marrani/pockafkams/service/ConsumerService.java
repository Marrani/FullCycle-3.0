package com.marrani.pockafkams.service;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@AllArgsConstructor
public class ConsumerService {

    @KafkaListener(topics = "deposito", groupId = "pix")
    private void executar(ConsumerRecord<String, String> registro) {

        String comprovante = registro.value();
        log.info("Deposito recebido = {}", comprovante);
    }
}
