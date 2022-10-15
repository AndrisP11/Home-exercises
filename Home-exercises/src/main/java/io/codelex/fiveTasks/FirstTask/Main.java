package io.codelex.fiveTasks.FirstTask;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {


        CreditCard creditCard = new CreditCard(4647484, "Peter Milts", "045", new BigDecimal(2000));
        creditCard.withdraw(new BigDecimal(500));

    }


}
