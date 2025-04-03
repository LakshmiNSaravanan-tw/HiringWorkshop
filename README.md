## E-Commerce System  

This project is a simple E-Commerce System developed in Java using **Gradle**.  

## Problem Statement
This is a simplified e-commerce system built to demonstrate core software engineering concepts including Object-Oriented Programming (OOP), Design Patterns, and Data Structures. It simulates real-world functionalities such as user management, shopping cart, product handling, order processing, and dynamic discounts

---

##  Technologies Used
- **Java** - Core development language  
- **Gradle** - Build tool  

---

##  Prerequisites 
- Java 1.8 or later
- **Gradle installed**  

---

##  Build the Project  
To clean and build the project, run:  
```sh
./gradlew clean build
```

---

##  Run the Application**  

### **Using Gradle (Recommended)
Run the application with Gradle:  
```sh
./gradlew run
```
 **Ensure your `build.gradle` contains the following:
```gradle
plugins {
    id 'application'
}

application {
    mainClass = 'MainClass'  // Using the default package
}
```

---

### Running from a JAR (After Building) 
If you've built the project, you can run:  
```sh
java -jar build/libs/ecommerce-system-1.0-SNAPSHOT.jar
```

---

## **Existing Implementation**  
**Domain Models** for the base problem statement.  
**Hard-coded list of products** with prices.  
 **Function to calculate total cost** (stubbed for additional logic).  

---

Absolutely! Here's a **clean and clear table** that summarizes the purpose of each class in your e-commerce project, ideal for explaining to freshers:

---

### 📦 **E-Commerce Project – Class Summary Table**

| **Package**   | **Class Name**                    | **Purpose**                                                                 |
|---------------|----------------------------------|------------------------------------------------------------------------------|
| `users`       | `User`                           | Abstract base class with common attributes (`name`, `email`, `password`).  |
|               | `Customer`, `Vendor`, `Admin`    | Inherit from `User` and implement role-specific behaviors.                 |
|               | `UserProfile`                    | Holds additional user details (e.g., address, phone).                       |
| `products`    | `Product`                        | Represents an individual product with fields like `id`, `name`, `price`.   |
|               | `ProductFactory`                 | Uses **Factory Pattern** to create product instances dynamically.           |
| `cart`        | `CartItem`                       | Represents an item added to the shopping cart.                             |
|               | `ShoppingCart`                   | **Singleton Pattern**: One cart per user session; manages cart operations. |
|               | `DiscountStrategy`               | Interface for the **Strategy Pattern** – flexible discount system.          |
|               | `FlatDiscount`, `PercentageDiscount` | Concrete strategies for applying flat or percentage discounts.         |
| `orders`      | `Order`                          | Represents a customer's placed order.                                       |
|               | `OrderProcessor`                 | Manages order flow and notifies observers.                                 |
|               | `OrderObserver`                  | Interface for **Observer Pattern**; listens to order events.               |
|               | `EmailNotificationObserver`      | Sends email updates when order is placed.                                  |
|               | `InventoryObserver`              | Updates inventory when an order is placed.                                 |
| Root          | `MainClass`                      | Application entry point – demonstrates how all pieces work together.       |

---

Let me know if you want this converted into a **slide or handout format** as well!

