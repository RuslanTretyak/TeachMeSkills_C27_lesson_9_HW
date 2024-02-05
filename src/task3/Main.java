package task3;

import task3.entity.card.BelCard;
import task3.repository.CardRepository;
import task3.entity.card.MasterCard;
import task3.entity.card.VisaCard;
import task3.entity.client.Client;
import task3.service.Service;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Client client1 = new Client("Иван", "Иванов", "KH1234567", "01.01.1994",
                "230001", "Беларусь", "Гродно", "Советская", "1");
        CardRepository cardRepository = new CardRepository();
        cardRepository.addCardToRepository(new BelCard(1111_1111_1234_5678L, 1,123,
                1000.0, "BYN", 300.0));
        cardRepository.addCardToRepository(new VisaCard(2222_2222_1234_5678L, 2,123,
                2500.0, "USD", 500.0));
        cardRepository.addCardToRepository(new MasterCard(3333_3333_1234_5678L, 3,123,
                4000.0, "EUR", 200.0));
        Service.addCardToClient(cardRepository.getCardRepository(), client1, 1);
        Service.addCardToClient(cardRepository.getCardRepository(), client1, 2);
        Service.addCardToClient(cardRepository.getCardRepository(), client1, 3);
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите карту с которой будет осуществлен перевод");
        int cardTransferFrom = scanner.nextInt();
        System.out.println("введите карту на которую будет осуществлен перевод");
        int cardTransferTo = scanner.nextInt();
        System.out.println("введите сумму перевода");
        double transferAmount = scanner.nextDouble();
        Service.doTransfer(client1, cardTransferTo, cardTransferFrom, transferAmount);
    }

}
