<p align="center">
  <a href="./README.md">
    <img src="https://img.shields.io/badge/Language-Português-green?style=for-the-badge">
  </a>
</p>

# Array Reversal in Java

This Java program reverses the order of elements in an array of integers.

It performs three main tasks:
- Creates an array of integers
- Reverses the order of the array elements
- Displays the reversed array in the console

## Technologies Used
- Java
- Array `int[]`
- Static method
- Loop structure `while`
- Loop structure `for`

## How the program works
1. An `int[]` array is created in the `main` method with predefined values.
2. The array is passed as a parameter to the `inverterList` method.
3. Two variables are created: `inicio` (first position) and `fim` (last position of the array).
4. A `while` loop is used to run while `inicio` is less than `fim`.
5. Inside the loop, the values at the positions are swapped using a temporary variable.
6. With each iteration, `inicio` is incremented and `fim` is decremented.
7. The process continues until the positions meet in the middle of the array.
8. The reversed array is returned.
9. A `for` loop goes through the reversed array and prints the values in the console.
