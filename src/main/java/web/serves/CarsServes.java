package web.serves;

import org.springframework.stereotype.Service;
import web.DAO.CarsDAO;
import web.model.Car;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarsServes {
    private final CarsDAO carsDAO;

    public CarsServes(CarsDAO carsDAO) {
        this.carsDAO = carsDAO;
    }

    public List<Car> showListCarsToCount(Integer count) {
        if (count != null) return carsDAO.getAllCars().stream().limit(count).collect(Collectors.toList());
        else return carsDAO.getAllCars();
    }
}
