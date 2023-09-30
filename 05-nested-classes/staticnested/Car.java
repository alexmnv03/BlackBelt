package staticnested;

public class Car {

    String color;
    int doorCount;
    Engine engine;
    static int number;
    private static int numbers;


    public Car(String color, int doorCount, Engine engine) {
        this.color = color;
        this.doorCount = doorCount;
        this.engine = engine;
    }


    @Override
    public String toString() {
        return "My Car {" +
            " color='" + getColor() + "'" +
            ", doorCount='" + getDoorCount() + "'" +
            ", engine='" + getEngine() + "'" +
            "}";
    }

    public void getValue() {
        System.out.println(Engine.count);

        Car.Engine engineL = new Car.Engine(200);
        // Но так как мы находимся в классе Car то можно написать и так
        Engine engineLo = new Engine(200);
        System.out.println(engineL.power);
        
    }

    public static class Engine{
        int hoursePower;
        private int power;
        static int count;

        public Engine(int hoursePower) {
            this.hoursePower = hoursePower;
            count++;  
        }

        public int getHoursePower() {
            return this.hoursePower;
        }        

        @Override
        public String toString() {
            return "My Engine {" +
                " color='" + getHoursePower() + "'" +
            "}";
        }       

        public void getValue() {
            System.out.println(number);
            System.out.println(numbers);
            //System.out.println(color); так нельзя
        }

    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getDoorCount() {
        return this.doorCount;
    }

    public void setDoorCount(int doorCount) {
        this.doorCount = doorCount;
    }

    public Engine getEngine() {
        return this.engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
    

}


