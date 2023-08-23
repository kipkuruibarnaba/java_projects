package threads.thread1;

import static threads.thread1.ThreadColor.ANSI_BLUE;

public class AnotherThread extends Thread{
    @Override
    public void run() {
//        super.run();
        System.out.println(ANSI_BLUE +"Hello from another thread");
    }
}
