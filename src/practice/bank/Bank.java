package practice.bank;

import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name: ");
        String name = sc.nextLine();
        System.out.println("Enter the account number: ");
        String acc_no = sc.nextLine();

        Account acc = new Account("Snehal", "7886876", 0.0);
        int choice;
        do{
            System.out.println("this is the entire info");
            System.out.println("1: shows your name");
            System.out.println("2: shows your Account number");
            System.out.println("3: amount to be deposited");
            System.out.println("4: Withdraw amount");
            System.out.println("5: Check balance");

            System.out.println("5: Exit");

            System.out.println("Enter your choice: " );
            choice = sc.nextInt();

            switch (choice){
                case 1 :
                    System.out.println("The name of the account holder: " +name);
                    break;

                case 2:
                    System.out.println("The account number: ");
                    acc.getAc_no();
                    break;

                case 3:
                    System.out.println("Enter the amount to be depostited: ");
                    double db = sc.nextDouble();
                    acc.deposit(db);
                    break;

                case 4:
                    System.out.println("Amount ot withdraw:  " );
                    double wd = sc.nextDouble();
                    acc.withdraw(wd);
                    break;

                case 5:
                    System.out.println("Total balance: ");
                    acc.checkBlancce();
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        }
        while (choice != 5);
        sc.close();



    }

}
