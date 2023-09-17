package Task;

import java.util.Scanner;

public class InterfaceATM {

    private int balance = 10000; // Initialize balance as a class-level instance variable

    public static void main(String[] args) {
        InterfaceATM atm = new InterfaceATM(); // Create a single instance of the ATM interface
        Scanner sc = new Scanner(System.in);
        int choice, check = 1;

        while (check == 1) {
            System.out.println("1. Withdraw");
            System.out.println("2. Deposit");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.println("Enter your choice:");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    atm.drawMoney();
                    break;
                case 2:
                    atm.deposit();
                    break;
                case 3:
                    atm.checkBalance();
                    break;
                case 4:
                    System.out.println("Exiting the ATM. Goodbye!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Choose among the options");
            }

            System.out.println("Press 1 to Continue\n");
            System.out.println("0 to exit\n");
            check = sc.nextInt();
        }
    }

    private void drawMoney() {
        int amount;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount to be withdrawn:");
        amount = sc.nextInt();

        if (balance >= amount && amount % 500 == 0) {
            balance -= amount;
            System.out.println("Withdraw Successful");
        } else if (balance < amount) {
            System.out.println("Insufficient Balance");
        } else {
            System.out.println("Enter amount in multiples of 500");
        }

        System.out.println("Balance: " + balance);
    }

    private void deposit() {
        int amount;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount to deposit:");
        amount = sc.nextInt();

        if (amount % 100 == 0) {
            balance += amount;
            System.out.println("Deposit Successful");
        } else {
            System.out.println("Enter amount in multiples of 100");
        }

        System.out.println("Balance: " + balance);
    }

    private void checkBalance() {
        System.out.println("Balance: " + balance);
    }
}