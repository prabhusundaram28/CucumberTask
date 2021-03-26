$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("D:/Workspace/CucumberTask/src/test/resources/FeatureFile/adactin.feature");
formatter.feature({
  "name": "Verifying the adactin webpage",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Verifying the adactin webpage with valid credentails",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user is on the adactin webpage",
  "keyword": "Given "
});
formatter.step({
  "name": "user should enter \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "user should click login button",
  "keyword": "Then "
});
formatter.step({
  "name": "user should enter \"\u003clocation\u003e\",\"\u003chotels\u003e\",\"\u003croomtype\u003e\",\"\u003cnoofrooms\u003e\",\"\u003cadultsperroom\u003e\"and\"\u003cchildperroom\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "name": "user should click search button",
  "keyword": "Then "
});
formatter.step({
  "name": "user should select the hotel and click the continue button",
  "keyword": "Then "
});
formatter.step({
  "name": "user should enter the \"\u003cfname\u003e\",\"\u003clname\u003e\",\"\u003caddress\u003e\",\"\u003cccnum\u003e\",\"\u003cccType\u003e\",\"\u003cexpMonth\u003e\",\"\u003cexpyaer\u003e\" and \"\u003ccvvNum\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "name": "user should click the book now button",
  "keyword": "Then "
});
formatter.step({
  "name": "user should print the orderId num",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password",
        "location",
        "hotels",
        "roomtype",
        "noofrooms",
        "adultsperroom",
        "childperroom",
        "fname",
        "lname",
        "address",
        "ccnum",
        "ccType",
        "expMonth",
        "expyaer",
        "cvvNum"
      ]
    },
    {
      "cells": [
        "prabhusundaram28",
        "Prabhu@1996",
        "Sydney",
        "Hotel Sunshine",
        "Standard",
        "1 - One",
        "1 - One",
        "1 - One",
        "prabhu",
        "kalyan",
        "perungudi",
        "1234567890123456",
        "VISA",
        "July",
        "2022",
        "123"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Verifying the adactin webpage with valid credentails",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user is on the adactin webpage",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.user_is_on_the_adactin_webpage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should enter \"prabhusundaram28\" and \"Prabhu@1996\"",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.user_should_enter_and(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should click login button",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_should_click_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should enter \"Sydney\",\"Hotel Sunshine\",\"Standard\",\"1 - One\",\"1 - One\"and\"1 - One\"",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_should_enter_and(String,String,String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should click search button",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_should_click_search_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should select the hotel and click the continue button",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_should_select_the_hotel_and_click_the_continue_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should enter the \"prabhu\",\"kalyan\",\"perungudi\",\"1234567890123456\",\"VISA\",\"July\",\"2022\" and \"123\"",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_should_enter_the_and(String,String,String,String,String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should click the book now button",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_should_click_the_book_now_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should print the orderId num",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_should_print_the_orderId_num()"
});
formatter.result({
  "status": "passed"
});
});