@cs4
Feature: Logout User

  Scenario: Test Case 4: Logout User


    Given Navigate to url "autoExeUrl"
    Then Verify that home page is visible successfully
    Then Click on Signup Login button
    Then Verify Login to your account is visible
    Then Enter correct email address and password
    Then Click login button
    Then Verify that Logged in as username is visible
    Then Click Logout button
    Then Verify that user is navigated to login page
