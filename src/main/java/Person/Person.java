package Person;

import Person.Wallet.Wallet;
import java.util.LinkedList;

public class Person {
  private LinkedList<Wallet> listWallets;
  private String name;
  private int id;
  public Person(String name, int id){
    this.name = name;
    this.id = id;
    this.listWallets = new LinkedList<Wallet>();
  }

  public void addWallet(Wallet wallet){
    this.listWallets.add(wallet);
  }

  /*getter and setter*/
  public LinkedList<Wallet> getListWallets() {
    return listWallets;
  }
  public void setListWallets(LinkedList<Wallet> listWallets) {
    this.listWallets = listWallets;
  }

  public String getName() {
    return name;
  }
}
