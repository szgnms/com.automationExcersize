@cs8
Feature: Test Case 8: Verify All Products and product detail page

  Scenario: Verify All Products and product detail page


    Given Navigate to url "autoExeUrl"
    Then Verify that home page is visible successfully
    Then Click on Products button
    Then Verify user is navigated to ALL PRODUCTS page successfully
    Then The products list is visible
    Then Click on View Product of first product
    Then User is landed to product detail page
    Then Verify that detail detail is visible: product name, category, price, availability, condition, brand

