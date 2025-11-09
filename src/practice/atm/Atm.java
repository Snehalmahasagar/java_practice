package practice.atm;

import java.util.Scanner;

public class Atm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome");
        System.out.println("Enter the acc_no: ");
        String acc_no = sc.nextLine();

        System.out.println("Enter your pin: ");
        String pin = sc.nextLine();

        Customer c1 = new Customer("27984797", "67878",false,5000);

        int choices;
        do{
            System.out.println("This is the entire info");
            System.out.println("1 : shows balance");
            System.out.println("2: this shows amount");

            System.out.println("3: this shows pin");
            System.out.println("enter the choice: ");
            choices = sc.nextInt();


            switch (choices){
                case 1:
                    System.out.println("Your existing balance: " +c1.getBalance());
                    break;

                case 2:
                    System.out.println("Cash that you want to withdrwa: " +c1.withdrwa(3000));
                    break;

                case 3:
                    System.out.println("this is your pin: " +c1.isPin());

            }
        }
        while (choices != 4);
            sc.close();

    }
}
