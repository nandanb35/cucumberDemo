Feature: API Feature

  @API @TC-API-01 @Regression @Sanity
  Scenario: get users api verification
    Given I verify below users are returned in get users request
      | name                     | email                     | companyName        |
      | Leanne Graham            | Sincere@april.biz         | Romaguera-Crona    |
      | Ervin Howell             | Shanna@melissa.tv         | Deckow-Crist       |
      | Clementine Bauch         | Nathan@yesenia.net        | Romaguera-Jacobson |
      | Patricia Lebsack         | Julianne.OConner@kory.org | Robel-Corkery      |
      | Chelsey Dietrich         | Lucio_Hettinger@annie.ca  | Keebler LLC        |
      | Mrs. Dennis Schulist     | Karley_Dach@jasper.info   | Considine-Lockman  |
      | Kurtis Weissnat          | Telly.Hoeger@billy.biz    | Johns Group        |
      | Nicholas Runolfsdottir V | Sherwood@rosamond.me      | Abernathy Group    |
      | Glenna Reichert          | Chaim_McDermott@dana.io   | Yost and Sons      |
      | Clementina DuBuque       | Rey.Padberg@karina.biz    | Hoeger LLC         |

  @API @TC-API-01 @Regression @Sanity
  Scenario: create user
    Given I create user with below data
      | userId | 1   |
      | title  | foo |
      | body   | bar |
