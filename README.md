# LAB TEST \#1

[![Open in GitHub Codespaces](https://github.com/codespaces/badge.svg)](https://codespaces.new/ttran375/comp228-test1)

[![Style Check](https://github.com/ttran375/comp228-test1/actions/workflows/main.yml/badge.svg)](https://github.com/ttran375/comp228-test1/actions/workflows/main.yml)

**Time allowed: 1 hour 50 minutes**

**General Scenario:**
>
You are creating an interactive application that gets input from the
keyboard and keeps track of a grocery store that a businessman runs.
In order to develop this application, you will be using 2 interfaces,
1 abstract class, and 1 concrete class. You should use the interfaces
and the abstract class to create the concrete class. Your application
should have overridden toString() at appropriate places so that you
could display the object state, i.e., the string representation of the
objects that you create by simply using the following command:
System.out.println(object).

**Follow the following instructions:**

1. Create 2 interfaces: Onion and Coke.

   Interface Onion contains only 1 abstract method: onionPrice() which
   does not return any data. It takes 1 double argument: onionPrice that
   represents the current price (per kilo) of onion.

   Interface Coke contains only 1 abstract method: cokePrice() which does
   not return any data. It takes 1 double argument: cokePrice that
   represents the current price (per bottle) of coke.

2. Create an abstract class named Businsess. This class contains 1
    instance variable, 1 constructor, and 1 abstract method.

    a. Instance variable: numEmp (that will take care of the number of employees in the business.

    b. An 1-argument constructor that will be called from its subclass to load 1 instance variable of this level during the creation of an object in its subclass.

    c. 1 abstract method: numEmployee(). This method does not take any arguments. When implemented in its subclass, it is supposed to return an integer that represents the number of employees in the business.

    d. In this abstract class Business, write necessary code to get the object state (i.e., the string representation) that will eventually be called from its concrete subclass. **\[25 marks\]**


3. Create a concrete class named GroceryBusiness that makes use of both
    the interfaces: Onion and Coke that you created earlier. This
    concrete class also makes use of the abstract class Business that
    you also created earlier.

4. This concrete class GroceryBusiness has 1 instance variable of
    its own, 1 constructor, and 1 concrete method of its own.

    a. Instance variable: groceryIncome (Use appropriate data type) that represents the current yearly income of the grocery business.

    b. Constructor: 1 constructor that constructs a GroceryBusiness object with all the its instance variables (numEmp and groceryIncome) supplied during the GroceryBusiness object creation.

    c. 1 concrete method of its own: yearEstablished() that does not return any data. It takes 1 integer argument (year) that represents the year the grocery business was established. This method displays the year the grocery business was established from within itself.

    d. Write all necessary code to make this class a concrete class.

    e. Write necessary code to get the complete string representation (i.e., the object state) of objects made from this class.

**\[35 marks\]**

5. Create a driver class named XXXMidTest (replace XXX by three letters
    of your name). This driver class would prompt the user to enter
    current number of employees in your grocery business. It would then
    ask how much you earn from the grocery business. It then uses these
    2 user input to create a GroceryBusiness object. It would then
    display the string representation of the object you just created.
    Then it would ask for the year the grocery business was
    established.. It would display the year you just entered. It would
    then ask for the current price of onion per kilo. And finally it
    would ask for the current price of coke per bottle. It would then
    display the prices you just entered.

**\[40 marks\]**

**A possible test run would look like:**

```
How many employees work in your business?

12

How mmuch do you earn from your grocery business?

120000

The Data You Just Entered for Your Grocery Business:

Number of Employees in Your Business: 12

groceryIncome: 120000

In which year you established your grocery business?

1999

You established your business in year: 1999

What is the price for onion per kilo?

1.29

What is the price for coke per bottle?

2.49

Price List:

The onion price per kilo is: 1.29

The price per bottle of Coke is: 2.49
```

**\[DO NOT use the data as shown aboe. USE YOUR OWN DATA and provide
your screen shot.\]**
