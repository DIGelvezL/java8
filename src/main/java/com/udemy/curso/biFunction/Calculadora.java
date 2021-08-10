package com.udemy.curso.biFunction;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

public class Calculadora {

	public String calc(BiFunction<Integer, Integer, String> bi, Integer i1, Integer i2) {
		return bi.apply(i1, i2);
	}
	
	public List<Double> calcularSalarios(BiFunction<Double, Double, Double> bi, List<Empleado> listaEmp, Double incremento) {
		List<Double> listaSalarios = new ArrayList<>();
		
		for (Empleado empleado: listaEmp) {
			listaSalarios.add(bi.apply(empleado.getSalario(), incremento));
		}
		return listaSalarios;
	}
}
