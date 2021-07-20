package ru.netology.rest;

import io.restassured.filter.log.LogDetail;
import io.restassured.http.ContentType;
import io.restassured.response.ValidatableResponse;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.empty;
import static org.hamcrest.Matchers.equalTo;

class ApiTest {
    @Test
    void shouldWork() {
//        String str =
        given()
            .baseUri("https://postman-echo.com")
            .body("some data")
        .when()
            .post("/post")
        .then()
            .statusCode(200)
            .body("args", Matchers.anEmptyMap())
            .body("data", equalTo("some data"))
            .body("headers.accept-encoding", equalTo("gzip,deflate"))
//        .extract().body().asString()
        ;
//        System.out.println(str);
    }
}
