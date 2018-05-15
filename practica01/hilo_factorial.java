package practica01;

import java.util.Scanner;

public class hilo_factorial extends Thread {

	int n;

	public hilo_factorial(int n){
		
	this.n = n;
	}
	
	@Override
	public void run(){
		
		int factorial = 1;
		
	 	for(int i=1; i<=n; i++)
		{
	 		factorial = factorial * i;

		}
	 	
	 	System.out.println("El factorial de " + n + " es " + factorial);

	}
	
}
