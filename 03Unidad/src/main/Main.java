package main;

import pc.bean.Memoria;
import pc.hilo.Consumidor;
import pc.hilo.Productor;
import pc.inter.Buffer;

public class Main {

	public static void main(String[] args) {
		
		Buffer buffer = new Memoria();
		
		Productor p = new Productor(buffer);
		Consumidor c = new Consumidor(buffer);
		
		p.start();
		c.start();
	}

}