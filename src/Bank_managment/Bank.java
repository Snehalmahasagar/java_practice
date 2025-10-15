package Bank_managment;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Bank {
    Scanner sc = new Scanner(System.in);
    public String name; // ✅ move here
    public String accountType;
    public double amount;



    private int pin;
    public int age;
    public void getPin(){
        System.out.println("Enter the pin: ");
        pin = sc.nextInt();
    }


    public void AddressDetails(){
        String address;
        System.out.println("Enter the bank address here: ");
        address = sc.nextLine();
        System.out.println(address);

    }
    public void ShowDetails(){
        System.out.println("Customer name: " +name);
        System.out.println("accounttype: "+accountType);
        System.out.println("Amount: "+amount);
        System.out.println("PIN: "+pin);
        System.out.println("AGE: "+age);


    }


    public static void main(String[] args) {
            Customer c1 = new Customer();
        System.out.println("****Welcome to the Bank****");
        c1.AddressDetails();
        System.out.println("-----------Fill your info--------");
        c1.getDetails();
        c1.getPin();
        System.out.println("---------please check once----------");

        c1.ShowDetails();
    }
}
