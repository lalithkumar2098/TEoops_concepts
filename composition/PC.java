package com.te.composition;

public class PC 
{
	private Case theCase;
	private Monitor themonitor;
	private Motherboard  themotherboard;
	public PC(Case theCase, Monitor themonitor, Motherboard themotherboard) {
		super();
		this.theCase = theCase;
		this.themonitor = themonitor;
		this.themotherboard = themotherboard;
	}
	
	public Case getTheCase() {
		return theCase;
	}
	public Monitor getThemonitor() {
		return themonitor;
	}
	public Motherboard getThemotherboard() {
		return themotherboard;
	}
	
}
