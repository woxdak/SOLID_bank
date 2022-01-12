package Person;

import static org.junit.jupiter.api.Assertions.*;

import Card.Discover;
import Card.MC;
import Card.Visa;
import Person.Wallet.Wallet;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class PersonInterestPerCardTest {
  @BeforeAll
  public static void printMessaage(){
    System.out.println("This test tests function:");
    System.out.println("calculateSimpleInterestPerCard()");
    System.out.println("in a wallet with Discover, Visa, and MasterCard");
  }

  @Test
  public void calculateInterestPerCard(){
    Person person1 = new Person("John Smith", 0);
    Wallet wallet = new Wallet(0);
    wallet.addCard(new Discover());
    wallet.addCard(new Visa());
    wallet.addCard(new MC());
    Assertions.assertEquals(5, wallet.getListCard().get(2).calculateSimpleInterest());
    Assertions.assertEquals(10, wallet.getListCard().get(1).calculateSimpleInterest());
    Assertions.assertEquals(1, wallet.getListCard().get(0).calculateSimpleInterest());
  }

  @AfterEach
  public void printResult(){
    System.out.println("-----------------------------------");
    System.out.println("testCalculateSimpleInterestPerCard(): This test case is passed!");
  }
}