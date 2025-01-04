package MultiThreading;

import java.util.Scanner;

class Account {
    int balance ;
    Account(int inputBalance){
        balance = inputBalance;
    }
    boolean isSufficientBalance(int withdrawAmount){
        if (balance > withdrawAmount){
            return true;
        }
        else {
            return false;
        }
    }
    void withdraw(int amountWithdraw){
        balance = balance - amountWithdraw;
        System.out.println("Transaction Successful ");
        System.out.println("Current balance is "+ balance);

    }

}

class Customer implements Runnable{
    Account accountDetails;
    String userName ;
    Customer(Account customerDetails , String Name){
            accountDetails = customerDetails;
            userName = Name;
    }

    public void run(){
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter amount to withdraw");
        int amountEntered = s1.nextInt();
        if (accountDetails.isSufficientBalance(amountEntered)){
            accountDetails.withdraw(amountEntered);
        }else {
            System.out.println("Insufficient Balance ");
        }

    }
}

public class ThreadSync {
    public static void main(String[] args) {
        Account a1 = new Account(5000);
        Customer c1 = new Customer(a1,"C1");
        Customer c2 = new Customer(a1, "C2");

        Thread t1 = new Thread(c1);
        Thread t2 = new Thread(c2);

        t1.start();
        t2.start();

    }
}
