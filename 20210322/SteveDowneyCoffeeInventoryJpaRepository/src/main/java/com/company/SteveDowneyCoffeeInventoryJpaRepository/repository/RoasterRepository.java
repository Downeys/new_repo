package com.company.SteveDowneyCoffeeInventoryJpaRepository.repository;

import com.company.SteveDowneyCoffeeInventoryJpaRepository.models.Roaster;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoasterRepository extends JpaRepository<Roaster, Integer> {
}
