package practice;

import java.util.Scanner;

public class Student extends Schoole{
   private String name ;
   private int roll_numer;
   private String city;

    public double getPercentage() {
        System.out.println("PERCENTAGE :" +percentage);
        return percentage;
    }

    public void setPercentage() {
        this.percentage = percentage;
        System.out.println("Enter the percentage here: ");
        percentage = sc.nextDouble();

    }

    public String getCity() {
        System.out.println("CITY: "+city);

        return city;
    }

    public void setCity() {
        this.city = city;
        System.out.println("enter the city : ");
        city = sc.nextLine();
    }

    private double percentage;




    public void setName() {

        System.out.println("Enter the name : ");
        name = sc.nextLine();
        this.name = name;

    }
    public String getName() {

        System.out.println("NAME: " +name);
        return name;
    }

    public void setRoll_numer(){
        this.roll_numer = roll_numer;
        System.out.println("Enter the roll number : ");
        roll_numer = sc.nextInt();
        sc.nextLine();

    }

    public int getRoll_numer(){
        System.out.println("ROLL NUMBER: "+roll_numer);
        return roll_numer;
    }




    Scanner sc = new Scanner(System.in);


}