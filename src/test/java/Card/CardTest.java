package Card;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class CardTest {
  @BeforeAll
  public static void printMessaage(){
    System.out.println("This test tests function:");
    System.out.println("CalculateSimpleInterest()");
    System.out.println("on three types of cards: Visa, Mastercard, and Discover.");
  }
  @Test
  public void testCalculateSimpleInterest(){
    Discover discoverCard = new Discover();
    Assertions.assertEquals(1, discoverCard.calculateSimpleInterest());
    Visa visaCard = new Visa();
    Assertions.assertEquals(10, visaCard.calculateSimpleInterest());
    MC MCCard = new MC();
    Assertions.assertEquals(5, MCCard.calculateSimpleInterest());
  }

  @AfterEach
  public void printResult(){
    System.out.println("-----------------------------------");
    System.out.println("testCalculateSimpleInterest(): This test case is passed!");
  }
}
