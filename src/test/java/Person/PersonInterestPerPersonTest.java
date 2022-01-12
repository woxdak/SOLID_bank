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

class PersonInterestPerPersonTest {
  @BeforeAll
  public static void printMessaage(){
    System.out.println("This test tests function:");
    System.out.println("calculateSimpleInterestPerPerson()");
    System.out.println("in a wallet with Discover, Visa, and MasterCard");
  }
  @Test
  public void calculateInterestPerPerson(){
    Person person1 = new Person("John Smith", 0);
    Wallet wallet = new Wallet(0);
    wallet.addCard(new Discover());
    wallet.addCard(new Visa());
    wallet.addCard(new MC());
    person1.addWallet(wallet);
    PersonInterestPerPerson result = new PersonInterestPerPerson();
    result.calculateInterestPerPerson(person1);
    Assertions.assertEquals(16.0, result.calculateInterestPerPerson(person1));
  }

  @AfterEach
  public void printResult(){
    System.out.println("-----------------------------------");
    System.out.println("testCalculateSimpleInterestPerPerson(): This test case is passed!");
  }
}