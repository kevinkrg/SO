package pc.bean;

import pc.inter.Buffer;

public class Memoria implements Buffer {
	
	private int valor;

	@Override
	public synchronized int getValor() {
		try {
			wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return valor;
	}

	@Override
	public synchronized void setValor(int valor) {
		// TODO Auto-generated method stub
		this.valor = valor;
		notify();
	}

}