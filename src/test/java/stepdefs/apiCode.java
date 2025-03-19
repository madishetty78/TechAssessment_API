package stepdefs;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.http.ContentType;
import org.json.simple.JSONObject;
import org.testng.Assert;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import java.io.IOException;
import java.sql.SQLException;
import java.util.*;

import utility.Library;


public class apiCode {

    private Response response;

    public JSONObject dataJson;
    Library library = new Library();


    @Given("i have payload with the following details")
    public void iHavePayloadWithTheFollowingDetails(List<Map<String,String>> heroDetails) throws IOException {
        dataJson = new JSONObject();
        dataJson.put("name",heroDetails.get(0).get("name"));
        dataJson.put("job", heroDetails.get(0).get("job"));

        System.out.println("json Object is: " + dataJson);
    }

    @When("I send a POST request to {string}")
    public void iSendAPostRequestToCreateTheHero(String endpoint) throws IOException {
        RestAssured.baseURI = library.getDetailsFromProperty("base.uri");
        response = given()
                        .log().all()
                        .contentType(ContentType.JSON)
                        .body(dataJson.toString())
                   .when()
                        .post(endpoint);

        String body = response.getBody().asString();
        System.out.println("Response Object is: " + body);
    }


    @When("I send a GET request to {string}")
    public void i_send_a_get_request_to(String endpoint) throws IOException {
        // Send GET request to the specified endpoint
        RestAssured.baseURI = library.getDetailsFromProperty("base.uri");
        response = given()
                        .log().all()
                  .when()
                       .get(endpoint);

        String body = response.getBody().asString();
        System.out.println("Response Object is: " + body);
    }

    @When("I have setup the base URI")
    public void i_have_setup_the_base_uri() throws IOException {
        RestAssured.baseURI = library.getDetailsFromProperty("base.uri");
    }

    @Then("I should receive a response with status code {int}")
    public void i_should_receive_a_response_with_status_code(int statusCode) {
        // Verify the status code of the response
        System.out.println("Response code is : " + response.getStatusCode());
        Assert.assertEquals(statusCode, response.getStatusCode());
    }

    @Then("the POST response should contain the message")
    public void the_Post_response_should_contain_the_message(List<Map<String,String>> dataTable) {
        // Verify the message in the response body
        String expectedName = dataTable.get(0).get("name");
        String expectedJob = dataTable.get(0).get("job");

        response.then().body("name", equalTo(expectedName))
                       .body("job", equalTo(expectedJob))
                       .body("id", notNullValue())
                       .body("createdAt", notNullValue());
    }

    @Then("the GET response should contain the message")
    public void the_Get_response_should_contain_the_message(List<Map<String,String>> dataTable) {
        // Verify the message in the response body
        String expectedId = dataTable.get(0).get("id");
        String expectedEmail = dataTable.get(0).get("email");
        String expectedFName = dataTable.get(0).get("first_name");
        String expectedLName = dataTable.get(0).get("last_name");
        String expectedAvatar = dataTable.get(0).get("avatar");
        String expectedUrl = dataTable.get(0).get("url");
        String expectedText = dataTable.get(0).get("text");

        String responseBody = response.getBody().asString();

        // Parse the JSON response
        JsonPath jsonPath = new JsonPath(responseBody);

        Assert.assertEquals(expectedId, jsonPath.getString("data.id"));
        Assert.assertEquals(expectedEmail, jsonPath.getString("data.email"));
        Assert.assertEquals(expectedFName, jsonPath.getString("data.first_name"));
        Assert.assertEquals(expectedLName, jsonPath.getString("data.last_name"));
        Assert.assertEquals(expectedAvatar, jsonPath.getString("data.avatar"));
        Assert.assertEquals(expectedUrl, jsonPath.getString("support.url"));
        Assert.assertEquals(expectedText, jsonPath.getString("support.text"));

    }

}
