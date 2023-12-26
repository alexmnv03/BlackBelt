package exanger;

import java.util.List;
import java.util.concurrent.Exchanger;

public class BestFreind extends Thread{

    private String name;
    private List<Action> myAction;
    private Exchanger<Action> exchanger;

    public BestFreind(String name, List<Action> myAction, Exchanger<Action> exchanger){
        this.name = name;
        this.myAction = myAction;
        this.exchanger = exchanger;
        this.start();

    }
    private void whoWins(Action myAction, Action freindAction) {
        if((myAction == Action.KAMEN && freindAction == Action.NOJNIZ)
        || (myAction == Action.NOJNIZ && freindAction == Action.BUMAGA)
        || (myAction == Action.BUMAGA && freindAction == Action.KAMEN)) {
            System.out.println(name + "WINS!!!");
        }
    }

    public void run() {
        Action replay;
        for(Action action: myAction) {
            try {
                // Тут мы передаем другу свое состояние и получаем от него его
                // Если мой друг не готов еще, то поток будет заблокирован в этм месте, пока друг так же не вызовет метод exchange                
                replay = exchanger.exchange(action);
                whoWins(action, replay);
                sleep(2000);
            } catch (InterruptedException e) {                
                e.printStackTrace();
            }
        }
    }
    
}
