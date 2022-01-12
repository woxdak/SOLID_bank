# SOLID_bank
# This project uses Maven depency which could find in pom.xml to use JUNIT 5
# This project applies SOLID principle to solve banking problems with 3 test cases

S - Single-responsiblity Principle
Each class has only one reason to change
Person classcan add the wallet
PersonFetchWalletList can only fetch the wallet from the database
PeresonInterestPerCard can only find simple interest of each card in each wallet
PersonInterestPerPerson can only find total simple interest

O - Open-closed Principle
Objects or entities should be open for extension but closed for modification.
All classes use private variable so client could not modify the data
Card class implements simpleInterest Interface which is open forr extension but closed fo modification

L - Liskov Substitution Principle
All Visa, MasterCard, and Discover imheritants from Card Class.
So when a function uses Card object, all Visa, MasterCard, and Discover Objects can be passed in to 
calculate simple interest


I - Interface Segregation Principle
All classes are only implemented necessary interfaces
simpleInterestRate interface is implemented in Card class for simplicity

D - Dependency Inversion Principle
High Level module should not depend on low level module
For example PersonFetchWalletList implements DBConnectionInterface instead of of MySQL database Connection
which makes it more flexible and not depends on MySQL database.
If a developer wants to use another database such as MongoDB, it is easier to change and maintain.



To run the test case, click on each test in main test folder then click run

<img width="1061" alt="Screen Shot 2022-01-11 at 7 48 53 PM" src="https://user-images.githubusercontent.com/43390744/149049455-292d3244-dbd8-40f3-854f-7b35039cc037.png">

To see the details in each main test, run Main in source folder

<img width="933" alt="Screen Shot 2022-01-11 at 7 44 20 PM" src="https://user-images.githubusercontent.com/43390744/149049316-c636f596-c3b6-4132-9913-2080551bab92.png">


Examples output

<img width="1061" alt="Screen Shot 2022-01-11 at 7 44 42 PM" src="https://user-images.githubusercontent.com/43390744/149049325-a7a28938-f046-4dbc-9045-91c24cc0a529.png">

<img width="1061" alt="Screen Shot 2022-01-11 at 7 45 01 PM" src="https://user-images.githubusercontent.com/43390744/149049339-7669d194-017b-4583-96e8-623af752ac3c.png">

<img width="1061" alt="Screen Shot 2022-01-11 at 7 45 14 PM" src="https://user-images.githubusercontent.com/43390744/149049347-7ea55fb5-7720-4b86-874c-03f953488940.png">


