package lab4;

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;

public class CarTestDrive {
    public static void main(String[] args) {
        Car car = new Car("Suzuki", 2021);
        Car car2 = new Car("Honda", 2022);

        List<Car> listCars = new ArrayList<>();
        listCars.add(car);
        listCars.add(car2);

        Gson gson = new Gson();

        try(FileWriter writer = new FileWriter("Car.json")) 
        {
            gson.toJson(listCars, writer);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
