package Bank_managment;

import java.text.DateFormat;
import java.util.Date;
import java.util.Scanner;

public class Customer extends Bank{
    Scanner sc = new Scanner(System.in);


    public void getDetails(){
        System.out.println("Enter your name: ");
        name = sc.nextLine();
        if(name == null || name.trim().isEmpty()){
            System.out.println("Enter your name: ");
            name = sc.nextLine();
        }
        System.out.println("Enter accout type: ");
        accountType = sc.nextLine();



        System.out.println("Entet the dob: ");
        age = sc.nextInt();
        sc.nextLine();
        if(age < 18){
            System.out.println("::Sorry you are not eligible::");
            System.exit(0);

        }
        else{
            System.out.println("You are eligible for");

        }
        System.out.println("Investing amount: ");
        amount=sc.nextDouble();

        if(amount < 100){
            System.out.println("Please invest more than 100.Rs");
           System.exit(0);
        }
        else{
            System.out.println("congo on your first saving");
        }
    }

}
