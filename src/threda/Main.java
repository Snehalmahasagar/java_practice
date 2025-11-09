package threda;

public class Main {
    public static void main(String[] args) {
        BnakAccount bank = new BnakAccount();
        Runnable run = () ->bank.withdrwal(600);
        Thread t1 = new Thread(run , "snehal");
        Thread t2 = new Thread(run, "sneh");

        t1.start();
        t2.start();



    }
}
