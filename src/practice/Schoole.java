package practice;
import java.util.Scanner;


public class Schoole {
    int roll;
    String name;
    String city;

    Scanner sc = new Scanner(System.in);
    public void input(){
        System.out.println("Enter the roll_number: ");
        roll = sc.nextInt();
        sc.nextLine();

        System.out.println("Ente the name here : ");
        name = sc.nextLine();
        sc.nextLine();

        System.out.println("enter the city here: ");
        city= sc.nextLine();
    }

    public void output(){
        System.out.println("Name: "+name);
        System.out.println("Roll_number: "+roll);
        System.out.println("City : " +city);
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.input();

        s1.output();
    }
}