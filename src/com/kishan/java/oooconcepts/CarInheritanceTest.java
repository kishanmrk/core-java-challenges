package com.kishan.java.oooconcepts;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// Inheritance concept
abstract class Car {
	protected boolean isSedan;
	protected String seats;

	public Car(boolean isSedan, String seats) {
		this.isSedan = isSedan;
		this.seats = seats;
	}

	public boolean getIsSedan() {
		return this.isSedan;
	}

	public String getSeats() {
		return this.seats;
	}

	abstract public String getMileage();

	public void printCar(String name) {
		System.out.println("A " + name + " is " + (this.getIsSedan() ? "" : "not ") + "Sedan, is " + this.getSeats()
				+ "-seater, and has a mileage of around " + this.getMileage() + ".");
	}
}

// Write your code here.

class WagonR extends Car {

	String mileage;

	WagonR(int mileage) {
		super(false, "4");
		this.mileage = String.valueOf(mileage);
	}

	@Override
	public String getMileage() {
		// TODO Auto-generated method stub
		return this.mileage;
	}
}

class HondaCity extends Car {

	String mileage;

	HondaCity(int mileage) {
		super(true, "4");
		this.mileage = String.valueOf(mileage) + " kpl";
	}

	@Override
	public String getMileage() {
		// TODO Auto-generated method stub
		return this.mileage;
	}
}

class InnovaCrysta extends Car {

	String mileage;

	InnovaCrysta(int mileage) {
		super(false, "6");
		this.mileage = String.valueOf(mileage);
	}

	@Override
	public String getMileage() {
		// TODO Auto-generated method stub
		return this.mileage;
	}
}

/**
 * @author Kishankumar Feb 23, 2020
 */
public class CarInheritanceTest {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		int carType = Integer.parseInt(bufferedReader.readLine().trim());
		int carMileage = Integer.parseInt(bufferedReader.readLine().trim());

		if (carType == 0) {
			Car wagonR = new WagonR(carMileage);
			wagonR.printCar("WagonR");
		}

		if (carType == 1) {
			Car hondaCity = new HondaCity(carMileage);
			hondaCity.printCar("HondaCity");
		}

		if (carType == 2) {
			Car innovaCrysta = new InnovaCrysta(carMileage);
			innovaCrysta.printCar("InnovaCrysta");
		}
	}

}
