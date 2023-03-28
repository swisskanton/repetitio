/*
Create Station and Car classes
    Station
        it stores how much gas is avaliable: gasAmount
        the gas amount must be given when we create a station
        it can refill a car: refill(car):
            decreases the gasAmount by the capacity of the car (let us suppose that the car is empty) and
            increases the car's gasAmount
    Car
        it stores how much gas is actually present: gasAmount
        it stores the capacity of the tank: capacity
        create a constructor for the Car class where you:
            initialize gasAmount -> 0
            initialize capacity -> 100
 */
class Station {
    int gasAmount;

    public Station(int value) {
        this.gasAmount = value;
    }

    public void refill(Car car) {
        if (this.gasAmount > car.capacity - car.gasAmount) {
            this.gasAmount -= car.capacity - car.gasAmount;
            car.gasAmount += car.capacity - car.gasAmount;
        } else {
            car.gasAmount += this.gasAmount;
            this.gasAmount = 0;
        }

    }
}

class Car {
    int gasAmount;
    int capacity;

    public Car() {
        this.gasAmount = 0;
        this.capacity = 100;
    }
}

public class PetrolStation {

    public static void main(String[] args) {
        Station station = new Station(500);
        Car car = new Car();

        System.out.printf("Petrol station has %d gas.\n", station.gasAmount);
        System.out.printf("Car has %d gas.\n", car.gasAmount);

        car.gasAmount = 50;
        System.out.printf("Petrol station has %d gas.\n", station.gasAmount);
        System.out.printf("Car has %d gas.\n", car.gasAmount);

        station.refill(car);
        System.out.printf("Petrol station has %d gas.\n", station.gasAmount);
        System.out.printf("Car has %d gas.\n", car.gasAmount);
    }
}