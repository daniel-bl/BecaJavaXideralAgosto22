package com.calculadora.v5;

public class Resta extends Operacion {

	Resta(int x, int y){
		super(x,y);
	}
	
	@Override
	int ejecuta(){
		return x-y;
	}

}
