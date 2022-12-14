Feature: UI Feature

  Background:
    Given This is background step

  @Regression @Sanity @TC-01
  Scenario: Test case number one
    Given I login as user
    When I navigate to homepage
    And I add iphone to cart
    Then I place an order


  @Regression @Sanity @TC-02
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

  @Regression @Sanity @TC-03
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
    And I replace order with order id 7654490

  @Regression @Sanity @TC-04
  Scenario: Test case number four
    Given I login as user with below details
      | name | Felix |
      | age  | 35    |
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
    And I cancel order '523489'

  @Prod @TC-05
  Scenario: Test case number five
    Given I login as user with below details
      | name | John |
      | age  | 40    |
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
    And I cancel order '523489'


  @Regression @Sanity @TC-06
  Scenario: Test case number six
    Given I login as user with below details
      | name | Roger |
      | age  | 55    |
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
    And I cancel order '64345'