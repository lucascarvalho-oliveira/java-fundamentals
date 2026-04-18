<p align="center">
  <a href="./README.md">
    <img src="https://img.shields.io/badge/Language-Português-green?style=for-the-badge">
  </a>
</p>

# Seconds Converter in Java

This Java program converts an integer value entered by the user, representing seconds, into hours, minutes, and seconds.

It performs three main tasks:
- Receives an integer value in seconds
- Calculates the corresponding number of hours and minutes
- Displays the converted time in the console

## Technologies Used
- Java
- Data input using `Scanner`
- Arithmetic operators: `/` and `%`
- Variables of type `int`

## How the program works
1. The user enters an integer number representing seconds.
2. The program calculates the hours using integer division by 3600.
3. The remainder is obtained using the `%` operator.
4. From the remainder, minutes are calculated using integer division by 60.
5. The final remaining value represents the seconds.
6. The result is displayed in the format: `Xh Ymin Zsec`.
