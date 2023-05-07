package class30;

import java.util.LinkedList;

public class CardTester {
    public static void main(String[] args) {

        CreditCard creditCard=new CreditCard("Milo","Dollar");
        VisaCard visaCard=new VisaCard("Finance","WesternUnion");
        MasterCard masterCard=new MasterCard("Allo","Cash");

        LinkedList<Card> linkedList=new LinkedList<>();
        linkedList.add(creditCard);
        linkedList.add(visaCard);
        linkedList.add(masterCard);
        for (Card card:linkedList){
            card.Guider();
            card.TransferMoney();
        }
    }
}
