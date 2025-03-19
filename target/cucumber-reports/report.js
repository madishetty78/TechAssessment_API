$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/001_UI_Spec.feature");
formatter.feature({
  "name": "Perform UI Spec operations on the Home Page and Support Page",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Perform UI Specific GET operations on the Home Page",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@UI_Scenario"
    },
    {
      "name": "@GET"
    },
    {
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "name": "I am on the Home page",
  "keyword": "Given "
});
formatter.match({
  "location": "glueCode.getHomePage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on the \"GET LIST USERS\" method button",
  "keyword": "When "
});
formatter.match({
  "location": "glueCode.i_click_on_the_method(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should see \"https://reqres.in/api/users?page\u003d2\" End Point",
  "keyword": "Then "
});
formatter.match({
  "location": "glueCode.i_should_see_a_endpoint(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should see \"200\" Response",
  "keyword": "And "
});
formatter.match({
  "location": "glueCode.i_should_see_a_response(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on the \"GET SINGLE USER\" method button",
  "keyword": "When "
});
formatter.match({
  "location": "glueCode.i_click_on_the_method(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should see \"https://reqres.in/api/users/2\" End Point",
  "keyword": "Then "
});
formatter.match({
  "location": "glueCode.i_should_see_a_endpoint(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should see \"200\" Response",
  "keyword": "And "
});
formatter.match({
  "location": "glueCode.i_should_see_a_response(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on the \"GET SINGLE USER NOT FOUND\" method button",
  "keyword": "When "
});
formatter.match({
  "location": "glueCode.i_click_on_the_method(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should see \"https://reqres.in/api/users/23\" End Point",
  "keyword": "Then "
});
formatter.match({
  "location": "glueCode.i_should_see_a_endpoint(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should see \"404\" Response",
  "keyword": "And "
});
formatter.match({
  "location": "glueCode.i_should_see_a_response(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Perform UI Specific POST operations on the Home Page",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@UI_Scenario"
    },
    {
      "name": "@POST"
    },
    {
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "name": "I am on the Home page",
  "keyword": "Given "
});
formatter.match({
  "location": "glueCode.getHomePage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on the \"POST CREATE\" method button",
  "keyword": "When "
});
formatter.match({
  "location": "glueCode.i_click_on_the_method(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should see \"https://reqres.in/api/users\" End Point",
  "keyword": "Then "
});
formatter.match({
  "location": "glueCode.i_should_see_a_endpoint(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should see \"201\" Response",
  "keyword": "And "
});
formatter.match({
  "location": "glueCode.i_should_see_a_response(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Perform UI Specific PUT operations on the Home Page",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@UI_Scenario"
    },
    {
      "name": "@PUT"
    },
    {
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "name": "I am on the Home page",
  "keyword": "Given "
});
formatter.match({
  "location": "glueCode.getHomePage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on the \"PUT\" method button",
  "keyword": "When "
});
formatter.match({
  "location": "glueCode.i_click_on_the_method(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should see \"https://reqres.in/api/users/2\" End Point",
  "keyword": "Then "
});
formatter.match({
  "location": "glueCode.i_should_see_a_endpoint(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should see \"200\" Response",
  "keyword": "And "
});
formatter.match({
  "location": "glueCode.i_should_see_a_response(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Perform UI Specific PATCH operations on the Home Page",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@UI_Scenario"
    },
    {
      "name": "@PATCH"
    },
    {
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "name": "I am on the Home page",
  "keyword": "Given "
});
formatter.match({
  "location": "glueCode.getHomePage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on the \"PATCH\" method button",
  "keyword": "When "
});
formatter.match({
  "location": "glueCode.i_click_on_the_method(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should see \"https://reqres.in/api/users/2\" End Point",
  "keyword": "Then "
});
formatter.match({
  "location": "glueCode.i_should_see_a_endpoint(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should see \"200\" Response",
  "keyword": "And "
});
formatter.match({
  "location": "glueCode.i_should_see_a_response(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Perform UI Specific DELETE operations on the Home Page",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@UI_Scenario"
    },
    {
      "name": "@DELETE"
    },
    {
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "name": "I am on the Home page",
  "keyword": "Given "
});
formatter.match({
  "location": "glueCode.getHomePage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on the \"DELETE\" method button",
  "keyword": "When "
});
formatter.match({
  "location": "glueCode.i_click_on_the_method(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should see \"https://reqres.in/api/users/2\" End Point",
  "keyword": "Then "
});
formatter.match({
  "location": "glueCode.i_should_see_a_endpoint(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should see \"204\" Response",
  "keyword": "And "
});
formatter.match({
  "location": "glueCode.i_should_see_a_response(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Perform UI Specific operations on the Home Page and Support Page",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@UI_Scenario"
    },
    {
      "name": "@SupportPage"
    },
    {
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "name": "I am on the Home page",
  "keyword": "Given "
});
formatter.match({
  "location": "glueCode.getHomePage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should see \"SUPPORT REQRES\" button",
  "keyword": "And "
});
formatter.match({
  "location": "glueCode.i_should_see_a_button(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on the \"SUPPORT REQRES\" button",
  "keyword": "When "
});
formatter.match({
  "location": "glueCode.i_click_on_the_button(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should see \"One-time payment ($)\" Option",
  "keyword": "Then "
});
formatter.match({
  "location": "glueCode.i_should_see_a_Option(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should see \"Monthly support ($5/month)\" Option",
  "keyword": "And "
});
formatter.match({
  "location": "glueCode.i_should_see_a_Option(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should see Support \"UPGRADE\" button",
  "keyword": "And "
});
formatter.match({
  "location": "glueCode.i_should_see_a_support_button(String)"
});
formatter.result({
  "status": "passed"
});
formatter.uri("file:src/test/resources/features/002_API_Spec.feature");
formatter.feature({
  "name": "Perform API POST and GET Operations on https://reqres.in/ URL",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Perform POST operation to Create user",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@API_Scenario"
    },
    {
      "name": "@POST_method"
    },
    {
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "name": "i have payload with the following details",
  "rows": [
    {
      "cells": [
        "name",
        "job"
      ]
    },
    {
      "cells": [
        "morpheus",
        "leader"
      ]
    }
  ],
  "keyword": "Given "
});
formatter.match({
  "location": "apiCode.iHavePayloadWithTheFollowingDetails(String,String\u003e\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I send a POST request to \"/api/users\"",
  "keyword": "When "
});
formatter.match({
  "location": "apiCode.iSendAPostRequestToCreateTheHero(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should receive a response with status code 201",
  "keyword": "Then "
});
formatter.match({
  "location": "apiCode.i_should_receive_a_response_with_status_code(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the POST response should contain the message",
  "rows": [
    {
      "cells": [
        "name",
        "job"
      ]
    },
    {
      "cells": [
        "morpheus",
        "leader"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "apiCode.the_Post_response_should_contain_the_message(String,String\u003e\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Perform GET operation to get user by id",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@API_Scenario"
    },
    {
      "name": "@GET_method"
    },
    {
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "name": "I have setup the base URI",
  "keyword": "Given "
});
formatter.match({
  "location": "apiCode.i_have_setup_the_base_uri()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I send a GET request to \"/api/users/2\"",
  "keyword": "When "
});
formatter.match({
  "location": "apiCode.i_send_a_get_request_to(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should receive a response with status code 200",
  "keyword": "Then "
});
formatter.match({
  "location": "apiCode.i_should_receive_a_response_with_status_code(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the GET response should contain the message",
  "rows": [
    {
      "cells": [
        "id",
        "email",
        "first_name",
        "last_name",
        "avatar",
        "url",
        "text"
      ]
    },
    {
      "cells": [
        "2",
        "janet.weaver@reqres.in",
        "Janet",
        "Weaver",
        "https://reqres.in/img/faces/2-image.jpg",
        "https://contentcaddy.io?utm_source\u003dreqres\u0026utm_medium\u003djson\u0026utm_campaign\u003dreferral",
        "Tired of writing endless social media content? Let Content Caddy generate it for you."
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "apiCode.the_Get_response_should_contain_the_message(String,String\u003e\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.uri("file:src/test/resources/features/003_Data_Load_Transformation.feature");
formatter.feature({
  "name": "Generate Position Report by transforming data from Instrument Details and Position Details tables",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Generate Position Report from input files",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@ETL"
    },
    {
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "name": "I upload the file \"InstrumentDetails\" to Database",
  "keyword": "When "
});
formatter.match({
  "location": "glueCode.i_upload_the_file_to_database(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I upload the file \"PositionDetails\" to Database",
  "keyword": "And "
});
formatter.match({
  "location": "glueCode.i_upload_the_file_to_database(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I generate the PositionReport from after processing",
  "keyword": "Then "
});
formatter.match({
  "location": "glueCode.i_generate_the_PositionReport_from_database()"
});
formatter.result({
  "status": "passed"
});
});