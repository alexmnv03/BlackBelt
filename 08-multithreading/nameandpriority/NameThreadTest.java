package nameandpriority;

public class NameThreadTest {

    public static void main(String[] args) {
        MyThreadOne myThreadOne = new MyThreadOne();
        System.out.println("Name MyThreadOne = " + myThreadOne.getName() + "\n priority of MyThreadOne = " + myThreadOne.getPriority());
        MyThreadOne myThreadOneNext = new MyThreadOne();
        System.out.println("Name myThreadOneNext = " + myThreadOneNext.getName() + "\n priority of myThreadOneNext = " + myThreadOneNext.getPriority());

        MyThreadOne myThreadOneGet = new MyThreadOne();
        myThreadOneGet.setName("my_thread_getName");
        myThreadOneGet.setPriority(Thread.MAX_PRIORITY);
        System.out.println("Name myThreadOneGet = " + myThreadOneGet.getName() + "\n priority of myThreadOneGet = " + myThreadOneGet.getPriority());

    }
    
}
