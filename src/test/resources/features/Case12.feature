@cs11
Feature: Test Case 11: Verify Subscription in Cart page

  Scenario:   Verify Subscription in Cart page


    Given Navigate to url "autoExeUrl"
    Then Verify that home page is visible successfully
    Then Click Cart button
    Then Scroll down to footer
    Then Verify text SUBSCRIPTION
    Then Enter email address in input and click arrow button
    Then Verify success message You have been successfully subscribed! is visible

