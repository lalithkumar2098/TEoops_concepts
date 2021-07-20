package com.te.encapsulation;

public class Main 
{
public static void main(String[] args) {
	
	Player player =new Player();
	player.fullName="ajay";
	player.health=50;
	//player.health=200;
	
	player.looseHealth(20);
}
}
