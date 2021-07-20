package com.te.encapsulation;

public class EnhancedPlayer 
{
 private String fullname;
 private int health=100;
 private String weapon;
public EnhancedPlayer(String name, int health, String weapon) {
	
	this.fullname = fullname;
	
	if(health>0 && health<=100)
	{
		this.health = health;
	}
	
	this.weapon = weapon;
}

public void looseHealth(int damage)
{
	this.health-=damage;
	System.out.println(this.fullname + " remaining health: " +this.health);
	if(this.health<=0)
	{
		System.out.println(this.fullname+ "player knocked out");
	}
	
}

	public void gainHealth(int numberMediCare)
	{
	
	}

public String getName() {
	return fullname;
}
public int getHealth() {
	return health;
}
public String getWeapon() {
	return weapon;
}
 
}
