package task3.entity.client;

import task3.entity.card.BaseCard;

import java.util.Arrays;

public class Client {
    private String name;
    private String surName;
    private String passNumber;
    private String dateOfBirth;
    private String postCode;
    private String country;
    private String city;
    private String street;
    private String houseNumber;
    private BaseCard[] cards;

    public Client(String name, String surName, String passNumber, String dateOfBirth,
                  String postCode, String country, String city, String street, String houseNumber) {
        this.name = name;
        this.surName = surName;
        this.passNumber = passNumber;
        this.dateOfBirth = dateOfBirth;
        this.postCode = postCode;
        this.country = country;
        this.city = city;
        this.street = street;
        this.houseNumber = houseNumber;
    }

    public void setCard(BaseCard card) {
        if (this.cards != null) {
            cards = Arrays.copyOf(cards, (cards.length) + 1);
            cards[cards.length - 1] = card;
        } else {
            this.cards = new BaseCard[1];
            this.cards[0] = card;
        }
    }

    public BaseCard[] getCards() {
        return cards;
    }

    public BaseCard getCard(int id) {
        BaseCard tempCard = null;
        for (BaseCard card : this.cards) {
            if (card.getId() == id) {
                tempCard = card;
            }
        }
        return tempCard;
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }
    public int getCardQuantity() {
        return this.cards.length;
    }
}
