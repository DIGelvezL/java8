package com.udemy.curso.expresionesLambda;

public class LambdaTest {

	public static void main(String[] args) {
		
		FunctionTest ft = () -> System.out.println("Hola mundo");
//		ft.saludar();
		LambdaTest obj = new LambdaTest();
		obj.miMetodo(ft);
		
		FunctionTestParametros fp = (num1, num2) -> System.out.println(num1 + num2);
//		fp.imprimeSuma(15, 30);
		obj.miMetodoSuma((num1, num2) -> System.out.println(num1 - num2), 15, 30);
		
		engine((long x, long y) -> x + y);
		engine((CalculadoraInt)(x, y) -> x + y);
		
		System.out.println(create().calculate(5, 5));
	}
	
	public void miMetodo(FunctionTest parametro) {
		parametro.saludar();
	}
	
	public void miMetodoSuma(FunctionTestParametros parametro, int num, int num2) {
		parametro.imprimeOperacion(num, num2);
	}
	
	public static void engine(CalculadoraInt cal) {
		
	}
	
	public static void engine(CalculadoraLong cal) {
		
	}
	
	public static CalculadoraLong create() {
		return (x, y) -> x * y;
	}
}
