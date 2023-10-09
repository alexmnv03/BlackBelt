package function.consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class ConsumerTest {

    public static List<Car> createThreeCars(Supplier<Car> carSuplier) {
        List<Car> cars = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            cars.add(carSuplier.get());            
        }
        return cars;
    }

    public static void changeCar(Car car, Consumer<Car> carConsumer) {
        carConsumer.accept(car);
    }

    public static void main(String[] args) {
        List<Car> cars = createThreeCars(() -> new Car("white", "Nissan Tida", 1.6));
        System.out.println("cars = " + cars);

        changeCar(cars.get(0), car -> {car.color = "red";
            car.engine = 2.4;
            System.out.println("upgrade car = " + car);
        });
    }
    
}
