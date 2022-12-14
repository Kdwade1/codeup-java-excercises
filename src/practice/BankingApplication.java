package practice;

import java.sql.SQLOutput;
import java.util.Scanner;

public class BankingApplication {

    public static void main(String[] args) {
        BankAccount bank1 = new BankAccount("Kelvin", "r3203s");
        bank1.showMenu();

    }

    static class BankAccount {
        BankAccount(String customerName, String customerId) {
            this.customerName = customerName;
            this.customerId = customerId;
        }

        public int getBalance() {
            return balance;
        }

        public void setBalance(int balance) {
            this.balance = balance;
        }

        public void setPreviousTransaction(int previousTransaction) {
            this.previousTransaction = previousTransaction;
        }

        public String getCustomerName() {
            return customerName;
        }

        public void setCustomerName(String customerName) {
            this.customerName = customerName;
        }

        public String getCustomerId() {
            return customerId;
        }

        public void setCustomerId(String customerId) {
            this.customerId = customerId;
        }

        int balance;
        int previousTransaction;
        String customerName;
        String customerId;

        void deposit(int amount) {
            if (amount > 0) {
                balance = balance + amount;
                previousTransaction = amount;
            }

        }

        void withdrawal(int amount) {
            if (amount != 0) {
                balance = balance - amount;
                previousTransaction = -amount;
            }
        }

        void getPreviousTransaction() {
            if (previousTransaction > 0) {
                System.out.println("Deposited: " + previousTransaction);


            } else if (previousTransaction < 0) {
                System.out.println("Withdraw: " + Math.abs(previousTransaction));

            } else {
                System.out.println("No transaction occured");

            }

        }

        void showMenu() {
            char option = '\0';
            Scanner scanner = new Scanner(System.in);
            System.out.println("Welcome " + customerName + "!");
            System.out.println("Your Id number is: " + customerId);
            System.out.println("\n");
            System.out.println("A. Check Balance");
            System.out.println("B. Deposit");
            System.out.println("C. Withdrawal");
            System.out.println("D. Previous Transaction");
            System.out.println("E. Exit");

            do {
                System.out.println("==================================================================");
                System.out.println("Enter an option...");
                System.out.println("==================================================================");
                option = scanner.next().charAt(0);
                System.out.println("\n");

                switch (option) {
                    case 'A':
                        System.out.println("------------------");
                        System.out.println("Balance is: " + balance);
                        System.out.println("------------------");
                        System.out.println("\n");
                        break;


                    case 'B':
                        System.out.println("------------------");
                        System.out.println("Enter amount you wish to deposit");
                        System.out.println("------------------");
                        int amount = scanner.nextInt();
                        System.out.println(amount+" Has been deposited");
                        System.out.println("\n");
                        deposit(amount);
                        break;

                    case 'C':
                        System.out.println("------------------");
                        System.out.println("Enter amount you want to withdraw");
                        System.out.println("------------------");
                        int total = scanner.nextInt();
                        withdrawal(total);
                        System.out.println("\n");
                        break;

                    case 'D':
                        System.out.println("------------------");
                        getPreviousTransaction();
                        ;
                        System.out.println("------------------");
                        System.out.println("\n");
                        break;

                    case 'E':
                        System.out.println("*******************");
                        break;


                    default:
                        System.out.println("Invalid option. Please try again!");

                }
            } while(option != 'E');
                    System.out.println("Thank you for using our service!");



            }
        }

    }

