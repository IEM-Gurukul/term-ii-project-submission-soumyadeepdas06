[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/pG3gvzt-)
# PCCCS495 – Term II Project

## Project Title

Command-Line Banking System


## Problem Statement (max 150 words)

The objective of this project is to design and implement a command-line banking system in Java that demonstrates core Object-Oriented Programming (OOP) concepts. The system allows users to perform basic banking operations such as account creation, deposit, withdrawal, fund transfer, balance inquiry, and transaction history using a terminal-based interface. It includes proper error handling for scenarios like insufficient balance and invalid account numbers. The project focuses on clean design, modularity, and maintainability while simulating a simplified banking environment.
## Target User

This system is intended for students and basic users who want to understand banking operations and OOP concepts through a simple command-line application.


## Core Features

Account Creation (Savings and Current accounts)
Deposit Money
Withdraw Money
Balance Inquiry
Fund Transfer
Transaction History
Error Handling using exceptions
OOP Concepts Used
Abstraction

## OOP Concepts Used

- Abstraction:
- Inheritance:
- Polymorphism:
- Exception Handling:
- Collections / Threads:

## Proposed Architecture Description

Implemented using the abstract Account class to define common structure and behavior.

Inheritance

SavingsAccount and CurrentAccount extend the Account class to reuse and specialize functionality.

Polymorphism

The withdraw() method is overridden in different account types to provide specific behavior.

Exception Handling

A custom BankException class is used to handle runtime errors such as insufficient balance and invalid account operations.

Architecture Description

The system follows a simple layered approach. The Main class handles user input and displays the menu. The Bank class manages all banking operations such as account creation, deposit, withdrawal, and transfer. The Customer, Account, and Transaction classes manage data storage and structure. All data is stored using collections like HashMap and ArrayList. This design ensures modularity, readability, and easy maintenance.

## How to Run

Open Command Prompt and navigate to the project directory.
Compile all Java files:
javac *.java
Run the program:
java Main
Follow the on-screen menu to perform banking operations.

## Git Discipline Notes
Minimum 10 meaningful commits required.
