package com.Hitesh;

public class Main {

    public static void main(String[] args) {
	 Car swift = new Car(); // Always need to executed otherwise shows error
//		swift = null; // Throws Exception
	 Car holden = new Car();
	 swift.setModels("ZXI"); // set the value

		System.out.println("Model is " + swift.getModels());	// to get the value
    }
}
