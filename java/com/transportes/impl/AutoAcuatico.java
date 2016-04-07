package com.transportes.impl;

import com.transportes.Auto;

public class AutoAcuatico extends Auto {

	private int cantOxigeno = 5;

	public int getCantOxigeno(){
		return cantOxigeno;
	}
	
	@Override
	public void encenderse(){
		super.setEstado("Arrancando auto en el agua...");
	}


}
