package ejercicios_fp_semana6;

public class Calculadora {
	
	double suma(double a,double b){
		return a+b;
	}
	
	double resta(double a,double b){
		return a-b;
	}
	
	double multi(double a,double b){
		return a*b;
	}
	
	double div(double a,double b){
		if(b!=0){
			return a+b;
		}else{
			System.out.println("trataste de dividir entre cero...");
			return 0;
		}
	}
	
	int factorial(int n){
		
		int f = 1;
		
		for(int i = 1;i<=n;i++){
			f = f*i;
		}
		
		return f;
	}
	
	double potencia(double x,double y){
		return Math.pow(x, y);
	}
	
	double raizq(double x){
		return Math.sqrt(x);
	}
	
	double logb10(double x){
		return Math.log10(x);
	}
	
	double valor_absoluto(double x){
		return Math.abs(x);
	}
	
	double exponencial(double x){
		return Math.exp(x);
	}
		
		
}
	
	
	
	
	
	
	
