package practice.bank;

public class Account {


    private String name;
    private String ac_no;
    private double balance;

    public  Account(String name , String ac_no , double balance){
        this.ac_no = ac_no;
        this.balance= balance;
        this.name = name;
    }
    public void deposit(double amount){
        if(amount > 0)
        {
            balance += amount;
            System.out.println("Current balance is : " +balance);
        }
        else{
            System.out.println("Invalid amount");
            System.out.println(balance);
        }
    }

    public void withdraw(double amount){
            if(amount > 0 && amount <= balance){
                balance -= amount;
                System.out.println(amount+ "Rs amount is debited from acc_no" + ac_no);
                System.out.println("Available amonunt: " +balance);
            }
            else{
                System.out.println("you cant take the amount greater than balance");
            }
    }
    public void checkBlancce(){
        System.out.println("Total balance: " +balance);
    }
    public String getAc_no() {
        return ac_no;
    }

    public String getName() {
        return name;
    }


}
