package com.te.encapsulation;

public class Player 
{
	public String fullName;
	public int health;
	public String weapon;
	
	public void looseHealth(int damage)
	{
		this.health-=damage;
		System.out.println(this.fullName + " remaining health: " +this.health);
		if(this.health<=0)
		{
			System.out.println(this.fullName+ "player knocked out");
		}
		
	}

}
