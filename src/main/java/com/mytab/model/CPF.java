package com.mytab.model;

import java.util.function.Predicate;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class CPF implements CheckDocument, CleanDocument{
	@Column(name="cpf")
	private String numero;

	public CPF() {}
	public CPF(String numero) {
		this.numero = validarELimparCPF(numero);
	}

	public CPF(int numero_i) {
		String numero = String.valueOf(numero_i);
		numero = adicionarZeroEsquerda(numero, e -> e.length() < 11);
		this.numero = validarELimparCPF(numero);
	}

	private String validarELimparCPF(String numero) {
		numero = cleanDocument(numero);
		if (isValid(numero)) {
			return numero;
		} else {
			throw new IllegalArgumentException("CPF no formato inválido");
		}
	}

	@Override
	public boolean isValid(String numero) {
		// implementar lógica de validação de CPF aqui

		if (numero.length() != 11)
			return false;

		return true;
	}

	public String cleanDocument(String numero) {
		return numero.replaceAll("[^0-9]", "");
	}

	public static String adicionarZeroEsquerda(String numero, Predicate<String> p) {
		if (numero.length() > 11){
			throw new IllegalArgumentException("CPF > 11 é invalido");
		}
		if (p.test(numero)) {
			return String.format("%1$11s", numero).replace(' ', '0');
		}
		return numero;
	}
	
	@Override
	public String toString() {
		return this.numero;
	}

}
