package com.Hitesh;

public class Main {

    public static void main(String[] args) {
	Animal animal = new Animal("Retriver",2,1,8);
//	animal.eat();
	Dog dog = new Dog("hub",3,4,2,2,4,20);
	//dog.chew();
  	//dog.eat();
//	dog.walk();
		Fish fish = new Fish("Rohu",1,89,4,2,2);
		fish.rest();
		fish.swim(15);
    }

}
