import Card.Discover;
import Card.MC;
import Card.Visa;
import Person.Person;
import Person.Wallet.Wallet;
import Person.PersonInterestPerPerson;
import Person.PersonInterestPerCard;
public class Main {

    public static void main(String[] args) {
      /*Test case 1*/
      Person a = new Person("Person 1", 0);
      Wallet wallet = new Wallet(0);
      wallet.addCard(new Discover());
      wallet.addCard(new Visa());
      wallet.addCard(new MC());
      a.addWallet(wallet);
      PersonInterestPerPerson k = new PersonInterestPerPerson();
      k.calculateInterestPerPerson(a);
      PersonInterestPerCard h = new PersonInterestPerCard();
      h.calculateInterestPerCard(a);

      System.out.println("-----------------------------------------");
      /*Test case 2*/
      Person person2= new Person("Person 2", 0);
      Wallet wallet1 = new Wallet(0);
      wallet1.addCard(new Visa());
      wallet1.addCard(new Discover());
      person2.addWallet(wallet1);
      Wallet wallet2 = new Wallet(1);
      wallet2.addCard(new MC());
      person2.addWallet(wallet2);
      k.calculateInterestPerPerson(person2);
      h.calculateInterestPerCard(person2);
      System.out.println("-----------------------------------------");

      /*Test case 3*/
      Person person3= new Person("Person 3", 0);
      Wallet wallet3 = new Wallet(0);
      wallet3.addCard(new MC());
      wallet3.addCard(new Visa());
      person3.addWallet(wallet3);
      k.calculateInterestPerPerson(person3);
      h.calculateInterestPerCard(person3);

      Person person4 = new Person("Person 4", 0);
      Wallet wallet4 = new Wallet(0);
      wallet4.addCard(new Visa());
      wallet4.addCard(new MC());
      person4.addWallet(wallet4);
      k.calculateInterestPerPerson(person4);
      h.calculateInterestPerCard(person4);
    }
}
