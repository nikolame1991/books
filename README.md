# 📘 BooksToScrape - Selenium Test Automation

## 📄 Description

Automated UI test project for the demo website [books.toscrape.com](https://books.toscrape.com)  
using **Java**, **Selenium WebDriver**, **TestNG**, and **Page Object Model (POM)**.

This project performs UI validations on the homepage and product details page.

---

## 🧪 Features Tested

- Click on site logo
- Click on a book image
- Verify book title
- Verify book price
- Return to homepage
- Count the number of books on the main page

---

## 🛠 Technologies Used

- Java
- Selenium WebDriver
- TestNG
- Page Object Model (POM)
- WebDriverWait (Explicit Wait)

---

## 📂 Project Structure

# books
│
├── HomePageClasses.java # Page Object class
├── HomePageClassTest.java # Test class
├── BaseTestCase.java # Setup & teardown
├── README.md # Project info

---

## 🚀 How to Run the Tests

1. Clone the repo
2. Open the project in your IDE
3. Make sure you have the latest version of ChromeDriver in your system path
4. Run `HomePageClassTest` using TestNG

---

## ✅ Sample Assertion

```java
Assert.assertEquals(actualText, expectedText, "Book title does not match!");

👤 Author

Nikola Medan
LinkedIn
GitHub
