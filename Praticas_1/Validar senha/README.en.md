<p align="center">
  <a href="./README.md">
    <img src="https://img.shields.io/badge/Language-Português-green?style=for-the-badge">
  </a>
</p>

# Password Validator in Java
This Java program validates the creation of a password based on security criteria.
It performs three main tasks:

* Requests a password from the user
* Checks if the password has at least 8 characters
* Verifies if the password contains at least one special symbol

## Technologies Used

* Java
* Data input using `Scanner`
* Basic structures: `while`, `if`, `boolean`
* Regular expressions using `matches()`

## How the Program Works

1. The program enters a `while` loop until a valid password is provided.
2. The user enters a password.
3. The password length is checked using the `length()` method.
4. The presence of at least one special symbol is validated using a regular expression.
5. If the password meets the criteria, the program displays a success message and exits the loop.
6. Otherwise, an error message is displayed and the user is asked to try again.
