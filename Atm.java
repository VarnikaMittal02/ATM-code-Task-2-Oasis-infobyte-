import java.util.*;

public class Atm {
    private static Scanner sc = new Scanner(System.in);
    private static int userPin = 1233;
    private static String userId = "user";

    private static int balance = 1000;

    public static void main(String args[]) {
        // This is main , here we are taking information by the user
        System.out.println(" welcome to the ATM !! ");
        while (true) {
            System.out.println(" Enter user ID :");
            String enteruserId = sc.nextLine();

            System.out.println(" Enter user PIN : ");
            String enterusersPin = sc.nextLine();
            // Condition for checking
            if (enteruserId.equals(enteruserId) && enterusersPin.equals(enterusersPin)) {
                System.out.println("Login successfull !! ");

                while (true) {

                    System.out.println(" 1.Transaction history");
                    System.out.println(" 2.withdraw");
                    System.out.println(" 3.Deposite");
                    System.out.println(" 4.Transfer");
                    System.out.println(" 5.Quit");
                    System.out.println(" Enter your  choice ");

                    int choice = sc.nextInt();
                    sc.nextLine();

                    // Applying the switch case for choiceS off all the users in ATM
                    switch (choice) {
                        case 1:
                            Transactionhistory(); // call the functions one by one in all the cases
                            break;

                        case 2:
                            withdraw();
                            break;

                        case 3:
                            deposite();
                            break;

                        case 4:
                            AmountTransfer();
                            break;

                        case 5:
                            Quit();

                            return;

                        default:
                            System.out.println(" invalid choice ");
                    }
                }

            } else {
                System.out.println("LOGIN FAILED !!");
            }
        }
    }
    // HERE !! we are make a function

    // Function for Transaction History
    public static void Transactionhistory() {
        System.out.println(" Transaction history : ");
        System.out.println(" Balance" + balance);
    }
    // Function for withdraw

    public static void withdraw() {
        System.out.print(" Enter amount to withdraw : ");
        int amount = sc.nextInt();
        sc.nextLine();
        if (balance >= amount) {
            balance -= amount;
            System.out.println("withdraw successfull. ");
        } else {
            System.out.println("INSUFFICIENT MONEY !! ");
        }

    }

    // Function for Deposite
    private static void deposite() {
        System.out.print("Enter amount to deposite: ");
        int amount = sc.nextInt();
        sc.nextLine();
        balance += amount;
        System.out.println("deposite successfull ");

    }

    // Function for Amount Transfer
    private static void AmountTransfer() {
        String recipientId = sc.nextLine();
        System.out.println("Enter recipient ID : ");

        System.out.print("Enter amount to be transfered : ");
        int amount = sc.nextInt();
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Transfer successfull. ");
        } else {
            System.out.println("insufficient balance. ");
        }

    }

    // function for Quit
    private static void Quit() {
        System.out.println("Thankyou for using ATM : ");
    }

}