package typeerasure;

public class ErasureTest {

    public static void main(String[] args) {
        
    }

    public void abc(InfoErasure<String> info) {
        String str = info.getValue();
    }
    
    // public void abc(InfoErasure<Integer> info) {
    //     Integer i = info.getValue();
    // }

}
