package genclass;

public class Info<T> {

    private T value;
    
    public Info(T value) {
        this.value = value;
    }

    public T getValue() {
        return this.value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "{" +
            " value='" + getValue() + "'" +
            "}";
    }

}
