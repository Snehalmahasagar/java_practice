package threda;

import java.util.Locale;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BnakAccount {
    public int balance = 1000;
    private final Lock lock = new ReentrantLock();
    public synchronized void withdrwal(int amount)  {
        lock.lock();

       try{
           System.out.println(Thread.currentThread().getName() +" "+ "withdrawls " + amount);
           if(balance >= amount){
               System.out.println("Successful withdrwal");
               balance -= amount;
               Thread.sleep(2000);
               System.out.println("Remaining balance= " + balance);
           }
           else{
               System.out.println("Insufficient balance");

           }
       } catch (InterruptedException e) {
           throw new RuntimeException(e);
       } finally {
           lock.unlock();
       }

    }

    public int getBalance(){
        return balance;
    }
}
