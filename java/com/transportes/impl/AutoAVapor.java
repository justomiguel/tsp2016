package com.transportes.impl;

import com.transportes.Auto;

public class AutoAVapor extends Auto {

	private int cantAgua = 70;

	public int getCantAgua(){
		return cantAgua;
	}

	@Override
	public void encenderse(){
		setEstado("Arrancando auto a vapor...");
	}
	

}
