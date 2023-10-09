package function.consumer;

public class Car {

    String color;
    String name;
    Double engine;



    public Car(String color, String name, Double engine) {
        this.color = color;
        this.name = name;
        this.engine = engine;
    }


    @Override
    public String toString() {
        return "{" +
            " color='" + getColor() + "'" +
            ", name='" + getName() + "'" +
            ", engine='" + getEngine() + "'" +
            "}";
    }


    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return this.name;
    }

    public void setDoorCount(String name) {
        this.name = name;
    }

    public Double getEngine() {
        return this.engine;
    }

    public void setEngine(Double engine) {
        this.engine = engine;
    }
    
}


