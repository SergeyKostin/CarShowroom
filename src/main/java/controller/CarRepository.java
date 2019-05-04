package controller;

import model.Car;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface CarRepository extends MongoRepository<Car,String> {
    public List<Car> findByModel(String model);
}
