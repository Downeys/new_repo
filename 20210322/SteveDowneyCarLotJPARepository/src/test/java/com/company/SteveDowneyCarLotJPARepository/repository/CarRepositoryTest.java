package com.company.SteveDowneyCarLotJPARepository.repository;

import com.company.SteveDowneyCarLotJPARepository.models.Car;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CarRepositoryTest {
    @Autowired
    CarRepository carRepo;

    @Before
    public void setUp() throws Exception {
        carRepo.deleteAll();
    }

    @Test
    public void shouldFindCarByMake() {
        Car testCar1 = new Car();
        testCar1.setMake("Nissan");
        testCar1.setModel("Maxima");
        testCar1.setYear("2014");
        testCar1.setColor("Silver");

        Car testCar2 = new Car();
        testCar2.setMake("Ford");
        testCar2.setModel("Focus");
        testCar2.setYear("2000");
        testCar2.setColor("Red");

        Car testCar3 = new Car();
        testCar3.setMake("Ford");
        testCar3.setModel("F-150");
        testCar3.setYear("1986");
        testCar3.setColor("Silver");

        carRepo.save(testCar1);
        carRepo.save(testCar2);
        carRepo.save(testCar3);

        List<Car> carListForTest1 = carRepo.findCarByMake("Nissan");
        List<Car> carListForTest2 = carRepo.findCarByMake("Ford");

        assertEquals(1, carListForTest1.size());
        assertEquals("Nissan", carListForTest1.get(0).getMake());
        assertEquals(2, carListForTest2.size());
        assertEquals("Ford", carListForTest2.get(0).getMake());
        assertEquals("Ford", carListForTest2.get(1).getMake());

    }

    @Test
    public void findCarByColor() {
        Car testCar1 = new Car();
        testCar1.setMake("Nissan");
        testCar1.setModel("Maxima");
        testCar1.setYear("2014");
        testCar1.setColor("Silver");

        Car testCar2 = new Car();
        testCar2.setMake("Ford");
        testCar2.setModel("Focus");
        testCar2.setYear("2000");
        testCar2.setColor("Red");

        Car testCar3 = new Car();
        testCar3.setMake("Ford");
        testCar3.setModel("F-150");
        testCar3.setYear("1986");
        testCar3.setColor("Silver");

        carRepo.save(testCar1);
        carRepo.save(testCar2);
        carRepo.save(testCar3);

        List<Car> carListForTest1 = carRepo.findCarByColor("Red");
        List<Car> carListForTest2 = carRepo.findCarByColor("Silver");

        assertEquals(1, carListForTest1.size());
        assertEquals("Red", carListForTest1.get(0).getColor());
        assertEquals(2, carListForTest2.size());
        assertEquals("Silver", carListForTest2.get(0).getColor());
        assertEquals("Silver", carListForTest2.get(1).getColor());

    }
}