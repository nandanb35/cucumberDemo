Feature: UI Feature 2

  @Regression @Sanity @TC-08
  Scenario: Test case number eight
    Given I login as user
    When I navigate to homepage
    And I add iphone to cart
    And I apply coupon
    Then I place an order

  @Regression @Sanity @TC-07
  Scenario: Test case number seven
    Given I login as user with below details
      | name | manny |
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
    And I cancel order '867543'


