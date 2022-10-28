Feature: Application login


Scenario Outline: Salesfore home page login

Given Intialize the web driver
When user navaigates to website "https://login.salesforce.com/?locale=in"
And enter <username> and <password> and click on login button
Then user should be able to login sucessfully

Examples:
|username||password|
|test123||secure123|
|test456||secure456|