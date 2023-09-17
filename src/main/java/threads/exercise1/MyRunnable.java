package threads.exercise1;

import static threads.exercise1.ThreadColor.ANSI_RED;

public class MyRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println(ANSI_RED+" Hello from my Runnable implementation");
    }
}
