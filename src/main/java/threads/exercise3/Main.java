package threads.exercise3;

public class Main {
    public static void main(String[] args) {
        CountDown countDown1 = new CountDown();
        CountDown countDown2 = new CountDown();

        CountDownThread t1 = new CountDownThread(countDown1);
        t1.setName("Thread 1");
        CountDownThread t2 = new CountDownThread(countDown2);
        t2.setName("Thread 2");

        t1.start();
        t2.start();

    }
}
class CountDown{
    private int i;
    public void doCountDown(){
        String color;
        switch (Thread.currentThread().getName()){
            case "Thread 1":
                color= ThreadColor.ANSI_GREEN;
                break;
            case "Thread 2":
                color= ThreadColor.ANSI_BLUE;
                break;
            default:
                color= ThreadColor.ANSI_GREEN;
        }
        for (i=10; i> 0 ;i--)  {
            System.out.println(color+ Thread.currentThread().getName() + ": i ="+i);
        }

    }

}
class CountDownThread extends Thread{
    private CountDown threadCountdown;
    public CountDownThread(CountDown countDown){
        threadCountdown=countDown;
    }
    public void run(){
        threadCountdown.doCountDown();
    }
}
