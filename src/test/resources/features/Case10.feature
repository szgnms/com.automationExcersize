@cs5
Feature: Test Case 5: Register User with existing email

  Scenario:  Register User with existing email


    Given Navigate to url "autoExeUrl"
    Then Verify that home page is visible successfully
    Then Click on Signup Login button
    Then Verify New User Signup! is visible
    Then Enter name and already registered email address
    Then Click Signup button
    Then  Verify error Email Address already exist! is visible
