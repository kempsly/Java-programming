```markdown
# Object-Oriented Programming in Java

## Introduction
Object-Oriented Programming (OOP) is a programming paradigm that organizes code into objects, which encapsulate data and behavior. Java is a widely-used OOP language that provides robust features for creating scalable and reusable code.

This repository demonstrates key concepts of OOP in Java, including **classes**, **objects**, **inheritance**, **polymorphism**, **encapsulation**, and **abstraction**.

---

## Key Concepts of OOP

### 1. **Class and Object**
- **Class**: A blueprint for creating objects. Defines properties (fields) and behavior (methods).
- **Object**: An instance of a class.

```java
class Animal {
    String name;

    void eat() {
        System.out.println(name + " is eating.");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal dog = new Animal();
        dog.name = "Dog";
        dog.eat();
    }
}
```

---

### 2. **Encapsulation**
Encapsulation involves bundling data (fields) and methods that operate on that data within a single unit (class). It also involves restricting direct access to some of the object's components using access modifiers (`private`, `protected`, `public`).

```java
class BankAccount {
    private double balance;

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }
}
```

---

### 3. **Inheritance**
Inheritance allows one class (child) to inherit fields and methods from another class (parent). This promotes code reuse.

```java
class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks.");
    }
}
```

---

### 4. **Polymorphism**
Polymorphism allows methods to behave differently based on the object calling them. It can be achieved through method overriding and overloading.

#### Method Overriding:
```java
class Animal {
    void sound() {
        System.out.println("Animal makes a sound.");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks.");
    }
}
```

#### Method Overloading:
```java
class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }
}
```

---

### 5. **Abstraction**
Abstraction hides implementation details and only exposes essential features. This can be achieved using **abstract classes** or **interfaces**.

#### Abstract Class:
```java
abstract class Animal {
    abstract void sound();

    void sleep() {
        System.out.println("Sleeping...");
    }
}

class Cat extends Animal {
    void sound() {
        System.out.println("Cat meows.");
    }
}
```

#### Interface:
```java
interface Animal {
    void sound();
}

class Bird implements Animal {
    public void sound() {
        System.out.println("Bird chirps.");
    }
}
```

---

## Getting Started

### Prerequisites
- Java Development Kit (JDK) installed on your system.
- A text editor or an IDE like IntelliJ IDEA, Eclipse, or VS Code.

### Running the Examples
1. Clone this repository:
   ```bash
   git clone https://github.com/Java-programming/OOP.git
   ```
2. Navigate to the project directory:
   ```bash
   cd java-oop
   ```
3. Compile and run the Java files:
   ```bash
   javac Main.java
   java Main
   ```

---



---

## Why Use OOP in Java?
- **Modularity**: Makes code easier to understand and maintain.
- **Code Reusability**: Reuse common logic via inheritance.
- **Scalability**: Allows easy extension of features.
- **Data Security**: Provides mechanisms like encapsulation to protect sensitive data.

---

## Contributing
Contributions are welcome! Feel free to submit a pull request with improvements or additional examples.

---

## License
This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
```

