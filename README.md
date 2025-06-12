# MVCDemo Java Project

This project demonstrates how to implement the **Model-View-Controller (MVC)** architecture in Java.

It contains two tasks:

---

## 📌 Task 1 – Console-based MVC (Basic)

### ✅ Description:
In this task, we start with a simple MVC structure using the command line (no GUI). Instead of passing a plain `String` like "Hello, MVC!", we create a proper `Student` object with real-world attributes.

### ✅ Features:
- Java-based MVC pattern  
- `Student` class replaces the simple `String` data  
- Displays student details via the View  
- Controller is used to modify and retrieve the student data  

### ✅ Files Involved:
- `Student.java` – the model representing a student (name, ID, GPA, etc.)
- `StudentView.java` – the view to display student info
- `StudentController.java` – the controller that manages data between model and view
- `Main.java` – runs the MVC setup

---

## 📌 Task 2 – JavaFX-based MVC GUI

### ✅ Description:
In this enhanced version of the project, we use **JavaFX** to create a GUI (Graphical User Interface) version of the MVC pattern.

### ✅ Features:
- JavaFX-based student form  
- You can enter student details and display them in the UI  
- Shows how MVC works with a desktop GUI  

### ✅ Requirements:
- Java 17+
- JavaFX SDK 21+ (we used version `24.0.1`)
- NetBeans IDE or any other IDE that supports JavaFX

---

### 🛠 How to Set Up JavaFX in NetBeans:

1. Download JavaFX SDK:  
   👉 [https://gluonhq.com/products/javafx/](https://gluonhq.com/products/javafx/)

2. Extract it and note the path (e.g.,  
   `C:\Users\YourName\Downloads\javafx-sdk-24.0.1\lib`)

3. In NetBeans:  
   - Right-click your project → **Properties**  
   - Go to **Run** → **VM Options**  
   - Paste this line (update the path):

--module-path "C:\path\to\javafx-sdk-24.0.1\lib" --add-modules javafx.controls,javafx.fxml


> ⚠️ Replace the path above with the actual location of your JavaFX SDK.

---

### ✅ Files Involved:
- `Student.java` – model for student
- `StudentView.java` – JavaFX UI for input/output
- `StudentController.java` – connects the view and model
- `MainApp.java` – JavaFX application launcher

---

## ✅ How to Run

### 📦 For Console Version:
- Run `Main.java` inside the console-based task folder or setup.

### 🖥 For JavaFX Version:
1. Make sure JavaFX SDK is properly configured.
2. Right-click `MainApp.java` → Run.

---

## 🧠 Learning Objectives

- Understand how MVC works in Java  
- Replace primitive data with actual objects like `Student`  
- Learn to integrate JavaFX in an MVC pattern  
- Understand how controllers manage user interaction  

---

## 📁 Project Structure

src/
└── mvcdemo/

├── model/

│ ├── Model.java

│ ├── Student.java

│ └── AnotherModel.java

│
├── view/

│ ├── View.java

│ └── StudentView.java

│
├── controller/

│ ├── Controller.java

│ └── StudentController.java

│
└── app/

└── MainApp.java

