package com.mytab.model;

import java.util.function.Predicate;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class CNPJ implements CheckDocument, CleanDocument{
	@Column(name="cnpj")
	private String numero;

	public CNPJ(String numero) {
		this.numero = validarELimparCNPJ(numero);
	}

	public CNPJ(int numero_i) {
		String numero = String.valueOf(numero_i);
		numero = adicionarZeroEsquerda(numero, e -> e.length() < 11);
		this.numero = validarELimparCNPJ(numero);
	}

	private String validarELimparCNPJ(String numero) {
		numero = cleanDocument(numero);
		if (isValid(numero)) {
			return numero;
		} else {
			throw new IllegalArgumentException("CNPJ no formato inválido");
		}
	}
	
	@Override
	public boolean isValid(String numero) {
		// implementar lógica de validação de CNPJ aqui

		if (numero.length() != 14)
			return false;

		return true;
	}
	
	@Override
	public String cleanDocument(String numero) {
		return numero.replaceAll("[^0-9]", "");
	}

	public static String adicionarZeroEsquerda(String numero, Predicate<String> p) {
		if (p.test(numero)) {
			return String.format("%011d", numero);
		}
		return numero;
	}
	
	@Override
	public String toString() {
		return this.numero;
	}

}
