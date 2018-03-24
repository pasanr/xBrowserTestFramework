# Cross Browser Testing Framework

This is a simple project which combines Maven, TestNG, ReportNG and Selenium WebDriver. The basic setup can readily be extended with your own test cases.

## Prerequisites

Web drivers are Linux builts
You need Java (1.8), Maven (3.3) for compiling and building
Also, relevant browsers need to be installed in default locations

## How to Run

Extend your test cases and simply execute `mvn test` from project base directory

## Report Generation

Reports will be generated in:

- `{BaseDirectory}/target/surefire-reports/html/index.html` (TestNG Reports)
- `{BaseDirectory}/target/surefire-reports/index.html` (Surefire Reports)
