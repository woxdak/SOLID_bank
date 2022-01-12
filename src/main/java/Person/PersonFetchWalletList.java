package Person;

import Card.Discover;
import Card.MC;
import Card.Visa;
import Person.Wallet.Wallet;
import java.util.LinkedList;


/*function to fetch the database from MySQL
* just for demo dependency injection
* design pattern in SOLID*/
public class PersonFetchWalletList {
  private boolean dataBaseConnection;
  private DBConnectionInterface dbConnection;
  public void fetchWalletList(Person person, DBConnectionInterface dbConnection){
    this.dbConnection = dbConnection;
    if (dataBaseConnection) {
      LinkedList<Wallet> database = new LinkedList<Wallet>();
      Wallet walletFromDatabase = new Wallet(0);
      walletFromDatabase.addCard(new Discover());
      walletFromDatabase.addCard(new Visa());
      walletFromDatabase.addCard(new MC());
      database.add(walletFromDatabase);
      person.setListWallets(database);
    }
  }
}
