package exanger;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Exchanger;

public class ExchangeTest {

    public static void main(String[] args) {
        Exchanger<Action> exchanger = new Exchanger<>();
        List<Action> freindAction = new ArrayList<>();
        freindAction.add(Action.NOJNIZ);
        freindAction.add(Action.NOJNIZ);
        freindAction.add(Action.BUMAGA);
        freindAction.add(Action.NOJNIZ);
        freindAction.add(Action.KAMEN);

        List<Action> freindTwoAction = new ArrayList<>();
        freindTwoAction.add(Action.KAMEN);
        freindTwoAction.add(Action.NOJNIZ);
        freindTwoAction.add(Action.KAMEN);
        freindTwoAction.add(Action.BUMAGA);
        freindTwoAction.add(Action.KAMEN);     
        
        new BestFreind("fr1", freindAction, exchanger);
        new BestFreind("fr2", freindTwoAction, exchanger);
    }
    
}
