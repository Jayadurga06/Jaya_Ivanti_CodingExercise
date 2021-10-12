package com.ivanti.exercise;

abstract class Animal implements Jump,Bark,Croak
{
	public String name;

	
	
	public String getName() {
		return name;
	}

	
	
	public void setName(String name) {
		this.name = name;
	}



	@Override
	public String toString() {
		return "My Name - "+name;
	}
	
	public void action()
	{
		System.out.println("I Jump!");
	}
		
 
}

class Dog extends Animal 
{
	

	String fur_color;

	public String getFur_color() {
		return fur_color;
	}

	public void setFur_color(String fur_color) {
		this.fur_color = fur_color;
	}
	
	@Override
	public void sound()
	{
		System.out.println("I Bark!");
	}

	
	
}

class Frog extends Animal 
{


	int poison_level;

	public int getPoison_level() {
		return poison_level;
	}

	public void setPoison_level(int poison_level) {
		this.poison_level = poison_level;
	}
	
	
	@Override
	public void sound() {
		System.out.println("I Croak!");
		
	}
	
}


public class Animal_Test {
	
	
	public static void main(String arg[]) {
		//This is for animal 1
		Animal a=new Dog();
		a.setName("Dog");
		System.out.println(a.toString());
		a.action();
		a.sound();
		Dog d=new Dog();
		d.fur_color="White";
		System.out.println("Fur_color-"+d.getFur_color());	
	  
		System.out.println("------");
		
		//This is for animal 2
		Animal b=new Frog();
		b.name="Frog";
		System.out.println(b.toString());
		b.action();
		b.sound();
		Frog f=new Frog();
		f.setPoison_level(10);
		System.out.println("Poison_level-"+f.getPoison_level());
		
		
	
	
	}
	
	
	
	

}
