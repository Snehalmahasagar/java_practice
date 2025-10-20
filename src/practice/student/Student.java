package practice.student;

import java.util.Scanner;

public class Student {
    Scanner sc = new Scanner(System.in);
    double percentage;
    public void score(){

       String name;

        System.out.println("Enter the name of student: ");
        name = sc.nextLine();

    }
    public void percentages(int m1 , int m2 , int m3 , int m4 , int m5){


        percentage = (m1 + m2 + m3+ m4 + m5) / 5.0;
        System.out.println("the student percentage out of 100: " + percentage);
    }
    public void grade(){
        if(percentage > 75){
            System.out.println("Grade A");
        }
        else {
            System.out.println("Grade B");
        }
    }
    public static void main(String[] args) {
            Student sc = new Student();
            sc.score();
            sc.percentages(45,67,78,89,78);
            sc.grade();


    }
}
