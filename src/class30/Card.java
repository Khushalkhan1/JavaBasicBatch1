package class30;

public abstract class Card {
    String cardName;

    Card(String cardName) {
        this.cardName = cardName;
    }

    public abstract void Guider();

    public abstract void TransferMoney();
}
class CreditCard extends Card {
    String exchangeType;

    CreditCard(String cardName, String exchangeType) {
        super(cardName);
        this.exchangeType = exchangeType;
    }

    public void Guider() {
        System.out.println("Get a Guider for your Card " + cardName + " with " + exchangeType);
    }

    public void TransferMoney() {
        System.out.println("Cancel your creditCard " + exchangeType + " cardName " + cardName);
    }
}
class VisaCard extends Card{
    String transferType;
    VisaCard(String cardName, String transferType){
        super(cardName);
        this.transferType=transferType;
    }
    public void Guider(){
        System.out.println("Get a Guider for your Card " + cardName + " with " + transferType);
    }
    public void TransferMoney(){
        System.out.println("Cancel your VisaCard " + transferType + " cardName " + cardName);
    }
}
class MasterCard extends Card{
    String paymentType;
    MasterCard(String cardName, String paymentType){
        super(cardName);
        this.paymentType=paymentType;
    }
    public void Guider(){
        System.out.println("Get a Guider for your Card " + cardName + " with " + paymentType);
    }
    public void TransferMoney(){
        System.out.println("Cancel your MasterCard " + paymentType + " cardName " + cardName);
    }
}

