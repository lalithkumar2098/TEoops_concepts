package com.te.loosecoupled;

public class Bus implements Transport{

	@Override
	public void start() {
		System.out.println("Bus is started....");
	}
}