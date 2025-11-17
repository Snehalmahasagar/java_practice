package practice;

public class Main {
    public static void main(String[] args) {
        generics<Integer> gen = new generics<>();
        gen.setValue(1);
        int i = gen.getValue();
        System.out.println(i);

    }
}
