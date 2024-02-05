package task3.repository;

import task3.entity.card.BaseCard;

import java.util.Arrays;

public class CardRepository {
    private BaseCard[] cardRepository;

    public void addCardToRepository(BaseCard card) {
        if (this.cardRepository != null) {
            this.cardRepository = Arrays.copyOf(this.cardRepository, this.cardRepository.length + 1);
            this.cardRepository[cardRepository.length - 1] = card;
        } else {
            this.cardRepository = new BaseCard[1];
            this.cardRepository[0] = card;
        }
    }

    public BaseCard[] getCardRepository() {
        return cardRepository;
    }
}
