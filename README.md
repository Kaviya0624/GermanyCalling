## Overview

This project contains automated test scripts for testing login functionality using Selenium WebDriver and TestNG. The tests cover various login scenarios such as valid login, invalid password, invalid email, blank fields, and inputting special characters.

## Test Execution Steps

## Prerequisites

* Java JDK 8 or higher
*	Maven 
*	Eclipse
*	Selenium Webdriver

 ## Setup Instructions

* Clone the repository.

* Import the Project.
Open the project in your IDE.
Ensure that the Maven dependencies are installed by updating the Maven project.

* Running Tests

- Via testNG in IDE:
Right-click on the testng.xml file and select Run as testNG Suite

- run.bat file
Double click on the run.bat file to run the project instantly

- Via command prompt
Open command prompt and go to web-test directory.
run mvn test

## Test Results

* After test execution, detailed report(extentreport) will be automatically opened in chrome
* Screenshots will be saved in the screenshots/ directory if any test fails.

## Assumptions

* The test site URL and login credentials are configured correctly in the config.properties file.
* The cookies popup is assumed to be present only during the first page load and may not appear in subsequent test cases. 
* WebDriver executables for Chrome, Firefox, and Edge are correctly installed and accessible.

## Limitations

* The current test scripts only cover login functionality and do not have other features such as registration.

## Challenges Faced

* Some elements like the cookies popup may appear inconsistently, which required extra exception handling in the test scripts and some times tests gets failed due to this.
* And when clicking login button after entering the credentials the page landing in url is sometimes changing its inconsistent so the test gets failed.when comparing expected url with actual url

## Potential Improvements

* Test cases can be extended to cover additional functionalities like registration, password recovery, and profile management.
* Can include cross browser testing ,grouping ,parallel testing to improve.










