package com.sinensia.pollosfelices.backend.business.model;

public class Cliente extends Persona {

	private boolean tarjetaGold;
	
	public Cliente() {
		
	}

	public boolean isTarjetaGold() {
		return tarjetaGold;
	}

	public void setTarjetaGold(boolean tarjetaGold) {
		this.tarjetaGold = tarjetaGold;
	}

	@Override
	public String toString() {
		return "Cliente [tarjetaGold=" + tarjetaGold + ", toString()=" + super.toString() + "]";
	}
	
}
