package Contests.Week7;

import java.util.Arrays;

public class Con7_04 {

    public static void main(String[] args) {
        CarFactory factory = new CarFactory(4);

        Car car1 = new Car(CarModel.SEDAN);
        Car car2 = new Car(CarModel.SUV);
        Car car3 = new Car(CarModel.HATCHBACK);
        Car car4 = new Car(CarModel.PICKUP);

        factory.addCar(car1);
        factory.addCar(car2);
        factory.addCar(car3);
        factory.addCar(car4);

        // Print out all cars in the inventory
        Car[] inventory = factory.getInventory();
        for (int i = 0; i < inventory.length; i++) {
            System.out.println(inventory[i]);
        }

        // Retrieve a specific car by its model
        Car specificCar = factory.getCarByModel("SUV");
        System.out.println("Specific Car: " + specificCar);

        specificCar = factory.getCarByModel("PICKUP");
        System.out.println("Specific Car: " + specificCar);

    }
}

enum CarModel{SEDAN, SUV, HATCHBACK, PICKUP}

class Car{
    private CarModel model;

    public Car(CarModel carModel){
        model = carModel;
    }

    public String toString(){
        return "Car Model: "+ model;
    }
}

class CarFactory{
    private Car[] inventory;
    private int carCount;

    public CarFactory(int num){
        if (num <= 0){
            System.out.println("Fatal Error: 양수인 숫자를 기입해주세요.");
            System.exit(0);
        } else {
            inventory = new Car[num];
            carCount = 0;
        }
    }



    public void addCar(Car newCar){
        if (carCount < inventory.length) {
            inventory[carCount] = newCar;
            carCount++;
        } else {
            System.out.println("Fatal Error: 차량을 더 이상 추가할 수 없습니다.");
        }
    }

    public Car[] getInventory() {
        Car[] showCar = new Car[carCount];
        for (int i = 0; i < carCount; i++){
            showCar[i]= inventory[i];
        }
        return showCar;
    }

    public Car getCarByModel(String carModel) {
        for (int i = 0;i < carCount;i++) {
            if (inventory[i].toString().equals("Car Model: "+carModel)) {
                return inventory[i];
            }
        }
        return null;
    }
}


