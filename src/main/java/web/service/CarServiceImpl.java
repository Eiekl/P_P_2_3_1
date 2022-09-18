package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImpl implements CarService {

    @Override
    public List<Car> carList(int count) {
        List<Car> carList;
        {
            carList = new ArrayList<>();
            carList.add(new Car("Chevrolet", "Aveo", "brown"));
            carList.add(new Car("Chevrolet", "Epica", "black"));
            carList.add(new Car("Chevrolet", "Lacetti", "white"));
            carList.add(new Car("Chevrolet", "Corvette", "red"));
            carList.add(new Car("Chevrolet", "Matiz", "blue"));
        }
        return carList.stream().limit(count).collect(Collectors.toList());
    }
}
