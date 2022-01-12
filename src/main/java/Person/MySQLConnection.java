package Person;

public class MySQLConnection implements DBConnectionInterface{

  @Override
  public boolean connect() {
    return true;
  }
}
