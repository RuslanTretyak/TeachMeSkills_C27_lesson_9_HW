package task3.entity.card;

public abstract class BaseCard {
    protected String cardName;
    protected long cardNumber;
    protected int cvv;
    protected double currentAmount;
    protected int id;
    protected String currency;
    protected double transferLimit;
    protected double transferFee;

    public BaseCard(String cardName, long cardNumber, int cvv, double currentAmount, int id, String currency, double transferLimit, double transferFee) {
        this.cardName = cardName;
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.currentAmount = currentAmount;
        this.id = id;
        this.currency = currency;
        this.transferLimit = transferLimit;
        this.transferFee = transferFee;
    }

    public abstract void printStatus();
    public abstract double getTransferFee();
    public abstract double getTransferLimit();
    public abstract double getCurrentAmount();
    public abstract int getId();
    public abstract void setCurrentAmount(double newAmount);
    public abstract String getCurrency();
    public abstract String getCardName();
}
