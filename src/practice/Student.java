package practice;

import java.util.Scanner;

public class Student extends Schoole {
   private String name;
   private  String city_name;
   Scanner sc = new Scanner(System.in);
   public void input(){
       super.input();
       this.name = name;
       System.out.println("Enter the school name: ");
       name =sc.nextLine();
        this.city_name = city_name;
       System.out.println("Enter the school city: ");
       city_name = sc.nextLine();

   }
   public void output(){
       super.output();
       System.out.println("School name: "+name);
       System.out.println("School city : "+city_name);
   }



}