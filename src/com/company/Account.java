package com.company;

import java.util.Scanner;

//Q9.  WAP to create a class account with the instance variables accno, name, balance, account_type.
//        Define 4 methods getData() , display(), withdraw(), deposit().
public class Account {

    int accno;
    double balance;
    String name , account_type;

    void getData() {
        System.out.println(" Account Number ");
        Scanner inp = new Scanner(System.in);
        accno = inp.nextInt();
        System.out.println(" Balance ");
        balance = inp.nextDouble();
        System.out.println(" Account type");
        account_type = inp.next();
        System.out.println(" Name");
        name = inp.next();
        inp.close();
    }

    void display(){
        System.out.println("Displaying Data for user "+ name );
        System.out.println("Account Number " + accno);
        System.out.println("Balance " + balance);
        System.out.println("Account Type " + account_type);
    }

    void withdraw(int amount){
        System.out.println("Account Balance is" +balance);
        System.out.println("Withdrawing....");
        balance -= amount;
        System.out.println("Remaining Balance is" +balance);

    }

    void deposit(int amount){
        System.out.println("Account Balance is" +balance);
        System.out.println("Depositing....");
        balance += amount;
        System.out.println("New Balance is" +balance);

    }
}

class testAccount {
    public static void main(String[] args) {

        Account account = new Account();
        account.getData();
        account.display();
        account .deposit(15000);
        account.withdraw(15000);

    }

}