package practica01;

import java.util.Random;
import java.util.Scanner;

public class hilo_par_impar extends Thread {

	int n;


	/**/
	
	public hilo_par_impar(int n){
		this.n = n;
	}
	
	
	@Override
	public void run(){
		
		if (n%2==0){
			System.out.println("El numero " + n + " es par");
		}
		else{
			if(n%2==1){
				System.out.println("El numero " + n + " es impar");
			}
		}

	}
	
}
