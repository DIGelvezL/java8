package com.udemy.curso.interfacesFuncionales;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import com.udemy.curso.dtos.Comensal;

public class DatosComensal {
	
	public static void main(String[] args) {
		Comensal c = new Comensal("Daniel Gelvez", 256.2, 29);
		
		String nombreCom = (String)getDatosComensal(c, x -> x.getNombre());
		int mesa = (int)getDatosComensal(c, x -> x.getMesa());
		
		System.out.println("El nombre es: " + nombreCom);
		System.out.println("La mesa es: " + mesa);
		
		List<Comensal> listaComensales = Arrays.asList(
				new Comensal("Daniel", 1, 5),
				new Comensal("Laura", 2, 4),
				new Comensal("Vilma", 3, 3),
				new Comensal("Arya", 4, 2),
				new Comensal("Kiara", 5, 1));
		
		List<Object> nombresComensales = getDatosComensales(listaComensales, x -> x.getNombre());
		
		System.out.println("La lista de nombres de comensales es: ");
		for (Object nombre : nombresComensales) {
			System.out.println("El nombre es: " + nombre);
		}
		
	}

	public static Object getDatosComensal(Comensal com, Function<Comensal, Object> func) {
		
		return func.apply(com);
	}
	
	public static List<Object> getDatosComensales(List<Comensal> listaCom, Function<Comensal, Object> func) {
		
		List<Object> listaDatos = new ArrayList<>();
		
		for (Comensal comensal: listaCom) {
			listaDatos.add(func.apply(comensal));
		}
		return listaDatos;
	}
}
