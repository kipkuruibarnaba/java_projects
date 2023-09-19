package threads.bank;

import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("12345-678",1000.00,new ReentrantLock());
        //Create and start the threads here...
//        Thread thread1 = new Thread(){
//            public void run (){
//                account.deposit(300.00);
//                account.withdraw(50.00);
//            }
//        };
//
//        Thread thread2 = new Thread(){
//            public void run (){
//                account.deposit(203.75);
//                account.withdraw(100.00);
//            }
//        };
        Thread thread1 = new Thread(new Runnable(){
            @Override
            public void run(){
                account.deposit(203.75);
                account.withdraw(100.00);
            }
        });
        Thread thread2 = new Thread(new Runnable(){
            @Override
            public void run(){
                account.deposit(203.75);
                account.withdraw(100.00);
            }
        });
        thread1.start();
        thread2.start();
    }
}
