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
public class Test3 {

  @BeforeAll
  public static void printMessaage(){
    System.out.println("Test case:");
    System.out.println("1 person has 2 wallets  Wallet 1 has a Visa and Discover , wallet 2 a MC -"
        + "\n  each card has $100 balance - calculate the total interest(simple interest) "
        + "\nfor this person and interest per wallet");
  }


  @Test
  public void test3(){
    Person person1 = new Person("John Smith", 0);
    Wallet wallet1_1 = new Wallet(0);
    wallet1_1.addCard(new MC());
    wallet1_1.addCard(new Visa());
    person1.addWallet(wallet1_1);

    /* test simple interest for each card in wallet 1 in person 1*/
    Assertions.assertEquals(5, wallet1_1.getListCard().get(0).calculateSimpleInterest());
    Assertions.assertEquals(10, wallet1_1.getListCard().get(1).calculateSimpleInterest());

    Person person2 = new Person("James Henry", 1);
    Wallet wallet2_1 = new Wallet(0);
    wallet2_1.addCard(new Visa());
    wallet2_1.addCard(new MC());
    person2.addWallet(wallet2_1);

    /* test simple interest for each card in wallet 1 in person 2*/
    Assertions.assertEquals(10, wallet2_1.getListCard().get(0).calculateSimpleInterest());
    Assertions.assertEquals(5, wallet2_1.getListCard().get(1).calculateSimpleInterest());

    /* test total simple interest of a person 1*/
    PersonInterestPerPerson result = new PersonInterestPerPerson();
    Assertions.assertEquals(15.0, result.calculateInterestPerPerson(person1));

    /* test total simple interest of a person 2*/
    Assertions.assertEquals(15.0, result.calculateInterestPerPerson(person2));
  }

  @AfterEach
  public void printResult(){
    System.out.println("-----------------------------------");
    System.out.println("The third test case is passed!");
  }
}
