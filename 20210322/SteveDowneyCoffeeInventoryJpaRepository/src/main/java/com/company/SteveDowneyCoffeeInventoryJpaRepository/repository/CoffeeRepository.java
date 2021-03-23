package com.company.SteveDowneyCoffeeInventoryJpaRepository.repository;

import com.company.SteveDowneyCoffeeInventoryJpaRepository.models.Coffee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CoffeeRepository extends JpaRepository<Coffee, Integer> {
    List<Coffee> findCoffeeByRoasterId(Integer id);
    List<Coffee> findCoffeeByType(String type);
}
