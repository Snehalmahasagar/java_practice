package practice;

public class Reverse {
    public void fibo(int n){
            int a  = 0 ;
            int b = 1;
            int temp = 0;
            for (int  i = 0 ; i<=n ; i++){
                System.out.println(a + " ");
                temp = a+b;
                a= b ;
                b = temp;


            }

    }

    public static void main(String[] args) {
        Reverse r1 = new Reverse();
        r1.fibo(5);
    }

}
