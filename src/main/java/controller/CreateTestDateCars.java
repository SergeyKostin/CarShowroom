package controller;

import model.Car;

import java.util.ArrayList;
import java.util.List;

public class CreateTestDateCars {
    public static List<Car> getCarsListTest() {
        List<Car> carList = new ArrayList<Car>();
        carList.add(new Car("A4", "02-2018", "black", "E3453g322R", "2345000 руб.",
                "249 л.с.", "2.2 л.", "Sport"));
        carList.add(new Car("A4", "02-2018", "white", "E3453g444R", "2960000 руб.",
                "333 л.с.", "3.0 л.", "Business"));
        carList.add(new Car("A4", "02-2018", "blue", "E3453g323R", "2090000 руб.",
                "249 л.с.", "2.2 л.", "Base"));
        carList.add(new Car("A6", "01-2018", "black", "E3453g511R", "3258000 руб.",
                "333 л.с.", "3.0 л.", "Base"));
        carList.add(new Car("A6", "01.2018", "black", "E3453g987R", "3590000 руб.",
                "333 л.с.", "3.0 л.", "Business"));
        carList.add(new Car("A6", "03-2018", "white", "E3453g324R", "3450000 руб.",
                "333 л.с.", "3.0 л.", "Business"));
        carList.add(new Car("A8", "02-2018", "black", "E3453g322R", "5345000 руб.",
                "445 л.с.", "4.2 л.", "Sport"));
        carList.add(new Car("A8", "02-2018", "white", "E3453g444R", "5960000 руб.",
                "333 л.с.", "3.0 л.", "Business"));
        carList.add(new Car("A8", "02-2018", "blue", "E3453g323R", "6090000 руб.",
                "445 л.с.", "4.2 л.", "Luxury"));
        carList.add(new Car("Q7", "01-2018", "black", "E3453g511R", "5258000 руб.",
                "333 л.с.", "3.0 л.", "Luxury"));
        carList.add(new Car("Q7", "01.2018", "black", "E3453g987R", "4590000 руб.",
                "333 л.с.", "3.0 л.", "Business"));
        carList.add(new Car("Q7", "03-2018", "white", "E3453g324R", "4450000 руб.",
                "333 л.с.", "3.0 л.", "Business"));
        return carList;
    }
}
