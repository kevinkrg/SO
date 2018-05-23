package practica01;

public class hilo_sumatoria extends Thread {
		
	int n;

	public hilo_sumatoria(int n){
		
	this.n = n;
	}
	
	@Override
	public void run(){
		
		int sumatoria = 0;
		for(int i = 1; i <= n; i++){
			
			sumatoria = sumatoria + i;
		}
		
		System.out.println("La sumatoria de " + n + " es " + sumatoria);

	}

}
