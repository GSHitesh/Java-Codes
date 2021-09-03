package com.Hitesh;

public class Dog extends Animal{

    private int eyes;
    private int legs;
    private int teeth;


    public Dog(String name, int brain, int body, int size, int eyes, int legs, int teeth) {
        super(name, brain, body, size);
        this.eyes = eyes;
        this.legs = legs;
        this.teeth = teeth;
    }

    public void chew(){
        System.out.println("The Dog chew function called");
    }

    @Override
    public void eat() {
        System.out.println("The dog eat function called");
        super.eat();
    }

    public void walk(){
        System.out.println("Dog.walk() called");
        super.move(5);
    }

}
