package practice.atm;

public class Customer {
    private String pin;


    public double getBalance() {
        return balance;
    }

    public String getAcc_no() {
        return acc_no;
    }

    private String acc_no;
    private  double balance;

    public boolean choice;

    Customer( String pin, String acc_no,boolean choice,double balance){
        this.pin = pin;
        this.acc_no = acc_no;
        this.balance = balance;
    }

    public Object withdrwa(double amount){
        double cash = balance - amount;
        if(amount > balance){
            System.out.println("Please decrease the amount: ");
            System.out.println("Your balance is only: "+balance);

        }
        else{
            System.out.println("Here is your cash: "+amount);
            System.out.println("The total balance remained: "+cash);
        }
        return null;
    }

    public void isChoicce(){
        if(choice == false){
            System.out.println("You need the account");
        }
        else{
            System.out.println("You can use services");
        }
    }

    public String isPin(){
        if(pin.length() < 6){
            System.out.println("Please type valid pin: ");
        }
        else{
            System.out.println("Starting your service");
        }
        return pin;
    }






}
