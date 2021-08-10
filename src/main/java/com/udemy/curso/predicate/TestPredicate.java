package com.udemy.curso.predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;



public class TestPredicate {

	public static void main(String[] args) {
		Predicate<Integer> predicate = (valor) -> valor > 0;
		
		System.out.println(predicate.test(123));
		
		List<Empleado> listaEmpleados = Arrays.asList(
				new Empleado("Daniel", 29, 2563.2, "Cobranzas"),
				new Empleado("Laura", 27, 183.2, "Ventas"),
				new Empleado("Vilma", 58, 2648879.2, "Ventas"),
				new Empleado("Arya", 18, 2546.2, "Mostrador"),
				new Empleado("Kiara", 23, 2522.2, "Ventas"));
		
		TestPredicate testPredicate = new TestPredicate();
		
		System.out.println("Empleados en el departamento de ventas:");
		List<Empleado> empVentas = testPredicate.evaluar(listaEmpleados, empleado -> "Ventas".equals(empleado.getDepartamento()));
		
		for (Empleado empleado2 : empVentas) {
			System.out.println(empleado2.getNombre());
		}
		
		Funciones func =new Funciones();
		
		for(Empleado empleado: empVentas) {
			double nuevoSalario = func.incrementoSalario(empleado, 10, 
					(salario, incremento) -> salario + ((salario * incremento)/100));
			
			empleado.setSalario(nuevoSalario);
		}
		
		for (Empleado empleado2 : empVentas) {
			System.out.println(empleado2.getNombre());
		}
		
	}
	
	public List<Empleado> evaluar(List<Empleado> listEmp, Predicate<Empleado> eval){
		List<Empleado> listaNueva = new ArrayList<>();
		
		for (Empleado empleado : listEmp) {
			if(eval.test(empleado)) {
				listaNueva.add(empleado);
			}
		}
		
		return listaNueva;
	}
}
