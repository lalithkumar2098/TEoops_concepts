package com.te.polymorphism;

class Movie{
	private String name;

	public Movie(String name) {
		
		this.name = name;
	}
	
	public String Plot()
	{
		return "no plot here";
	}
	
	public String getMovieName()
	{
		return this.name;
	}
}

class Pk extends Movie
{
	public Pk()
	{
		super("Pk");
	}
	
	@Override
	public String Plot()
	{
		return "Misunderstanding god";
	}
}

class Joker extends Movie
{

	public Joker() {
		super("Joker");
	}
	@Override
	public String Plot() {
	
		return "Smile ever time";
	}
	
}

class Kgf extends Movie
{

	public Kgf() {
		super("KGF");
	}
	@Override
	public String Plot() {
	
		return "Survival of the fittest";
	}
	
}


class Starwars extends Movie
{

	public Starwars() {
		super("Star wars");
	}
	@Override
	public String Plot() {
	
		return "Imperial forces try to take over universe";
	}
	
}

class Forgettable extends Movie
{

	public Forgettable() {
		super("Forgettable");
	}
	// No plots provided
}


public class Main 
{
	public static void main(String[] args)
	{
		for(int i=1; i<=5; i++)
		{
			Movie movie = randomMovie();
			System.out.println("Movie # " + i + " " + movie.getMovieName()+ "\n" + "Plot: "+movie.Plot());
		}
	}
	
	public static Movie randomMovie() 
	{
		int randomNumber=(int)(Math.random()*5)+1;
		System.out.println("Random number generated: "+ randomNumber);
		
		switch(randomNumber)
		{
		case 1:
			return new Pk();
			
			
		case 2:
			return new Joker();
			
			
		case 3:
			return new Kgf();
			
		case 4:
			return new Starwars();
			
		case 5:
			return new Forgettable();
			
			default :
				return null;
		}
	}
}











