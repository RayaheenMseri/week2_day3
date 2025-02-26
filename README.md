# Inventory Management System

## Overview
This Java-based Inventory Management System allows users to track product stock levels, predict stock depletion based on sales data, and process customer orders efficiently.

## Features
- **Product Management**: Stores product details, including name, price, stock level, and reorder threshold.
- **Stock Prediction**: Estimates when stock will run out based on average daily sales and provides restock suggestions.
- **Order Processing**: Handles customer orders, assigns unique order IDs, and updates order statuses.

## Technologies Used
- Java
- Object-Oriented Programming (OOP) principles
- UUID for unique identifiers
- Multi-threading for simulating order processing delays
- Scanner for user input

## How to Run
1. Clone this repository:
   ```sh
   git clone https://github.com/your-repository.git
2. Navigate to the project directory:
   ```sh
   cd inventory-management
3. Compile and run the Java program:
   ```sh
   javac Main.java
   java Main
4. Follow the on-screen instructions to enter sales data and process orders.

## Classes Overview

**Product**: Represents a product with attributes like name, price, stock level, and reorder threshold.

**StockPredictor**: Predicts when a product will be out of stock based on daily sales.

**Order**: Manages customer order details, including product, quantity, and status.

**OrderManager**: Processes orders and updates their status over time.

**Main**: The entry point of the program, handling user input and program execution.

## Example Output
   <pre> ```
   Enter average daily sales for Laptop: 4
   Enter average daily sales for Smartphone: 2

   Product ID: 123e4567-e89b-12d3-a456-426614174000
   Name: Laptop
   Price: $1200.0
   Stock Level: 20
   Reorder Threshold: 5
   ----------------------------
   Product ID: 321a4567-e89b-12d3-a456-426614174111
   Name: Smartphone
   Price: $800.0
   Stock Level: 10
   Reorder Threshold: 3
   ----------------------------
   Stock Prediction for Laptop:
   Days until stock out: 5
   Restock Suggestion: Moderate: Consider restocking soon.
   Stock Prediction for Smartphone:
   Days until stock out: 5
   Restock Suggestion: Moderate: Consider restocking soon.
   ``` </pre>
   
## Future Enhancements

Add a database for persistent product and order storage.

Implement a graphical user interface (GUI) for better usability.

Introduce a notification system for low stock alerts.

## License

This project is licensed under the MIT License. Feel free to modify and use it as needed.


