Feature: UI Feature

  Background:
    Given This is background step

  @Regression @Sanity
  Scenario: Test case number one
    Given I login as user
    When I navigate to homepage
    And I add iphone to cart
    Then I place an order


  @Regression @Sanity
  Scenario: Test case number two
    Given I login as user with below details
      | name | nandan |
      | age  | 30     |
    When I navigate to homepage
    And I add below products to cart
      | iphone |
      | watch  |
      | ipad   |
    Then I place an order with below details
      | FIELDNAME | KEY        | VALUE |
      | firstName | isRequired | true  |
      | lastName  | isRequired | true  |
      | email     | isRequired | true  |
    And I return order with order id '123556'

  @Regression @Sanity
  Scenario: Test case number three
    Given I login as user with below details
      | name | chandan |
      | age  | 25      |
    When I navigate to homepage
    And I add below products to cart
      | iphone |
      | watch  |
      | ipad   |
    Then I place an order with below details
      | FIELDNAME | KEY        | VALUE |
      | firstName | isRequired | true  |
      | lastName  | isRequired | true  |
      | email     | isRequired | true  |
    And I replace order with order id '7654490'
