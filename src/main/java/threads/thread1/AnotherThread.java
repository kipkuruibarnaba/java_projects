package threads.thread1;

import static threads.thread1.ThreadColor.ANSI_BLUE;

public class AnotherThread extends Thread{
    @Override
    public void run() {
//        super.run();
//        System.out.println(ANSI_BLUE +"Hello from another thread");
        System.out.println(ANSI_BLUE +"Hello from "+currentThread().getName());
        try {
            Thread.sleep(3000);
        }catch (InterruptedException e){
            System.out.println(ANSI_BLUE +"Another Thread woke me up");
            return;
        }
        System.out.println(ANSI_BLUE +"It's past three seconds and I am a wake");
    }
}
