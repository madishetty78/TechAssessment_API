Feature: Perform API POST and GET Operations on https://reqres.in/ URL

  @API_Scenario @POST_method @Regression
  Scenario: Perform POST operation to Create user
    Given i have payload with the following details
      | name     | job    |
      | morpheus | leader |

    When I send a POST request to "/api/users"
    Then I should receive a response with status code 201
    And the POST response should contain the message
      | name     | job    |
      | morpheus | leader |


  @API_Scenario @GET_method @Regression
  Scenario Outline: Perform GET operation to get user by id
    Given I have setup the base URI
    When I send a GET request to "/api/users/<id>"
    Then I should receive a response with status code 200
    And the GET response should contain the message
      | id   | email   | first_name   | last_name  | avatar   | url   | text   |
      | <id> | <email> | <first_name> | <last_name>| <avatar> | <url> | <text> |

    Examples:
      | id | email                  | first_name  | last_name  | avatar                                   | url                                                                             | text                                                                                  |
      | 2  | janet.weaver@reqres.in | Janet       | Weaver     | https://reqres.in/img/faces/2-image.jpg  | https://contentcaddy.io?utm_source=reqres&utm_medium=json&utm_campaign=referral | Tired of writing endless social media content? Let Content Caddy generate it for you. |
      | 10 | byron.fields@reqres.in | Byron       | Fields     | https://reqres.in/img/faces/10-image.jpg | https://contentcaddy.io?utm_source=reqres&utm_medium=json&utm_campaign=referral | Tired of writing endless social media content? Let Content Caddy generate it for you. |

