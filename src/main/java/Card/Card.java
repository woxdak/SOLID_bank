package Card;

public class Card implements simpleInterestRate{
  private double amount;
  private double interestRate;
  private String name;
  public Card(double amount, double interestRate, String Name){
    this.amount = amount;
    this.interestRate = interestRate;
    this.name = Name;
  }

  /*getter*/
  public String getName() {
    return name;
  }

  @Override
  public double calculateSimpleInterest() {
    return this.amount * this.interestRate;
  }
}
