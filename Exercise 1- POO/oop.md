## OOP (Object-Oriented Programming) - Exercise 1

**Step 1: Account Class (Encapsulation and Inheritance)**

Create a Java class called `Account` with private attributes for `accountNumber` (String), `accountHolder` (String), and `balance` (double). Implement getters and setters to encapsulate these attributes. Ensure that the `balance` attribute cannot be set to a negative value. Also, make this class the base class for other account types.

**Step 2: Savings Account (Inheritance)**

Extend the `Account` class to create a `SavingsAccount` class. Add attributes like `interestRate` (double) and methods to calculate and add interest to the savings account balance. Use inheritance to inherit the common attributes and methods from the `Account` class.

**Step 3: Checking Account (Inheritance)**

Extend the `Account` class to create a `CheckingAccount` class. Add attributes like `overdraftLimit` (double) and methods to handle overdraft protection. Use inheritance to inherit the common attributes and methods from the `Account` class.

**Step 4: Bank Class (Abstraction and Polymorphism)**

Create an abstract Java class called `Bank` with an abstract method `createAccount()` that allows the creation of different account types. Derive subclasses such as `SavingsBank` and `CheckingBank` from `Bank`. Implement the `createAccount()` method in each subclass to create `SavingsAccount` and `CheckingAccount` instances. This demonstrates abstraction and polymorphism as you can interact with different account types through the `Bank` interface.

**Step 5: User Interface**

Create a simple text-based user interface (UI) where users can create accounts, deposit, withdraw, and check balances. The UI should interact with the `Bank` class to perform these operations, demonstrating the complete application's functionality. You can use polymorphism to work with various account types through the common `Bank` interface.

---

By combining these exercises, you'll have a complete banking application that effectively utilizes Encapsulation (private attributes with getters and setters), Abstraction (abstract `Bank` class for account creation), Inheritance (hierarchical account structure), and Polymorphism (common interface for different account types). This application allows users to manage both savings and checking accounts with a user-friendly interface.