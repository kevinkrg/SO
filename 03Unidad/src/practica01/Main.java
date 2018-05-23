package practica01;


public class Main {

	public static void main(String[] args) {
		hilo_par_impar h1 = new hilo_par_impar(5);
		
		hilo_primo h2 = new hilo_primo(5);
		
		hilo_factorial h3 = new hilo_factorial(5);
		
		hilo_fibonacci h4 = new hilo_fibonacci(5);
		
		hilo_sumatoria h5 = new hilo_sumatoria(5);
		
		
		h1.start();
		h2.start();
		h3.start();
		h4.start();
		h5.start();
		
	}
	
	

}
