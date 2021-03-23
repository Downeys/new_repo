package com.company.SteveDowneyCarLotJPARepository.repository;

import com.company.SteveDowneyCarLotJPARepository.models.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CarRepository extends JpaRepository<Car, Integer> {

    List<Car> findCarByMake(String make);
    List<Car> findCarByColor(String color);

}
