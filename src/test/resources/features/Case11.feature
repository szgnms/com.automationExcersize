@cs10
Feature: Test Case 10: Verify Subscription in home page

  Scenario:  Verify Subscription in home page


    Given Navigate to url "autoExeUrl"
    Then Verify that home page is visible successfully
    Then Scroll down to footer
    Then Verify text SUBSCRIPTION
    Then Enter email address in input and click arrow button
    Then Verify success message You have been successfully subscribed! is visible

