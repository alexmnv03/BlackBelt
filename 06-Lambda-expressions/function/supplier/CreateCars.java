package function.supplier;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class CreateCars {

    public static List<Car> createThreeCars(Supplier<Car> carSuplier) {
        List<Car> cars = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            cars.add(carSuplier.get());            
        }
        return cars;
    }
    
    public static void main(String[] args) {
        List<Car> cars = createThreeCars(() -> new Car("white", "Nissan Tida", 1.6));
        System.out.println("cars = " + cars);
    }

}
