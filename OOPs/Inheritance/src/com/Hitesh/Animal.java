package com.Hitesh;

public class Animal {
    private String name;
    private int brain;
    private int body;
    private int size;

    public Animal(String name, int brain, int body, int size) {
        this.name = name;
        this.brain = brain;
        this.body = body;
        this.size = size;
    }

    public void eat(){
        System.out.println("The Animal eat function called");
    }
    public void move(int size){
        System.out.println("Speed of Animal: "+ size);
    }

    public String getName() {
        return name;
    }

    public int getBrain() {
        return brain;
    }

    public int getBody() {
        return body;
    }

    public int getSize() {
        return size;
    }
}
