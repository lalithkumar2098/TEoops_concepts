package com.te.encapsulation;

public class EnhancedMainClass {

	public static void main(String[] args) 
	{
		EnhancedPlayer player = new EnhancedPlayer("Anil",101,"Assult rifle");
		//System.out.println(player.getHealth());
		player.looseHealth(30);
		player.looseHealth(70);
		
		
		
	}
	

}
