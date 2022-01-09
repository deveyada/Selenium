Feature: Login with different emailids

Scenario Outline: Verify login functionality with different email id's


Given user launches the browser
Then user opens the "https://www.qaclickacademy.com/" site
Then user opens the home page
Then user clicks on login link
Then user opens the login page
And user enters the <emailid> in email field
And user enters the <password> in password field
And user clicks on Login button

Examples:

| emailid | password | site |
| kumar.devesh04@gmail.com| Cap@1234 |www.qaclickacademy.com/|
| test@xyz.com | aiwai |www.qaclickacademy.com/|