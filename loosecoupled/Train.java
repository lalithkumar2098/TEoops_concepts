package com.te.loosecoupled;

public class Train implements Transport {

	@Override
	public void start() {
		System.out.println("Train is started....");
	}
}
