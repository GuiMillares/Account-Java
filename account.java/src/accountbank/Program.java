package accountbank;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Account account;

        System.out.print("Enter account number: ");
        int acnumber = sc.nextInt();

        System.out.print("Enter account holder: ");
        sc.nextLine();
        String acholder = sc.nextLine();

        System.out.print("Is there an initial deposit? (Y/N): ");
        char response = sc.next().charAt(0);

        if (response == 'Y' || response == 'y') {
            System.out.print("Enter initial deposit value: ");
            double initialDeposit = sc.nextDouble();
            account = new Account(acnumber, acholder, initialDeposit);
        } else {
            account = new Account(acnumber, acholder);
        }

        System.out.println("Account data:");
        System.out.println("Account: " + account.getAcnumber() + ", Holder: " + account.getAcholder()
                + ", Balance: R$" + String.format("%.2f", account.getBalance()));

        System.out.print("Do you want to make a withdrawal? (Y/N): ");
        String withdrawalOption = sc.next();

        if (withdrawalOption.equalsIgnoreCase("Y")) {
            System.out.print("Enter the withdrawal amount: ");
            double withdrawalAmount = sc.nextDouble();
            account.withdraw(withdrawalAmount);
        }

        System.out.println("Updated Data: ");
        System.out.print("Account: " + account.getAcnumber() + ", Holder: " + account.getAcholder() + ", Balance: R$");
        System.out.printf("%.2f%n", account.getBalance());
        
        sc.close();
    }
}
