package Person;

/*function to calculate simple interest per card
* demonstrate Single responsibility principle*/

public class PersonInterestPerCard {
  public void calculateInterestPerCard(Person person){
    person.getListWallets().forEach(wallet -> {
      System.out.println("Wallet: " + wallet.getId());
      wallet.getListCard().forEach(card ->{
        System.out.println("Card " + card.getName() + ": " + card.calculateSimpleInterest());
      });
    });
  }
}
