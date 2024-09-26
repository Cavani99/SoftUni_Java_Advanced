package Bank_Account;

import java.util.HashMap;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] commands = scanner.nextLine().split("\\s+");
        HashMap <Integer, BankAccount> accounts = new HashMap<>();
        BankAccount bankAccount;
        while (!commands[0].equals("End")){
            switch (commands[0]){
                case "Create":
                    bankAccount = new BankAccount();
                    accounts.put(bankAccount.getId(), bankAccount);
                    System.out.println(String.format("Account ID%d created", bankAccount.getId()));
                    break;
                case "Deposit":
                    int id = Integer.parseInt(commands[1]);
                    double amount = Double.parseDouble(commands[2]);

                    if(!accounts.containsKey(id)){
                        System.out.println("Account does not exist");
                    } else {
                        bankAccount = accounts.get(id);
                        bankAccount.deposit(amount);
                        System.out.println(String.format("Deposited %.0f to ID%d", amount, id));
                    }
                    break;
                case "SetInterest" :
                    BankAccount.setInterest_rate(Double.parseDouble(commands[1]));
                    break;
                case  "GetInterest":
                    id = Integer.parseInt(commands[1]);
                    int years = Integer.parseInt(commands[2]);

                    if(!accounts.containsKey(id)){
                        System.out.println("Account does not exist");
                    } else {
                        bankAccount = accounts.get(id);
                        System.out.println(String.format(Locale.US, "%.2f", bankAccount.getInterest_rate(years)));
                    }
                    break;
            }

            commands = scanner.nextLine().split("\\s+");
        }

    }
}
