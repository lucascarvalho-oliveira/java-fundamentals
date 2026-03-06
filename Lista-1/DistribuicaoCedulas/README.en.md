<p align="center">
  <a href="./README.md">
    <img src="https://img.shields.io/badge/Language-Português-green?style=for-the-badge">
  </a>
</p>

# Banknote Distribution in Java

This Java program calculates the distribution of banknotes from an integer value provided by the user.
It performs three main tasks:

* Receives an integer value that is a multiple of 10
* Calculates the quantity of **R$50**, **R$20**, and **R$10** banknotes
* Displays the distribution result in the console

## Technologies Used

* Java
* Data input using `Scanner`
* Basic structures: arithmetic operators, `int` variables, and logic based on conditional reasoning

## How the Program Works

1. The user enters an integer value that is a multiple of 10.
2. The program calculates the number of **R$50** banknotes using integer division.
3. The remaining value is calculated using the `%` (modulus) operator.
4. From the remainder, the number of **R$20** banknotes is calculated.
5. The final remaining value is converted into **R$10** banknotes.
6. The quantity of each banknote is displayed in the console.
