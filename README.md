# Hierarchical Inheritance in Java

Hierarchical Inheritance is a type of inheritance in Java where **multiple child classes inherit from a single parent class**.  
This allows common properties and methods to be shared while each child class can have its own specific behavior.

---

## Description
In hierarchical inheritance:
- One **base (parent) class** contains common data members and methods
- Multiple **derived (child) classes** inherit from the same parent class
- Each child class can access the parent class members and also define its own features

---

## Key Points
- Promotes **code reusability**
- Reduces **code duplication**
- Improves **maintainability**
- Supported in Java using the `extends` keyword

---

## Example Scenario
- A parent class `Animal` defines common behaviors like `eat()`
- Child classes such as `Dog` and `Cat` inherit from `Animal`
- Each child class can implement its own behavior like `bark()` or `meow()`

---

## Advantages
- Common functionality is written once
- Easy to extend functionality
- Logical class hierarchy

---

## Purpose
This program is intended for beginners to understand how hierarchical inheritance works in Java and how a single parent class can be reused by multiple child classes.

