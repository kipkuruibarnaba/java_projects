package threads.bank;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {
    private double balance;
    private String accountNumber;
    private Lock lock;

    public BankAccount(String accountNumber, double initialBalance,Lock lock) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
        this.lock=new ReentrantLock();
    }

//    public synchronized void deposit(double amount) {
//        balance += amount;
//    }
//
//    public synchronized void withdraw(double amount) {
//        balance -= amount;
//    }
    public void deposit(double amount) {
        boolean status = false;
        try{
            if(lock.tryLock(1000, TimeUnit.MILLISECONDS)){
                try{
                    balance += amount;
                    status=true;
                }finally {
                    lock.unlock();
                }
            }else {
                System.out.println("Could not get the lock");
            }
        }catch (InterruptedException e){

        }
        System.out.println("Transaction status = "+ status);

        //       lock.lock();
//       try{
//           balance += amount;
//       }finally {
//           lock.unlock();
//       }
//        synchronized (this){
//            balance += amount;
//        }

    }
    public void withdraw(double amount) {
        boolean status=false;
        try{
        if(lock.tryLock(1000, TimeUnit.MILLISECONDS)){
            try{
                balance -= amount;
                status =true;
            }finally {
                lock.unlock();
            }
        }else {
            System.out.println("Could not get the lock");
        }
        }catch (InterruptedException e){

        }
        System.out.println("Transaction status = "+ status);
//        synchronized (this){
//            balance -= amount;
//        }
//        lock.lock();
//        try{
//            balance -= amount;
//        }finally {
//            lock.unlock();
//        }
    }
    public String getAccountNumber(){
        return accountNumber;
    }
    public void printAccountNumber(){
        System.out.println("Account Number = "+accountNumber);
    }

}
