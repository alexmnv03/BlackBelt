package innernested;

public class Car {

    String color;
    int doorCount;
    Engine engine;
    static int number;
    private static int numbers;


    public Car(String color, int doorCount, int hoursePower) {
        this.color = color;
        this.doorCount = doorCount;
        this.engine = this.new Engine(hoursePower);
    }

    public Car(String color, int doorCount) {
        //System.out.println(hoursePower); е можем обратиться к переменной внутреннего класса пока он не создан

        // Так можн делать тольк овнутри класса Car
        Engine engine = new Engine(200);
        System.out.println(engine.hoursePower);
        this.color = color;
        this.doorCount = doorCount;
     
    }    

    @Override
    public String toString() {
        return "My Car {" +
            " color='" + getColor() + "'" +
            ", doorCount='" + getDoorCount() + "'" +
            ", engine='" + getEngine() + "'" +
            "}";
    }

    // public void getValue() {
    //     System.out.println(Engine.count);

    //     Car.Engine engineL = new Car.Engine(200);
    //     // Но так как мы находимся в классе Car то можно написать и так
    //     Engine engineLo = new Engine(200);
    //     System.out.println(engineL.power);
        
    // }

    public class Engine{
        int hoursePower;
        // private int power;
        public final static int count=4;//Error
        public final static int count2=4;

        public Engine(int hoursePower) {
            this.hoursePower = hoursePower;
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

        // public void getValue() {
        //     System.out.println(number);
        //     System.out.println(numbers);
        // }

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


