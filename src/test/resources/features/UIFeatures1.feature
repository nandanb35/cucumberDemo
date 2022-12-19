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

  @Regression @Sanity @TC-07
  Scenario Outline: Test case number seven
    Given I login as user with below details
      | name | <name> |
      | age  | <age>  |
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

    Examples:
      | name       | age |
      | Michael    | 30  |
      | Pam        | 31  |
      | Jim        | 32  |
      | Dwight     | 33  |
      | Angela     | 34  |
      | Nancy      | 35  |
      | sheldon    | 36  |
      | leonard    | 37  |
      | penny      | 38  |
      | raj        | 39  |
      | howard     | 40  |
      | bernadette | 41  |
      | amy        | 42  |


