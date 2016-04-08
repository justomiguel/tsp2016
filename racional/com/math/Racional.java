package com.math;

public class Racional {

	private int num;
	private int den;

	public Racional(int num, int den){
		this.num = num;
		this.den = den;
	}

	public void add(Racional elOtro){
		int auxDen = Mathematica.obtenerMCM(this.den, elOtro.getDen());
		this.num = auxDen/this.den*this.num + auxDen/elOtro.getDen()*elOtro.getNum();
		this.den = auxDen;
	}

	
	public int getNum(){
		return num;
	}

	public int getDen(){
		return den;
	}

	@Override
	public String toString(){
		return num+"/"+den;
	}


}
