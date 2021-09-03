package com.Hitesh;

public class Fish extends Animal {
    int gills;
    int fins;

    public Fish(String name, int brain, int body, int size, int gills, int fins) {
        super(name, brain, body, size);
        this.gills = gills;
        this.fins = fins;
    }

    public void rest(){
        System.out.println("Fish resting");
    }

    public void swim(int size){
        System.out.println("Fish Speed: " + size);
        move(10);


    }
}
