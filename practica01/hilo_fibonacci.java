package practica01;

public class hilo_fibonacci extends Thread {	
	
	int n;

	public hilo_fibonacci(int n){
		
	this.n = n;
	}
	
	@Override
	public void run(){
		
		int x = 0, y = 1, z = 0 ;
		
		for(int i = 1; i <= n; i++){
			z = y;
			y = y + z;
			x = z;
		}
		
		int fibonaci = x;
		
		System.out.println("El nesimo numero de la serie de fibonaci es " + fibonaci);	

	}
	
	
}
