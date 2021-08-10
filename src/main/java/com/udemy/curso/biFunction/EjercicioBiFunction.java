package com.udemy.curso.biFunction;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;

public class EjercicioBiFunction {

	public static void main(String[] args) {
		BiFunction<String, String, String> bi = (x, y) -> x + y;
		
		System.out.println(bi.apply("Hola ", "mundo!!"));
		
		Calculadora calculadora = new Calculadora();
		
		String resultado = calculadora.calc((x, y) -> ": " + (x * y), 60, 10);
		System.out.println(resultado);
		
		List<Empleado> listaEmpleados = Arrays.asList(
				new Empleado("Daniel", 2563.2),
				new Empleado("Laura", 183.2),
				new Empleado("Vilma", 2648879.2),
				new Empleado("Arya", 2546.2),
				new Empleado("Kiara", 2522.2));
		
		List<Double> salarios = calculadora.calcularSalarios((salario, incremento) -> 
			salario + ((salario * incremento) / 100), listaEmpleados, 16.0);
		
		for (Double salario : salarios) {
			System.out.println(salario);
		}
	}
}
