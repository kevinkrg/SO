package practica01;


public class hilo_primo extends Thread {
	
	int n;

	public hilo_primo(int n){
		
	this.n = n;
	}
	
	/*		*/
	
	@Override
	public void run(){
		int a=0;
		
	 	for(int i=1; i<=n; i++)
		{
	    if(n%i==0) 
			a++;
		}
	 	
	 	if(a==2)
		{
	   System.out.println("El numero " + n + " es primo");
		}
		else
		{
		System.out.println("El numero " + n + " es primo "); 
		}

	}

}
