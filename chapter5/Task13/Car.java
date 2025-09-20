package ciiccb72025.chapter5.Task13;

public class Car extends Vehicle {
    
    int numberOfDoors;  

    public Car(String make, String model, int year, int numberOfDoors) {
        super(make, model, year);
        this.numberOfDoors = numberOfDoors;
    }
    public void displayDetails() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Number of Doors: " + numberOfDoors);
    }
    // Not sure if a setter is needed for this task
    public static void main(String[] args) {
        Car myCar = new Car("Toyota","Camry",2022,4);
        myCar.displayDetails();
    }
}