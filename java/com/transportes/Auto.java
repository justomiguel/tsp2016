package com.transportes;

public abstract class Auto {

	//Defino atributos
	private	String color;
	private int cantPuertas;
	private String estado;

	//Defino Comportamiento
	public void encenderse(){
		estado = "Arrancando...";
	}

	public void acelerar(){
		estado = "Pisteando como un campeon...";
	}

	public void frenar(){
		estado = "Quieto...";
	}

	public void setEstado(String estadoNuevo){
		estado = estadoNuevo;
	}

	public String getEstado(){
		return estado;
	}



}
