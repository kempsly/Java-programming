```markdown
# JavaFX and FXML Project

This project is a JavaFX application that uses FXML for building the user interface. JavaFX provides a rich set of APIs for creating graphical user interfaces, and FXML simplifies the process by allowing UI components to be defined in XML files.

---

## **Table of Contents**
1. [Features](#features)
2. [Prerequisites](#prerequisites)
3. [Project Structure](#project-structure)
4. [How to Run](#how-to-run)
5. [FXML Overview](#fxml-overview)
6. [Resources](#resources)

---

## **Features**
- Interactive GUI built with JavaFX.
- UI components defined using FXML.
- Event-driven programming for seamless user interaction.
- Supports scalability and separation of concerns with MVC architecture.

---

## **Prerequisites**
1. **JDK**: Install Java Development Kit (JDK) version 11 or higher.
   - [Download JDK](https://www.oracle.com/java/technologies/javase-downloads.html)
2. **JavaFX SDK**: Download and set up the JavaFX SDK compatible with your JDK.
   - [Download JavaFX SDK](https://openjfx.io)
3. **IDE**: Recommended IDEs for JavaFX development:
   - [IntelliJ IDEA](https://www.jetbrains.com/idea/)
   - [Eclipse](https://www.eclipse.org/)
   - [NetBeans](https://netbeans.apache.org/)
4. **Build Tool**: Use Maven or Gradle for dependency management (optional).

---

## **Project Structure**

```plaintext
project-root/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   ├── com.example.app/
│   │   │   │   ├── Main.java          # Entry point of the application
│   │   │   │   ├── controllers/
│   │   │   │   │   ├── MainController.java
│   │   │   │   ├── models/
│   │   │   │   ├── utils/
│   │   ├── resources/
│   │   │   ├── fxml/
│   │   │   │   ├── main.fxml          # FXML file defining the UI layout
│   │   │   ├── styles/
│   │   │   │   ├── app.css           # CSS file for styling
│   │   │   ├── images/               # Images used in the app
├── pom.xml                           # Maven configuration (if using Maven)
├── build.gradle                      # Gradle configuration (if using Gradle)
└── README.md
```

---

## **How to Run**

### **Step 1: Clone the Repository**
```bash
git clone https://github.com/kempsly/Java-Programming/FXML-JavaFX.git
cd FXML-JavaFX
```

### **Step 2: Set Up JavaFX**
Ensure the JavaFX SDK is configured in your IDE or added as a dependency in your build tool.

#### **For Maven:**
Add the following dependency in `pom.xml`:
```xml
<dependency>
    <groupId>org.openjfx</groupId>
    <artifactId>javafx-controls</artifactId>
    <version>20.0.1</version> <!-- Replace with the latest version -->
</dependency>
```

#### **For Gradle:**
Add the following to your `build.gradle`:
```groovy
plugins {
    id 'application'
}

repositories {
    mavenCentral()
}

dependencies {
    implementation 'org.openjfx:javafx-controls:20.0.1' // Replace with the latest version
}

application {
    mainClass = 'com.example.app.Main'
}
```

### **Step 3: Run the Application**
1. Open the project in your IDE.
2. Run the `Main` class.
   - Alternatively, use the following command:
     ```bash
     java --module-path /path/to/javafx-sdk/lib --add-modules javafx.controls,javafx.fxml -jar app.jar
     ```

---

## **FXML Overview**

### **Example FXML File (`main.fxml`):**
```xml
<?xml version="1.0" encoding="UTF-8"?>
<?import javafx.scene.layout.*?>
<?import javafx.scene.control.*?>

<VBox xmlns:fx="http://javafx.com/fxml" fx:controller="com.example.app.controllers.MainController" spacing="10" alignment="CENTER">
    <Label text="Welcome to JavaFX!" />
    <Button text="Click Me" onAction="#handleButtonClick" />
</VBox>
```

### **Controller Example (`MainController.java`):**
```java
package com.example.app.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class MainController {
    @FXML
    private Label label;

    @FXML
    private void handleButtonClick() {
        label.setText("Button clicked!");
    }
}
```
## **Error Troubleshooting**
If you encounter the error "JavaFX runtime components are missing", please refer to this article for detailed troubleshooting steps:
Solving the "JavaFX Runtime Components Are Missing" Error in IntelliJ : 
- [JavaFX Runtime Components Are Missing](https://medium.com/@cem.kaya/solving-the-javafx-runtime-components-are-missing-error-in-intellij-6feb9607d775)


---

## **Resources**
- [JavaFX Documentation](https://openjfx.io)
- [JavaFX FXML Tutorial](https://docs.oracle.com/javase/8/javafx/fxml-tutorial/index.html)
- [OpenJFX GitHub](https://github.com/openjfx/openjfx)

---

## **License**
This project is licensed under the MIT License. See the `LICENSE` file for details.
```
