package Person;

import static org.junit.jupiter.api.Assertions.*;

import Person.Wallet.Wallet;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class PersonTest {
  Person person1;

  @BeforeAll
  public static void printMessage(){
    System.out.println("This test tests function");
    System.out.println("addWallet()");
    System.out.println("It checks the length of the list after using addWallet()");
    System.out.println("-----------------------------------------");
  }
  @BeforeEach
  public void setup(){
    person1 = new Person("John Smith", 0);
  }

  @Test
//  @DisplayName("All test cases are passed!")
  public void addWallet(){
        Wallet wallet1 = new Wallet(0);
        Assertions.assertEquals(0, person1.getListWallets().size());
        person1.addWallet(wallet1);
        Assertions.assertEquals(1, person1.getListWallets().size());
        person1.addWallet(wallet1);
        Assertions.assertEquals(2, person1.getListWallets().size());
  }

  @AfterEach
  public void testCase(){
    System.out.println("allWallet(): This test case is passed!");
  }

}