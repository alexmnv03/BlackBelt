package genclass;

public class Doublet<V> {

    private V value1;
    private V value2;

    public Doublet(V value1, V value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public <S> S abc(S val) {
        return val;
    }

    public <T> T abcd(T val) {
        return val;
    }    

    public V getValue1() {
        return this.value1;
    }

     public V getValue2() {
        return this.value2;
    }


    @Override
    public String toString() {
        return "{" +
            " value1='" + getValue1() + "'" +
            ", value2='" + getValue2() + "'" +
            "}";
    }
        
}
