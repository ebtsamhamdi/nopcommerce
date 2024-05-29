## NopCommerce Automation Project
#### Overview
This project is designed to automate the registration process on the NopCommerce demo website using Selenium WebDriver and Java. The tests are written using TestNG, a popular testing framework in Java, which allows us to efficiently manage and run automated tests.

#### URL : https://demo.nopcommerce.com/

#### link for video running project 
#### https://www.screenpresso.com/=k73dc


## Project Structure
#### src/main/java/nopcommerce/pages: Contains the Page Object Model (POM) classes representing various web pages.
#### src/main/java/nopcommerce/steps: Contains the test steps and utility classes.
#### src/test/java/nopcommerce/screenshots: Directory where screenshots of failed tests will be saved.
#### allure-results:contains data of allure reports can opened as displayed in video

## Prerequisites
#### Java Development Kit (JDK)
#### Maven: Ensure Maven is installed for dependency management.
#### WebDriver Manager
#### TestNG
#### allure
#### apache POI

## Project Setup
#### Import the project in your IDE " Intellij "
#### Install dependencies
#### Update the WebDriver path: Ensure chromedriver is accessible from your system PATH or specify its location directly in the Base class

## Configuration
Ensure the data.csv file is located at C:\Users\ebtsam\Desktop\data.csv or update the file path in the CSVdata class accordingly.


## How to Run Tests
Right-click on the "Register_steps" class and select Run "Register_steps".

## TestNG Configuration
The Register_steps class is annotated with TestNG annotations to manage the test lifecycle:

#### @BeforeMethod: Sets up the necessary web pages before each test method.
#### @Test: Defines the test method which takes data from the data provider.
#### @AfterMethod: Closes the browser after each test method.


## Data Provider
The getData method in the Register_steps class reads test data from a CSV file using the CSVdata class. Ensure the CSV file is correctly formatted and located at the specified path.


## Screenshots
In case of test failure, screenshots will be captured and saved in the src/test/java/nopcommerce/screenshots/ directory. Each screenshot is uniquely named to prevent overwriting.

## CSV File Format
The CSV file should have the following headers:

#### gender
#### firstName
#### lastName
#### day
#### month
#### year
#### email
#### companyName
#### password
#### confirmPassword






