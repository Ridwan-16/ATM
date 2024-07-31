package ATM;

import java.util.InputMismatchException;
import java.util.Scanner;

class UserData {
    int ID;
    int PIN;

    int userID(int ID) {
        this.ID = ID;
        return ID;
    }

    int userPIN(int PIN) {
        this.PIN = PIN;
        return PIN;
    }
}

public class login {
    public static void main(String[] args) throws InputMismatchException {
        int credit = 0;
        boolean jack = true;
        UserData user = new UserData();
        user.ID = 1234;
        user.PIN = 1234;
        Scanner input = new Scanner(System.in);
        try {
            while (jack) {

                System.out.println("Enter your bank ID: ");
                int userID = input.nextInt();
                System.out.println("Enter your PIN: ");
                int userPIN = input.nextInt();

                if (userID == user.ID && userPIN == user.PIN) {
                    System.out.println("Welcome to the BIJOY BANK PLC.");
                    break;

                } else {
                    System.out.println("Wrong input!!");
                }
            }
        } catch (Exception e) {
            System.out.println("Only number input is valid");
            System.exit(0);
        }

        while (jack) {
            System.out.println();
            System.out.println("Enter your option\n1.Check balance 2.Diposit 3.Withdraw 4.Exit");
            int num = input.nextInt();
            switch (num) {
                case 1:
                    System.out.printf("your balance is: %d $", credit);
                    break;
                case 2:
                    System.out.println("Enter your ammout you want to diposit: ");
                    credit += input.nextInt();
                    System.out.printf("New balace: %d $", credit);
                    break;
                case 3:
                    System.out.println("Enter your ammout you want to withdraw :");
                    int withdraw = input.nextInt();
                    if (withdraw > credit) {
                        System.out.println("insufficient balance!");
                        break;
                    } else {
                        credit -= withdraw;
                        System.out.printf("New balace: %d $", credit);
                        break;
                    }
                case 4:
                    System.out.println("See you again!!");
                    System.exit(0);
                default:
                    System.out.println("invalid input");
                    break;
            }
        }
    }
}