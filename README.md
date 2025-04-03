# E-Commerce System  

This project is a simple **E-Commerce System** developed in **Java** using **Gradle**.  

## **Problem Statement**  
A college student with a group of friends enjoys purchasing products tailored to each person's needs. They frequently use an **e-commerce platform** that offers a wide range of transactions. Could you assist them in **calculating their total expenditure on purchases**? A **5% GST** gets added to the total worth of products.  

📌 **Notes:**  
- Handle **exceptions gracefully**.  
- Write **clean, modular, and scalable** code.  

---

## **🛠️ Technologies Used**  
- **Java** - Core development language  
- **Gradle** - Build tool  

---

## **📌 Prerequisites**  
- **Java 1.8 or later**  
- **Gradle installed**  

---

## **🚀 Build the Project**  
To clean and build the project, run:  
```sh
./gradlew clean build
```

---

## **▶️ Run the Application**  

### **Using Gradle (Recommended)**  
Run the application with Gradle:  
```sh
./gradlew run
```
✅ **Ensure your `build.gradle` contains the following:**  
```gradle
plugins {
    id 'application'
}

application {
    mainClass = 'MainClass'  // Using the default package
}
```

---

### **Running from a JAR (After Building)**  
If you've built the project, you can run:  
```sh
java -jar build/libs/ecommerce-system-1.0-SNAPSHOT.jar
```

---

## **Existing Implementation**  
✅ **Domain Models** for the base problem statement.  
✅ **Hard-coded list of products** with prices.  
✅ **Function to calculate total cost** (stubbed for additional logic).  

---

