package Person;

import java.util.concurrent.atomic.AtomicReference;

/*function to calculate total simple interest of a person*/
public class PersonInterestPerPerson {
  public double calculateInterestPerPerson(Person person){
      AtomicReference<Double> totalInterest = new AtomicReference<>((double) 0);
      person.getListWallets().forEach(wallet -> {
        wallet.getListCard().forEach(card ->{
            totalInterest.updateAndGet(
                v -> new Double((double) (v + card.calculateSimpleInterest())));
        });
      });
    System.out.println("Total interest for "+ person.getName() + " is: "+ totalInterest);
    return totalInterest.get();
  }
}
