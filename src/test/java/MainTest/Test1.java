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
public class Test1 {

  @BeforeAll
  public static void printMessaage(){
    System.out.println("Test case:");
    System.out.println("1 person has 1 wallet and 3 cards (1 Visa, 1 MC, 1 Discover)");
    System.out.println("Each card has a balance of $100 - calculate total interest");
  }


  @Test
  public void test1(){
    Person person1 = new Person("John Smith", 0);
    Wallet wallet = new Wallet(0);
    wallet.addCard(new Visa());
    wallet.addCard(new Discover());
    wallet.addCard(new MC());
    person1.addWallet(wallet);
    /* test simple interest for each card*/
    Assertions.assertEquals(10, wallet.getListCard().get(0).calculateSimpleInterest());
    Assertions.assertEquals(1, wallet.getListCard().get(1).calculateSimpleInterest());
    Assertions.assertEquals(5, wallet.getListCard().get(2).calculateSimpleInterest());

    /* test total simple interest of a person*/
    PersonInterestPerPerson result = new PersonInterestPerPerson();
    result.calculateInterestPerPerson(person1);
    Assertions.assertEquals(16.0, result.calculateInterestPerPerson(person1));

  }

  @AfterEach
  public void printResult(){
    System.out.println("-----------------------------------");
    System.out.println("The first test case is passed!");
  }
}
