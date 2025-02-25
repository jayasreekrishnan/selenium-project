$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/scenarionout.feature");
formatter.feature({
  "name": "To validate the login functionality by using invalid credentials",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Successful login for valid username and password",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Mytest"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "to launch the chrome browser and maximize window",
  "keyword": "Given "
});
formatter.match({
  "location": "background.to_launch_the_chrome_browser_and_maximize_window()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "to launch the url of the facebook application",
  "keyword": "When "
});
formatter.match({
  "location": "background.to_launch_the_url_of_the_facebook_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user enters \"Admin1\" and \"Admin123\"",
  "keyword": "When "
});
formatter.match({
  "location": "background.the_user_enters_and(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on the Login button",
  "keyword": "And "
});
formatter.match({
  "location": "background.click_on_the_Login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Successful login for invalid username and password",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Mytest"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "to launch the chrome browser and maximize window",
  "keyword": "Given "
});
formatter.match({
  "location": "background.to_launch_the_chrome_browser_and_maximize_window()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "to launch the url of the facebook application",
  "keyword": "When "
});
formatter.match({
  "location": "background.to_launch_the_url_of_the_facebook_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user enters \"Inmakes\" and \"Inamkes123\"",
  "keyword": "When "
});
formatter.match({
  "location": "background.the_user_enters_and(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on the Login button",
  "keyword": "And "
});
formatter.match({
  "location": "background.click_on_the_Login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});