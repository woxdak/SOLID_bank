package Person.Wallet;

import Card.Card;
import java.util.LinkedList;

public class Wallet {
  private LinkedList<Card> listCard;
  private int id;

  public Wallet(int id){
    this.id = id;
    this.listCard= new LinkedList<Card>();
  }

  public int getId() {
    return id;
  }

  public void addCard(Card card){
    this.listCard.add(card);
  }

  /*getter and setter*/
  public LinkedList<Card> getListCard() {
    return this.listCard;
  }
  public void setListCard(LinkedList<Card> listCard) {
    this.listCard = listCard;
  }
}
