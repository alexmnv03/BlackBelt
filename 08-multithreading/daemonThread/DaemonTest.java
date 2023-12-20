package daemonThread;

public class DaemonTest {

    public static void main(String[] args) {
        System.out.println("Main thred starts");
        UserThread userThread = new UserThread();
        userThread.setName("user Thread");
        DaemonThread daemonThread = new DaemonThread();
        daemonThread.setName("daemon Thread");
        daemonThread.setDaemon(true);
        userThread.start();
        daemonThread.start();
        System.out.println("Main thred ends");
    }
    
}
