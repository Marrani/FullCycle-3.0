package com.marrani.pockafkaapi.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Deposito {
    private Integer idBacoDestino;
    private Integer idBacoOrigem;
    private Integer agencia;
    private Integer conta;
    private Double valor;
}
