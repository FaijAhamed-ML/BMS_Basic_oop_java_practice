import java.util.Scanner;
public class BMS_SavingsAccount {
    private static int acc_num;
    private static String accHolder_name;
    private static double acc_balance;

    //setting up the account details
    public static void setAccNum(int Account_number){
        acc_num = Account_number;
    }
    public static void setAccHoldName(String AccountHolderName){
        accHolder_name = AccountHolderName;
    }

    //getting the account details
    public static int getAccNumber(){
        return acc_num;
    }
    public static String getAccName(){
        return accHolder_name;
    }
    public static double getAccBal(){
        return acc_balance;
    }

    //implement the deposit method
    public static void deposit(double amount){
        acc_balance+= amount;
    }
    public static void withdraw(double amount){
        acc_balance-= amount;
    }

    //display account details
    public static void displayAccountDetails(){
        System.out.println("Account Nmuber: "+acc_num);
        System.out.println("Account Holder: "+accHolder_name);
        System.out.println("Balance: "+acc_balance);
    }
    public static void main(String[] args) {
        Scanner get= new Scanner(System.in);
        System.out.print("Enter the Account Number: ");
        int Account_number= get.nextInt();
        setAccNum(Account_number);
        System.out.print("Enter Account holder Name: ");
        String Account_name= get.next();
        setAccHoldName(Account_name);
        System.out.print("Enter initial Deposit: ");
        double Account_Balance= get.nextDouble();
        deposit(Account_Balance);
        System.out.println("deposited "+Account_Balance+" New balance: "+getAccBal());
        System.out.print("Enter Deposit Amount: ");
        double dep= get.nextDouble();
        deposit(dep);
        System.out.println("deposited "+dep+" New balance: "+getAccBal());
        System.out.print("Enter Withdrawal Amount: ");
        double withdraw= get.nextDouble();
        withdraw(withdraw);
        System.out.println("Withdrawn "+withdraw+" New balance: "+getAccBal());

        System.out.println("\nFinal Account Detils: ");
        displayAccountDetails();

        
        

    }

}