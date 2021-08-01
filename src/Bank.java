import java.util.Scanner;

public class Bank {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int num;
        double balance = 0;
        double checkingBalance = 0, savingsBalance = 0;

        do {

            double amount;

            System.out.println("------------------------");
            System.out.println("Select a Transaction by typing number");
            System.out.println("1. Deposit");
            System.out.println("2. Withdrawal");
            System.out.println("3. Balance");
            System.out.println("4. Exit");
            System.out.println("------------------------");
            num = scan.nextInt();


            if (num == 1) {
                System.out.println("------------------------");
                System.out.println("Would you like to deposit in checking or savings?");
                System.out.println("1. Checking");
                System.out.println("2. Savings");
                System.out.println("------------------------");
                num = scan.nextInt();

                if (num == 1) {
                    System.out.println("------------------------");
                    System.out.println("Enter amount to deposit in checking account: ");
                    System.out.println("------------------------");
                    amount = scan.nextDouble();

                    System.out.println("------------------------");
                    System.out.println("Would you like to continue this transaction?");
                    System.out.println("1. Yes");
                    System.out.println("2. No");
                    System.out.println("------------------------");
                    num = scan.nextInt();

                    checkingBalance += amount;
                    System.out.println("------------------------");
                    System.out.println("Your checking account's balance is " + checkingBalance);
                    System.out.println("------------------------");

                } else if (num == 2) {
                    System.out.println("------------------------");
                    System.out.println("Enter amount to deposit in savings account: ");
                    System.out.println("------------------------");
                    amount = scan.nextDouble();

                    System.out.println("------------------------");
                    System.out.println("Would you like to continue this transaction?");
                    System.out.println("1. Yes");
                    System.out.println("2. No");
                    System.out.println("------------------------");
                    num = scan.nextInt();

                    if (num == 1) {
                        savingsBalance += amount;
                        System.out.println("------------------------");
                        System.out.println("Your savings account's balance is " + savingsBalance);
                        System.out.println("------------------------");
                    } else if (num == 2) {

                    }
                }


            } else if (num == 2) {

                System.out.println("------------------------");
                System.out.println("Would you like to withdrawal from checking or savings?");
                System.out.println("1. Checking");
                System.out.println("2. Savings");
                System.out.println("------------------------");
                num = scan.nextInt();

                if (num == 1) {

                    System.out.println("------------------------");
                    System.out.println("Enter amount to withdrawal: ");
                    System.out.println("------------------------");
                    amount = scan.nextDouble();

                    System.out.println("------------------------");
                    System.out.println("Would you like to continue this transaction?");
                    System.out.println("1. Yes");
                    System.out.println("2. No");
                    System.out.println("------------------------");
                    num = scan.nextInt();

                    if (num == 1) {
                        checkingBalance -= amount;
                        System.out.println("------------------------");
                        System.out.println("Your checking account's balance is " + checkingBalance);
                        System.out.println("------------------------");
                    } else if (num == 2) {
                    }

                } else if (num == 2) {

                    System.out.println("------------------------");
                    System.out.println("Enter amount to withdrawal: ");
                    System.out.println("------------------------");
                    amount = scan.nextDouble();

                    System.out.println("------------------------");
                    System.out.println("Would you like to continue this transaction?");
                    System.out.println("1. Yes");
                    System.out.println("2. No");
                    System.out.println("------------------------");
                    num = scan.nextInt();

                    if (num == 1) {

                        savingsBalance -= amount;
                        System.out.println("------------------------");
                        System.out.println("Your savings account's balance is " + savingsBalance);
                        System.out.println("------------------------");
                    } else if (num == 2) { //if you say no to continuing
                    }
                }


            } else if (num == 3) {
                System.out.println("------------------------");
                System.out.println("Your Checking balance is " + checkingBalance);
                System.out.println("Your Savings balance is " + savingsBalance);
                System.out.println("------------------------");
                num = scan.nextInt();
            }


        } while (num != 4);

        System.out.println("------------------------");
        System.out.println("Good Bye!");
        System.out.println("------------------------");
    }
}
