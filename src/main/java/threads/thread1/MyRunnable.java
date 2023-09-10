package threads.thread1;

import static threads.thread1.ThreadColor.ANSI_RED;
import static threads.thread1.ThreadColor.ANSI_RESET;

public class MyRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println(ANSI_RED+" Hello from my Runnable implementation");
    }
}
