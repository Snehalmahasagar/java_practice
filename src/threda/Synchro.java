package threda;

public class Synchro {
    private int cnt=0;
    public synchronized void  increment(){
        cnt ++;
    }


    public int getCnt(){
        return cnt;
    }

    public static void main(String[] args) throws InterruptedException {
        Synchro sn = new Synchro();
        Thread t1 = new Thread(() ->{
            for (int i = 0 ; i<100; i++){
                sn.increment();
            }
        });
        Thread t2 = new Thread(() ->{
            for (int i = 0 ; i<100; i++){
                sn.increment();
            }
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(sn.getCnt());

    }

}
