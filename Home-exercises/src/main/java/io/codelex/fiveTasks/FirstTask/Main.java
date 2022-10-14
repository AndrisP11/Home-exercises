package io.codelex.fiveTasks.FirstTask;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please input card number: ");
        int number = sc.nextInt();
        sc.nextLine();
        String fullName = sc.nextLine();
        System.out.print("Please input full name: ");
        boolean isVal = false;
        String CCVcode = "";
        System.out.print("Please input CCV code: ");
        while (!isVal) {
            CCVcode = sc.nextLine();
            isVal = validateCCV(CCVcode);
        }


        BigDecimal balance = sc.nextBigDecimal();
        System.out.println("Please input your balance: ");
        CreditCard creditCard = new CreditCard(number, fullName, CCVcode, balance);
        creditCard.withdraw();

    }

    public static boolean validateCCV(String CCVcode) {
        boolean isValid = false;
        if (CCVcode.length() < 3) {
            isValid = false;
            System.out.println("CCV code too short!");
        } else if (CCVcode.length() > 3) {
            isValid = false;
            System.out.println("CCV code too long!");
        } else if (!CCVcode.matches("[0-9]+")) {
            isValid = false;
            System.out.println("CCV code can be only numbers!");
        } else if (!CCVcode.matches("0.*")) {
            isValid = false;
            System.out.println("CCV code has to start with 0!");
        } else {
            isValid = true;
        }
        return isValid;
    }
}
