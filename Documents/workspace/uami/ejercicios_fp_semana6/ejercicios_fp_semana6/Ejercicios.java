package ejercicios_fp_semana6;

import java.util.Scanner;

public class Ejercicios {
	
	void ver_combos(){
		
		Scanner input = new Scanner(System.in);
		Calculadora  calq = new Calculadora();
		
		System.out.println("tama–o del conjunto? (n)");
		int n = input.nextInt();
		System.out.println("Tama–o de la combinacion? (r)");
		int r = input.nextInt();
		
		int res = calq.factorial(n)/(calq.factorial(r)*calq.factorial(n-r));
		System.out.println("El numero de combinaciones posibles es: "+res);
		
		input.close();
	}
	
	void fibonacci(){
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Secuencia de Fibonacci.");
		System.out.println("cuantos numeros quieres ver?");
		int n = input.nextInt();
		
		if(n>1){
			System.out.println("1");
		}
		if(n>2){
			System.out.println("1");
			
			int f1 = 1,f2 = 1, fn;
			for(int i = 1;i<=n-2;i++){
				fn = f1+f2;
				System.out.println(fn);
				f2 = f1; 
				f1 = fn;
			}
		}else{
			System.out.println("invalid value? algo chistoso pas—...");
			fibonacci();
		}
		
	}
	
	

}
