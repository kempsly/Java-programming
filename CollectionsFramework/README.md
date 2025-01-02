```markdown
# Java Collections Framework

## Introduction
The **Java Collections Framework (JCF)** is a unified architecture for managing and manipulating groups of objects in Java. It includes interfaces, implementations (classes), and algorithms that provide ready-to-use data structures and methods to operate on them.

This repository provides an overview of the Java Collections Framework and examples of its most commonly used classes and interfaces.

---

## Key Features of the Collections Framework
1. **Reusable Data Structures**: Includes implementations like `ArrayList`, `HashMap`, and `HashSet`.
2. **Algorithms**: Provides utility methods for sorting, searching, and modifying collections in the `Collections` class.
3. **Interoperability**: Allows different collection types to be used together via interfaces.
4. **Thread Safety**: Includes concurrent implementations like `ConcurrentHashMap`.

---

## Collections Framework Hierarchy

### 1. **Core Interfaces**
The framework is built around a set of core interfaces:
- **Collection**: Root interface for managing a group of objects.
  - **List**: Ordered collection (e.g., `ArrayList`, `LinkedList`).
  - **Set**: Unordered collection with no duplicate elements (e.g., `HashSet`, `TreeSet`).
  - **Queue**: Collection designed for holding elements prior to processing (e.g., `PriorityQueue`).
  - **Deque**: Double-ended queue (e.g., `ArrayDeque`).

- **Map**: Interface for key-value pairs (e.g., `HashMap`, `TreeMap`).

---

## Commonly Used Classes

### 1. **List**
Maintains the order of insertion and allows duplicate elements.
```java
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        System.out.println(list);  // Output: [Apple, Banana, Cherry]
    }
}
```

---

### 2. **Set**
Prevents duplicate elements.
```java
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Apple");  // Duplicate, will not be added

        System.out.println(set);  // Output: [Apple, Banana]
    }
}
```

---

### 3. **Map**
Stores key-value pairs.
```java
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "One");
        map.put(2, "Two");

        System.out.println(map.get(1));  // Output: One
    }
}
```

---

### 4. **Queue**
Follows the FIFO (First-In-First-Out) principle.
```java
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("First");
        queue.add("Second");

        System.out.println(queue.poll());  // Output: First
    }
}
```

---

### 5. **Deque**
Supports insertion and removal from both ends.
```java
import java.util.ArrayDeque;

public class Main {
    public static void main(String[] args) {
        ArrayDeque<String> deque = new ArrayDeque<>();
        deque.addFirst("First");
        deque.addLast("Last");

        System.out.println(deque.pollFirst());  // Output: First
    }
}
```

---

## Utility Class: `Collections`
The `Collections` class provides static methods for working with collections.
### Examples:
1. **Sorting**:
   ```java
   import java.util.ArrayList;
   import java.util.Collections;

   public class Main {
       public static void main(String[] args) {
           ArrayList<Integer> list = new ArrayList<>();
           list.add(3);
           list.add(1);
           list.add(2);

           Collections.sort(list);
           System.out.println(list);  // Output: [1, 2, 3]
       }
   }
   ```

2. **Searching**:
   ```java
   Collections.binarySearch(list, 2);
   ```

---

## Concurrent Collections
Java provides thread-safe collections for multi-threaded environments:
- **ConcurrentHashMap**
- **CopyOnWriteArrayList**
- **ConcurrentLinkedQueue**

---

## Getting Started

### Prerequisites
- JDK installed.
- IDE or text editor for Java development.

### Running Examples
1. Clone this repository:
   ```bash
  
   ```
2. Navigate to the project directory:
   ```bash
   cd java-collections-framework
   ```
3. Compile and run any example:
   ```bash
   javac Main.java
   java Main
   ```

---

---

## Why Use the Collections Framework?
- **Ease of Use**: Provides pre-built data structures.
- **Efficiency**: Optimized for performance.
- **Flexibility**: Wide range of data structures and algorithms.
- **Thread Safety**: Includes synchronized and concurrent implementations.

---

## Contributing
Contributions are welcome! If you have additional examples or improvements, feel free to submit a pull request.

---

## License
This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
```
