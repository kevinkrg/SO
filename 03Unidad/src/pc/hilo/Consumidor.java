package pc.hilo;

import java.util.Random;
import pc.inter.Buffer;

public class Consumidor extends Thread {
		private Buffer buffer;
		int numero = 1;
		
		public Consumidor(Buffer buffer) {
			this.buffer = buffer;
		}
		
		@Override
		public void run() {
						
			while(numero != -1) {
				
				numero = buffer.getValor();
				
				if(numero == -1){
					System.out.println("[CONSUMIDOR]: FIN");
				}else{
					
				
				int factorial = 1;
				
				for(int i = 1; i <= numero;  i++){
					factorial = factorial * i;
				}
				
				System.out.println("[CONSUMIDOR]: El factorial es " + factorial);
				
					
					
				//System.out.println("consumidor "+getName()+" "+buffer.getValor());
				
				try {
					sleep(new Random().nextInt(100));
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				}
			}	
			
		}
}