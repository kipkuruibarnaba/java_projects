package threads.exercise1;

import static threads.exercise1.ThreadColor.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(ANSI_PURPLE+ "Hello from the main Thread");
        Thread anotherThread = new AnotherThread();
        anotherThread.setName("==== Another Thread =====");
        anotherThread.start();
        new Thread(){
            public void run(){
                System.out.println(ANSI_GREEN+"Hello from the anonymous class thread");
            }
        }.start();
        Thread myRunnable = new Thread(new MyRunnable(){
            @Override
            public void run() {
//                super.run();
                System.out.println(ANSI_RED+"Hello from the anonymous class implementation of run()");
                try {
//
                    anotherThread.join();
                    System.out.println(ANSI_RED+"Another thread terminated or timed out, So I am running again!");
                } catch (InterruptedException e){
                    System.out.println(ANSI_RED+"I couldn't wait after all. I was Interrupted");
                }
            }
        });
        myRunnable.start();
//        Thread myRunnable = new Thread(new MyRunnable());
//        myRunnable.start();
//        anotherThread.interrupt();
        System.out.println(ANSI_PURPLE+"Hello again from the main thread");
    }
}
