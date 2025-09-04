# Selenium Java Automation Project

This repository contains an automation suite developed using **Selenium WebDriver** with **Java**, following the **Page Object Model (POM)** design pattern. The suite automates tasks for user authentication, form submission, and e-commerce site interactions.

---

## Technologies Used

- **Java** – Programming language for test scripts.
- **Selenium WebDriver** – Browser automation tool.
- **TestNG** – Test framework for assertions and test execution.
- **Page Object Model (POM)** – Design pattern for better code maintainability and readability.
- **Maven** – Build and dependency management.

---

## Project Structure

```
src/
 ├── main/
 │    └── java/
 │         └── com.automation.qabrains/
 │             └── base/
 │             └── pages/
 └── test/
      └── java/
      │    └── tests/
      │         └── utils/
      └── resources/
```

- **pages/** – Contains POM classes representing different pages/modules of the application.
- **tests/** – Contains test classes with test methods for various scenarios.

---

## Features Automated

### 1. User Authentication
- Automated login using provided credentials:  
  `qa_testers@qabrains.com / Password123`
- Assert successful login and handle login errors.
- Negative login tests with invalid credentials and proper assertion of error messages.
- Navigation automation to **Registration** and **Forgot Password** submodules.
- Automate leaving feedback in the **Leave Feedback** section.

### 2. Form Submission
- Locate and fill all required fields in the form.
- Submit forms and assert success or error messages.
- Validate form by testing submission with missing or invalid data.

### 3. E-Commerce Site Automation
- Login to the demo e-commerce site.
- Add items to the cart and verify cart updates correctly.
- Automate the checkout flow: add items, proceed to checkout, fill required details, and complete the purchase.
- Assert success and error messages during checkout.

---

## How to Run the Tests

1. **Clone the repository**
```bash
git clone https://github.com/rahmannazneen/automation-qabrains.git
```

2. **Install dependencies**:
```bash
mvn clean install
```

3. **Execute tests** (using TestNG):
```bash
mvn test
```

> Ensure you have the latest browser drivers (ChromeDriver) in your system path.

---

## Key Highlights

- Fully implemented **Page Object Model (POM)** for modular and maintainable code.
- Includes **positive and negative test scenarios** for robust validation.
- Handles form validations and dynamic web elements efficiently.
- Suitable for **UI regression testing** of authentication, forms, and e-commerce flows.

---

## Author

**Nazneen Rahman** – QA Automation Engineer


