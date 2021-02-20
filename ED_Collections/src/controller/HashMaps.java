package controller;

import java.util.HashMap;
import java.util.Map;

public class HashMaps {
	public static void main(String[] args) {
		Map<String, String> dddPorMunicipio = new HashMap<>();
		dddPorMunicipio.put("São Paulo", "11");
		dddPorMunicipio.put("Rio de Janeiro", "21");
		dddPorMunicipio.put("Belo Horizonte", "00");
		dddPorMunicipio.put("Belo Horizonte", "31"); // se tentamos inserir um novo elemento com uma chave já existente
														// ele substitui o valor que está armazenado na chave
		dddPorMunicipio.put("Paraná", "21"); // os valores podem ser repetidos sem problema, a chave não pode se repetir

		for (String municipio : dddPorMunicipio.keySet()) {
			System.out.println("O DDD do Município " + municipio + " é = " + dddPorMunicipio.get(municipio));
		}
	}
}
