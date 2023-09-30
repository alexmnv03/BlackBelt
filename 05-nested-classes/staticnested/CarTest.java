package staticnested;

public class CarTest {

    public static void main(String[] args) {
        
        Car.Engine engine = new Car.Engine(212);
        System.out.println(engine);
        Car car = new Car("white", 4, engine);
        System.out.println(car);
    }
    
}
