package com.te.composition;

import java.awt.Dimension;

public class Main {

	public static void main(String[] args) 
	{
		Dimensions dimension = new Dimensions(20,20,5);
		Case theCase =new Case("220J","Anil","240v",dimension);
		
		Monitor theMonitor = new Monitor("beast","Samsung",40,new Resolution(2540, 1440));
		
		
		
		Motherboard motherboard=new Motherboard("intel - 2200","megha",2,"bios-2.2v");
		PC thePc= new PC(theCase,theMonitor,motherboard);

		thePc.getTheCase().pressPowerButton();
		thePc.getThemotherboard().loadProgram("Wind 11");
		thePc.getThemonitor().drawPixelAt(1500, 200, "black");
		
		//System.out.println();
	}

}
