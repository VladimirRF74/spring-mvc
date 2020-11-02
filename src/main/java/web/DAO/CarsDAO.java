package web.DAO;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarsDAO {
    private final List<Car> carList;
    {
        carList = new ArrayList<>();
        carList.add(new Car("Audi", 2011, 14000));
        carList.add(new Car("Lada", 2018, 11000));
        carList.add(new Car("Opel", 2001, 7500));
        carList.add(new Car("Kia", 2019, 29000));
        carList.add(new Car("BMW", 2015, 18000));
    }
    public List<Car> getAllCars() {
        return carList;
    }
}
