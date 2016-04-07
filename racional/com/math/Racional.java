package com.math;

public class Racional {

	private int num;
	private int den;

	public Racional(int num, int den){
		this.num = num;
		this.den = den;
	}

	public void add(Racional elOtro){
		int auxDen = this.obtnerMCM(this.den, elOtro.getDen());
		this.num = auxDen/this.den*this.num + auxDen/elOtro.getDen()*elOtro.getNum();
		this.den = auxDen;
	}

	private int obtenerMCM(int n1, int n2){
		// >,<,!=,==
		// if (condicionLogica o variable logica) {
		//	cuerpo
		// }
		if (n1 == n2){
			return n1;	
		}
		int mayor = obtenerMayor(n1, n2);
		
		
	}

	private int obtenerMayor(int n1, int n2){
		if (n1 > n2){
			return n1;
		}
		return n2;
	}
	
	
	public Racional sumaFea(Racional elOtro){
                int auxDen = this.den * elOtro.getDen();
                int num = auxDen/this.den*this.num + auxDen/elOtro.getDen()*elOtro.getNum();
                int den = auxDen;
		return new Racional(num, den);	
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
