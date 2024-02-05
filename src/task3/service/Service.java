package task3.service;

import task3.entity.card.BaseCard;
import task3.entity.client.Client;

public class Service {
    public static void addCardToClient(BaseCard[] cardRepository, Client client, int id) {
        boolean isCardAdd = false;
        for (BaseCard card : cardRepository) {
            if (card.getId() == id) {
                client.setCard(card);
                isCardAdd = true;
                System.out.println("карта с ID '" + id + "' добавлена");
                card.printStatus();
                System.out.println();
            }
        }
        if (!isCardAdd) {
            System.out.println("карта с ID '" + id + "' не существует");
        }
    }

    public static void doTransfer(Client client, int cardIdTransferTo, int cardIdTransferFrom, double transferAmount) {
        double amountBeforeTransfer = client.getCard(cardIdTransferFrom).getCurrentAmount();
        if (checkIdCardInput(client, cardIdTransferTo, cardIdTransferFrom)
                && checkTransferAmountInput(client, cardIdTransferFrom, transferAmount)) {
            client.getCard(cardIdTransferFrom).setCurrentAmount(client.getCard(cardIdTransferFrom).getCurrentAmount()
                    - transferAmount - (transferAmount * client.getCard(cardIdTransferFrom).getTransferFee()));
            client.getCard(cardIdTransferTo).setCurrentAmount(client.getCard(cardIdTransferTo).getCurrentAmount()
                    + CurrencyConverter.convertTransfer(client, cardIdTransferTo, cardIdTransferFrom, transferAmount));
            System.out.println("перевод произведен");
            Service.printTransferStatus(client, amountBeforeTransfer, cardIdTransferTo, cardIdTransferFrom, transferAmount);
        } else {
            System.out.println("перевод невозможен");
        }
    }

    private static boolean checkCardAvailability(BaseCard[] cards, int id) {
        for (BaseCard card : cards) {
            if (card.getId() == id) {
                return true;
            }
        }
        return false;
    }

    private static boolean checkIdCardInput(Client client, int cardIdTransferTo, int cardIdTransferFrom) {
        if (!Service.checkCardAvailability(client.getCards(), cardIdTransferFrom)) {
            System.out.println("у клиента нет каты ID " + cardIdTransferFrom);
            return false;
        } else if (!Service.checkCardAvailability(client.getCards(), cardIdTransferTo)) {
            System.out.println("у клиента нет каты ID " + cardIdTransferTo);
            return false;
        }
        return true;
    }

    private static boolean checkTransferAmountInput(Client client, int cardIdTransferFrom, double transferAmount) {
        if (transferAmount <= 0) {
            System.out.println("неверный ввод суммы перевода");
            return false;
        } else if ((transferAmount + transferAmount * client.getCard(cardIdTransferFrom).getTransferFee())
                > client.getCard(cardIdTransferFrom).getCurrentAmount()) {
            System.out.println("недостаточно остатка на карте для перевода");
            return false;
        } else if (transferAmount > client.getCard(cardIdTransferFrom).getTransferLimit()) {
            System.out.println("превышен лимит перевода");
            return false;
        }
        return true;
    }

    private static void printTransferStatus(Client client, double amountBeforeTransfer, int cardIdTransferTo, int cardIdTransferFrom, double transferAmount) {
        System.out.println("клиент: " + client.getName() + " " + client.getSurName());
        System.out.println("количество карт клиента: " + client.getCardQuantity());
        for (int i = 0; i < client.getCardQuantity(); i++) {
            if (client.getCards()[i].getId() == cardIdTransferTo) {
                System.out.println("карта DI " + client.getCards()[i].getId() + " '" + client.getCards()[i].getCardName()
                        + "': сумма до перевода " + (client.getCards()[i].getCurrentAmount()
                        - CurrencyConverter.convertTransfer(client, cardIdTransferTo, cardIdTransferFrom, transferAmount)));
                System.out.println("карта DI " + client.getCards()[i].getId() + " '" + client.getCards()[i].getCardName()
                        + "': сумма после перевода " + client.getCards()[i].getCurrentAmount());
            } else if (client.getCards()[i].getId() == cardIdTransferFrom) {
                System.out.println("карта DI " + client.getCards()[i].getId() + " '" + client.getCards()[i].getCardName()
                        + "': сумма до перевода " + amountBeforeTransfer);
                System.out.println("карта DI " + client.getCards()[i].getId() + " '" + client.getCards()[i].getCardName()
                        + "': сумма после перевода "
                        + client.getCards()[i].getCurrentAmount());
            } else {
                System.out.println("карта DI " + client.getCards()[i].getId() + " '" + client.getCards()[i].getCardName()
                        + "': сумма до перевода " + client.getCards()[i].getCurrentAmount());
                System.out.println("карта DI " + client.getCards()[i].getId() + " '" + client.getCards()[i].getCardName()
                        + "': сумма после перевода " + client.getCards()[i].getCurrentAmount());
            }
        }
    }
}
