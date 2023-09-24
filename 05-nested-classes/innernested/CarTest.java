package innernested;

public class CarTest {

    public static void main(String[] args) {
        
        Car car = new Car("green", 4, 150);
        Car.Engine engine = car.new Engine(250);
        car.setEngine(engine);
        System.out.println(car);
        System.out.println(engine);

        Car.Engine engine2 = new Car("red", 4).new Engine(200);
    }
    
}
