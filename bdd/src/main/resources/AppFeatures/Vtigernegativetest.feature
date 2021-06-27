Feature: vTiger login Test

Scenario Outline: As a user I want to login to application by using invalid credentials
Given I want to launch the browser and I will enter the url
When login page is displayed I will enter "<username>" and "<password>"
And click on login button
Then It should Not navigate me to Home page
And Error message should be displayed


Examples:
|username||password|
|        ||        |
|admin||12345|
|12345||admin|
||||

