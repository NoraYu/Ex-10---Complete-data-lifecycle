package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {
    @Autowired
    CarRepository carRepository;
    @Override
    public void run(String... strings) throws Exception{
        Car car;
        car= new Car("Honda",2019,"Civic");
        carRepository.save(car);

        car= new Car("Subaru",2017,"Forester");
        carRepository.save(car);

        car= new Car("Toyota",2001,"Corolla");
        carRepository.save(car);

    }
}
