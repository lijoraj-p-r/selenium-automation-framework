
# Selenium Automation Framework

A professional-grade test automation framework developed using **Java**, **Selenium WebDriver**, and **TestNG**. This project is designed to facilitate scalable, maintainable, and readable automated web testing through the Page Object Model (POM) architecture.

## 🚀 Key Features

* **Page Object Model (POM):** Decouples test logic from UI locators for better maintainability.
* **Data-Driven Testing:** Support for external data sources (Excel/Properties) to drive test cases.
* **Cross-Browser Support:** Easily switch between Chrome, Firefox, and Edge via configuration.
* **Parallel Execution:** Integrated TestNG capabilities to run tests concurrently, reducing execution time.
* **Reporting:** Detailed execution reports (ExtentReports/Allure) with automatic screenshots on failure.
* **CI/CD Ready:** Configured with Maven for seamless integration with Jenkins or GitHub Actions.

## 🛠 Tech Stack

* **Language:** Java
* **Automation Tool:** Selenium WebDriver
* **Testing Framework:** TestNG
* **Build Tool:** Maven
* **Logging:** Log4j
* **Reporting:** ExtentReports / TestNG Reports

## 📋 Prerequisites

Before you begin, ensure you have the following installed:

* [JDK 11+](https://www.oracle.com/java/technologies/downloads/)
* [Maven](https://maven.apache.org/download.cgi)
* An IDE (IntelliJ IDEA or Eclipse)
* Browser Drivers (ChromeDriver, GeckoDriver, etc.) — *Managed automatically via WebDriverManager*

## ⚙️ Setup & Installation

1. **Clone the Repository:**
```bash
git clone https://github.com/lijoraj-p-r/selenium-automation-framework.git
cd selenium-automation-framework

```


2. **Install Dependencies:**
```bash
mvn clean install

```



## 🏃 Running Tests

* **Run via Maven:**
```bash
mvn test

```


* **Run Specific Test Suite:**
```bash
mvn test -DsuiteXmlFile=testng.xml

```


* **Run via IDE:**
Right-click on any test class in `src/test/java` or the `testng.xml` file and select **Run**.

## 📊 Reporting

After the test execution completes, reports are generated in the `test-output/` or `target/` directory. Open `index.html` (TestNG) or `ExtentReport.html` in any browser to view the results.
