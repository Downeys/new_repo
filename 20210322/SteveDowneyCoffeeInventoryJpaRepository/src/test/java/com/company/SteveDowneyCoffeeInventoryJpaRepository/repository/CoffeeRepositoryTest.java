package com.company.SteveDowneyCoffeeInventoryJpaRepository.repository;

import com.company.SteveDowneyCoffeeInventoryJpaRepository.models.Coffee;
import com.company.SteveDowneyCoffeeInventoryJpaRepository.models.Roaster;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CoffeeRepositoryTest {

    @Autowired
    CoffeeRepository coffeeRepo;

    @Autowired
    RoasterRepository roasterRepo;

    @Before
    public void setUp() throws Exception {
        coffeeRepo.deleteAll();
        roasterRepo.deleteAll();
    }

    @Test
    public void shouldFindCoffeeByRoasterId() {
        Roaster testRoaster1 = new Roaster();
        testRoaster1.setName("We Roast LLC");
        testRoaster1.setStreet("123 Main St.");
        testRoaster1.setCity("Big City");
        testRoaster1.setState("TX");
        testRoaster1.setPostalCode("98765");
        testRoaster1.setPhone("321-654-984");
        testRoaster1.setEmail("info@weroast.com");
        testRoaster1.setNote("We write notes.");

        Roaster testRoaster2 = new Roaster();
        testRoaster2.setName("You Roast We Watch");
        testRoaster2.setStreet("321 Another Ln.");
        testRoaster2.setCity("Springdale");
        testRoaster2.setState("CA");
        testRoaster2.setPostalCode("12345");
        testRoaster2.setPhone("123-456-789");
        testRoaster2.setEmail("info@youroastwewatch.com");
        testRoaster2.setNote("You write notes, we watch.");

        roasterRepo.save(testRoaster1);
        roasterRepo.save(testRoaster2);

        Coffee testCoffee1 = new Coffee();
        testCoffee1.setRoasterId(testRoaster1.getRoasterId());
        testCoffee1.setName("Folgers: Medium Roast");
        testCoffee1.setCount(156);
        testCoffee1.setUnitPrice(2.56);
        testCoffee1.setDescription("Good, cheap coffee.");
        testCoffee1.setType("Ground");

        Coffee testCoffee2 = new Coffee();
        testCoffee2.setRoasterId(testRoaster2.getRoasterId());
        testCoffee2.setName("Maxwell House: French Roast");
        testCoffee2.setCount(32);
        testCoffee2.setUnitPrice(1.99);
        testCoffee2.setDescription("That other coffee in the blue tub");
        testCoffee2.setType("Ground");

        Coffee testCoffee3 = new Coffee();
        testCoffee3.setRoasterId(testRoaster2.getRoasterId());
        testCoffee3.setName("Maxwell House: Donut Blend");
        testCoffee3.setCount(15);
        testCoffee3.setUnitPrice(12.99);
        testCoffee3.setDescription("That other coffee in the blue tub, but in cups");
        testCoffee3.setType("Keurig");

        coffeeRepo.save(testCoffee1);
        coffeeRepo.save(testCoffee2);
        coffeeRepo.save(testCoffee3);

        List<Coffee> coffeeListForTest1 = coffeeRepo.findCoffeeByRoasterId(testRoaster1.getRoasterId());
        List<Coffee> coffeeListForTest2 = coffeeRepo.findCoffeeByRoasterId(testRoaster2.getRoasterId());

        assertEquals(1, coffeeListForTest1.size());
        assertEquals(testRoaster1.getRoasterId(), coffeeListForTest1.get(0).getRoasterId());
        assertEquals(2, coffeeListForTest2.size());
        assertEquals(testRoaster2.getRoasterId(), coffeeListForTest2.get(0).getRoasterId());
        assertEquals(testRoaster2.getRoasterId(), coffeeListForTest2.get(1).getRoasterId());

    }

    @Test
    public void findCoffeeByType() {
        Roaster testRoaster1 = new Roaster();
        testRoaster1.setName("We Roast LLC");
        testRoaster1.setStreet("123 Main St.");
        testRoaster1.setCity("Big City");
        testRoaster1.setState("TX");
        testRoaster1.setPostalCode("98765");
        testRoaster1.setPhone("321-654-984");
        testRoaster1.setEmail("info@weroast.com");
        testRoaster1.setNote("We write notes.");

        Roaster testRoaster2 = new Roaster();
        testRoaster2.setName("You Roast We Watch");
        testRoaster2.setStreet("321 Another Ln.");
        testRoaster2.setCity("Springdale");
        testRoaster2.setState("CA");
        testRoaster2.setPostalCode("12345");
        testRoaster2.setPhone("123-456-789");
        testRoaster2.setEmail("info@youroastwewatch.com");
        testRoaster2.setNote("You write notes, we watch.");

        roasterRepo.save(testRoaster1);
        roasterRepo.save(testRoaster2);

        Coffee testCoffee1 = new Coffee();
        testCoffee1.setRoasterId(testRoaster1.getRoasterId());
        testCoffee1.setName("Folgers: Medium Roast");
        testCoffee1.setCount(156);
        testCoffee1.setUnitPrice(2.56);
        testCoffee1.setDescription("Good, cheap coffee.");
        testCoffee1.setType("Ground");

        Coffee testCoffee2 = new Coffee();
        testCoffee2.setRoasterId(testRoaster1.getRoasterId());
        testCoffee2.setName("Maxwell House: French Roast");
        testCoffee2.setCount(32);
        testCoffee2.setUnitPrice(1.99);
        testCoffee2.setDescription("That other coffee in the blue tub");
        testCoffee2.setType("Ground");

        Coffee testCoffee3 = new Coffee();
        testCoffee3.setRoasterId(testRoaster1.getRoasterId());
        testCoffee3.setName("Maxwell House: Donut Blend");
        testCoffee3.setCount(15);
        testCoffee3.setUnitPrice(12.99);
        testCoffee3.setDescription("That other coffee in the blue tub, but in cups");
        testCoffee3.setType("Kuerig");

        coffeeRepo.save(testCoffee1);
        coffeeRepo.save(testCoffee2);
        coffeeRepo.save(testCoffee3);

        List<Coffee> coffeeListForTest1 = coffeeRepo.findCoffeeByType("Kuerig");
        List<Coffee> coffeeListForTest2 = coffeeRepo.findCoffeeByType("Ground");

        assertEquals(1, coffeeListForTest1.size());
        assertEquals("Kuerig", coffeeListForTest1.get(0).getType());
        assertEquals(2, coffeeListForTest2.size());
        assertEquals("Ground", coffeeListForTest2.get(0).getType());
        assertEquals("Ground", coffeeListForTest2.get(1).getType());
    }
}