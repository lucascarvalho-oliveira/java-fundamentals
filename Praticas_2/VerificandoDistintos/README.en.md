<p align="center">
  <a href="./README.md">
    <img src="https://img.shields.io/badge/Language-Português-green?style=for-the-badge">
  </a>
</p>

# Distinct Number Verification in Java

This Java program checks whether a list of integers entered by the user contains duplicate values.

It performs three main tasks:
- Receives the number of values to be compared
- Stores the values in an array
- Checks if there are equal numbers in the list

## Technologies Used
- Java
- Data input using `Scanner`
- Array `int[]`
- Loop structures: `for`
- Conditional structure `if`
- Boolean variable `boolean`

## How the program works
1. The user enters the number of values they want to compare.
2. An `int[]` array is created with the specified size.
3. The numbers are stored in the array using a `for` loop.
4. Two nested `for` loops go through the array to compare each element with the others.
5. If two equal values are found, the control variable is updated.
6. At the end, the program informs whether the list contains duplicate numbers or not.
