package task3.entity.card;

public class VisaCard extends BaseCard {

    public VisaCard(long cardNumber, int id, int cvv, double currentAmount, String currency, double transferLimit) {
        super("VisaCard", cardNumber, cvv, currentAmount, id, currency, transferLimit, 0.01);
    }

    @Override
    public void printStatus() {
        System.out.println(super.cardName + "\n" + super.cardNumber + "\nID "
                + super.id + "\nтекущая сумма: " + super.currentAmount + " " + super.currency);

    }

    public double getTransferFee() {
        return transferFee;
    }
    @Override
    public double getTransferLimit() {
        return super.transferLimit;
    }
    @Override
    public double getCurrentAmount() {
        return super.currentAmount;
    }
    @Override
    public int getId() {
        return super.id;
    }
    @Override
    public void setCurrentAmount(double newAmount) {
        this.currentAmount = newAmount;
    }
    @Override
    public String getCurrency() {
        return super.currency;
    }
    @Override
    public String getCardName() {
        return super.cardName;
    }
}
