package threads.thread1;

import static threads.thread1.ThreadColor.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(ANSI_PURPLE+ "Hello from the main Thread");
        Thread anotherThread = new AnotherThread();
        anotherThread.start();
        new Thread(){
            public void run(){
                System.out.println(ANSI_CYAN+"Hello from the anonymous class thread");
            }
        }.start();
        System.out.println(ANSI_BLUE+"Hello again from the main thread");
    }
}
