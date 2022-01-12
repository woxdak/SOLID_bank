package MainTest;

import Card.Discover;
import Card.MC;
import Card.Visa;
import Person.Person;
import Person.Wallet.Wallet;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import Person.PersonInterestPerPerson;
public class Test2 {

  @BeforeAll
  public static void printMessaage(){
    System.out.println("Test case:");
    System.out.println("1 person has 2 wallets  Wallet 1 has a Visa and Discover , wallet 2 a MC -"
        + "\n  each card has $100 balance - calculate the total interest(simple interest) "
        + "\nfor this person and interest per wallet");
  }


  @Test
  public void test2(){
    Person person1 = new Person("John Smith", 0);
    Wallet wallet1 = new Wallet(0);
    wallet1.addCard(new Visa());
    wallet1.addCard(new Discover());
    person1.addWallet(wallet1);

    /* test simple interest for each card in wallet 1*/
    Assertions.assertEquals(10, wallet1.getListCard().get(0).calculateSimpleInterest());
    Assertions.assertEquals(1, wallet1.getListCard().get(1).calculateSimpleInterest());

    Wallet wallet2 = new Wallet(1);
    wallet2.addCard(new MC());
    person1.addWallet(wallet2);

    /* test simple interest for each card in wallet 2*/
    Assertions.assertEquals(5, wallet2.getListCard().get(0).calculateSimpleInterest());

    /* test total simple interest of a person*/
    PersonInterestPerPerson result = new PersonInterestPerPerson();
    result.calculateInterestPerPerson(person1);
    Assertions.assertEquals(16.0, result.calculateInterestPerPerson(person1));
  }

  @AfterEach
  public void printResult(){
    System.out.println("-----------------------------------");
    System.out.println("The second test case is passed!");
  }
}
