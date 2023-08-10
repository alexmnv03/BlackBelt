package typeerasure;

public class InfoErasure<T> {
    
    private T value;


    public InfoErasure(T value) {
        this.value = value;
    }


    public T getValue() {
        return this.value;
    }

    public void setValue(T value) {
        this.value = value;
    }


}
