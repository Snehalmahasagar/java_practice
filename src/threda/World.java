package threda;

public class World extends Thread{
    World(String name){
        super(name);
    }
    @Override
    public void run() {
        while(true) {
            System.out.println(Thread.currentThread().getName()+"is runing");

        }

    }

    public static void main(String[] args) throws InterruptedException {
        World t1 = new World("t1");
        World t2 = new World("t2");
            t1.setDaemon(true);
        t1.start();
        t2.start();


    }
}
