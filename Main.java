import java.util.Locale;
import java.util.Scanner;

public class Main {
    static void main (String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter account number: ");
        int numberCount = sc.nextInt();

        sc.nextLine();

        System.out.println("Enter account holder: ");
        String accountHolder = sc.nextLine();

        Bank bank;

        char choice = ' ';

        while (choice != 'y' && choice != 'n') {
            System.out.println("Is there na initial deposit (y/n)? ");
            String response = sc.nextLine();

            if (!response.isEmpty()) {
                choice = response.charAt(0);
            }
        }
        if(Character.toLowerCase(choice) == 'y'){
            System.out.println("Enter initial deposit value: ");
            double depositIntital = sc.nextDouble();

            bank = new Bank(accountHolder, numberCount, depositIntital);

        }else{
            bank = new Bank(accountHolder, numberCount);
        }

        System.out.printf("Account data: \n%s\n", bank.toString());

        //Deposit
        System.out.println("Enter a deposit value: ");
        double newDeposit = sc.nextDouble();
        bank.DepositBank(newDeposit);

        System.out.printf("Updated account data: \n%s\n", bank.toString());

        //Sake
        System.out.println("Enter a withdraw value: ");
        double newSake = sc.nextDouble();
        bank.SakeBank(newSake);

        System.out.printf("Updated account data: \n%s", bank.toString());
    }
}