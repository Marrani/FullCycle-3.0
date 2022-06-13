package com.marrani.pockafkaapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@SpringBootApplication
public class PocKafkaApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(PocKafkaApiApplication.class, args);

		calculation(6);

	}

	public static List<Integer> calculation(int maxDigit) {

		List<Integer> lista = new ArrayList<>(1);

		for(Integer numeroGerado = 1000; numeroGerado <= 7770; numeroGerado++){

			String numeroGeradoString = String.valueOf(numeroGerado);
			List<Integer> digitosDoNumeroGerado = new ArrayList<>(4);

			for (int y = 0; y < numeroGerado.toString().length(); y++) {
//				int i = Integer.parseInt((numeroGeradoString.substring(y, 1)));
//				digitosDoNumeroGerado.add(i);

					Integer i = numeroGeradoString.substring(y, 1).length() == 0 ? 0 : Integer.valueOf((numeroGeradoString.substring(y, 1)));
					digitosDoNumeroGerado.add(i);
				}



			if (Collections.max(digitosDoNumeroGerado) > maxDigit)
				continue;

			int soma = 0;
			for (int n = 0; n < numeroGerado.intValue(); n++)
				soma += Integer.valueOf(numeroGeradoString.substring(n, 1));

			if (soma == 21)
				lista.add(numeroGerado);
		}

		return lista;
	}



}
