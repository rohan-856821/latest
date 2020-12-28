@Timesheet
Feature: Hackathon Project

@Add
Scenario: Create New User

Given  Navigate to the Application 
When In the Home page Enter the User Name and Password
And  Click Login Verify Login successful
Then Click on Employee Details 
And  Create New User Link verify New user page is displayed
And  Enter all the mandatory details 
And  Click on Save Details
And  Click on Employee Details Link
Then  Click on Logout 

@Update
Scenario: Edit details

Given Navigate to the Application
When In the Home page Enter the User Name and Password
And Click Login Verify Login successful
Then Click on Employee Details
And Click on Edit Employee icon
And Change email
And Click on update Details
And Assert E-mail Updated
And Click on Logout