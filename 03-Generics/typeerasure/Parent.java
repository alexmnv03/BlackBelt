package typeerasure;

public class Parent {

    public void abc(InfoErasure<String> info) {
        String str = info.getValue();
    }
    
}
