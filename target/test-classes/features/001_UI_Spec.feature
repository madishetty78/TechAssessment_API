Feature: Perform UI Spec operations on the Home Page and Support Page

  @UI_Scenario @GET @Regression
  Scenario: Perform UI Specific GET operations on the Home Page

    # Home Page
    Given I am on the Home page
    When I click on the "GET LIST USERS" method button
    Then I should see "https://reqres.in/api/users?page=2" End Point
    And I should see "200" Response

    When I click on the "GET SINGLE USER" method button
    Then I should see "https://reqres.in/api/users/2" End Point
    And I should see "200" Response

    When I click on the "GET SINGLE USER NOT FOUND" method button
    Then I should see "https://reqres.in/api/users/23" End Point
    And I should see "404" Response

  @UI_Scenario @POST @Regression
  Scenario: Perform UI Specific POST operations on the Home Page

    # Home Page
    Given I am on the Home page

    When I click on the "POST CREATE" method button
    Then I should see "https://reqres.in/api/users" End Point
    And I should see "201" Response

  @UI_Scenario @PUT @Regression
  Scenario: Perform UI Specific PUT operations on the Home Page

    # Home Page
    Given I am on the Home page

    When I click on the "PUT" method button
    Then I should see "https://reqres.in/api/users/2" End Point
    And I should see "200" Response

  @UI_Scenario @PATCH @Regression
  Scenario: Perform UI Specific PATCH operations on the Home Page

    # Home Page
    Given I am on the Home page

    When I click on the "PATCH" method button
    Then I should see "https://reqres.in/api/users/2" End Point
    And I should see "200" Response

  @UI_Scenario @DELETE @Regression
  Scenario: Perform UI Specific DELETE operations on the Home Page

    # Home Page
    Given I am on the Home page

    When I click on the "DELETE" method button
    Then I should see "https://reqres.in/api/users/2" End Point
    And I should see "204" Response

  @UI_Scenario @SupportPage @Regression
  Scenario: Perform UI Specific operations on the Home Page and Support Page

    # Home Page
    Given I am on the Home page
    And I should see "SUPPORT REQRES" button
    When I click on the "SUPPORT REQRES" button

    # Support Page
    Then I should see "One-time payment ($)" Option
    And I should see "Monthly support ($5/month)" Option

    And I should see Support "UPGRADE" button








