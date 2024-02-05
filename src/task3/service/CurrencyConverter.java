package task3.service;

import task3.entity.client.Client;

public class CurrencyConverter {
    private static final double COURSE_EUR = 0.200;
    private static final double COURSE_USD = 0.300;
    public static double convertTransfer(Client client, int cardIdTransferTo, int cardIdTransferFrom, double transferAmount) {
        double transferInByn;
        if (client.getCard(cardIdTransferFrom).getCurrency().equals("USD")) {
            transferInByn = transferAmount /CurrencyConverter.COURSE_USD;
        } else if (client.getCard(cardIdTransferFrom).getCurrency().equals("EUR")) {
            transferInByn = transferAmount / CurrencyConverter.COURSE_EUR;
        } else {
            transferInByn = transferAmount;
        }

        if (client.getCard(cardIdTransferTo).getCurrency().equals("USD")) {
            return transferInByn * CurrencyConverter.COURSE_USD;
        } else if (client.getCard(cardIdTransferTo).getCurrency().equals("EUR")) {
            return transferInByn * CurrencyConverter.COURSE_EUR;
        } else {
            return transferInByn;
        }

    }
}
