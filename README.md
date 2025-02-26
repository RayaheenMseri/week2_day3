Inventory Management System

Overview

This Java-based Inventory Management System allows users to track product stock levels, predict stock depletion based on sales data, and process customer orders efficiently.

Features

Product Management: Stores product details, including name, price, stock level, and reorder threshold.

Stock Prediction: Estimates when stock will run out based on average daily sales and provides restock suggestions.

Order Processing: Handles customer orders, assigns unique order IDs, and updates order statuses.

Technologies Used

Java

Object-Oriented Programming (OOP) principles

UUID for unique identifiers

Multi-threading for simulating order processing delays

Scanner for user input

How to Run

Clone this repository:

git clone https://github.com/your-repository.git

Navigate to the project directory:

cd inventory-management

Compile and run the Java program:

javac Main.java
java Main

Follow the on-screen instructions to enter sales data and process orders.

Classes Overview

Product: Represents a product with attributes like name, price, stock level, and reorder threshold.

StockPredictor: Predicts when a product will be out of stock based on daily sales.

Order: Manages customer order details, including product, quantity, and status.

OrderManager: Processes orders and updates their status over time.

Main: The entry point of the program, handling user input and program execution.

Example Output

Enter average daily sales for Laptop: 3
Enter average daily sales for Smartphone: 2

Product ID: <UUID>
Name: Laptop
Price: 1200.0
Stock Level: 20
Reorder Threshold: 5

Stock Prediction for Laptop
Days until stock out: 6
Restock Suggestion: Consider restocking soon.

Processing order: <UUID>
Order <UUID> status updated to SHIPPED.
Order <UUID> status updated to DELIVERED.

Future Enhancements

Add a database for persistent product and order storage.

Implement a graphical user interface (GUI) for better usability.

Introduce a notification system for low stock alerts.

License

This project is licensed under the MIT License. Feel free to modify and use it as needed.
